package figuras;

import areas.Areas;
import areas.Quadrado;

public class FiguraQuadrado extends Figura{

	public FiguraQuadrado(double base, double altura) {
		super(base, altura);
	}

	@Override
	protected Areas area() {
		return new Quadrado(base, altura);
	}

}
