public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("ucup","12345");

        mahasiswa1.show();
        mahasiswa1.setNama("Tutung");
        mahasiswa1.show();

        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNim());

        String data = mahasiswa1.sayHi("ganteng");
        System.out.println(data);
    }
}
