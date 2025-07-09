// package DicodingDasarJava;

public class Main {
    byte contohByte = 100;
    short contohShort = 10000;
    public static void main(String[] args) {
        // This is the entry point of the Java application
        System.out.println("Hello, World!");
        System.out.println("Contoh Byte: " + new Main().contohByte + " \nTipe data integer 8 bit yang digunakan untuk menampung angka dalam range yang kecil. Nilai minimum dan maksimum dari tipe data ini adalah -128, dan 127. Tipe data byte memiliki nilai default 0. Ia digunakan untuk menghemat ruang dalam array yang besar, terutama pada bilangan bulat, karena 1 (satu) byte 4 (empat) kali lebih kecil dari tipe data int.");
        System.out.println("Contoh Short: " + new Main().contohShort + " \nMerupakan tipe data integer 16 bit yang digunakan untuk menampung angka dalam range menengah, yaitu antara -32,768 sampai 32,767. Sama seperti tipe sebelumnya, nilai default-nya 0. Ia bisa digunakan untuk menghemat memori seperti tipe data byte namun hanya 2 (dua) kali lebih kecil dari tipe data int.");
    }
}
