public class Main {
    private String user;
    private int age; // Instance variables

    public Main(String name, int years) {
        this.age = years;
        this.user = name;
    }

    public void attributes() {
        System.out.println("Name: " + this.user + " Age: " + this.age);
    }

    public static void main(String[] args) {
        Main acc = new Main("mawborn", 18);

        acc.attributes();
    }
}
