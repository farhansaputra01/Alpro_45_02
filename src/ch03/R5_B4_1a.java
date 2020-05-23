package ch03;

import java.util.Scanner;
public class R5_B4_1a {
    public static void main(String[] args){
        Scanner nilai = new Scanner(System.in);
        
        System.out.println("*** Menentukan Nilai Tertinggi ***");
            int x,y,z;
        System.out.print("Masukkan nilai x = ");
            x = nilai.nextInt();
        System.out.print("Masukkan nilai y = ");
            y = nilai.nextInt();
                 
        if (x >= y){
            System.out.println("Nilai tertinggi antara variabel x dan y adalah "+ x);
        }else if(y >= x){
            System.out.println("Nilai tertinggi antara variabel x dan y adalah "+ y);
        }
    }
}