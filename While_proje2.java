package Temel_Kavramlar;


import java.util.Scanner;
public class While_proje2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int fakt = 1;
	    System.out.println("Sayı giriniz: ");
	    int n = scan.nextInt();
	    while(n >0) {
	       fakt *=n;
	       n--; 
	       }
	        System.out.println("Girilen sayının faktöriyeli = " +fakt);

	}

}
