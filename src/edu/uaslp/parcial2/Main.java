package edu.uaslp.parcial2;

import edu.uaslp.parcial2.figuras.*;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Cuadrado cuadrado = new Cuadrado();
        Rectangulo rectangulo = new Rectangulo();
        Triangulo triangulo = new Triangulo();
        PoligonoRegular poligonoRegular = new PoligonoRegular(5);
        Circulo circulo = new Circulo();

        List<Figura> figuresList = new LinkedList<>();

        figuresList.add(cuadrado);
        figuresList.add(rectangulo);
        figuresList.add(triangulo);
        figuresList.add(poligonoRegular);
        figuresList.add(circulo);

        //printItems(figuresList);

        printItems2(figuresList);
    }


    public static void printItems(List items){

        for(Object item: items){

            if(item instanceof Cuadrado){
                ((Cuadrado)item).draw();
            } else if (item instanceof Rectangulo){
                ((Rectangulo)item).draw();
            } else if (item instanceof Triangulo){
                ((Triangulo)item).draw();
            } else if (item instanceof PoligonoRegular){
                ((PoligonoRegular)item).draw();
            } else if (item instanceof Circulo){
                ((Circulo)item).draw();
            }

        }

    }

    public static void printItems2(List<Figura> items){

        // Polimorfismo
        for(Figura item: items){

            System.out.println(item.getName() + "-----");
            item.draw();
        }

    }

}
