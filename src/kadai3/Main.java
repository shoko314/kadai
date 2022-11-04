package kadai3;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("公開年ごとに、おすすめの映画を表示します。");

        HashMap<String, String> movieMap = new HashMap<>();

        //movieMapを登録する
        movieMap.put("2021年", "マリグナント");
        movieMap.put("2020年", "野生の呼び声");
        movieMap.put("2018年", "レディー・プレイヤー１");
        movieMap.put("2019年", "アラジン");
        movieMap.put("2017年", "グレイテスト・ショーマン");
        movieMap.put("2016年", "ズートピア");

        Scanner scanner = new Scanner(System.in);

        System.out.println("公開年を入力してください。");

        String inputYear = scanner.nextLine();
        scanner.close();

        String movie = movieMap.get(inputYear);

        //登録されていない公開年の入力があった場合、エラーメッセージを表示
        if(movieMap.get(movie) == null){
            throw new Exception("登録されていません。");
        }

        //登録されている年月日の入力があった場合、対応する映画を表示する
        System.out.println("おすすめの映画は" + movieMap.get(movie) + "です。");
        }
    }




