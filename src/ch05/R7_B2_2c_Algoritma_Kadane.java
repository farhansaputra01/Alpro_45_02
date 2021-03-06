package ch05;

public class R7_B2_2c_Algoritma_Kadane{
		int[] arr1 = {1,2,-3,-4,2,7,-2,3};
		int[] arr2 = { -2, -3, -4, -2, -7, -2, -3,-11 };
	public int kandane(int[] arrA) {
		int max_end_here = 0;
		int max_so_far = 0;
		for (int i = 0; i < arrA.length; i++) {
			max_end_here += arrA[i];
			if (max_end_here < 0) {
				max_end_here = 0;
			}
			if (max_so_far < max_end_here) {
				max_so_far = max_end_here;
			}
		}
		return max_so_far;
	}
	public int KandaneModify(int[] arrA) {
		int max_end_here = arrA[0];
		int max_so_far = arrA[0];
		for(int i=1;i<arrA.length;i++){
			max_end_here = Math.max(arrA[i], max_end_here+arrA[i]);
			max_so_far = Math.max(max_so_far,max_end_here);
		}
		return max_so_far;
	}	
	public void cetak(){
		for (int i = 0; i < arr1.length ; i++ ) {
			System.out.print(arr1[i]+", " );

		}
	}
	public void cetak2(){
		for (int i = 0; i < arr2.length ; i++ ) {
			System.out.print(arr2[i]+", " );

		}
	}

	public static void main(String[] args) {

		System.out.println(" Program Algoritma Kadane : Menentukan Nilai Maximum dari Subarray");
		System.out.println();

		R7_B2_2c_Algoritma_Kadane i = new R7_B2_2c_Algoritma_Kadane();
		int arrA[] = { 1, 2, -3, -4, 2, 7, -2, 3 };
		i.cetak();
		System.out.println();
		System.out.println("Maximum subarray : " + i.kandane(arrA));

		int arrB[] = { -2, -3, -4, -2, -7, -2, -3,-11 };
		i.cetak2();
		System.out.println();
		System.out.println("Maximum Subarray : " + i.KandaneModify(arrB));
	}
} 