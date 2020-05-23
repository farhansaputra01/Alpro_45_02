package ch09;
public class R13_B2_2c_SOE{
	void sieveOfEratosthenes(int n){ 
		boolean prime[] = new boolean[n+1]; 
		for(int i=0;i<n;i++) 
			prime[i] = true; 

		for(int p = 2; p*p <=n; p++) 
		{ 
			if(prime[p] == true) 
			{ 
				for(int i = p*p; i <= n; i += p) 
					prime[i] = false; 
			} 
		} 
		for(int i = 2; i <= n; i++) 
		{ 
			if(prime[i] == true) 
				System.out.print(i + " "); 
		} 
	}
	
	public static void main(String args[]){ 
		System.out.println(" Program Algoritma Sieve Of Eratosthenes : ");
		System.out.println();

		R13_B2_2c_SOE object = new R13_B2_2c_SOE();

		Scanner a = new Scanner (System.in);
		System.out.print(" Masukkan Batas Bilangan : ");
		int n = a.nextInt(); 

		System.out.print(" Bilangan Prima "); 
		System.out.print(" Kecil dari " + n + " : "); 

		object.sieveOfEratosthenes(n); 
	}
}  