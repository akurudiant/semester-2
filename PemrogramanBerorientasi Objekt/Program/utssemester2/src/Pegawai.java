public class Pegawai {
    private String nip;
    private String nama;
    
    public Pegawai(){}
    public Pegawai (String nip, String nama){
        this.nip = nip;
        this.nama = nama;
    }
    public void setNip(String nip){
        this.nip = nip;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNip(){
        return this.nip;
    }
    public String getNama(){
        return this.nama;
    }
    public int getGajiTambahan(){
        return 0;
    }
    public int gajiPokok(){
            return 1300000;
    }
    public int getGaji(){
        return gajiPokok();
    }
}
