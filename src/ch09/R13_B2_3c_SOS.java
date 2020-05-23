package ch09;
import java.util.Arrays; 
public class R13_B2_3c_SOS{
	static int SieveOfSundaram(int n) { 
	int nNew = (n - 2) / 2; 

	boolean marked[] = new boolean[nNew + 1]; 

	Arrays.fill(marked, false); 

	for (int i = 1; i <= nNew; i++) 
	for (int j = i; (i + j + 2 * i * j) <= nNew; j++) 
		marked[i + j + 2 * i * j] = true; 

	if (n > 2) 
	System.out.print(2 + " "); 

	for (int i = 1; i <= nNew; i++) 
	if (marked[i] == false) 
		System.out.print(2 * i + 1 + " "); 
	return -1; 
    }

	public static void main(String[] args) {
		R13_B2_3c_SOS object = new R13_B2_3c_SOS();
		System.out.println(" Program Algoritma Sieve of Sundaram : ");
		System.out.println();

		Scanner a = new Scanner (System.in);
		System.out.print(" Masukkan Batas Bilangan : ");
		int n = a.nextInt(); 
		System.out.print(" Menampilkan Bilangan Prima kecil dari "+ n +" : ");
		object.SieveOfSundaram(n); 
		}	
}
 