package com.tutorial;

class Player {
    String name; // default, dia akan bisa ditulis dan dibaca
    public int exp; // public, dia akan bisa dibaca dan ditulis
    private int health; // private, hanya akan bisa dibaca dan ditulis di dalam class saja

    Player(String name, int exp, int health){
        this.name = name;
        this.exp = exp;
        this.health = health;
    }

    // dufault modifier akses
    void display(){
        tambahExp(); // contoh mengakses private methods
        System.out.println("\nName\t: "+this.name);
        System.out.println("exp\t: "+this.exp);
        System.out.println("health\t: "+this.health); // membaca di dalam class
    }

    // public
    public void ubahNama(String namaBaru){
        this.name = namaBaru;
    }

    private void tambahExp(){
        this.exp += 100;
    }
}

public class Main{
    public static void main(String[] args) {
        Player player1 = new Player("Marni", 0, 100);

        // default
        System.out.println(player1.name); // membaca data
        player1.name = "Surti"; // menulis data
        System.out.println(player1.name); // membaca data

        // public
        System.out.println(player1.exp);// membaca data
        player1.exp = 100; // menulis data
        System.out.println(player1.exp); // membaca data

        // private (tidak bisa diakses)
//        System.out.println(player1.health; // membaca data
//        player1.health = 100; // menulis data
//        System.out.println(player1.health; // membaca data

        // methods
        player1.display();

        // public
        player1.ubahNama("Tejo");
        player1.display();

        // private
//         player1.tambahExp();

    }
}
