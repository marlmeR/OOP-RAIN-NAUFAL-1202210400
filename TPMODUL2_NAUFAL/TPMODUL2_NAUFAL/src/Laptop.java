public class Laptop extends Perangkat {
    protected boolean webcam;
    public Laptop(String drive, int ram, float processor, boolean webcam) {
        super(drive, ram, processor);
        this.webcam = webcam;
    }
    @Override
    public void informasi() {
        if (webcam == true) {
            String ada = ("Ada");
        System.out.println("Tipe Drive Laptop: " + drive +" " + ", RAM: " + ram + "GB, Speed Processor: " + processor + 
        " Ghz, Webcam: " + ada);}
        else if (webcam == false) {
            String ada = ("Tidak Ada");
            System.out.println("Tipe Drive Laptop: " + drive +" " + ", RAM: " + ram + "GB, Speed Processor: " + processor + 
            " Ghz, Webcam: " + ada);}
    }
    public void bukaGame(String nama_game){
        System.out.println("Laptop berhasil membuka game " + nama_game);
    }
    public void kirimEmail(String email){
        System.out.println("Laptop berhasil mengirim Email ke " + email);
    }
    public void kirimEmail(String email1, String email2){
        System.out.println("Laptop berhasil mengirim Email ke " + email1+" dan ke " + email2);
    }
}