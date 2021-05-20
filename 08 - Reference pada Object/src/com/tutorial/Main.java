package com.tutorial;

class Buku {
    String judul;
    String penulis;

    Buku(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }

    void display(){
        System.out.println("\nJudul\t   : "+this.judul);
        System.out.println("Penulis\t   : "+this.penulis);
    }
}

public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Hujan", "Tere Liye");
        buku1.display();

        // Menampilkan address
        String addressBuku1 = Integer.toHexString(System.identityHashCode(buku1));
        System.out.println(addressBuku1);

        // Assignment object
        Buku buku2 =  buku1;
        buku2.display();
        String addressBuku2 = Integer.toHexString(System.identityHashCode(buku2));
        System.out.println(addressBuku2);

        // karena buku 1 dan 2 berada pada address atau referensi yang sama
        buku1.judul = "rain";
        buku1.display();
        buku2.display();

        // kita akan memasukkan object ke dalam methods
        fungsi(buku2);
        buku1.display();
        buku2.display();
    }
    public static void fungsi(Buku dataBuku){
        String addressDataBuku = Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println(addressDataBuku);
        dataBuku.penulis = "Haruki";
    }
}

