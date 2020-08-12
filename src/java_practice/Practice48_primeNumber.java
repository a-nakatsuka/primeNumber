//素数を求める　
//0811 11:52-12:00
//0812 10:00-12:00
//0812 14:00-15:15
//目標 120分
//仕様変更追加
package java_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Practice48_primeNumber {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //数字1
        System.out.println("1.数字を入力してください。(2-9999)");
        String inputNum1 = reader.readLine();
        int inputNumber1 = Integer.parseInt(inputNum1);
        //数字2
        System.out.println("2.数字を入力してください。(2-9999)");
        String inputNum2 = reader.readLine();
        int inputNumber2 = Integer.parseInt(inputNum2);

        minToMax(inputNumber1,inputNumber2);
        //primeNumber(inputNumber1,inputNumber2);
    }

    //入力された数をループ
    public static List<Integer> primeNumber(int min,int max) {
        //素数を入れていくためのリスト
        List<Integer> result = new ArrayList<>();

        String s = "";

        //入力された数までループ
        for (int i = min; i <= max; i++) {

            if (judge(i) == true) {
                //素数の場合はリストに追加する
                result.add(i);
            }
        }

        //リストの型変換
        s = String.valueOf(result);
        //[]を外す
        s = s.replace("[" , "");
        s = s.replace("]" , "");
        System.out.print(min + "以上で" + max + "以下の素数は、" + s + "です。");
        return result;
    }


    /**
     * 素数の判定
     * @param num 入力された数
     * @return 素数
     */
    public static boolean judge(int num) {
        //偶数の中で2は唯一の素数
        if (num == 2) {
            return true;
        }

        //偶数は素数ではない
        if (num % 2 == 0) {
            return false;
        }

        //奇数を2ずつカウントアップ
        for (int i = 3; i < num; i+=2) {
            //奇数で割る
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * 開始値と終了値を指定される
     */
    public static void minToMax(int num1,int num2){
        //入力された値の大小を確認
        int max = Math.max(num1,num2);
        int min = Math.min(num1,num2);

        primeNumber(min,max);



    }





}

