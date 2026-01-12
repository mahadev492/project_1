package Cognifyz;

import java.io.*;
import java.util.Scanner;

public class FileEncryptionDecryption {

    static final int KEY = 3; // shift value

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Encrypt File");
        System.out.println("2. Decrypt File");
        System.out.print("Choose option (1 or 2): ");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter input file path: ");
        String inputFile = sc.nextLine();

        System.out.print("Enter output file path: ");
        String outputFile = sc.nextLine();

        try {
            FileReader fr = new FileReader(inputFile);
            FileWriter fw = new FileWriter(outputFile);

            int ch;
            while ((ch = fr.read()) != -1) {
                if (choice == 1) {
                    fw.write(ch + KEY); // Encrypt
                } else if (choice == 2) {
                    fw.write(ch - KEY); // Decrypt
                }
            }

            fr.close();
            fw.close();

            System.out.println("Operation completed successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

