public class Kapal extends TransportasiAir{
        protected String mesin;
        public Kapal(int jumlahKursi, int biaya, String mesin) {
            super(jumlahKursi, biaya);
            this.mesin = mesin;
        }
        @Override
        public void informasi() {
            System.out.println("Transportasi jenis Kapal dengan kursi berjumlah"+jumlahKursi+"ditetapkan dengan biaya"+biaya);
        }
        public void berlayar(String mesin ){
            System.out.println("Transportasi Air jenis Kapal sedang berlayar menggunakan mesin "+ mesin+"dengan kecepatan tidak stabil");
        }
        public void berlayar(int kecepatan){
            System.out.println("Transportasi Air jenis Kapal sedang berlayar berlayar menggunakan mesin "+ mesin+"dengan kecepatan"+kecepatan+"knot");
        }
        public void berlabuh(){
            System.out.println("Transportasi Air jenis Kapal sedang berlabuh di pantai");
        }
    }