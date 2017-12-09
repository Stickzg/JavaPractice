package com.flowacademy.VilllageSimulatorWithClasses;

import com.flowacademy.VilllageSimulatorWithClasses.Exception.IsFullException;
import com.flowacademy.VilllageSimulatorWithClasses.Villagers.*;

import java.io.*;
import java.security.Key;
import java.util.*;

public class Main {

    private static final String INPUTPATH = "./data/input.txt";
    private static final String SERIALIZEPATH = "./data/output.ser";

    private static Random random = new Random();

    private static Human createVillager(String[] s) {
        Human human = null;
        String name = s[1];
        int age = Integer.parseInt(s[2]);
        int energy = Integer.parseInt(s[3]);
        switch (s[0]) {
            case "Ember":
                human = new Human(name, age, energy);
                break;
            case "Vadász":
                human = new Hunter(name, age, energy);
                break;
            case "Halász":
                human = new Fisherman(name, age, energy);
                break;
            default:
                System.out.println("Error at villager creator.");
                break;
        }
        return human;
    }

    /*public static void*/

    public static HashMap<Gatherer, List<Integer>>  bigGameHunt( List<Human> hunters ) {
        HashMap<Gatherer, List<Integer>> huntersTrophy = new HashMap<>();
        for (Human human : hunters) {
            if ( human instanceof Gatherer ) {
                ((Gatherer) human).gather();
            }
        }
        return huntersTrophy;
    }

    public static void main(String[] args) {

        BufferedReader br;
        List<Human> villagers = new ArrayList<>();

        try {
            String line;
            br = new BufferedReader(new FileReader(INPUTPATH));
            while ((line = br.readLine()) != null) {
                String[] splittedLine = line.split(";");
                villagers.add(createVillager(splittedLine));
            }
            br.close();
        } catch (IOException e) {
            e.fillInStackTrace();
        }

        HashMap<String, WhatToEat> eat = new HashMap();

          try {
            for (Human human : villagers) {
                if ( human instanceof Hunter ) {
                    ((Hunter) human).gather();
                } else if ( human instanceof Fisherman ) {
                    ((Fisherman) human).gather();
                } else {
                    int fishOrMeat = random.nextInt(1);
                    if ( fishOrMeat == 0 ) {
                        human.eszik(WhatToEat.MEAT);
                        eat.put(human.getName(), WhatToEat.MEAT);
                    } else {
                        human.eszik(WhatToEat.FISH);
                        eat.put(human.getName(), WhatToEat.FISH);
                    }

                }
            }
        } catch (IsFullException e) {
            e.fillInStackTrace();
        }
        try {
            FileOutputStream fileOut = new FileOutputStream(SERIALIZEPATH);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(villagers);
            out.close();
            fileOut.close();
            System.out.println("Succesfull serialization.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Human> unserHuman = null;

        try {
            FileInputStream fileIn = new FileInputStream(SERIALIZEPATH);
            ObjectInputStream obj = new ObjectInputStream(fileIn);
            unserHuman = new ArrayList<>((Collection<? extends Human>) obj.readObject());
            fileIn.close();
            obj.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        double luckTotal = 0;
        int numberOfHunters = 0;
        for (Human human : unserHuman) {
            if ( human instanceof Hunter ) {
                luckTotal += ((Hunter) human).getLuck();
                numberOfHunters++;
                ((Hunter) human).gather();
                ((Hunter) human).gather();
            }
        }
        System.out.println("A vadászok átlag szerencséje: "+
                luckTotal/numberOfHunters);


    }
}
