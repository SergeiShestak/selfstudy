package filehandlingdemo;

import javax.swing.*;
import java.io.*;


public class FileHandlingDemo {
    public static void main (String[] args){
        String line;
        BufferedReader reader = null;
        String text = "Hello Java world!!";

        try
        {
            reader = new BufferedReader(new FileReader("//home//sergei//myFile.txt"));
            line = reader.readLine();
            while (line != null){
                System.out.println(line);
                line = reader.readLine();
            }
        } catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            try
            {
                if (reader != null)
                    reader.close();
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        try
                (BufferedWriter writer = new BufferedWriter ( new FileWriter("//home//sergei//myFile1.txt",true)))
            {
                writer.write(text);
                writer.newLine();
            }

         catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
