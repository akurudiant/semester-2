public class TestProgram {
    public static void main(String[]args){
        Dosen dsn1 = new Dosen();
        dsn1.setNip("21157201114");
        dsn1.setNama("Rudiyanto");
        dsn1.setSKS(23);
        
        TenagaPendidikan tpd1 = new TenagaPendidikan();
        tpd1.setNip("21157202244");
        tpd1.setNama("Ayubi");
        tpd1.setKehadiran(20);
        
        DaftarGaji dg = new DaftarGaji(2);
        dg.tambahPegawai(dsn1);
        dg.tambahPegawai(tpd1);
        dg.tampilSemuaGji();
}
}