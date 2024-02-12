package figuras;

import areas.Areas;

public abstract class Figura {

	protected double base;
	protected double altura;

	protected abstract Areas area();

	public Figura(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double calcularArea() {
		return area().calcular();
	}

}
