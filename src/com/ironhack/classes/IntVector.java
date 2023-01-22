package com.ironhack.classes;

import com.ironhack.interfaces.IntList;

public class IntVector implements IntList {

    int[] lista = new int[20];
    int counter = 0;


    @Override
    public void add(int number) {
        if (lista.length ==10) {
            lista = aumentar(lista);
        }
        lista[counter] = number;
        counter++;
    }

    @Override
    public void get(int number) {

    }

    public int getNumber(int index) {
        return lista[index];
    }


    private int[] aumentar(int[] array) {
        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public int[] getLista() {
        return lista;
    }

    public void setLista(int[] lista) {
        this.lista = lista;
    }


}
