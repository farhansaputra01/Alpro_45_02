package ch04;

public class array_14{
    
    public static void main(String[] args){
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int x = 0;
        int sum = 0;
        
            for(int mulai = 0; mulai < angka.length; mulai++){
                x = x + angka[mulai]-1;
                sum = sum + angka[mulai];
            }
                System.out.println(x+sum);
    }   
}