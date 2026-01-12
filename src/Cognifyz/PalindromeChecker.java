package Cognifyz;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word or phrase: ");
        String input = sc.nextLine();

        // Remove spaces and punctuation, convert to lowercase
        String clean = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reverse = "";
        for (int i = clean.length() - 1; i >= 0; i--) {
            reverse = reverse + clean.charAt(i);
        }

        if (clean.equals(reverse)) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is NOT a Palindrome");
        }

        sc.close();
    }
}
