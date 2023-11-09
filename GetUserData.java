import java.time.Year;

public class GetUserData {
    public void printName() {
        System.out.println("My name is Joe.");
    }

    public int getAge() {
        int year = Year.now().getValue();
        return year - 1995;
    }
}
