package ui;

import data.GestorDatos;
import model.ProduccionCultivos;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String ubicacion = "resources/Cultivos.txt"; // Ruta del Archivo

        GestorDatos gestor = new GestorDatos(ubicacion); //Creamos un objeto del gestor con la ubicación del archivo a leer

        //LLamamos al metodo cargarProduccion() del gestor, este lee el archivo, crea los objetos y guarda en una lista
        ArrayList<ProduccionCultivos> archivo = gestor.cargarProduccion();

        System.out.println("------------------------------------");
        System.out.println("Ejemplo 3");
        System.out.println("Mostramos centros de ubicación Temuco");
        System.out.println("------------------------------------\n");
        for (ProduccionCultivos cultivos3 : archivo){
            if (cultivos3.getComuna().contains("Temuco")){
                System.out.println(cultivos3);
            }
        }

        System.out.println("------------------------------------");
        System.out.println("Ejemplo 2");
        System.out.println("Mostramos solo los centro con producción menor a 100 toneladas");
        System.out.println("------------------------------------\n");
        for (ProduccionCultivos cultivos2 : archivo){
            if (cultivos2.getToneladas() < 100){
                System.out.println(cultivos2);
            }

        }

        System.out.println("------------------------------------");
        System.out.println("Ejemplo 1");
        System.out.println("Mostramos todos los elementos del archivo");
        System.out.println("------------------------------------\n");
        for (ProduccionCultivos cultivos : archivo) {
            System.out.println(cultivos);
        }
    }
}
