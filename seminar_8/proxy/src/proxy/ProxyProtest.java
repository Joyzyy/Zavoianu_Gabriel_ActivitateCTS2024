package proxy;

import clase.Autobuz;
import clase.AutobuzAbstract;

import java.util.ArrayList;
import java.util.List;

public class ProxyProtest implements AutobuzAbstract {
    private AutobuzAbstract autobuz;
    private List<String> statiiInterzise;

    public ProxyProtest(AutobuzAbstract autobuz) {
        this.statiiInterzise = new ArrayList<>();
        this.autobuz = autobuz;
    }

    public void adaugaStatieInterzisa(String statie) {
        this.statiiInterzise.add(statie);
    }

    @Override
    public void opresteInStatie(String statie) {
        if (statiiInterzise.contains(statie)) {
            System.out.println("SKIP LA STATIA " + statie);
        } else {
            this.autobuz.opresteInStatie(statie);
        }
    }

    @Override
    public String getNumarAutobuz() {
        return null;
    }

    @Override
    public int getNumarCalatori() {
        return 0;
    }
}
