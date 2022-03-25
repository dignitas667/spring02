package net.developia.spring02.mvc1;

public class RandomTest {
	public static void main(String[] args) {
		//4~15 숫자 생성
		int num = (int)(Math.random() * 12)+4;
		
		/*
		  600  700  800  900 1000
		 1100 1200 1300 1400 1500
		 1600 1700 1800 1900 2000
		 2100 2200 2300
		 */
		int num2 = ((int)(Math.random() * 18) + 6) * 100;
	}
}
