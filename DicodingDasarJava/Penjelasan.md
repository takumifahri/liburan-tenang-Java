# Pengantar Java Dasar

Demi menaklukkan medan pemrograman dengan Java, kita perlu memahami terlebih dahulu seperti apakah Java itu. Bagaimana strukturnya? Bagaimana menggunakan fungsi basic programming yang ia miliki? Oleh karena itu kita perlu tahu pemrograman dasar Java yang dikemas dalam materi berikut:

## Struktur Dasar
Ini adalah materi paling mendasar dari Java yang wajib Anda kuasai.

## Tipe Data
Setiap tipe data digunakan untuk menampung konten yang berbeda. Delapan (8) tipe data dalam Java yang akan kita pelajari adalah:
- `int`
- `float` 
- `char`
- `long`
- `double`
- `boolean`
- `byte`
- `short`

## String
Selain data primitif, string merupakan pokok dasar yang perlu Anda kuasai.

## Operator
Operator meliputi operasi aritmatika dasar seperti:
- Penambahan
- Pengurangan
- Perkalian
- Pembagian

Selain aritmatika dasar, terdapat juga operator-operator lain seperti:
- Assignment
- Unary
- Equality and relational
- Condition

## Fungsi Input Output
Proses input dan output merupakan hal yang penting agar kita dapat berinteraksi dengan program. Di sini kita akan belajar beberapa komponen yang dapat menerima input dari user dan komponen yang dapat menampilkan data ke user.

## Array
Array adalah kumpulan data yang dimasukkan ke dalam satu objek. Di materi ini kita akan belajar tentang pembuatan array dan aplikasinya di dalam suatu program.

## Tipe Data Primitif

Tipe data primitif adalah tipe data standar yang tidak diturunkan dari objek manapun. Tipe data primitif telah ditentukan dengan kata kuncinya masing-masing. Terdapat 8 (delapan) tipe data primitif yang Java dukung, antara lain:

### Byte
Tipe data integer 8 bit yang digunakan untuk menampung angka dalam range yang kecil. Nilai minimum dan maksimum dari tipe data ini adalah -128, dan 127. Tipe data byte memiliki nilai default 0. Ia digunakan untuk menghemat ruang dalam array yang besar, terutama pada bilangan bulat, karena 1 (satu) byte 4 (empat) kali lebih kecil dari tipe data int.

```java
byte value = 10;
byte anotherValue = -10;
```

### Short
Merupakan tipe data integer 16 bit yang digunakan untuk menampung angka dalam range menengah, yaitu antara -32,768 sampai 32,767. Sama seperti tipe sebelumnya, nilai default-nya 0. Ia bisa digunakan untuk menghemat memori seperti tipe data byte namun hanya 2 (dua) kali lebih kecil dari tipe data int.

```java
short value = 15000;
short anotherValue = -20000;
```

### Int
Merupakan tipe data integer 32 bit yang digunakan untuk menyimpan angka dalam range cukup besar, yakni antara -2,147,483,648 sampai 2,147,483,647 dengan nilai default 0. Jika kita tidak memperhatikan penggunaan memori, tipe data inilah yang biasanya dipakai.

```java
int value = 150000;
int anotherValue = -200000;
```

### Long
Merupakan tipe data integer yang lebih besar jika dibandingkan dengan tipe data int. Ukurannya 64 bit dan bisa digunakan untuk menyimpan angka dengan range antara -9,223,372,036,854,775,808 sampai 9,223,372,036,854,775,807. Tipe data long memiliki nilai default 0L.

```java
long value = 150000L;
long anotherValue = -200000L;
```

### Float
Merupakan sebuah tipe data yang bisa digunakan untuk menampung angka desimal. Nilai default-nya 0.0f.

```java
float value = 3.5f;
```

### Double
Merupakan sebuah tipe data yang mirip seperti tipe data float, namun memiliki kapasitas yang lebih besar. Nilai default-nya 0.0d.

```java
double value = 5.0;
```

### Boolean
Merupakan sebuah tipe data yang memiliki 2 (dua) macam nilai, yaitu true dan false. Nilai default-nya false.

```java
boolean value = true;
boolean anotherValue = false;
```

### Char
Merupakan sebuah tipe data yang bisa digunakan untuk menampung karakter. Nilai karakter tersebut dibungkus di dalam tanda ' '.

```java
char item = 'A';
```

## Pengantar Object-Oriented Programming

Apa itu OOP? OOP atau (Object-Oriented Programming) adalah suatu paradigma dalam pemrograman yang berbasis pada obyek. OOP terinsiprasi dari model yang telah ada di kehidupan sehari-hari. Contoh saja seperti mobil, mobil merupakan suatu objek. Mobil terbentuk dari beberapa objek yang lebih kecil seperti roda, body, mesin dll. Objek yang terdapat pada mobil saling berhubungan, berinteraksi dan berkomunikasi. 

Melalui konsep di atas, OOP diciptakan untuk mempermudah pengembangan program dengan cara mengikuti pendekatan model objek yang telah ada dikehidupan sehari-hari. Bagi yang ingin mempelajari bahasa pemrograman Java tentunya harus memahami konsep OOP, karena pemrograman Java didesain dengan menerapkan konsep OOP.

Berikut ini adalah beberapa istilah yang sering digunakan dalam konsep OOP:

### Class dan Object
Kelas (terjemahan dari class) dan obyek (terjemahan dari object) adalah hal paling dasar yang harus kita pelajari. Kita akan belajar bagaimana membuat suatu kelas dan menggunakaanya di dalam suatu program.

### Method
Suatu metode mendefinisikan perilaku obyek yang dibuat dari kelas. Metode dapat berupa prosedur atau fungsi.

### Member
Di materi ini kita akan belajar lebih dalam lagi tentang member (semua yang dideklarasikan) di dalam suatu kelas.

### Access Modifier
Di sini kita akan belajar tentang hak akses dari suatu kelas, metode, dan data member. Ada beberapa macam modifier yaitu private, default, protected, dan public.

### Encapsulation
Encapsulation adalah metode untuk membundling suatu data dan metode di dalam kelas. Di dalamnya juga akan ada materi tentang bagaimana mengaksesnya dengan memanfaatkan metode di dalam kelas.

### Inheritance
Inheritance adalah pewarisan, suatu kelas dapat diturunkan dari kelas lain sehingga mewarisi data dan metode dari kelas lain tersebut. Materi inheritance sangat penting di dalam OOP.

### Interface
Selain inheritance, kita juga akan belajar tentang interface. Interface mirip seperti kelas, tetapi hanya berisi method signature (nama, parameter dan return).