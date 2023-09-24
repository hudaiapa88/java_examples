package com.uc.io_example;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

public class HostMain {
    public static void main(String[] args) throws IOException {
        //Verileri oluşturmak için
        File hostFile = new File("src/main/java/com/uc/io_example/etc/hosts.txt");
        File myHostFile = new File("src/main/java/com/uc/io_example/MyHosts.txt");

     /*   hostFile.createNewFile();
        myHostFile.createNewFile();
        String hosts = "234.45.23.56 google.com\n" +
                "763.12.345.67 amazon.com\n" +
                "746.4123.45.6 facebook.com\n";
        String myHosts = "234.45.23.56 google.com\n" +
                "345.25.789.23 samsung.com\n" +
                "595.576.653.129 starbucks.com\n" +
                "62.875.123.63 smartin.com.tr\n" +
                "746.4123.45.6 facebook.com\n";
        fileWrite(myHosts, myHostFile);
        fileWrite(hosts, hostFile);*/


        //Okuma ve diğer işlemler
        HashMap<String,String> hostList = readHosts(hostFile);
        HashMap<String,String> myHostList = readHosts(myHostFile);


        for (Map.Entry<String,String> myHost:myHostList.entrySet()) {
            hostList.replace(myHost.getKey(),myHost.getValue());
            hostList.putIfAbsent(myHost.getKey(),myHost.getValue());
        }
        hostAdd(hostList,hostFile);

    }

    static void fileWrite(String text, File file) {
        try (FileWriter fw = new FileWriter(file, StandardCharsets.UTF_8)
             ; BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(text);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    static void hostAdd(HashMap<String,String> map,File file){
        try (FileWriter fw = new FileWriter(file, StandardCharsets.UTF_8)
             ; BufferedWriter bw = new BufferedWriter(fw)) {
            for (Map.Entry<String,String> host:map.entrySet()) {
                bw.write(host.getValue()+" "+host.getKey()+"\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    static HashMap<String,String> readHosts(File file) {
        try (FileReader reader = new FileReader(file, StandardCharsets.UTF_8);
             BufferedReader br = new BufferedReader(reader)) {
            HashMap<String,String> map=new HashMap<>();
            String line;
            while ((line=br.readLine())!=null)
            {
                String[] ar= line.split(" ");
                map.put(ar[ar.length-1],ar[0]);
            }
            return map;

        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
        }

    }
}
