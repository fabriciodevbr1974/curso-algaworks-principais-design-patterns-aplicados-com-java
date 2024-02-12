package areas;

public class Retangulo implements Areas{
	
	private double base;
	private double altura;
	
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double calcular() {
		return base * altura;
	}

}
