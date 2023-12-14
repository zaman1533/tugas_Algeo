package modul.pkg4;

import java.util.Scanner;
public class Penjumlahan_matriks_3x3
{
    public static void main(String[] arga) 
    {
        Scanner inputan= new Scanner (System.in); 
            int A[][]=new int [3][3]; 
            int B[][]=new int [3][3];
            int C[][]=new int [3][3];
            
            System.out.println("Masukan nilai matrixs X"); 
            System.out.println("======================");
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                {
                    System.out.println("[" +(i+1)+ "}{" +(j+1)+"}:");
                    A[i][j]=inputan.nextInt(); 
                }
            }
            
            System.out.println("\n21Masukan nilai matriks Y");
            System.out.println("======================");
            for (int i=0;i<3;i++)
            {
                for (int j=0;j<3;j++)
                {
                    System.out.print("[" +(i+1)+"][" +(j+1)+ "]");
                    B[i][j]=inputan.nextInt();
                }
            }
            
            for (int i=0;i<3;i++) 
            {
                for (int j=0;j<3;j++) 
                {
                    C[i][j]=A[i][j]+B[i][j];
                }
            }
            System.out.println("\n Hasil Penjumlahan matriks");
            System.out.println("=========================");
            for (int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                {
                    System.out.print(+(C[i][j])+" "); 
                }
                System.out.println(" ");
            }
            
                    
    }
}