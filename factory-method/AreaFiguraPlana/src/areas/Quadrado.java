package areas;

public class Quadrado implements Areas{
	
	private double base;
	private double altura;
	
	public Quadrado(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double calcular() {
		return base * altura;
	}

}
