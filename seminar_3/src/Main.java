import companie.Manager;

public class Main {
    public static void main(String[] args) {
        Manager manager = Manager.getInstance();
        Manager manager2 = Manager.getInstance();
        System.out.println(manager);
        System.out.println(manager2);
    }
}