package edu.uaslp.parcial2.figuras;

public class Rectangulo extends Figura implements FigureWithSides
{
	public Rectangulo() {
		super("Rectangulo");
	}

	public void draw()
	{
		System.out.println("Rectangulo, tengo 4 lados. ");
	}

	@Override
	public int getSidesCount() {
		return 4;
	}
}
