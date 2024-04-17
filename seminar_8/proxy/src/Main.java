import clase.Autobuz;
import clase.AutobuzAbstract;
import proxy.ProxyAutobuzNoapte;
import proxy.ProxyProtest;

public class Main {
    public static void main(String[] args) {
        AutobuzAbstract autobuz = new Autobuz(10, "STB312", "Alin");
        ProxyAutobuzNoapte proxyAutobuzNoapte = new ProxyAutobuzNoapte(autobuz);
        proxyAutobuzNoapte.opresteInStatie("RRRRR");
        ProxyProtest proxyAutobuzProtest = new ProxyProtest(proxyAutobuzNoapte);
        proxyAutobuzProtest.adaugaStatieInterzisa("VVVV");
        ((Autobuz)autobuz).setNumarCalatori(0);
        proxyAutobuzProtest.opresteInStatie("AAAA");
        ((Autobuz)autobuz).setNumarCalatori(1);
        proxyAutobuzProtest.opresteInStatie("VVVV");
    }
}