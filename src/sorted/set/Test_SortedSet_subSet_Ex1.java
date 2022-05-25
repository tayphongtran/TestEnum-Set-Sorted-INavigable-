package sorted.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class Test_SortedSet_subSet_Ex1 {
    public static void main(String[] args) {
        TreeSet<String> ex1Set = new TreeSet<>();
        ex1Set.add("A");
        ex1Set.add("B");
        ex1Set.add("C");
        ex1Set.add("D");
        ex1Set.add("F");
        ex1Set.add("G");
        //A sub Set
        SortedSet<String> subSet = ex1Set.subSet("B","C2");
        System.out.println( "subSet---------------");
        subSet.forEach((sub1)->{
            System.out.println(sub1 + " them vao ex1 ư???");
        });

        subSet.add("B1");
        subSet.add("B2");
        System.out.println("--subSet (after adding elements to subSet) --");
        subSet.forEach((subset) -> {
            System.out.println(subset);//thực hiện xong thì index
        });

        System.out.println("---- ex1Set(sau khi them vao subset---)");
        for (String item :
                ex1Set) {
            System.out.println(item);
        }
    }
}
