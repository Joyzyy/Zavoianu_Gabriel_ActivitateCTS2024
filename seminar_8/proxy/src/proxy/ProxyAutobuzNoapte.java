package proxy;

import clase.AutobuzAbstract;

public abstract class Proxy implements AutobuzAbstract {
    AutobuzAbstract autobuzAbstract;

    public Proxy(AutobuzAbstract autobuzAbstract) {
        this.autobuzAbstract = autobuzAbstract;
    }

    @Override
    public boolean opresteInStatie(String statie) {
        return false;
    }
}
