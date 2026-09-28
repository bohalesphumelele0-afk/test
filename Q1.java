/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java
 */

package com.mycompany.q1;

public class Q1 {

    public static void main(String[] args) {

        // array for the city names
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};

        // array for the console names
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        // 2D array for sales
        int[][] sales = {
            {1000, 2000, 3000},  // Cape Town
            {2000, 3000, 4000},  // Port Elizabeth
            {1500, 1100, 1200}   // Pretoria
        };

        // Array to store total sales
        int[] cityTotals = new int[cities.length];

        int highestSales = 0;
        String cityWithMostSales = "";

        // Display report heading
        System.out.println("-------------------------------------------");
        System.out.println("          GAMING CONSOLE REPORT");
        System.out.println("-------------------------------------------");

        // Display column headings
        System.out.printf("%-20s %-10s %-10s %-10s%n",
                "CITY", consoles[0], consoles[1], consoles[2]);

        // Display sales and calculate totals
        for (int i = 0; i < sales.length; i++) {

            int total = 0;

            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }

            cityTotals[i] = total;

            // Find city with the highest sales
            if (total > highestSales) {
                highestSales = total;
                cityWithMostSales = cities[i];
            }

            System.out.printf("%-20s %-10d %-10d %-10d%n",
                    cities[i],
                    sales[i][0],
                    sales[i][1],
                    sales[i][2]);
        }

        // Display totals
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println("       CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("-------------------------------------------");

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s %d%n",
                    cities[i], cityTotals[i]);
        }

        // City with the most sales
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println("CITY WITH THE MOST SALES: " + cityWithMostSales);
        System.out.println("TOTAL SALES: " + highestSales);
        System.out.println("-------------------------------------------");
    }
}