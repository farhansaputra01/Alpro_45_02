package ch04;

import java.util.Scanner;

public class R5_B4_1d {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("*** Menentukan Bilangan Prima ***");
        System.out.print("Masukkan angka = ");
        int angka = x.nextInt();
        boolean prima = true;
        for(int pembagi = 2; pembagi < angka; pembagi++){
            
            if((angka % pembagi) == 0){
                prima = false ;
                break;
                
            }
        }
        
            if(prima){
                System.out.println(angka + " Merupakan Bilangan Prima");
            }else{
                System.out.println(angka + " Bukan Bilangan Prima");
            }
    }
}