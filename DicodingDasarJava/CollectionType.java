import java.util.*;
public class CollectionType {
    public static void main(String[] args) {
       
    }
}

class List{
    // List adalah suatu Collection di mana data yang masuk akan disimpan secara teratur. List mempunyai index berdasarkan urutan objek yang dimasukkan ke dalam List. Objek di dalam List bisa duplikat artinya objek yang sama bisa dimasukkan beberapa kali ke dalam List dan akan mempunyai index yang berbeda. Objek dikatakan sama jika dibandingkan menggunakan method equals() menghasilkan nilai true. Hal ini akan berbeda dengan Set yang akan kita bahas berikutnya. Salah satu implementasi dari interface List adalah class ArrayList. ArrayList mirip dengan Array hanya saja ArrayList ukurannya tidak tetap atau fleksibel.
    public static void main(String[] args){
        String[] fruits = new String[3];
        fruits[0] = "Apple";
        fruits[1] = "Banana";
        fruits[2] = "Cherry";

        System.out.println("isi array:" + java.util.Arrays.toString(fruits));
         // deklarasi Array
        String[] heroes = new String[2];
        heroes[0] = "riki";
        heroes[1] = "sven";
        //heroes[2] = "zeus"; // error ArrayIndexOutOfBoundsException karena ukuran Array tetap
        // menggunakan ArrayList
        java.util.List<String> planets = new ArrayList<>();
        planets.add("mercury"); // method add() untuk menambahkan objek ke List
        planets.add("venus");
        planets.add("earth");
        planets.add("mars"); // objek lainnya masih bisa terus ditambahkan ke List
        System.out.println("List planets awal:");
        for (int i = 0; i < planets.size(); i++) { // method size() untuk mendapatkan ukuran List
            // method get() untuk melihat isi List pada index i
            System.out.println("\t index-"+ i +" = " + planets.get(i));
        }
        planets.remove("venus"); // method remove() untuk mengeluarkan objek dari List
        System.out.println("List planets akhir:");
        for (int i = 0; i < planets.size(); i++) {
            System.out.println("\t index-"+ i +" = " + planets.get(i));
        }
    }
}

class Set{
    public static void main(String[] args){
        System.out.println("Set mirip dengan List hanya saja objek di dalam Set tidak bisa diduplikasi.\nYang artinya jika objek yang sama dimasukkan beberapa kali ke dalam Set maka Set hanya akan menyimpan objek tersebut satu kali saja.\nLebih lanjut, perbedaan lain antara Set dengan List adalah penyimpanan pada Set tidak teratur.");
        java.util.Set<String> planets = new HashSet<>();
        planets.add("mercury");
        planets.add("venus");
        planets.add("earth");
        planets.add("mars");
        planets.add("mars");
        planets.add("mars");

        System.out.println("Set planets awal: (size = " + planets.size() + ")");
        for (String planet : planets) {
            System.out.println("\t " + planet);
        }

        planets.remove("venus");
                System.out.println("Set planets awal: (size = " + planets.size() + ")");
        for (String planet : planets) {
            System.out.println("\t " + planet);
        }

    }
}

class MapSaja{
    private String name;
    private Number price;

    public static void main(String[] args){
        System.out.println("Map adalah struktur data dalam bentuk pasangan key-value. Map sama dengan “associative array “ dalam bahasa PHP.\nObjek disimpan di Map sebagai value menggunakan key yang harus unik dan harus berupa objek juga.\nSalah satu implementasi dari interface Map adalah class HashMap. ");
    
    }

    public MapSaja(String name, Number price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString(){
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';    
    }
}

class ProductMap{
    public static void main(String[] args){
       java.util.Map<String, MapSaja> product = new HashMap();

       MapSaja product1 = new MapSaja("Laptop", 15000000);
       MapSaja product2 = new MapSaja("Smartphone", 5000000);   
       
       product.put("product1", product1);
       product.put("product2", product2);
       
        System.out.println("Map planets awal: (size = "+ product.size() +")");
        for (String key : product.keySet()) { // looping key dari Map
            // method get() untuk melihat isi Map berdasarkan key
            System.out.println("\t " + key + " : " + product.get(key));
        }

        
        product.remove("product2"); // method remove() untuk mengeluarkan objek dari Map
 
        System.out.println("Map planets akhir: (size = "+ product.size() +")");
        for (MapSaja productItem : product.values()) { // looping value dari Map
            System.out.println("\t " + productItem);
        }
    }
}