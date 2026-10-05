import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(20, "Alice", 55));
        students.add(new Student(19, "Bob", 60));
        students.add(new Student(21, "Charlie", 58));
         students.add(new Student(21, "chetan", 65));

        Collections.sort(students);
        System.out.println(students);
    
















       /*List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(2);
        list.add(19);
        list.add(3);
        System.out.println(list);*/

        /*Collections.sort(list);// it will sort the list in ascending order
        System.out.println(list);*/
    }
}    
    