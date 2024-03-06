package anofm;

import java.util.HashMap;
import java.util.Map;

public class ManagerRegistry {
    private Map<String, Manager> manageri;
    private static ManagerRegistry instance = null;

    private ManagerRegistry() {
        this.manageri = new HashMap<>();
    }

    public static ManagerRegistry getInstance() {
        if (instance == null) {
            instance = new ManagerRegistry();
        }
        return instance;
    }

    public void InregistreazaManageri(String numeFirma, String numeManager, double salariu) {
        this.manageri.putIfAbsent(numeFirma, new Manager(numeFirma, numeManager, salariu));
    }

    public String GetManager(String numeFirma) {
        return this.manageri.get(numeFirma).getNumeManager();
    }
}
