package ch04;

public class array_11 {
    public static void main(String[] args){
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        for(int awal = 0; awal < angka.length-1; awal++){
            int a = awal + 1;
            
                if(angka[awal]<angka[a]){
                    System.out.println(angka[awal]+" ");
                }
        }
    }
}
