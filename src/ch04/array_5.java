package ch04;

public class array_5 {
    public static void main(String[] args){

    int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

for (int awal=0; awal < angka.length-1; awal++){
    int satuan = angka[awal] - 2;
    int puluhan = angka[awal] - 20;

    for(int x=0; x<10; x++){
	int kali = 10*x;
	
	if(satuan == kali){
	    System.out.println(angka[awal]+" ");
        }else if (puluhan == x){
	    System.out.println(angka[awal]+" ");
                }
            }
        }
    }
}