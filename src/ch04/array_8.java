package ch04;

public class array_8 {
    public static void main(String[] args){
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int sum = 0;
        
            for(int num : angka){
                sum = sum+num;
            }
            System.out.println("Jumlah nilai dari seluruh angka adalah = " + sum);
    }
}