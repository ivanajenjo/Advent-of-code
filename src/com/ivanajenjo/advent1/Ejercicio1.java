package com.ivanajenjo.advent1;

import java.io.*;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        try {
            File myObj = new File("C:\\Users\\ivana\\IdeaProjects\\DAM\\src\\com\\ivanajenjo\\advent1\\Input Advent 1.txt");
            Scanner myReader = new Scanner(myObj);
            int[] elArray = new int[200];
            int i = 0;
            while (myReader.hasNextLine()) {
                int data = myReader.nextInt();
                elArray[i++] = data;
            }

            for (int j = 0; j < elArray.length; j++) {
                for (int k = 0; k < elArray.length; k++) {
                    for (int l = 0; l < elArray.length; l++) {
                        if ((elArray[j] + elArray[k] + elArray[l]) == 2020){
                            System.out.println(elArray[j] * elArray[k] * elArray[l]);
                        }
                    }

                }
            }
        }catch (Exception e){
            System.out.println("No se encuentra el archivo");
        }
    }
}
