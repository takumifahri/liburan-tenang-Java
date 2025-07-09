public class Array {
    public static void main(String[] args) {
        // Untuk array itu setiap data nya tambahkan []
        String[] fruits = {"Apple", "Banana", "Cherry"};
        System.out.println("Fruits: " + String.join(", ", fruits));
        
        // Array of integers
        int[] numbers = {1, 2, 3, 4, 5}; 
        System.out.println("Numbers: " + java.util.Arrays.toString(numbers));
        // Cara pertama: tipe[] namaVariable = new tipe[ukuran]
        double[] arrA = new double[20];
        // Deklarasi array dengan tanda kurung siku [] setelah tipe data
        // Ini adalah cara yang lebih direkomendasikan karena:
        // - Lebih mudah dibaca: tipe data dan array-nya jelas terpisah
        // - Konsisten dengan konvensi Java modern
        // - Ketika mendeklarasikan multiple variable, lebih jelas
        System.out.println("\nArray of doubles: " + java.util.Arrays.toString(arrA));

        // Cara kedua: tipe namaVariable[] = new tipe[ukuran]  
        double arrB[] = new double[20];
        // Deklarasi array dengan tanda kurung siku [] setelah nama variable
        // Ini adalah gaya lama dari bahasa C/C++, masih valid di Java tapi kurang direkomendasikan
        // Alasan kurang direkomendasikan:
        // - Bisa membingungkan saat deklarasi multiple variable
        // - Contoh: double arrB[], normalVar; -> arrB adalah array, normalVar bukan array
        System.out.println("Array of doubles (cara dua): " + java.util.Arrays.toString(arrB));

        int[] arrInt = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(arrInt[0]);
        System.out.println(arrInt[1]);
        System.out.println(arrInt[2]);
        System.out.println(arrInt[3]);
        System.out.println(arrInt[4]);
        System.out.println(arrInt[5]);
    }
}


class ArrayExample {
    public static void main(String[] args) {
        // Contoh array dengan tipe data String
        String[] names = {"Alice", "Bob", "Charlie"};
        System.out.println("Names: " + java.util.Arrays.toString(names));

        // Contoh array dengan tipe data int
        int[] ages = {25, 30, 35};
        System.out.println("Ages: " + java.util.Arrays.toString(ages));

        // Contoh array dengan tipe data double
        double[] prices = {19.99, 29.99, 39.99};
        System.out.println("Prices: " + java.util.Arrays.toString(prices));
        int[] arrInt = new int[1000000];
 
        // Inisiasi dan menampilkan arrInt dari elemen ke 1 sampai 1000000
        for (int x = 0; x < arrInt.length; x++) {
            arrInt[x] = x + 1;
            System.out.println(arrInt[x]);
        }
    }
}

class MultiDimensionalArray {
    public static void main(String[] args) {
        // Contoh array dua dimensi (matriks)
        // Seperti dengan namanya “multi dimensional” berarti array bisa memiliki lebih dari 1 dimensi. Pada penjelasan sebelumnya kita baru hanya menggunakan array yang memiliki 1 dimensi. Jika diilustrasikan dengan dimensi maka 1 dimensi array baru hanya menggunakan sumbu x, seperti ini.
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Matrix:" + java.util.Arrays.deepToString(matrix));
        // Menampilkan elemen-elemen matriks
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class IndexOutOfBoundsExample {
    public static void main(String[] args) {
        // Contoh IndexOutOfBoundsException\
        int[] arrA = {1, 2, 3, 4};
        System.out.println(arrA[0]);
        System.out.println(arrA[1]);
        System.out.println(arrA[2]);
        // Akses indeks ke 4
        System.out.println(arrA[4]);
        int[] numbers = {1, 2, 3};
        try {
            // Mengakses indeks yang tidak ada
            System.out.println(numbers[5]); // Ini akan menyebabkan IndexOutOfBoundsException
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

    
    }
}
