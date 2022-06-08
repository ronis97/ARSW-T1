package edu.escuelaing.arsw.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class SecondVersion {
    public static void main(String[] args) {
        calculateTotalLinesFromDirectory(args);
    }
    public static long calculateTotalLinesFromDirectory(String[] params){
        String option = params[0];
        File file = new File(params[1]);
        long lines = 0;
        if (file.isDirectory()){
            for(File file1: file.listFiles()){
                if (option.equals("phy")) FirstVersion.countLinesPhysical(file1.getName());
                else if (option.equals("loc")) FirstVersion.countLinesOfCode(file1.getName());
            }
        }
        System.out.println(lines);
        return 0;
    }

}
