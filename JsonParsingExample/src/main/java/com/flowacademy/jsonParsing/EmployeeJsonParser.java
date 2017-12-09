package com.flowacademy.jsonParsing;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.flowacademy.jsonParsing.beans.Address;
import com.flowacademy.jsonParsing.beans.Employee;


public class EmployeeJsonParser {

    public static Employee createEmployee() {

        Employee employee = new Employee();
        employee.setId(100);
        employee.setName("David");
        employee.setPermanent(false);
        employee.setPhoneNumbers(new long[] { 123456, 987654 });
        employee.setRole("Manager");

        Address add = new Address();
        add.setCity("Bangalore");
        add.setStreet("BTM 1st Stage");
        add.setZipcode(560100);
        employee.setAddress(add);

        List<String> cities = new ArrayList<String>();
        cities.add("Los Angeles");
        cities.add("New York");
        employee.setCities(cities);

        Map<String, String> props = new HashMap<String, String>();
        props.put("salary", "1000 Rs");
        props.put("age", "28 years");
        employee.setProperties(props);

        return employee;
    }

    public static void main(String[] args) throws IOException {

        //read json file data to String
        byte[] jsonData = Files.readAllBytes(Paths.get("./data/employee.txt"));

        //create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        //convert json string to object
        Employee emp = objectMapper.readValue(jsonData, Employee.class);

        System.out.println("Employee Object\n"+emp);

        Employee employee = createEmployee();
        System.out.println(employee);

        String output = null;

        String out = objectMapper.writeValueAsString(employee);
        BufferedWriter bw = new BufferedWriter(new FileWriter("./data/output.txt"));
        bw.write(out);
        bw.close();
    }


}
