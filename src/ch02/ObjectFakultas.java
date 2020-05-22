package ch02;

public class ObjectFakultas {
	public static void main(String[] args){
		Fakultas fk1 = new Fakultas();
		fakultas fk2 = new Fakultas();
		
		fk1.nama = "Sains dan Teknologi";
		fk1.jumlahMahasiswa = 2354;

		fk1.nama = "Psikologi";
		fk1.jumlahMahasiswa = 1202;	
		
		System.out.println("Fakultas " + fk1.getNama() +": "+ fk1.getJumlahMahasiwa());
		System.out.println("Fakultas " + fk2.getNama() +": "+ fk2.getJumlahMahasiwa());
	}
}