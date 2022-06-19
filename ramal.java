import java.util.Scanner;

public class Ramal {
  public static void main(String[] args) {
    
	  String namalaki, umurlaki, namacewe, umurcewe;
	  int acak;
	  double hasil;


		System.out.println("Selamat Datang di Program Ramalan Cupu nama anda");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");

		System.out.println("Data Anda 	:");
		System.out.println("^^^^^^^^^^^^");		
    
		Scanner tulisnamalaki = new Scanner(System.in);
		System.out.println("Masukan Nama Anda		:");
		namalaki = tulisnamalaki.nextLine();

		Scanner tulisumurlaki = new Scanner(System.in);
		System.out.println("Masukan Umur Anda		:");
		umurlaki = tulisumurlaki.nextInt();


		System.out.println("Data Pasangan Anda 	:");
		System.out.println("^^^^^^^^^^^^");		
		
    Scanner tulisnamacewe = new Scanner(System.in);
		System.out.println("Masukan Nama Anda		:");
		namacewe = tulisnamacewe.nextLine();
		
		Scanner tulisumurcewe = new Scanner(System.in);
		System.out.println("Masukan Umur Anda		:");
		umurcewe = tulisumurcewe.nextInt();

		System.out.println(namalaki + "[" + umurlaki + "]" + "Tahun");
		System.out.println("LoveLoveLoveLoveLoveLoveLoveLoveLoveLove");
		System.out.println(namacewe + "[" + umurcewe + "]" + "Tahun");

		System.out.println("Tekan ENTER untuk melihat hasil Ramalan.....");
		acak = 50 + (int)(Math.random() * 50);
		hasil = (acak/1.1);

		System.out.println("Kecocokan anda dengan Pasangan anda adalah   :" + String.format("%.2f", hasil) + " %");		
		System.out.println("Terima Kasih anda telah menggunakan jasa Ramalan kami...   ^^v");
  }
}
