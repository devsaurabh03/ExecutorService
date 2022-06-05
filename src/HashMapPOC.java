import java.util.HashMap;
import java.util.Map;

public class HashMapPOC {
    public static void main(String[] args) {

        Map<Employee,String> hashmap = new HashMap<>();

        Employee emp = new Employee("Saurabh",27);

        Employee emp1 = new Employee("Saurav",27);

        /*
        Saurabh -> e1
        Saurav -> e2
         */

        hashmap.put(emp,"a");
        hashmap.put(emp1,"b");

 //       System.out.println(hashmap.get(emp));

        emp.setName("Saurav");
        emp1.setName("Saurabh");

        System.out.println(hashmap.get(emp));
    }
}