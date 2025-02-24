// Arrays

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> network = new ArrayList<>();
        network.add("[ERROR]");

        sout(network.get(0));
    }

    public static void sout(String message) {
        System.out.println(message);
    }
}
