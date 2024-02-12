package principal;

import figuras.Figura;
import figuras.FiguraRetangulo;

public class PrincipalFiguraRetangulo {

	public static void main(String[] args) {
		Figura figura = new FiguraRetangulo(2, 3);
		System.out.println(figura.calcularArea());
	}

}
