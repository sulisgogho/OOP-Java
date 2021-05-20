public class Mahasiswa {

    // data member
    String nama;
    String nim;

    // constructor
    Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // method tanpa return dan tanpa parameter
    void show(){
        System.out.println("Nama    : "+this.nama);
        System.out.println("NIM     : "+this.nim);
    }

    // method tanpa return dan dengan parameter
    void setNama(String nama){
        this.nama = nama;
    }

    // method dengan return tapi tidak ada parameter
    String getNama(){
        return this.nama;
    }
    String getNim(){
        return  this.nim;
    }

    // method dengan parameter dan dengan return
    String sayHi(String message){
        return message + " juga, nama saya adalah "+this.nama;
    }
}
