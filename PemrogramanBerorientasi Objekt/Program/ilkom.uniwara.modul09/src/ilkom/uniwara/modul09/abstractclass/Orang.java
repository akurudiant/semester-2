package ilkom.uniwara.modul09.abstractclass;
public class Orang {
    private String nama;
    private Hewan hewanPeliharaan;
    public Orang(String nama){
        this.nama=nama;
    }    
    public void peliharaHewan(Hewan hewanPeliharaan){
        this.hewanPeliharaan = hewanPeliharaan;
    }
    public void ajakPeliharaanJalanJalan(){
        System.out.println("Namaku "+this.nama);
        System.out.println("Hewan Peliharaanku Berjalan Dengan Cara ");
        this.hewanPeliharaan.bergerak();
        System.out.println("---------------------------------------");
    }
}
