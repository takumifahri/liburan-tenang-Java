import java.util.Scanner;
public class ControlFlow {
    public static void main(String[] args) {
        // Contoh penggunaan if-else
        int number = 10;
        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }

        // Contoh penggunaan switch-case
        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("Start of the week");
                break;
            case "Friday":
                System.out.println("End of the week");
                break;
            default:
                System.out.println("Midweek day");
                break;
        }

        // Contoh penggunaan loop for
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // Contoh penggunaan loop while
        int count = 0;
        while (count < 5) {
            System.out.println("Count: " + count);
            count++;
        }

        // Contoh penggunaan loop do-while
        int j = 0;
        do {
            System.out.println("Do-While Count: " + j);
            j++;
        } while (j < 5);
    }
}


class Percabangan{
    // If Then
    // Percabangan if-then adalah control flow statement yang paling dasar di dalam pemrograman Java. Ini sangat simpel dengan artian program akan menjalankan baris kode jika kondisinya adalah true. 

    public static void main(String[] args) {
        boolean isTrue = true;
        if (isTrue) {
            System.out.println("Kondisi adalah true, maka baris kode ini akan dieksekusi.");
        }

        String name = "Sarah";
        if (name.equals("Fahri")) {
            System.out.println("Nama saya adalah Fahri.");
        } else if (name.equals("Budi")) {
            System.out.println("Nama saya adalah Budi.");
        } else {
            System.out.println("Nama saya bukan Fahri atau Budi.");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int inputNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Masukkan Operator (-,+,%,/,*): ");
        String operator = scanner.nextLine().trim();
        System.out.print("Masukkan angka kedua: ");
        int secondNumber = scanner.nextInt();

        switch(operator) {
            case "+": // Penjumlahan
                System.out.println("Hasil penjumlahan: " + (inputNumber + secondNumber));
                break;
            case "-": // Pengurangan
                System.out.println("Hasil pengurangan: " + (inputNumber - secondNumber));
                break;
            case "*": // Perkalian
                System.out.println("Hasil perkalian: " + (inputNumber * secondNumber));
                break;
            case "/": // Pembagian
                if (secondNumber != 0) {
                    System.out.println("Hasil pembagian: " + (inputNumber / secondNumber));
                } else {
                    System.out.println("Pembagian dengan nol tidak diperbolehkan.");
                }
                break;
            case "%": // Modulus
                System.out.println("Hasil modulus: " + (inputNumber % secondNumber));
                break;
            default:
                System.out.println("Operator tidak valid.");
        }
        
        scanner.close();
    }

    // Switch Case
}

class Perulangan{
    public static void main(String[] args) {
        // Contoh perulangan for
        for (int i = 0; i < 5; i++) {
            System.out.println("Perulangan for ke-" + i);
        }

        // Contoh perulangan while
        int j = 0;
        while (j < 5) {
            System.out.println("Perulangan while ke-" + j);
            j++;
        }

        // Contoh perulangan do-while
        int k = 0;
        do {
            System.out.println("Perulangan do-while ke-" + k);
            k++;
        } while (k < 5);


        // for bersarang
        int rows = 5;
        for (int row = 0; row <= rows; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}