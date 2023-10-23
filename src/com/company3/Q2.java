package com.company3;
import java.util.HashMap;
import java.util.Scanner;
public class Q2 {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int charValue = romanValues.get(s.charAt(i));

            if (charValue < prevValue) {
                result -= charValue;
            } else {
                result += charValue;
            }

            prevValue = charValue;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Roman numeral: ");
        String romanNumeral= sc.nextLine();
        romanNumeral = romanNumeral.toUpperCase();
//         romanNumeral = "IX";
        int integerEquivalent = romanToInt(romanNumeral);
        System.out.println("Roman numeral " + romanNumeral + " is equivalent to " + integerEquivalent);
    }
    }

