package NumberGuessing;
import java.util.Scanner;
public class NumberGuessing {
    // Number Guessing Project based on console input and output
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numberToGuess = (int) (Math.random() * 100) + 1; // Random number between 1 and 100
        int userGuess = 0;
        int attempts = 0;
        
        System.out.println("==== SELAMAT DATANG DI GAME TEBAK ANGKA ====");
        System.out.println("Saya telah memilih sebuah angka antara 1 dan 100.");
        System.out.println("Coba tebak angka tersebut!");
        System.out.println("Masukkan tebakan Anda (atau ketik -1 untuk keluar):");

        while (userGuess != -1) {
            userGuess = input.nextInt();
            attempts++;
            
            if (userGuess == -1) {
                System.out.println("Terima kasih telah bermain! Sampai jumpa!");
                break;
            }
            
            if (userGuess < 1 || userGuess > 100) {
                System.out.println("Tebakan harus antara 1 dan 100. Coba lagi:");
            } else if (userGuess < numberToGuess) {
                System.out.println("Tebakan Anda terlalu rendah. Coba lagi:");
            } else if (userGuess > numberToGuess) {
                System.out.println("Tebakan Anda terlalu tinggi. Coba lagi:");
            } else {
                System.out.println("Selamat! Anda telah menebak angka yang benar: " + numberToGuess);
                System.out.println("Jumlah percobaan: " + attempts);
                System.out.println("Terima kasih telah bermain! Sampai jumpa!");
                break;
            }
        }
    }
}

