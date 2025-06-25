package main;

import java.util.*;

public class LogicaClasificacion {

    /**
     * Invierte el contenido de una cola de nombres utilizando una pila auxiliar.
     * 
     * Ejemplo:
     * Entrada: ["Ana", "Luis", "Pedro"]
     * Salida: ["Pedro", "Luis", "Ana"]
     *
     * @param cola cola original de nombres
     * @return nueva cola con los nombres en orden invertido
     */

    public Queue<String> invertirColaNombres(Queue<String> cola) {
        Stack<String> pila = new Stack<>();
        for (String nombre : cola) {
            pila.push(nombre);
        }

        Queue<String> invertida = new LinkedList<>();
        while (!pila.isEmpty()) {
            invertida.offer(pila.pop());
        }

        return invertida;
    }

    /**
     * Verifica si la palabra formada por los elementos de una cola es un
     * palíndromo.
     *
     * Se considera que la cola contiene letras individuales como strings.
     * Ejemplo:
     * Entrada: ["r", "a", "d", "a", "r"] → true
     * Entrada: ["c", "a", "s", "a"] → false
     *
     * @param cola Cola de letras en minúsculas.
     * @return true si forman un palíndromo, false si no
     */
    public boolean verificarPalindromoCola(Queue<String> cola) {

        Stack<String> pilaInversa = new Stack<>();
        for (String letra : cola) {
            pilaInversa.push(letra);
        }

        Queue<String> copiaCola = new LinkedList<>(cola);

        while (!copiaCola.isEmpty()) {
            if (!copiaCola.poll().equals(pilaInversa.pop())) {

                return false;
            }
        }

        return true;
    }

}
