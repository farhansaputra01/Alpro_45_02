package ch02;

public class Trapesium {
	double alasBawah, alasAtas, tinggi;
	double alas() {
		return tinggi * (alasAtas + alasBawah) / 2;
	}
}