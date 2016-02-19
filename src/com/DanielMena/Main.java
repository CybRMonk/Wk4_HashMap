package com.DanielMena;

import java.util.HashMap;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashMap snowfall = new HashMap();
        snowfall.put("January ", 3);
        snowfall.put("Febuary", 10);

        Object janSnowfall = snowfall.get("January");
        System.out.println("in January," + janSnowfall + "inches of snow fell");



        for (Object ob : snowfall.keySet()) {
            System.out.println("Month " + ob);
            System.out.println("Snowfall inches: " + snowfall.get(ob));

        }
        Scanner textScanner = new Scanner(System.in);

        System.out.println("print Month");
        String month = textScanner.nextLine();

        System.out.println("enter snow for " + month);
        int snow = Integer.parseInt(textScanner.nextLine());
        // push to githum

        snowfall.put(month,snow);
        System.out.println("Here's the new data");
            for (Object ob : snowfall. keySet()){
                System.out.println("Snowfall in " + ob + " Was " + snowfall.get(ob));
            }

        textScanner.close();
    }
}
