public class BarangDiskon {
    public String kode;
    public String namBarang ;
    public int hargaDasar;
    public float diskon;
    
    public int hitungHargaJual(){
        return (int) (hargaDasar-((diskon/100)*hargaDasar));
    }
    public void tampilData (){
        System.out.println("kode         :"+kode);
        System.out.println("Nama Barang  :"+namBarang);
        System.out.println("Harga Dasar  "+hargaDasar);
        System.out.println("Diskon       :"+diskon);
        System.out.println("Harga Jual   :"+hitungHargaJual());
    }
}
