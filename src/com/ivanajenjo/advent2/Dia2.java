package com.ivanajenjo.advent2;

import java.io.File;
import java.util.Scanner;

public class Dia2 {
    public static void main(String[] args) {
        try {
            File myObj = new File("C:\\Users\\ivana\\IdeaProjects\\Advent-of-code\\src\\com\\ivanajenjo\\advent2\\input-day-2.txt");
            Scanner myReader = new Scanner(myObj);
            String[] elArray = new String[1000];
            int i = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                elArray[i++] = data;
            }
            for (String line:elArray) {
                String[] splitted = line.split(String.valueOf(':'));
                String politica = splitted[0];
                String password = splitted[1];
                String rangos = politica.split(String.valueOf(' '))[0];
            }
        }catch (Exception e){
            System.out.println("No se encuentra el archivo");
        }
    }
}
