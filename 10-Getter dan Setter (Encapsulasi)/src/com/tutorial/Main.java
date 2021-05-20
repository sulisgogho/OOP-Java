package com.tutorial;

class Data {
    public int intPublic;
    private int intPrivate;
    private double doublePrivate;

    public Data(){
        this.intPublic = 0;
        this.intPrivate = 10;
    }

    // getter
    public int getIntPrivate(){
        return this.intPrivate;
    }

    // setter
    public void setDoublePrivate(double value){
        this.doublePrivate = value;
    }

    void display (){
        System.out.println(this.intPublic);
        System.out.println(this.intPrivate);
        System.out.println(this.doublePrivate);
    }
}

public class Main {
    public static void main(String[] args) {
        Data object = new Data();

        // read and write dengan menggunakan public
        object.intPublic = 5; // write
        System.out.println("public : " +object.intPublic); // read

        // read only (kita bisa menggunakan GETTER)
        int angka = object.getIntPrivate();
        System.out.println("getter : "+angka);

        // write only (kita hanya bisa menulis)
        object.setDoublePrivate(0.05);
        object.display();
    }
}
