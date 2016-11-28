import java.util.IntSummaryStatistics;

/**
 * Created by andriis on 11/28/16.
 */
public class Main {
    String name = "";
    int age = 0;
    public static void main(String[] args){
        Main person = new Main();
        person.name = "Andriy";
        person.age = 23;
        System.out.println("Name: " + person.name + " Age: " + person.age);
    }
}
