package principal;

import figuras.Figura;
import figuras.FiguraTriangulo;

public class PrincipalFiguraTriangulo {

	public static void main(String[] args) {
		Figura figura = new FiguraTriangulo(2, 3);
		System.out.println(figura.calcularArea());
	}

}
