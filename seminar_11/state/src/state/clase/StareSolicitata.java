package state.clase;

public class StareSolicitata implements AbstractState {
    protected StareSolicitata() {}
    @Override
    public void schimbaStare(Reteta reteta) {
        reteta.schimbaStare(this);
    }
}
