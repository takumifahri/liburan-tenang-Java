// package DicodingDasarJava;

public class StrukturDasar {
	public static void main(String[] args) {
		// Your code here
		String str1 = "Hello World!";

		System.out.println(str1 + "type :" + str1.getClass().getName());

		char[] charArray = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!'};
		String str2 = new String(charArray);
		System.out.println(String.valueOf(charArray) + " type :" + charArray.getClass().getName()); // artinya char kalo [C

		System.out.println(str2 + " type :" + str2.getClass().getName()); // artinya String kalo Ljava.lang.String;

		// Membuat String dari array character yang menghasilkan "dicoding"
		char[] dicodingArray = {'d', 'i', 'c', 'o', 'd', 'i', 'n', 'g'};
		String str3 = new String(dicodingArray);
		System.out.println(str3 + " type :" + str3.getClass().getName());

		// String bersifat immutable (tidak bisa diubah)
		String immutableString = "Hello";
		System.out.println("Original: " + immutableString);
		immutableString = immutableString + " World"; // Ini membuat objek String baru, bukan mengubah yang lama
		System.out.println("After concatenation: " + immutableString);

		// StringBuffer - thread-safe, dapat diubah
		StringBuffer stringBuffer = new StringBuffer("Hello");
		System.out.println("StringBuffer original: " + stringBuffer);
		stringBuffer.append(" World"); // Mengubah objek yang sama
		System.out.println("StringBuffer after append: " + stringBuffer);

		// StringBuilder - tidak thread-safe, lebih cepat, dapat diubah
		StringBuilder stringBuilder = new StringBuilder("Hello");
		System.out.println("StringBuilder original: " + stringBuilder);
		stringBuilder.append(" World"); // Mengubah objek yang sama
		System.out.println("StringBuilder after append: " + stringBuilder);
		stringBuilder.insert(5, " Beautiful"); // Menyisipkan teks
		System.out.println("StringBuilder after insert: " + stringBuilder);

		// Demonstrasi perbedaan thread-safe dan tidak thread-safe
		System.out.println("\n=== Perbedaan Thread-Safe vs Non Thread-Safe ===");

		// StringBuffer adalah thread-safe
		// Artinya aman digunakan oleh multiple threads secara bersamaan
		// Karena methodnya disinkronisasi (synchronized)
		StringBuffer threadSafeBuffer = new StringBuffer("Thread-Safe: ");
		System.out.println("StringBuffer (thread-safe): Aman untuk multi-threading");

		// StringBuilder tidak thread-safe
		// Lebih cepat karena tidak ada overhead sinkronisasi
		// Tapi tidak aman jika digunakan multiple threads bersamaan
		StringBuilder notThreadSafeBuilder = new StringBuilder("Not Thread-Safe: ");
		System.out.println("StringBuilder (not thread-safe): Lebih cepat, tapi tidak aman untuk multi-threading");

		// Contoh: StringBuffer lebih lambat tapi aman
		// StringBuilder lebih cepat tapi berbahaya di multi-threading
		System.out.println("\nKesimpulan:");
		System.out.println("- Thread-safe: Aman tapi lebih lambat (ada locking mechanism)");
		System.out.println("- Not thread-safe: Cepat tapi berbahaya jika diakses multiple threads");


		// For length kita bisa gunakana length
		String exampleString = "Hello, World!";
		int length = exampleString.length();
		System.out.println("Panjang string: " + length);

		// Jika ingin mengambil sebuah char kita bisa gunakan charAt()
		char firstChar = exampleString.charAt(0);
		System.out.println("Karakter pertama: " + firstChar);

		// Jika ingin format string kita bisa gunakan String.format()
		String formatString = String.format("Panjang string '%s' adalah %d", exampleString, length);
		System.out.println(formatString);

		// Jika ingin Substring 
		String subString = exampleString.substring(7, 12); // Mengambil substring dari indeks 7 sampai 11
		System.out.println("Substring: " + subString);

		String num1 = "8";
		Integer num2 = 8;
		// Misalkan kita mau gunakan attribute Equals 	Memeriksa apakah nilai objek sama dengan nilai string.
		boolean isEqual = Integer.valueOf(num1).equals(num2); // JIka kita ingin jadikan Integer bisa gunakan Integer.valueOf(). Jika seudah sesuai maka langsung saja char1.equals(char2)
		System.out.println("Apakah " + num1 + " sama dengan " + num2 + "? " + isEqual);

		// Gotcha ⚠️
		// Integer.valueOf() menggunakan cache untuk nilai -128 hingga 127, jadi untuk nilai kecil lebih efisien
		// Untuk nilai besar, akan selalu membuat objek baru
		// Jika num1 atau num2 bukan format angka yang valid, akan throw NumberFormatException

		// isEmpty() untuk mengecek apakah string kosong
		String emptyString = "";
		String valuedString = "Hello";
		boolean isEmpty = emptyString.isEmpty();
		System.out.println("Apakah string kosong? " + isEmpty);
		boolean isValuedEmpty = valuedString.isEmpty();
		System.out.println("Apakah string dengan nilai 'Hello' kosong? " + isValuedEmpty);
		

		// Jika kita ingin concat concat(String s)
		String concatString = "Hello".concat(" World");
		System.out.println("Hasil concat: " + concatString);
		// Concat tidak sama dengan append, append itu untuk StringBuffer dan StringBuilder dan baru bisa karena mutable. Sedangkan kalo concat itu untuk String yang immutable dan membuat variable baru
		String concatedString = str1.concat(str2);
		System.out.println("Hasil concat str1 dan str2: " + concatedString);
		// Kalo append
		StringBuffer stringBufferAppend = new StringBuffer("Hello");
		stringBufferAppend.append(" World");		
		System.out.println("Hasil append StringBuffer: " + stringBufferAppend);


		// Kita ingin repalace karakter atau substring dalam string
		String originalString = "Hello World!";
		String replacedString = originalString.replace("World", "Java");
		System.out.println("String setelah replace: " + replacedString);


		// misalkan mau indexing Mengetahui indeks dari sebuah substring.
		String str4 = "Hello World!";
		int indexOfWorld = str4.indexOf("World");
		System.out.println("Index dari 'World' dalam string: " + indexOfWorld);	

		// To Loewr dan Uppercase 
		String lowerCaseString = str4.toLowerCase();
		String upperCaseString = str4.toUpperCase();	
		System.out.println("String dalam huruf kecil: " + lowerCaseString);
		System.out.println("String dalam huruf besar: " + upperCaseString);

		// Misalkan untuk merapihkan baris , bisagunakan trim, Menghapus spasi awal dan akhir dari string.
		String messyString = "   Hello World!   ";
		String trimmedString = messyString.trim();
		System.out.println("String setelah trim: '" + trimmedString + "'");

		// valueOf(int value)	Mengkonversi tipe yang diberikan menjadi sebuah string.
		int number = 42;
		String numberString = String.valueOf(number);
		System.out.println("String dari angka: " + numberString);

		// Untuk membandingkan bisa dengan compare, compareTo()	Membandingkan dua nilai
		String str5 = "Hello";
		String str6 = "World";
		int comparisonResult = str5.compareTo(str6);
		System.out.println("Hasil perbandingan '" + str5 + "' dengan '" + str6 + "': " + comparisonResult);

		// Hasil perbandingan 'Hello' dengan 'World': -15 muncul karena metode compareTo() membandingkan dua String secara leksikografis (berdasarkan urutan karakter dalam Unicode).

		// Cara Kerja compareTo():
		// Leksikografis:

		// compareTo() membandingkan karakter satu per satu dari kedua String.
		// Jika karakter pertama berbeda, hasil perbandingan adalah selisih nilai Unicode dari karakter tersebut.
		// Jika karakter pertama sama, maka perbandingan dilanjutkan ke karakter berikutnya hingga ditemukan perbedaan atau hingga akhir String.
		// Hasil:

		// 0: Jika kedua String sama persis.
		// Negatif: Jika String pertama lebih kecil secara leksikografis dibandingkan String kedua.
		// Positif: Jika String pertama lebih besar secara leksikografis dibandingkan String kedua.
		// Penjelasan untuk 'Hello' dan 'World':
		// Karakter Pertama:

		// 'H' dari 'Hello' memiliki nilai Unicode 72.
		// 'W' dari 'World' memiliki nilai Unicode 87.
		// Selisih Nilai Unicode:

		// 72 - 87 = -15.
		// Hasil:

		// Karena 'H' lebih kecil dari 'W', hasilnya adalah -15, menunjukkan bahwa 'Hello' secara leksikografis lebih kecil daripada 'World'.
		// Contoh Lain:
		System.out.println("Apple".compareTo("Banana")); // Output: -1
		System.out.println("Banana".compareTo("Apple")); // Output: 1
		System.out.println("Apple".compareTo("Apple"));  // Output: 0
	}
}