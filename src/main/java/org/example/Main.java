package org.example;

import org.example.controlador.ControladorGeneroMusical;
import org.example.vista.VentanaGeneroMusical;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        VentanaGeneroMusical view = new VentanaGeneroMusical("MVC Y JDBC");
        ControladorGeneroMusical controller = new ControladorGeneroMusical(view);
    }
}