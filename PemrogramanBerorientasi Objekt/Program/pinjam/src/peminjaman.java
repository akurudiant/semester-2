public class peminjaman {
    public int idPelanggan ;
    public String nama ;
    public String namaGame ;
    public int lamaSewa ;
    public int harga ;
    
    public void totalBiaya() {
        System.out.println("ID Pelanggan     :  " +idPelanggan);
        System.out.println("Nama             :  " +nama );
        System.out.println("Nama Game        :  " +namaGame);
        System.out.println("Harga            :  " +lamaSewa );
        System.out.println("Lama Bermain     :  " +harga );
    }
    public int Bayar (int lamaSewa){
     int BayarS=lamaSewa*harga;
     return BayarS;
    
    }
}