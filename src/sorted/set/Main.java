package sorted.set;

import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Staff e1 = new Staff("bam",1000);
        Staff e2 = new Staff("akkam1",12000);
        Staff e3 = new Staff("Aam2",10500);
        Staff e4 = new Staff("Nam3",8700);
//        Staff s2 = new Staff(" vilon",1);
//        Staff s3 = new Staff("A1 vilon1",110);
//        Staff s4 = new Staff("angle 1 ",20);

//        TestEmployee test = new TestEmployee();


//
//        for (Staff item :
//                see) {
//            System.out.println("hien thi: " + item.toString() );
//        }
//        for (Staff item2 :
//                see) {
//            System.out.println(item2.getId() + "/" + item2.getFullName());
//        }
        System.out.println("--------------------------" );
        Comparator<Staff> comparator = (s1,s2) -> {
            float delta = s1.getSalary() - s2.getSalary();
            if (delta>0){
                return  1;
            }else if (delta<0){
                return -1;
            }
            return s1.getFullName().compareTo(s2.getFullName());
        };
        SortedSet<Staff> see = new TreeSet<>(comparator);
        // see.add(null) khong the add duoc
        see.add(e1);
        see.add(e2);
        see.add(e3);
        see.add(e4);
        see.forEach((n) ->{
            System.out.println(n.getSalary());
        });
        System.out.println("-------------------duyet list-----------");
        for (Staff e :
                see) {
            System.out.println(e.getSalary() + "/" + e.getFullName());
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(3);
        numbers.add(19);
        numbers.add(34);
        numbers.add(77);
        System.out.println(numbers);
//        numbers.forEach( (n) -> {
//            System.out.println(n);
//        });

        Consumer<Integer> method = (n) -> {
            System.out.println(n);
        };
        numbers.forEach(method);
    }

}
