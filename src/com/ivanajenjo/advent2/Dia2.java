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
            int valid = 0;
            for (String line:elArray) {
                String[] splitted = line.split(String.valueOf(':'));
                String politica = splitted[0];
                String password = splitted[1];
                String rangos = politica.split(String.valueOf(' '))[0];
                int startRango = Integer.parseInt(rangos.split(String.valueOf('-'))[0]);
                int endRango = Integer.parseInt(rangos.split(String.valueOf('-'))[1]);
                char letra = politica.split(String.valueOf(' '))[1].charAt(0);
                int count = 0;
                for (char caracter:password.toCharArray()) {
                    if (letra == caracter){
                        count++;
                    }
                }
                if ((count >= startRango) && (count <= endRango)){
                    valid++;
                }
            }
            System.out.println(valid);
        }catch (Exception e){
            System.out.println("No se encuentra el archivo");
            e.printStackTrace();
        }
    }
}
