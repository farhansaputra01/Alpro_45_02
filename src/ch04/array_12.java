package ch04;

public class array_12 {
     public static void main(String[] args){
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        for(int awal = 0;awal<angka.length-2;awal++){
            int b = awal + 1;
            int c = angka[awal]+angka[b];
            
            
            if(c%2==0){
                System.out.println(c);
            }
        }
    }
}
