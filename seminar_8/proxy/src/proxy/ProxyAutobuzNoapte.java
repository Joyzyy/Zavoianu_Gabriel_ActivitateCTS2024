package proxy;

import clase.Autobuz;
import clase.AutobuzAbstract;

public class ProxyAutobuzNoapte implements AutobuzAbstract {
    AutobuzAbstract autobuzAbstract;

    public ProxyAutobuzNoapte(AutobuzAbstract autobuzAbstract) {
        this.autobuzAbstract = autobuzAbstract;
    }

    @Override
    public void opresteInStatie(String statie) {
        if (this.autobuzAbstract.getNumarCalatori() == 0)
            System.out.println("SKIP LA STATIA " + statie);
        else
            this.autobuzAbstract.opresteInStatie(statie);
    }

    @Override
    public String getNumarAutobuz() {
        return this.autobuzAbstract.getNumarAutobuz();
    }

    @Override
    public int getNumarCalatori() {
        return this.autobuzAbstract.getNumarCalatori();
    }
}
