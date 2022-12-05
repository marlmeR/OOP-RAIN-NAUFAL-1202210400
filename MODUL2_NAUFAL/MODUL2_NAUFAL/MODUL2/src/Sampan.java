public class Sampan extends TransportasiAir {
    protected int layar;
    public Sampan(int jumlahKursi, int biaya, int layar) {
        super(jumlahKursi, biaya, layar);
        this.layar = layar;
    }
    @Override
    public void informasi() {
        System.out.println("Transportasi jenis Sampan dengan kursi berjumlah"+jumlahKursi+"ditetapkan dengan biaya"+biaya);
    }
    public void berlayar(String layar ){
        System.out.println("Transportasi Air jenis Sampan sedang berlayar menggunakan "+ layar+"layar");
    }
    public void berlabuh(){
        System.out.println("Transportasi Air jenis Sampan sedang berlabuh di pantai tanpa jangkar");
    }
    public void berlabuh(int layar){
        System.out.println("Transportasi Air jenis Sampan sedang berlabuh menggunakan "+ layar+"layar");
    }
}