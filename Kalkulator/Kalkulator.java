package Kalkulator;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer num1, num2, result;
        char operator;

        System.out.println("==== SELAMAT DATANG DI KALKULATOR ====");
        System.out.println("RULES : INI ADALAH APLIKASI KALKULATOR SEDERHANA");

        // input satu
        System.out.println("Masukkan angka pertama: ");
        num1 = input.nextInt();

        System.out.println("Masukkan operator (+, -, *, /, %, ^): ");
        operator = input.next().charAt(0);

        // input dua
        System.out.println("Masukkan angka kedua: ");
        num2 = input.nextInt();


        // proses
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("====== Hasil: " + num1 + " + " + num2 + " = " + result + " ======");
                break;

            case '-' :
                result = num1 - num2;
                System.out.println("====== Hasil: " + num1 + " - " + num2 + " = " + result + " ======");
                break;

            case '*' :
                result = num1 * num2;
                System.out.println("====== Hasil: " + num1 + " * " + num2 + " = " + result + " ======");
                break;

            case '/' :
                if(num1 == 0 || num2 == 0) {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                } else {
                    result = num1 / num2;
                    System.out.println("======  Hasil: " + num1 + " / " + num2 + " = " + result + " ======");
                }
                break;

            case '%' :
                if(num1 == 0 || num2 == 0) {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                } else {
                    result = num1 % num2;
                    System.out.println("====== Hasil: " + num1 + " % " + num2 + " = " + result + " ======");
                }
                break;

            case '^' :
                if(num1 == 0 && num2 < 0) {
                    System.out.println("Error: Tidak dapat menghitung pangkat negatif dari nol.");
                } else {
                    result = (int) Math.pow(num1, num2);
                    System.out.println("====== Hasil: " + num1 + " ^ " + num2 + " = " + result + " ======");
                }
                break;
                
            default:
                System.out.println("Error: Operator tidak valid. Silakan gunakan +, -, *, /, %, atau ^.");
                break;
        }
        input.close();
        // 
    }
}