package cz.cvut.fel.pjv;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Lab01 {
   
   public static void start(String[] args) {
     
       Scanner reader = new Scanner(System.in);
       System.out.println("Vyber operaci (1-soucet, 2-rozdil, 3-soucin, 4-podil):");
       
       int operator = reader.nextInt();
       if (operator < 1 || operator > 4) {
           System.out.println("Chybna volba!");
           return;
       }
       
       double first = 0;
       double second = 0;
       double result = 0;
       
       switch(operator) {
           case 1:
               System.out.println("Zadej scitanec: ");
               first = reader.nextDouble();
               System.out.println("Zadej scitanec: ");
               second = reader.nextDouble();
               result = first + second;
               break;
            
           case 2:
               System.out.println("Zadej mensenec: ");
               first = reader.nextDouble();
               System.out.println("Zadej mensitel: ");
               second = reader.nextDouble();
               result = first - second;
               break;
            
           case 3:
               System.out.println("Zadej cinitel: ");
               first = reader.nextDouble();
               System.out.println("Zadej cinitel: ");
               second = reader.nextDouble();
               result = first * second;
               break;
            
           case 4:
               System.out.println("Zadej delenec: ");
               first = reader.nextDouble();
               System.out.println("Zadej delitel: ");
               second = reader.nextDouble();
               if (second == 0) {
                   System.out.println("Pokus o deleni nulou!");
                   return;}
               result = first / second;
               break;
       }
       
       System.out.println("Zadej pocet desetinnych mist: ");
       int format = reader.nextInt();
       if (format < 0) {
           System.out.println("Chyba - musi byt zadane kladne cislo!");
           return;
       }
       
       String ff = String.format("%." + format + "f", first); 
       String fs = String.format("%." + format + "f", second);
       String fr = String.format("%." + format + "f", result);
       
       switch (operator) {
           case 1:
               System.out.println(ff + " + " + fs + " = " + fr);
               break;
           case 2:
               System.out.println(ff + " - " + fs + " = " + fr);
               break;
           case 3:
               System.out.println(ff + " * " + fs + " = " + fr);
               break;
           case 4:
               System.out.println(ff + " / " + fs + " = " + fr);
               break;
               
       }
       
   }
}