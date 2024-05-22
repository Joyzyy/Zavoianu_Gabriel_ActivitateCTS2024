package template.clase;

import java.util.HashMap;
import java.util.Map;

public abstract class Template {
    private Map<String, Integer> stocuriMap;

    public Template() {
        this.stocuriMap = new HashMap<>();
        this.stocuriMap.put("Paracetamol", 2);
        this.stocuriMap.put("Nurofen", 5);
        this.stocuriMap.put("Diatlov", 1);
    }

    public Map<String, Integer> getStocuriMap() {
        return stocuriMap;
    }

    public final void cumparareMedicament() {
        // se primeste reteta
        this.primireReteta();
        if (verificareStoc()) {
            this.aduceMedicamente();
            this.incaseaza();
            this.emiteBon();
        } else {
            this.respingeAchizitia();
        }
    }

    protected abstract void primireReteta();
    protected abstract boolean verificareStoc();
    protected abstract void incaseaza();
    protected abstract void aduceMedicamente();
    protected abstract void emiteBon();
    protected abstract void respingeAchizitia();
}
