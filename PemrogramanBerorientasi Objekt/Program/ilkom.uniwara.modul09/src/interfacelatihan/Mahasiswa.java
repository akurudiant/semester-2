package interfacelatihan;
public class Mahasiswa {
    protected String nama;
    public Mahasiswa(String nama){
        this.nama = nama;
    }
    public void kuliahDiKampus(){
        System.out.println("Aku mahasiswa, Namaku "+this.nama);
        System.out.println("Aku berkuliah di Kampus.");
    }
}
