package com;

public class Object {
    private String nom;
    private int prix, valeur;

    public Object(String nom, int prix, int valeur) {
        this.nom = nom;
        this.prix = prix;
        this.valeur = valeur;
    }

    public String getNom() {
        return nom;
    }

    public int getPrix() {
        return prix;
    }

    public int getValeur() {
        return valeur;
    }
}
