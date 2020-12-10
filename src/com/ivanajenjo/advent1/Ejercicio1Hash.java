package com.ivanajenjo.advent1;

import java.io.File;
import java.util.*;

public class Ejercicio1Hash {
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
            Hashtable<Integer, Boolean> complement = new Hashtable<>();
            for (int j = 0; j < elArray.length; j++) {
                complement.put(elArray[j], true);
                int toFind = 2020-elArray[j];
                if (complement.containsKey(toFind)){
                    System.out.println(elArray[j] * toFind);
                }
            }
        }catch (Exception e){
            System.out.println("No se encuentra el archivo");
        }
    }
}
