package posicion;

public class EstadoSinPintar extends EstadoPintar {

	@Override
	public EstadoPintar pintar() {
		
		return new EstadoPintado();
	}

}
