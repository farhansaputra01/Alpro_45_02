package ch04;

public class array_10 {
    public static void main(String[] args){
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        for(int awal = 0; awal < angka.length-2; awal++){
            int a = awal + 1;
            int b = angka[awal]-angka[a];
            int c = angka[a]-angka[awal];
            int d = angka[awal]%2;
            int e = angka[a]%2;
            if((angka[a]>angka[awal])&&(e==0)&&(d==0)){
                System.out.println(c+" ");
            }else if((angka[a]<angka[awal])&&(e==0)&&(d==0)){
                System.out.println(b+" ");
            }
        }
    }    
}
