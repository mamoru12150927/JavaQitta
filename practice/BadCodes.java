import java.util.Arrays;
import java.util.List;

public class BadCodes {

    /**
     * 
     * 怒られコード①：横に長すぎる
     * 怒られ度：★★★☆☆
     * 怒られポイント：読み辛さがMax
     */
    private boolean checkBadCode(String str) {
        return str.equals("abc") ? true : str.endsWith("c") ? true : str.startsWith("a") ? true : false ;
    }

    /**
     * 怒られコード②：処理の多すぎるStream
     * 怒られ度：★★★☆☆
     * 怒られポイント：何でもforEach()を使えば言い訳ではない
     */
    private void streamBadCode(List<String> targetList) {
        targetList.stream().forEach((String str) -> 
                                    {str.concat("a");
                                     if(str.startsWith("a") ){
                                        System.out.print(str);
                                     };});
    }

    /**
     * 怒られコード③：無意味なラッパークラス
     * 怒られ度：★★★★☆
     * 怒られポイント：無駄なメモリ消費
     */
    private Integer literalBadCode(Integer i) {
        Integer firstValue = 10;
        Integer secondValue = 20;
        Integer sumValue = i + firstValue + secondValue;
        return sumValue;
    }

    /**
     * 怒られコード④：returnが無駄に遅い＆マジックナンバー
     * 怒られ度：★★★★★
     * 怒られポイント：可読性を損ねる
     */
    private boolean checkBatCode2(String target) {
        boolean japanFlg = false;
        boolean englishflg = false;
        boolean nonflg = true;
        switch(target) {
            case "Hello" :
                englishflg = true;
                break;
            case "こんにちは" : 
                japanFlg = true;
                break;
            default :
                nonflg = false;
                break;
        }

        if(japanFlg) {
            return japanFlg;
        } else if (englishflg) {
            return englishflg;
        } else {
            return nonflg;
        }

    }

    /**
     * 怒られコード⑤：コメントと処理がぜんぜん違う
     * 怒られ度：★★★★★
     * 怒られポイント：読んでて意味が分からなくなる
     * @param String str
     */
    private void printOutNumber(int number) {
        String concatNumber = String.valueOf(number).concat("5050");
        // 引数で受け取った数値をそのまま出力
        System.out.print(concatNumber);
    }

}

