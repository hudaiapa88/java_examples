package com.uc.io_example;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args)  {
        String a= "123.435.434.433        www.23.43.54.com";
        String[] ar=a.split(" ");
        System.out.println(ar[0]);
        System.out.println(ar[ar.length-1]);
        File file= new File("src/main/java/com/uc/io_example/example.txt");
        //Create
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        //Write
        String data="Hello Java ıİĞğÇç";
        try (FileWriter fw= new FileWriter(file, StandardCharsets.UTF_8)
             ;BufferedWriter bw= new BufferedWriter(fw)) {
            bw.write(data);
        }  catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //Read
       String line;
        try( FileReader reader  = new FileReader(file, StandardCharsets.UTF_8);
             BufferedReader br= new BufferedReader(reader)) {
            while ((line=br.readLine())!=null)
            {
                System.out.println(line);
            }
          /*  int character= br.read();
            while (character!=-1){
                System.out.print(((char)character));
                character= br.read();
            }*/
        }  catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
