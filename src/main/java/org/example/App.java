/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Berkay Arslan
 */

package org.example;
import java.util.*;
public class App
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("How many people? ");
        int people = s.nextInt();
        System.out.print("How many pizzas do you have? ");
        int pizza=s.nextInt();
        System.out.print("How many slices per pizza? ");
        int slice=s.nextInt();
        int total=slice*pizza;
        System.out.println(people+" people with " +pizza+ " pizzas ("+total+" slices)");
        if(total/people==1)
        {
            System.out.println("Each person gets " +total/people+ " piece of pizza.");
            System.out.println("There are " +(total%people)+ " leftover pieces.");
        }
        else
        {
            System.out.println("Each person gets " +total/people+ " pieces of pizza.");
            System.out.println("There are " +(total%people)+ " leftover pieces.");
        }
    }
}