package kata1;

import java.util.GregorianCalendar;

public class Kata1 {

    public static void main(String[] args) {
        GregorianCalendar birth = new GregorianCalendar(1990, 2, 22);
        Person person = new Person("Pepito", "de los Palotes", birth);
        System.out.println("Mi nombre es: " + person.getName());
        System.out.println("Mi apellido es: " + person.getSurname());
        System.out.println("Mi nombre completo es: " + person.getFullName());
        System.out.println("Naci el día: " + person.getBirthDay().getTime());
        System.out.println("Tengo " + person.getAge() + " años");
    }

}
