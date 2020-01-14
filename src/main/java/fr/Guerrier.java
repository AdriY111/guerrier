package fr;

import java.util.Random;

/*
 test des objets 08/01/2020!
 */

public class Guerrier {
    private int pv = 100;
    private double force = 100.0;
    private int vitesse = 50;
    private String nom;

    public void attaquer(final Guerrier autre) {
        final Random rand = new Random();
        final int puissAutre = rand.nextInt((int) force * vitesse); // renvoit un nombre entre 0 et 99
        final int puissMoi = rand.nextInt((int) autre.force * autre.vitesse);
        if (puissMoi > puissAutre) {
            autre.pv = autre.pv - 10;
        } else {
            pv -= 10;
        }
    }

    public boolean estEnVie() {
        return pv > 0;
    }

    public int getPv() {
        return pv;
    } // getter

    public void afficherStat() {
        System.out.print("nom : " + nom);
        System.out.print(" || ");
        System.out.print(" pv : " + pv + " ");
    }

    public void init(String leNom, double force, int vitesse) {
        nom = leNom;
        this.force = force;
        this.vitesse = vitesse;
    }
}
