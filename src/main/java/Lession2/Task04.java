package Lession2;

import java.io.FileWriter;
import java.io.IOException;

public class Task04 {//Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет
//    эту строку в простой текстовый файл, обработайте исключения.
public static void main(String[] args) {
    String temp = "TEST";
    int n = 5;
    //System.out.println(repeat(temp,n));
    String file = "test.txt";
    writeFile(repeat(temp,n),file);
}

    public static String repeat(String args, int n) {
    StringBuilder stringBuilder = new StringBuilder(args);
        for (int i = 1; i < n ; i++) {
            stringBuilder.append(" ");
            stringBuilder.append(args);


        }
        return  stringBuilder.toString();
    }

    public static void writeFile(String args,String nameFile) {
        try {
            FileWriter writer = new FileWriter(nameFile);
            writer.write(args);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static void readFile(String nameFile) {

    }
}