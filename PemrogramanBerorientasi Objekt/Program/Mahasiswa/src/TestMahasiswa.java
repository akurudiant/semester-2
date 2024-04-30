
public class TestMahasiswa {
    public static void main (String args []){
        Mahasiswa mhs1 = new Mahasiswa ();
        Mahasiswa mhs2 = new Mahasiswa ();
        Mahasiswa mhs3 = new Mahasiswa ();
        
        mhs1.nim = 101 ;
        mhs1.nama = "Lestari";
        mhs1.alamat = "jl. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();
        
        mhs2.nim = 114 ;
        mhs2.nama = "Jarjit";
        mhs2.alamat = "ds. Durian Runtuh";
        mhs2.kelas = "TK";
        mhs2.tampilBiodata();
        
        mhs3.nim = 289 ;
        mhs3.nama = "Fajar";
        mhs3.alamat = "Konoha";
        mhs3.kelas = "SD";
        mhs3.tampilBiodata();
        
        
    }
}
