public class Handphone extends Perangkat{
    protected boolean fingerprint;
    public Handphone(String drive, int ram, float processor, boolean fingerprint){
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }
    @Override
    public void informasi(){
        if (fingerprint == true){
            String ada = ("Ada");
            System.out.println("Tipe Drive Handphone: " + drive +" " + ", RAM: " + ram + "GB, Speed Processor: " + processor + 
" Ghz, Fingerprint: " + ada);}
        else if(fingerprint == false){
            String ada = ("Tidak Ada");
            System.out.println("Tipe Drive Handphone: " + drive +" " + ", RAM: " + ram + "GB, Speed Processor: " + processor + 
" Ghz, Fingerprint: " + ada);}
}
        public void telfon(int no_hp){
        System.out.println("Handphone berhasil menyambungkan telfon ke No "+no_hp);
    }
    public void kirimSMS(int no_hp){
        System.out.println("Handphone berhasil mengirim SMS ke No "+no_hp);
    }
    public void kirimSMS(int no_hp1, int no_hp2){
        System.out.println("Handphone berhasil mengirim SMS ke No "+no_hp1 + " dan ke No "+no_hp2);
    }    
}