package com.ijse.aadassignment01;

import java.io.*;

public class Deserialization {

    public static void main(String[] args) {
        Student student = null;

        try {
            FileInputStream fileInputStream = new FileInputStream("saminda.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            student = (Student) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println("Deserialized Student Object: " + student);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}