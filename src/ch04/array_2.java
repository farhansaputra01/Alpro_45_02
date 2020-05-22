package ch04;

import java.util.Scanner;

public class array_2 {
    
    public static void main(String[] args){
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        Scanner x = new Scanner(System.in);
        
        System.out.print("Mencari angka : ");
        int cari = x.nextInt();
        boolean hasil = false;
        
        for(int awal = 0; awal < angka.length; awal++){
           
            if(cari == angka[awal]){
                hasil = true;
            }
        }    
            if(hasil){
                System.out.println("Angka "+ cari +" terdapat didalam array ");
            }else{
                System.out.println("tidak ada didalam array ");
            
        }
    }
}