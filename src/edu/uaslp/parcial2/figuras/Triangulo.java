package edu.uaslp.parcial2.figuras;

public class Triangulo extends Figura implements FigureWithSides
{
	public Triangulo() {
		super("Triangulo");
	}

	public void draw()
	{
		System.out.println("Triangulo, tengo 3 lados. ");
	}

	@Override
	public int getSidesCount() {
		return 3;
	}
}
