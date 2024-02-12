package figuras;

import areas.Areas;
import areas.Triangulo;

public class FiguraTriangulo extends Figura{

	public FiguraTriangulo(double base, double altura) {
		super(base, altura);
	}

	@Override
	protected Areas area() {
		return new Triangulo(base, altura);
	}

}
