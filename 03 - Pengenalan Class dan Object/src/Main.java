public class Main {
    public static void main(String[] args) {

        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama     = "Sulistyowati Munawaroh";
        mahasiswa1.nim      = "2010651955";
        mahasiswa1.jurusan  = "Teknik Informatika";
        mahasiswa1.umur     = 19;
        mahasiswa1.IPK      = 4.00;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.nim);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.umur);
        System.out.println(mahasiswa1.IPK);

        System.out.println("==================");

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama     = "Niken Agustin";
        mahasiswa2.nim      = "1910611079";
        mahasiswa2.jurusan  = "Teknik Sipil";
        mahasiswa2.umur     = 20;
        mahasiswa2.IPK      = 3.8;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.nim);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.umur);
        System.out.println(mahasiswa2.IPK);
    }
}
