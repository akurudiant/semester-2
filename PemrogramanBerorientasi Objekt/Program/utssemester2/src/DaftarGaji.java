public class DaftarGaji extends Pegawai {
    private Pegawai[] listPegawai;
    private int jumlahPegawai;
public DaftarGaji (int jumlahPegawai){
    listPegawai = new Pegawai[jumlahPegawai];
    }
public void tambahPegawai(Pegawai pegawai){
    listPegawai[this.jumlahPegawai] = pegawai;
    this.jumlahPegawai++;
}
public void tampilSemuaGji(){
    System.out.println("Biodata Pegawai Kampus Uniwara");
    System.out.println("==============================");
    for (int i=0; i<this.jumlahPegawai;i++){
        System.out.println("NIP             :"+listPegawai[i].getNip());
        System.out.println("NAMA            :"+listPegawai[i].getNama());
        System.out.println("Gaji Tambahan   :Rp."+listPegawai[i].getGajiTambahan());
        System.out.println("Gaji Pokok      :RP."+listPegawai[i].gajiPokok());
        System.out.println("Total Gaji      :Rp."+listPegawai[i].getGaji());
    }
}
}
