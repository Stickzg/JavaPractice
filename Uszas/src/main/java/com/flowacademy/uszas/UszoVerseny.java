package com.flowacademy.uszas;

import com.flowacademy.uszas.exceptions.UszoException;
import com.flowacademy.uszas.init.MyInitPack;

import java.io.*;
import java.util.*;

public class UszoVerseny {

    private static final String INPUTPATH = "./data/input.txt";
    private static final String TXTOUTPUTPATH = "./data/output.txt";
    private static final String SERIALIZEPATHFASTSWIM = "./data/outputfast.ser";
    private static final String SERIALIZEPATHBACKSWIM = "./data/outputback.ser";
    private static final String SERIALIZEPATHLIFEGUARD = "./data/outputguard.ser";

    private static Uszo swimmerFactory(String[] splittedText) {
        Uszo uszo = null;
        String type = splittedText[0];
        String name = splittedText[1];
        int performance = Integer.parseInt(splittedText[2]);
        String nationality = splittedText[3];
        if ( type.equals("Gyorsuszo") ) {
            uszo = new Gyorsuszo(name, performance, nationality);
        } else if ( type.equals("Hatuszo") ) {
            uszo = new Hatuszo(name, performance, nationality);
        } else {
            uszo = new Uszomester(name, performance, nationality);
        }
        return uszo;
    }

    public static void main(String[] args) {
        BufferedReader br;
        List<Uszo> uszok = new ArrayList<>();


        String line;

        try {
            br = new BufferedReader(new FileReader(INPUTPATH));

            while ((line = br.readLine()) != null) {
                String[] splittedText = line.split(" ");
                uszok.add(swimmerFactory(splittedText));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        int uszomesterekSzama = 0;
        for (Uszo uszo : uszok) {
            if ( uszo instanceof Uszomester ) {
                uszomesterekSzama++;
            }
        }
        System.out.println("Az uszomesterek szama: " + uszomesterekSzama);

        Collections.sort(uszok);

        TreeMap<String, Double> gyorsuszoTreeMap = new TreeMap<>();
        TreeMap<String, Double> hatuszoTreeMap = new TreeMap();
        List<Uszomester> uszomesters = new ArrayList<>();




            for (Uszo uszo : uszok) {
                if ( uszo instanceof Gyorsuszo ) {
                    try {
                        double versenyezResult = ((Gyorsuszo) uszo).versenyez(100);
                        gyorsuszoTreeMap.put(uszo.getNev(), versenyezResult);
                    } catch (UszoException e) {
                        uszomesters.get(1).megment(uszo);
                    }
                } else if ( uszo instanceof Hatuszo ) {
                    try {
                        double versenyezResult = ((Hatuszo) uszo).versenyez(200);
                        hatuszoTreeMap.put(uszo.getNev(), versenyezResult);
                    } catch (UszoException e) {
                        uszomesters.get(1).megment(uszo);
                    }
                } else {
                    uszomesters.add((Uszomester) uszo);
                }
            }


        String fastestSwimmerName = null;
        double fastSwimWinnerId = 0;
        for (Map.Entry<String, Double> entry : gyorsuszoTreeMap.entrySet() ) {
            if ( entry.getValue() > fastSwimWinnerId ) {
                fastSwimWinnerId = entry.getValue();
                fastestSwimmerName = entry.getKey() + " ";
            }
        }

        String fastestBackSwimmerName = null;
        double backSwimWinnerId = 0;
        for (Map.Entry<String, Double> entry : hatuszoTreeMap.entrySet() ) {
            if ( entry.getValue() > backSwimWinnerId ) {
                backSwimWinnerId = entry.getValue();
                fastestBackSwimmerName = entry.getKey() + " ";
            }
        }

        BufferedWriter bw = null;


        try {
            bw = new BufferedWriter(new FileWriter(TXTOUTPUTPATH));
            bw.write(fastestSwimmerName);
            bw.write(fastestBackSwimmerName);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // combo line for multistrike :)
        /*String fastSwimmer = null;
        double timeTookToWinFastSwim = 0;

        for (Map.Entry<String, Double> entry : gyorsuszoTreeMap.entrySet()) {
            if ( fastSwimmer != null ) {
                if ( entry.getValue() > timeTookToWinFastSwim) {
                    fastSwimmer = entry.getKey();
                    timeTookToWinFastSwim = entry.getValue();
                }
            } else {
                fastSwimmer = entry.getKey();
                timeTookToWinFastSwim = entry.getValue();
            }
        }*/

        //serialize
        MyInitPack.serializeList(uszok ,SERIALIZEPATHFASTSWIM);
        MyInitPack.serializeList(uszok ,SERIALIZEPATHBACKSWIM);
        MyInitPack.serializeList(uszok ,SERIALIZEPATHLIFEGUARD);


        List<Gyorsuszo> deSerializedFastSwimmers = new ArrayList<>();
        List<Hatuszo> deSerializedBackSwimmers = new ArrayList<>();
        Uszomester deSerializedLifeGuard;

        deSerializedLifeGuard = (Uszomester) MyInitPack.deSerializeList(SERIALIZEPATHLIFEGUARD);
        deSerializedBackSwimmers.add((Hatuszo) MyInitPack.deSerializeList(SERIALIZEPATHBACKSWIM));
        deSerializedFastSwimmers.add((Gyorsuszo) MyInitPack.deSerializeList(SERIALIZEPATHFASTSWIM));

        System.out.println(deSerializedLifeGuard);
        System.out.println(deSerializedBackSwimmers);
        System.out.println(deSerializedFastSwimmers);


    }
}
