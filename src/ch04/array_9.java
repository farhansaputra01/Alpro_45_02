package ch04;

public class array_9 {
    public static void main(String[] args){
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        for(int awal = 0; awal < angka.length-1; awal++){
            int a = awal + 1;
            int b = angka[awal] - angka[a];
            int c = angka[a]-angka[awal];    
                if(angka[a]>angka[awal]){
                    System.out.println(c+" ");
                }else if(angka[a]<angka[awal]){
                    System.out.println(b+" ");
                    
            } 
        }
    }
}