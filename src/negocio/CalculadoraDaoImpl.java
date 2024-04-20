package negocio;

public class CalculadoraDaoImpl implements CalculadoraDao {

	@Override
	public int sumar(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public int restar(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	public int multiplicar(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}

	@Override
	public int dividir(int x, int y) {
		// TODO Auto-generated method stub
		return x/y;
	}

}
