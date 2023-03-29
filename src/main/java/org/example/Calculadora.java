package org.example;

import org.example.Dado;

import java.util.concurrent.CancellationException;

public class Calculadora {

    public double suma(int a, int b){
        return a+b;
    }
    public double resta(int a, int b){
        return a-b;
    }
    public double mulitplicacion(int a, int b){
        return a*b;
    }
    public double division(double a, double b) {
        if(b==0){
            throw new IllegalArgumentException();
        }else {
            return a / b;
        }
    }
    public double dobledado (Dado D1, Dado D2, int Caras, int nonum){
        try{
            return D1.get_value(Caras, nonum)+D2.get_value(Caras, nonum);
        }catch(Exception ex){
            return 0;
        }
    }
}
