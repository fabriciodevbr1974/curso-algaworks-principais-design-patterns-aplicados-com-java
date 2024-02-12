package figuras;

import areas.Areas;
import areas.Retangulo;

public class FiguraRetangulo extends Figura{

	public FiguraRetangulo(double base, double altura) {
		super(base, altura);
	}

	@Override
	protected Areas area() {
		return new Retangulo(base, altura);
	}

}
