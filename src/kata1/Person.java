package kata1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Person {
    
    private final String name;
    private final String surname;
    private final Calendar birthDay;
    private static final long MILLISECONS_PER_YEAR = (long) (1000*60*60*24*365.25);

    public Person(String name, String surname, Calendar birthDay) {
        this.name = name;
        this.surname = surname;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Calendar getBirthDay() {
        return birthDay;
    }
    
    public String getFullName(){
        return name + " " + surname;
    }
    
    public int getAge(){
        return (int) ((GregorianCalendar.getInstance().getTimeInMillis() - birthDay.getTimeInMillis()) / MILLISECONS_PER_YEAR);
    }
    
}
