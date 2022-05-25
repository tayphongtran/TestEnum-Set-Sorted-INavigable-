package InavigableSet;

import java.util.TreeSet;

public class SortedSet_null_element_Ex1 {
    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        Circle c2 = new Circle(13);
        Circle c3 = new Circle(23);
        Circle c4 = new Circle(3.5);

        // Sử dụng class CircleComparator triển khai Comparator
        // Sử dụng bộ công cụ Comparator cung cấp
        TreeSet<Circle> set = new TreeSet<>(new CircleComparator());
        // Với TreeSet add được null!
        set.add(null);
        set.add(c1);
        set.add(c2);
        set.add(c3);
        set.add(c4);

        set.forEach((loop)->{
            System.out.println("Circle: " + (loop == null ? null : loop.getRadius()));
        });
    }
}
