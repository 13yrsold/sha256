import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Random random = new Random();

        ArrayList<String> users = new Arraylist<>();
        users.add("mawborn");

        String userName;
        String password;
        int age = 0;
        int makeUserId = random.nextInt(9999999);
        int userId = makeUserId;
        int height = 0;

        System.out.print("Sign Up [y/n]: ");
        String firstAnswer = userInput.nextLine();

        boolean notSignUp = firstAnswer.equals("n") || firstAnswer.equals("n") && !(firstAnswer.isEmpty());
        boolean isSignUp = irstAnswer.equals("y") || firstAnswer.equals("Y") && !(firstAnswer.isEmpty());

        if (isSignUp && !(notSignUp)) {
            System.out.print("Set your Username: ");
            String setUsername = userInput.nextLine();

            users.add(setUsername);
            boolean isTaken = (users.contains(setUsername))

            if isTaken {
                System.out.println("Username already taken, enter a new Username");

                System.out.print("Set your Username: ");
                setUsername = userInput.nextLine();
            }

            System.out.print("Set your Password: ");
            String setPassword = userInput.nextLine();

            System.out.print("Year of birth: ");
            int setAge = Integer.valueOf(userInput.nextInt());

            userName = setUsername;
            age = setAge;
            password = setPassword;

            Users player = new Users(userName, password, age, userId, height)
        }

        System.out.print("Enter Username: ");
        String entredUser = userInput.nextLine();

        System.out.print("Enter Password: ");
        String entredPass = userInput.nextLine();

        if userName == entredUser && password == entredPass {
            System.out.println("You are logined in!");

            player.printUser();
            player.printAge();
            player.printHeight();
            player.printUserId();
        }
    }
}
