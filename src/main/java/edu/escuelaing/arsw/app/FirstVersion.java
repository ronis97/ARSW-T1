package edu.escuelaing.arsw.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Hello world!
 *
 */
public class FirstVersion {
    public static void main(String[] args) {
        //System.out.println(countLinesPhysical(args[1]));
        //System.out.println(countLinesOfCode(args[1]));
        //System.out.println(countLinesPhysical("src/main/resources/English.java"));
        //System.out.println(countLinesOfCode("src/main/resources/English.java"));
        String option = args[0];
        if (option.equals("phy")){
            System.out.println(countLinesPhysical(args[1]));
        }
        else if(option.equals("loc")){
            System.out.println(countLinesOfCode(args[1]));
        }
    }

    public static long countLinesPhysical(String fileName) {
        long lines = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.readLine() != null) {
                lines++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lines;
    }

    public static long countLinesOfCode(String fileName) {
        long lines = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String row;
            while ((row = reader.readLine()) != null) {
                if(getFirstCharacterFromString(row) != '*'
                    && getFirstCharacterFromString(row) != '/'
                && getFirstCharacterFromString(row) != ' ') lines++;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lines;
    }


    public static char getFirstCharacterFromString(String string){
        char value = ' ';
        try{
            int count = 0;
            while(string.charAt(count) == ' '){
                count++;
            }
            value = string.charAt(count);
        }
        catch (Exception e){ }
        return value;
    }
}