package com.ijse.aadassignment01;

import java.io.*;

public class Serialization {
    public static void main(String[] args) {
        Student s = new Student("1", "uthpala", "21");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("saminda.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(s);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Object has been Serialized");

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}