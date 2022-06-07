package edu.escuelaing.arsw.app;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println(countLines(args[1]));

    }

    public static long countLines(String fileName){
        long lines = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.readLine() != null){
                lines++;}
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lines;
    }
}
