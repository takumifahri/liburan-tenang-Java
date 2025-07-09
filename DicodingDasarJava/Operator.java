import java.util.Scanner; // utk dapatkan input dari pengguna
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// BufferedReader:
// Digunakan untuk membaca teks dari input stream (seperti keyboard atau file) secara efisien.
// Membaca data dalam bentuk baris atau karakter.
// Cocok untuk membaca data dalam jumlah besar karena menggunakan buffer untuk meningkatkan performa.

// InputStreamReader:
// Berfungsi sebagai penghubung antara byte stream (InputStream) dan character stream (Reader).
// Mengkonversi byte data menjadi karakter data.
// Biasanya digunakan bersama dengan BufferedReader.

// IOException:
// Exception yang dilempar jika terjadi kesalahan input/output, seperti gagal membaca data atau file tidak ditemukan.
// Harus ditangani dengan try-catch atau dideklarasikan dengan throws.
public class Operator {
    public static void main(String[] args){
        // Operasi Assignment
        // Operasi Assigment adalah salah satu operator yang akan sering ditemui dalam pemrograman Java. Assignment Variable (penempatan/pengalamatan variabel) merupakan operator yang cukup simpel dan diwakilkan dengan simbol operator ‘=’. Operator assigment memberikan nilai pada sebuah variabel yang ada di sebelah kiri (left operand) dengan nilai yang ada di sebelah kanan (right operand). 
        // int a = 10; // Memberikan nilai 10 pada variabel a
        // Scanner scanner = new Scanner(System.in);
        // try {
        //     System.out.print("Masukkan nilai b: ");
        //     int b = scanner.nextInt(); // Membaca input dari pengguna dan memberikan nilai pada vari
        //     int c = a + b; // Menjumlahkan nilai a dan b, lalu memberikan hasilnya pada variabel c
        //     System.out.println("Hasil penjumlahan a dan b adalah: " + c); // Menampilkan hasil penjumlahan
        // } finally {
        //     scanner.close(); // Close the scanner to prevent resource leaks
        // }

        // Contoh Operasi Aritmatika 
        int x = 5;
        int y = 3;
        int sum = x + y; // Penjumlahan
        int difference = x - y; // Pengurangan
        int product = x * y; // Perkalian
        int quotient = x / y; // Pembagian
        int remainder = x % y; // Sisa bagi
        System.out.println("Penjumlahan: " + sum);
        System.out.println("Pengurangan: " + difference);
        System.out.println("Perkalian: " + product);
        System.out.println("Pembagian: " + quotient);
        System.out.println("Sisa Bag atau Modulusi: " + remainder);
        
        // Operasio Unary (+, -, ++, --, !)
        int num = 10;
        System.out.println("Nilai awal: " + num);
        num++; // Increment
        System.out.println("Nilai setelah increment: " + num);
        num--; // Decrement
        System.out.println("Nilai setelah decrement: " + num);
        boolean isTrue = true;
        System.out.println("Nilai awal boolean: " + isTrue);
        isTrue = !isTrue; // Negasi
        System.out.println("Nilai setelah negasi: " + isTrue);

        // Operasi Equality and Relational (==, !=, <, >, <=, >=)
        int a1 = 5;
        int b1 = 10;
        System.out.println("a == b: " + (a1 == b1)); // Sama dengan
        System.out.println("a != b: " + (a1 != b1)); // Tidak sama dengan
        System.out.println("a < b: " + (a1 < b1)); //
        System.out.println("a > b: " + (a1 > b1)); // Lebih besar dari
        System.out.println("a <= b: " + (a1 <= b1)); // Lebih kecil atau sama dengan
        System.out.println("a >= b: " + (a1 >= b1)); // Lebih besar atau sama dengan

        // Conditional (&&, ||, !)
        boolean condition1 = true;
        boolean condition2 = false;
        System.out.println("condition1 && condition2: " + (condition1 && condition2)); // AND
        System.out.println("condition1 || condition2: " + (condition1 || condition2)); // OR
        System.out.println("!condition1: " + !condition1); // NOT
        System.out.println("!condition2: " + !condition2); // NOT


        // Operasi Bitwise (&, |, ^, ~, <<, >>)
        int bitA = 5; // 0101 dalam biner
        int bitB = 3; // 0011 dalam biner
        System.out.println("Bitwise AND: " + (bitA & bitB)); // 0101 & 0011 = 0001 (1 dalam desimal)
        System.out.println("Bitwise OR: " + (bitA | bitB)); //
        // 0101 | 0011 = 0111 (7 dalam desimal)
        System.out.println("Bitwise XOR: " + (bitA ^ bitB)); // 
        // 0101 ^ 0011 = 0110 (6 dalam desimal)
        System.out.println("Bitwise NOT: " + (~bitA)); //
        // ~0101 = 1010 (negasi biner, tergantung pada representasi bilangan bulat)
        System.out.println("Left Shift: " + (bitA << 1)); //
        // 0101 << 1 = 1010 (10 dalam desimal)
        System.out.println("Right Shift: " + (bitA >> 1)); //


        // Input output operator ,, Scanner dan BufferedReader
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.print("PEMOGRGRAMAN SEDERHANA");
        int value = 0;
        int anotherValue = 0;
        try {
            System.out.print("Masukan Angka pertama : ");
            value = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Masukan Angka kedua : ");
            anotherValue = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        int resul = value + anotherValue;
        System.out.println("Hasilnya adalah : " + resul);
    }
}
