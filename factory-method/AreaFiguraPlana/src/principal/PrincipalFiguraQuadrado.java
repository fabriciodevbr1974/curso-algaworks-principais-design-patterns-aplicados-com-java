package principal;

import figuras.Figura;
import figuras.FiguraQuadrado;

public class PrincipalFiguraQuadrado {

	public static void main(String[] args) {
		Figura figura = new FiguraQuadrado(2, 3);
		System.out.println(figura.calcularArea());
	}

}
