public class MainApp {
    public static void main(String[] args) throws Exception {
        Perangkat perangkat = new Perangkat("Maximtosh", 16, (float) 2.3);
        perangkat.informasi();
        System.out.println("");
        Laptop laptop = new Laptop("NutLab",64, (float)2.6, true);
        laptop.informasi();
        laptop.bukaGame("Cat vs Dog");
        laptop.kirimEmail("nfrajabi7@gmail.com");
        laptop.kirimEmail("naufalrjb@gmail.com", "jeskimeski32@gmail.com");
        System.out.println("");
        Handphone handphone = new Handphone("Provus",4, (float) 1.7, false);
        handphone.informasi();
        handphone.telfon(621196811);
        handphone.kirimSMS(621196811);
        handphone.kirimSMS(62344341, 621143377);       
    }  
}