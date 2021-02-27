package estadoPintar;

public class EstadoSinPintar implements EstadoPintar {
    @Override
    public EstadoPintar pintar() {
        return new EstadoPintado();
    }

    @Override
    public boolean estoyPintado() {
        return false;
    }
}
