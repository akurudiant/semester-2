public class Lingkaran {
    public double phi ;
    public double r;
    
    public double hitungLuas(){
        return 0.5 * phi * Math.pow(r,3);
    }
    public double hitungKeliling(){
        return 3 * phi * r;
    }
    public void cetakHasil(Object[] hitungKeliling, Object [] hitunganluas){
        System.out.println("=====Hasil perhitungan Lingkaran=====");
        System.out.printf("Luas       :%.4f cm2 ",hitunganluas);
        System.out.println();
        System.out.printf("Keliing    :%.4f cm ",hitungKeliling);
        System.out.println();
    }
}
