package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniela Gomez-Dugan
 */
public class Self_Checkout
{
    public static void main( String[] args )
    {
        // Program to calculate total of three items in a supermarket

        final double tax_rate = 0.055;
        Scanner input = new Scanner(System.in);

        double subtotal = 0.0;

        // Ask the user for information of each of the three items
        for (int i = 0; i < 3; i++)
        {
            System.out.print("Enter the price of item " + (i+1) + ": ");
            double item_price = input.nextDouble();
            System.out.print("Enter the quantity of item " + (i+1) + ": ");
            double quantity = input.nextDouble();
            subtotal += item_price * quantity;
        }

        System.out.println("Subtotal: $" + String.format("%.2f", subtotal));

        // Calculate tax
        double tax = subtotal * tax_rate;
        System.out.println("Tax: $" + String.format("%.2f", tax));

        double total = subtotal + tax;
        System.out.println("Total: $" + String.format("%.2f", total));
    }
}
