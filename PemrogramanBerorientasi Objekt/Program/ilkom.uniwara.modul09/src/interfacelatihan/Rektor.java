package interfacelatihan;
public class Rektor {
    public void beriSertifikatCumlaude(ICumlaude mahasiswa){
        System.out.println("Saya REKTOR, Memberikan Sertifikat cumlaude");
        System.out.println("Selamat!!! Silahkan pekenalkan diri Anda...");
        
        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();
        
        System.out.println("--------------------------------------------");
    }
}
