package presentacion;

import negocio.CalculadoraDao;
import negocio.CalculadoraDaoImpl;

public class Principal {

	public static void main(String[] args) {
		CalculadoraDao cdao = new CalculadoraDaoImpl();
		System.out.println(cdao.sumar(34, 22));
		System.out.println(cdao.restar(34, 22));
		System.out.println(cdao.multiplicar(34, 22));
		System.out.println(cdao.dividir(34, 22));
		

	}

}
