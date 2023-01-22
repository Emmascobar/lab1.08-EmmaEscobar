package com.ironhack;

import com.ironhack.classes.*;
import java.math.BigDecimal;
import java.util.Arrays;

import static com.ironhack.classes.EjerciciosBD.redondeo;
import static com.ironhack.classes.EjerciciosBD.reversSing;
import com.ironhack.classes.IntArrayList;
import com.ironhack.classes.IntVector;

public class main {

    //EJERCICIOS 1 Y 2 - BIGDECIMAL
    public static void main(String[] args) {
        System.out.println(" El valor redondeado es de: " + redondeo(redondeo(new BigDecimal(4.5621154))));
        System.out.println(" El valor del metodo ReverseSing es de: " + reversSing(new BigDecimal(6.3223645)));
        ;

        //EJERCICIO 3 - CARS
        Car Toyota = new Car(56486, "USA", "Corolla");

        //EJERCICIO 4 - VIDEOSTREAMING:
        Movies harryPotter = new Movies("Harry Poter y la Piedra filosofal", "2001", new String[]{"Daniel Radcliffe", "Daniel Radcliffe", "Daniel Radcliffe", "Daniel Radcliffe"}, true);
        TvSeries theOffice = new TvSeries("the office", "2011", new String[]{"Steve Carell", "Steve Carell", "Steve Carell", "Steve Carell"}, 8);
        harryPotter.play();
        harryPotter.pause();
        theOffice.searchSimilar();

        System.out.println(harryPotter);
        System.out.println(theOffice);


        //EJERCICIO 5:

        IntArrayList lista1 = new IntArrayList();
        lista1.add(2);
        lista1.add(4);
        lista1.add(6);
        lista1.add(8);
        System.out.println(Arrays.toString(lista1.getLista()));



        IntVector lista2 = new IntVector();
        lista2.add(8);
        lista2.add(6);
        lista2.add(4);
        lista2.add(2);
        System.out.println(Arrays.toString(lista2.getLista()));

    }
}
