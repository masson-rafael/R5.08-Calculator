package com.rafael.calculator;

import java.util.HashSet;
import java.util.Set;

public class Calculator {
    public static int add(int opG, int opD){
        return opG + opD;
    }

    public static int divide(int opG, int opD){
        return opG / opD;
    }


    /**
     * Retourne l'ensemble (non ordonné) des chiffres composant le nombre donné
     * @param pNombre le nombre dont on veut extraire les chiffres
     * @return un Set<Integer> contenant les chiffres uniques du nombre
     */
    public static Set<Integer> ensembleChiffres(int pNombre) {
        Set<Integer> chiffres = new HashSet<>();

        // Traiter le cas spécial de 0
        if (pNombre == 0) {
            chiffres.add(0);
            return chiffres;
        }

        // Travailler avec la valeur absolue pour gérer les nombres négatifs
        int nombre = Math.abs(pNombre);

        // Extraire chaque chiffre
        while (nombre > 0) {
            int chiffre = nombre % 10;
            chiffres.add(chiffre);
            nombre = nombre / 10;
        }

        return chiffres;
    }
}
