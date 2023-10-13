package org.example;


import Pattern_observer.EventManager;
import Pattern_strateg.*;

import java.util.ArrayList;
import java.util.Iterator;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       /* ArrayList<Integer> itt = new ArrayList<>();
        itt.add(5);
        Iterator<Integer> it = itt.iterator();
        while (it.hasNext()) {
            int cun = it.next();
            System.out.println(it);

        }
        */
        Nav net=new Nav();
        net.Navig(new Driving_car());
        net.Navig(new Walking());
        net.Navig(new Riding_transport());

    }

}