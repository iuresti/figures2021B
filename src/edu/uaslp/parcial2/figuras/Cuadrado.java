package edu.uaslp.parcial2.figuras;

public class Cuadrado extends Figura implements FigureWithSides
{

	public Cuadrado() {
		super("Cuadrado");
	}

	public void draw()
	{
		System.out.println("Cuadrado, tengo 4 lados iguales");
	}

	@Override
	public int getSidesCount() {
		return 4;
	}
}
