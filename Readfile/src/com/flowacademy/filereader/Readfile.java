package com.flowacademy.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Readfile {

    private static final String SZAMOK = "./data/szamok";

    public static void main(String[] args) {

        BufferedReader br = null;

        try {


            br = new BufferedReader(new FileReader(SZAMOK));
                String line;

                while ((line = br.readLine()) != null) {
                    String[] splittedLine = line.split(" ");
                    for (String string : splittedLine) {
                        System.out.print(string + "\n");
                    }
                }
            } catch(IOException e){
                e.printStackTrace();
            } finally {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
            }
        }
        }
    }

