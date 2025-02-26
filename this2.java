import java.util.Scanner;
import java.util.Random;

public class Users {
    private String name;
    private float accountAge;
    private int userId;

    public Users(String user, float age, int id) {
        this.name = user;
        this.accountAge = age;
        this.userId = id;
    }

    public void printUser(String message) {
        sout(false, message + this.name);
    }

    public void printAge(String message) {
        sout(false, message + this.accountAge);
    }

    public void printId(String message) {
        sout(false, message + this.userId);
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Random random = new Random();

        String usersName;
        float userAge = 0;
        int identificationId = random.nextInt(9999999);

        sout(true, "Whats your Username: ");
        usersName = userInput.nextLine();

        sout(true, "Age: ");
        userAge = Float.valueOf(userInput.nextLine());

        Users mawborn = new Users(usersName, userAge, identificationId);

        mawborn.printUser("Username: ");
        mawborn.printAge("Age: ");
        mawborn.printId("UserId: ");
    }

    public static void sout(boolean isSameLine, String message) {
        if (!(isSameLine)) {
            System.out.println(message);
        } else {
            System.out.print(message);
        }
    }
}
