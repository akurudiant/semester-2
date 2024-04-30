public class TestBrgDiskon {
    public static void main (String []args){
        BarangDiskon BD= new BarangDiskon();
        
        BD.kode= "12345";
        BD.namBarang="Buku";
        BD.hargaDasar=3000;
        BD.diskon=10;
        BD.tampilData();
    }
}
