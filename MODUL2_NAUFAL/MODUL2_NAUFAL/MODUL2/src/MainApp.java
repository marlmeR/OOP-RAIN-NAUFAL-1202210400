public class MainApp {
        public static void main(String[] args) throws Exception {
            TransportasiAir perangkat = new TransportasiAir(2, 15000, 2);
            perangkat.informasi();
            System.out.println("");
            Sampan sampan = new Sampan(2, 15000, 2);
            sampan.informasi();
            sampan.berlayar(2);
            sampan.berlabuh();
            sampan.berlabuh(2);
            System.out.println("");
            Kapal kapal = new Kapal(4, 5000, "Diesel");
            kapal.informasi();
            kapal.berlayar("Diesel");
            kapal.berlayar(20);
            kapal.berlabuh();       
        }  
    }    
}
