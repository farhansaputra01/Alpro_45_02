package ch05;

 class R7_B2_4c_Algoritma_LongestIS{
	static int lis(int arr[],int n){ 
		int lis[] = new int[n]; 
		int i,j,max = 0; 

		/* inialisasi */
		for ( i = 0; i < n; i++ ) 
			lis[i] = 1; 

		/* menghitung nilai lis dari atas kebawah */
		for ( i = 1; i < n; i++ ) 
			for ( j = 0; j < i; j++ ) 
						if ( arr[i] > arr[j] && lis[i] < lis[j] + 1) 
					lis[i] = lis[j] + 1; 

		/* Mengambil nilai tertinggi dari LIS */
		for ( i = 0; i < n; i++ ) 
			if ( max < lis[i] ) 
				max = lis[i]; 

			return max; 
	}
	
	public static void main(String args[]){ 
		int arr[] = { 30, 22, 9, 33, 25, 55, 41, 60 }; 
		R7_B2_4c_Algoritma_LongestIS algoritma= new R7_B2_4c_Algoritma_LongestIS();
			int n = arr.length; 
			System.out.println("Length Dari LongestIS : " + algoritma.lis( arr, n ) + "\n" ); 
	}
} 