package org.example;

public class Dado {

    public int get_value(int Caras, int nonum){
        if(Caras != 6 && Caras != 10){
            throw new IllegalArgumentException();
        }
        int resultado = (int)(Math.random()*6+1);
        if (resultado == nonum){
         return get_value(Caras, nonum);
        }else {
            return resultado;
        }
    }
}
