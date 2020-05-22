package ch04;

public class array_3 {
    public static void main(String[] args){
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        for(int awal = 0; awal < angka.length; awal++){
            int hasil = angka[awal]%2;
                    
                    if(hasil==1){
                        System.out.print(angka[awal]+" ");
            }
        }
    }
}