package org.example;

import java.util.Scanner;

public class TemperatureAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Part 1: Input and String Parsing

        System.out.print("Enter Day 1 High Temperature (e.g., 28.5): ");
        String day1TempStr = sc.nextLine();
        System.out.print("Enter Day 2 High Temperature (e.g., 28.5): ");
        String day2TempStr = sc.nextLine();
        System.out.print("Enter Day 3 High Temperature (e.g., 28.5): ");
        String day3TempStr = sc.nextLine();

        System.out.println();
        System.out.println("--- Temperature Analysis ---");
        System.out.println();

        double day1TempPrimitive = 28.5;
        try {
            day1TempPrimitive = Double.parseDouble(day1TempStr);
            System.out.println("Parsed Day 1 Temp (primitive double): " + day1TempPrimitive);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for Day 1 temperature. Setting default value to 28.5.");
        }

        double day2TempPrimitive = 28.5;
        try {
            day2TempPrimitive = Double.parseDouble(day2TempStr);
            System.out.println("Parsed Day 2 Temp (primitive double): " + day2TempPrimitive);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for Day 2 temperature. Setting default value to 28.5.");
        }

        double day3TempPrimitive = 28.5;
        try {
            day3TempPrimitive = Double.parseDouble(day3TempStr);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for Day 3 temperature. Setting default value to 28.5.");
        }
        System.out.println();

        // Part 2: Wrapper Object Creation (valueOf)

        Double day1TempWrapper = Double.valueOf(day1TempPrimitive);
        Double day2TempWrapper = Double.valueOf(day2TempPrimitive);

        // Part 3: Comparison (compareTo)

        int comparison = day1TempWrapper.compareTo(day2TempWrapper);
        System.out.print("Day 1 (" + day1TempWrapper + "°C) was ");
        switch (comparison) {
            case 1:
                System.out.print("warmer than");
                break;
            case -1:
                System.out.print("cooler than");
                break;
            default:
                System.out.print("the same temperature as");
                break;
        }
        System.out.println(" Day 2 (" + day2TempWrapper + "°C).");
        System.out.println();

        sc.close();
    }
}