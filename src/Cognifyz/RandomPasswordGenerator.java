package Cognifyz;

import java.util.Random;
import java.util.Scanner;

public class RandomPasswordGenerator {
	  public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        Random random = new Random();

	        System.out.print("Enter password length: ");
	        int length = sc.nextInt();

	        System.out.print("Include numbers? (y/n): ");
	        char numbers = sc.next().charAt(0);

	        System.out.print("Include lowercase letters? (y/n): ");
	        char lower = sc.next().charAt(0);

	        System.out.print("Include uppercase letters? (y/n): ");
	        char upper = sc.next().charAt(0);

	        System.out.print("Include special characters? (y/n): ");
	        char special = sc.next().charAt(0);

	        String chars = "";

	        if (numbers == 'y' || numbers == 'Y')
	            chars += "0123456789";

	        if (lower == 'y' || lower == 'Y')
	            chars += "abcdefghijklmnopqrstuvwxyz";

	        if (upper == 'y' || upper == 'Y')
	            chars += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	        if (special == 'y' || special == 'Y')
	            chars += "!@#$%^&*()-_=+[]{}<>?";

	        if (chars.isEmpty()) {
	            System.out.println("Please select at least one character type!");
	        } else {
	            String password = "";

	            for (int i = 0; i < length; i++) {
	                int index = random.nextInt(chars.length());
	                password += chars.charAt(index);
	            }

	            System.out.println("Generated Password: " + password);
	        }

	        sc.close();
	    }
	}

