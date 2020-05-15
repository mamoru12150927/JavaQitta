import java.util.List;
import java.util.Stream;

public class GoodCodes {
    public static final String LANGEAGE_ENG = "Hello";
    public static final String LANGEAGE_JP = "こんにちは";
    /**
     * 
     * 怒られコード①修正案
     * 
     */
    private boolean checkGoodCode(String str) {
        if(str.equals("abc")) {
            return true;
        } else if (str.startsWith("a") || str.endsWith("c")) {
            return true;
        }
 
        return false;
    }

     /**
     * 怒られコード②修正案
     */
    private void streamBadCode(List<String> targetList) {
        targetList.stream().map(s -> s.concat("a")).filter(s -> s.startsWith("a")).forEach(System.out:: print);
    }

    /**
     * 怒られコード④修正案
     */
    private boolean checkGoodCode2(String target) {
        if(target.equals(LANGEAGE_ENG) || target.equals(LANGEAGE_JP)) {
            return true;
        }
        return false;
    }

}