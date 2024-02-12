package areas;

public class Triangulo implements Areas{
	
	private double base;
	private double altura;
	
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double calcular() {
		return base * altura  / 2;
	}

}
