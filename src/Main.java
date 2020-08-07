import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by KPS on 8/7/2020.
 */
public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("green");
        stringList.add("blue");
        stringList.add("red");
        for (String s:stringList){
            System.out.println(s);
        }
        Collections.swap(stringList,0,2);
        for (String s:stringList){
            System.out.println(s);
        }
    }
}
