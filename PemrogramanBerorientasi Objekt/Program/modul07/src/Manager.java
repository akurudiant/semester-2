public class Manager extends Karyawan {
    private double tunjangan;
    private String bagian;
    private Staff st[];
    
    public void setTunjangan(double tunjangan){
        this.tunjangan=tunjangan;
    }
    public double getTunjangan(){
        return tunjangan;
    }
    public void setBagian(String bagian){
        this.bagian=bagian;
    }
    public String getBagian(){
        return bagian;
    }
    public void setStaff(Staff st[]){
        this.st = st;
    }
    public void viewStaff(){
        int i;
        System.out.println("-------------------");
        for(i=0; i<st.length; i++){
            st[i].lihatInfo();
        }
        System.out.println("-------------------");
    }
    public void lihatInfo(){
        System.out.println("Manager         :"+this.getBagian());
        System.out.println("Nip             :"+this.getNip());
        System.out.println("Nama            :"+this.getNama());
        System.out.println("Golongan        :"+this.getGolongan());
        System.out.println("Tunjangan       :"+this.getTunjangan());
        System.out.println("Gaji            :"+this.getGaji());
        System.out.println("Bagian          :"+this.getBagian());
        this.viewStaff();
    }
    @Override
    public double getGaji(){
        return super.getGaji()+tunjangan;
    }
}
