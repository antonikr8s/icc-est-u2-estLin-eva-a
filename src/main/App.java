package main;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import utils.StudentValidator;

public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());

        // NO MODIFICAR HASTA AQUÍ

        LogicaClasificacion logica = new LogicaClasificacion();

        Queue<String> nombres = new LinkedList<>(Arrays.asList("Ana", "Luis", "Pedro"));

        System.out.println("\n01. invertirColaNombres(Queue colaNombres)");

        System.out.println("Entrada: " + nombres);
        Queue<String> invertida = logica.invertirColaNombres(nombres);
        System.out.println("Salida: " + invertida);

        //
        
        Queue<String> palabra1 = new LinkedList<>(Arrays.asList("r", "a", "d", "a", "r"));
        Queue<String> palabra2 = new LinkedList<>(Arrays.asList("c", "a", "s", "a"));

        System.out.println("\n02. verificarPalindromoCola(Queue cola)");
        
        System.out.println("Entrada: " + (palabra1) + " -> " + logica.verificarPalindromoCola(palabra1));
        System.out.println("Entrada: " + (palabra2) + " -> " + logica.verificarPalindromoCola(palabra2));

    }
}
