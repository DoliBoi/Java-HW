/*
 * File name: Lab06.java
 * Date:      2014/08/26 21:39
 * Author:    @author
 */

package cz.cvut.fel.pjv;


import java.util.Scanner;
import cz.cvut.fel.pjv.TextIO;

public class Lab02 {


  
   public void start(String[] args) {
     
       int count = 0, numOfLine = 0, erC = 0;
       double number, mean, standardDeviation, computationalSum = 0, squareSum = 0;
       String line;
       
       Scanner stdin;
       stdin = new Scanner(System.in);

       while(true){
           if(!stdin.hasNext()) {
                        System.err.print("End of input detected!\n");
                        break;
           }
            for(int i = 0;i < 10; i++) {
                    if(!stdin.hasNext()) {
                        System.err.print("End of input detected!\n");
                        erC = 1;
                        break;
                    }
                    line = stdin.nextLine();
                    numOfLine++;
                    if (TextIO.isDouble(line)) {
                        number = Double.parseDouble(line);}
                    else {
                        System.err.print("A number has not been parsed from line " + numOfLine + "\n");
                        i--;
                        continue;
                    }
                    squareSum += Math.pow(number, 2);
                    computationalSum += number;
                    count = i + 1;

            }
            if(count < 2)
                break;
            mean = computationalSum / count;
            double sumOfSquares = squareSum - ((Math.pow(computationalSum, 2)/(count)));
            double sSquared = sumOfSquares/(count);
            standardDeviation = Math.sqrt(sSquared);
            String fc = String.format("%2d ", count); 
            String fm = String.format("%.3f ", mean);
            String fsd = String.format("%.3f", standardDeviation);
            System.out.println(fc + fm + fsd);
            squareSum = 0;
            computationalSum  = 0;
            if(erC == 1)
                break;
            
       }
    
	   
   }
   }


/* end of Lab02.java */
