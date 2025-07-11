package ObjectExample;

import models.Hewan;

public class Object {
    public static void main(String[] args){
        Hewan anjing = new Hewan("Anjing");
        Hewan kucing = new Hewan("Kucing");

        anjing.beratHewan(100);
        anjing.umurHewan(25);
        anjing.printHewan();

        kucing.beratHewan(50);
        kucing.umurHewan(15);
        kucing.printHewan();
    }
}
