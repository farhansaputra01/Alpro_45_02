package ch08;
public class R12_B2_1c_LCSP{
	public static int LCSubStr(char X[], char Y[], int m, int n){ 

		int LCStuff[][] = new int[m + 1][n + 1]; 
		int result = 0;

		for (int i = 0; i <= m; i++){ 
			for (int j = 0; j <= n; j++){ 
				if (i == 0 || j == 0) 
					LCStuff[i][j] = 0; 
				else if (X[i - 1] == Y[j - 1]){ 
					LCStuff[i][j] = LCStuff[i - 1][j - 1] + 1; 
					result = Integer.max(result, LCStuff[i][j]); 
				} 
				else
					LCStuff[i][j] = 0; 
			} 
		} 
		return result; 
	} 
 		
	public static void main(String[] args){ 
		System.out.println(" Program Algoritma Longest Common Substring Problem : ");
		System.out.println();
		Scanner a = new Scanner (System.in);
		System.out.print(" Masukkan Nilai Bilangan String Pertama : ");
		String X = a.nextLine();
		Scanner b = new Scanner (System.in);
		System.out.print(" Masukkan Nilai Bilangan String Kedua : ");
		String Y = b.nextLine();

		// String X = "OldSite:ArlanCoding.com"; 
		// String Y = "NewSite:W3School.com"; 

		R12_B2_1c_LCSP object = new R12_B2_1c_LCSP();
		int m = X.length(); 
		int n = Y.length(); 

		System.out.println(" Panjang Dari Longest Common Substring : "
				+ object.LCSubStr(X.toCharArray(), Y.toCharArray(), m, n)); 
	}
} 