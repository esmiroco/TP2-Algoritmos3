package estadoPintar;

public class EstadoPintado implements EstadoPintar {
    @Override
    public EstadoPintar pintar() {
        return this;
    }

    @Override
    public boolean estoyPintado() {
        return true;
    }
}
