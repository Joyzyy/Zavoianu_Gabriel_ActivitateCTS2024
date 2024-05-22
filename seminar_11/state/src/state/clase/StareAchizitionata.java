package state.clase;

public class StareAchizitionata implements AbstractState {
    protected StareAchizitionata() {}
    @Override
    public void schimbaStare(Reteta reteta) {
        reteta.schimbaStare(this);
    }
}
