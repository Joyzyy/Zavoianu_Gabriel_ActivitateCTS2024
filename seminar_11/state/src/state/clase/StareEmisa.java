package state.clase;

public class StareEmisa implements AbstractState {
    protected StareEmisa() {}
    @Override
    public void schimbaStare(Reteta reteta) {
        reteta.schimbaStare(this);
    }
}
