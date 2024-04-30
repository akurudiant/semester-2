public class Dosen extends Pegawai{
    private int jumlahSKS;
    private int tarifSKS = 120000;
public Dosen(){}
    public Dosen(String nip, String nama){
      super (nip,nama);
    }
    public void setSKS(int SKS){
        this.jumlahSKS = SKS;
    }
    public int getGajiTambahan(int jumlahSKS,int tarifSKS){
        return jumlahSKS * tarifSKS;
    }
    public int getGajiTambahan(){
        return jumlahSKS * tarifSKS;
    }
    @Override
    public int getGaji(){
        return getGajiTambahan() + super.getGaji();
    }
}        
