import  java.time.LocalDate;
import  java.time.*;
import static java.time.temporal.TemporalAdjusters.*;
/**
 * Created by andriis on 11/28/16.
 */
public class Main {
    String name = "";
    int age = 0;
    private static LocalDate date;


    public static void main(String[] args){
        date  = LocalDate.now();

        System.out.println(date.with(firstDayOfMonth()).getDayOfWeek().getValue());
        Main person = new Main();
        person.name = "Andriy";
        person.age = 23;
        System.out.println("Name: " + person.name + " Age: " + person.age);
    }
}
