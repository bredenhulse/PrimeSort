/*
Name: Breden Hulse
Class: Computer Science 2
Program: Will tell you the prime numbers leading up to the main number.
*/
import java.io.*;
import java.util.*;
public class PrimeSort{
    public static void main(String[]args)throws IOException{
		Scanner scan = new Scanner(new File("src/text.dat"));
        while(scan.hasNextInt()){
            int number = scan.nextInt();
            int[][] count = new int[2][number];
            for(int i = 1; i <= count[0].length; i++){//Make 2D Array
                count[1][i - 1] = 0;
                count[0][i - 1] = i;
            }
            for(int i = 2; i < count[0].length; i++){//Determines the prime numbers
                int num = 2;
                if(count[1][i - 1] == 1){
                    break;
                }
                for(int j = i * 2; j <= count[0].length; j = i * num){
                    count[1][j - 1] = 1;
                    num++;
                }
            }
            for(int i = 1; i < count[0].length; i++){//Print Prime Numbers leading up the number.
                if(count[1][i] == 0){
                    System.out.print(count[0][i] + " ");
                }
                if(i + 1 == count[0].length && count[0].length != 1){
                    System.out.println();
                }     
            }
        }   
	}
}
