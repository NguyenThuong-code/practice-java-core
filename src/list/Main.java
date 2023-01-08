package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> em= new ArrayList<>();

        em.add(new Employee(1,"thuong",20.0));
        em.add(new Employee(2,"cute",15.0));
        em.add(new Employee(3,"chinh",30.0));
       Collections.sort(em, new Comparator<Employee>() {
           @Override
           public int compare(Employee o1, Employee o2) {
               return o1.getSalary().compareTo(o2.getSalary());
           }
       });
        for (Employee e:em
             ) {
            System.out.println(e.toString());
        }
    }

}
