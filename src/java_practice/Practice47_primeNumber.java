//素数を求める　
//0811 11:52-12:00
//0812 10:00-
//目標 120分
package java_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Practice47_primeNumber {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("数字を入力してください。(2-9999)");
        String inputNum = reader.readLine();
        int inputNumber = Integer.parseInt(inputNum);

       judgePrimeNumber(inputNumber);
    }

    //素数の判定
    public static List<Integer> judgePrimeNumber(int number) {
        List<Integer> result = new ArrayList<>();
        //入力された数までループ
        for (int i = 2; i <= number; i++) {

            //素数の条件
            //if(i == 2 || i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
            if(number % i != 0) {
                result.add(i);
            }
        }
        System.out.print(number + "以下の素数は、" + result + "です。");
        return result;
    }
}
