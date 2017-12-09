package com.flowacademy.uszas.parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.flowacademy.uszas.Gyorsuszo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SwimmerParser {
    private static final String JSONINPUT_PATH = "./data/input.txt";

    public static void main(String[] args) throws IOException {


        byte[] jsonData = Files.readAllBytes(Paths.get(JSONINPUT_PATH));
        ObjectMapper objMap = new ObjectMapper();

        BufferedReader br;
        String line;
        List<Gyorsuszo> gyorsuszos = new ArrayList<>();

        StringWriter stringWriter = new StringWriter();

        br = new BufferedReader(new FileReader(JSONINPUT_PATH));
        while ((line = br.readLine()) != null) {
            gyorsuszos.add(objMap.readValue(line, Gyorsuszo.class));
        }

        System.out.println(gyorsuszos);
    }

}
