package functionExample;
import java.util.Scanner;
public class Angka {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan dua angka untuk dijumlahkan:");
        System.out.print("Angka Pertama: ");
        Integer angka1 = scanner.nextInt();
        System.out.print("Angka kedua: ");
        Integer angka2 = scanner.nextInt();
        Integer hasil = jumlah(angka1, angka2);
        System.out.println("Hasil penjumlahan: " + hasil);
        scanner.close();

    }

    public static Integer jumlah(Integer a, Integer b){
        Integer hasil = a + b;
        return hasil;
        
    }

}
