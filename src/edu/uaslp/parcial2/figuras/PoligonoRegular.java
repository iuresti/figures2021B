package edu.uaslp.parcial2.figuras;

public class PoligonoRegular extends Figura implements FigureWithSides
{
	private int sides;

	public PoligonoRegular(int sides){
		super("PoligonoRegular");

		this.sides = sides;
	}

	public void draw()
	{
		System.out.println("PoligonoRegular, tengo " + sides + " lados iguales");
	}

	public int getSidesCount() {
		return sides;
	}
}
