public class testPeminjaman {
    public static void main (String args []){
        peminjaman pjm1=new peminjaman();
        pjm1.idPelanggan = 22;
        pjm1.nama = "Ruday";
        pjm1.namaGame = "Counter Strike";
        pjm1.lamaSewa = 11;
        pjm1.harga = 3000;
        pjm1.totalBiaya();
        
        System.out.println("Harga sewa            : "+pjm1.harga+"Ribu");
        System.out.println("Sewa                  : "+pjm1.lamaSewa+"jam");
        System.out.println("Total harganya adalah : "+pjm1.Bayar(2)+"Ribu");
    }
}
