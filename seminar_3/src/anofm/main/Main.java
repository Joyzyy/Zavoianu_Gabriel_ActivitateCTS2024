package anofm.main;

import anofm.Manager;
import anofm.ManagerRegistry;

public class Main {
    public static void main(String[] args) {
        var mr = ManagerRegistry.getInstance();
        mr.InregistreazaManageri("CTS SRL", "Popescu", 123213);
        mr.InregistreazaManageri("CTS SRL", "Flas", 123213);
        System.out.println(mr.GetManager("CTS SRL"));
    }
}
