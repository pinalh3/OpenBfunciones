package com.function;

public class Main {
    public static void main(String[] args) {
        double precio = 25.65;
        System.out.println(precioConIva(precio));

    }
    public static Double precioConIva(Double precio){
        return precio + precio * 0.16;
    }

}