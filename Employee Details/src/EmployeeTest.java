import java.lang.reflect.Array;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class EmployeeTest {
    public static void main(String[] args) {
//        Employee person = new Employee("Stanhope");
//        System.out.println(person.getAge() + " " + person.getLastName());
//
//        Employee person2 = new Employee("Cooper");
//        person2.setAge(44);
//        System.out.println(person2.getAge());
//        System.out.println(person2.getAge() + " " + person2.getLastName());

//        for (int i=0; i<65 ; i++ ) {
//            person.incAge();
//            person2.incAge();
//        }
//        System.out.println("Person1 age = " + person.getAge());
//        System.out.println("Person2 age =" + person2.getAge());
//
//        Employee person3 = new Employee("Brown", "Carrie", 25);
//        person3.setRetirementAge(68);
//        System.out.println(person3.getLastName());
//
//        for (int i=person3.getAge(); i <= person3.getRetirementAge() ; i++ ) {
//            person3.incAge();
//            System.out.println(person3.getAge());
//        }
//
//        for (int i=person.getAge(); i <= 70 ; i++ ) {
//            person.incAge();
//            System.out.println(person.getAge());
//        }
//
//        person.setFirstName("Ginnie");
//        person2.setFirstName("Ella");

        //number 4
        //Manager person3 = new Manager("Bosch", "Xelda", 30);
        //System.out.println(person3.getLastName() + person3.getAge());

        //number 5
        Employee[] myEmployees = {new Employee("Stanhope", "Jake", 34), new Employee("Brown", "Karen", 40) };

        //number 6
        for (Employee person : myEmployees) {
            System.out.println(person.getDetails());
        }

        Manager Jenny = new Manager("Bosch", "Jenny", 30, myEmployees);
        Manager Alex = new Manager("Summers", "Alex", 47, myEmployees);
        System.out.println(Jenny.getEmployeeNames());
        System.out.println(Alex.getDetails());
        System.out.println(Jenny.getDetails());

        System.out.println(myEmployees[0].getDetails());
        System.out.println(myEmployees[1].getDetails());

    }
}