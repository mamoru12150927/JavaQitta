import java.util.ArrayList;
import java.util.List;

public class Control {
    public static long allCount = 0;

    public static void main(String[] args) {
        Control control = new Control();
        List<String> targetStrList = new ArrayList<>(); 
        targetStrList.add("Java");
        targetStrList.add("Python");
        targetStrList.add("Scala");
        targetStrList.add("C");

        allCount = control.firstCheck(targetStrList)
                 + control.secondCheck(targetStrList)
                 + control.thridCheck(targetStrList);

        System.out.print(allCount);

    }

    public long firstCheck(List<String> checkTarget) {
        long count = checkTarget.stream().filter(str -> str.length() > 5).count();
        return count;
    }

    public long secondCheck(List<String> checkTarget) {
        long count = 0L;
        for(String target : checkTarget) {
            if(target.length() > 3) {
                count++;
            }
        }

        return count;
    }

    public long thridCheck(List<String> checkTarget) {
        long count = 0L;
        int i = 0 ; 
        while(i < checkTarget.size()) {
            count = checkTarget.get(i).length() > 5 ? count++ : count;
            i++;
        }

        return count;
    }


}