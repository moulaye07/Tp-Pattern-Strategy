package com;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByValue implements ObjectStrategy {
    public void sort(List<Object> objects){
        System.out.println("sorting objects By Value");
        System.out.println(" Avant");
        for (Object o: objects) {
            System.out.println("{nom : "+o.getNom()+"; prix : "+o.getPrix()+"; valeur :"+o.getValeur()+" }");
        }
        Collections.sort(objects, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return o1.getValeur() - o2.getValeur();
            }
        });
        System.out.println("\n Après");
        for (Object o: objects) {
            System.out.println("{nom : "+o.getNom()+"; prix : "+o.getPrix()+"; valeur :"+o.getValeur()+" }");
        }

    };
}
