public class TenagaPendidikan extends Pegawai {
    private int jumlahKehadiran;
    private int tarifHarian = 50000;
public TenagaPendidikan(){}
public TenagaPendidikan(String nip, String nama){
    super (nip,nama);
    } 
public void setKehadiran(int jumlahKehadiran){
    this.jumlahKehadiran = jumlahKehadiran;
}
public int getGajiTambahan(int jumlahKehadiran,int tarifHarian){
    return jumlahKehadiran * tarifHarian;
    }
public int getGajiTambahan(){
    return jumlahKehadiran *tarifHarian;
}
public int getGaji(){
    return getGajiTambahan() + super.getGaji();
}
}
    

