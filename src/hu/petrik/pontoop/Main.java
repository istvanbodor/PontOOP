package hu.petrik.pontoop;

import hu.petrik.pontoop.pont.Pont;

public class Main {

    public static void main(String[] args) {

        Pont p1 = new Pont();
        Pont p2 = new Pont(0,0);
        Pont p3 = new Pont(3,4);
        Pont p4 = new Pont(100);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);


        Pont[] pontok = new Pont[100];
        for (int i = 0; i < pontok.length; i++) {
            pontok[i] = new Pont(10);
        }
        for (Pont p: pontok)
        {
            System.out.println(p);

        }
        int legtavolabbesoIndex =0;
        for (int i = 1; i < pontok.length ; i++) {
            if (pontok[legtavolabbesoIndex].getOrigotolMertTavolsag()<pontok[i].getOrigotolMertTavolsag()){
                legtavolabbesoIndex = i;
            }
        }
        System.out.printf("A legtávolabbeső pont az origotól a(z) %d. pont, koordinátái: %s, origotól mért távolsága: %.3f"
                ,(legtavolabbesoIndex +1), pontok[legtavolabbesoIndex], pontok[legtavolabbesoIndex].getOrigotolMertTavolsag());
    }



}
