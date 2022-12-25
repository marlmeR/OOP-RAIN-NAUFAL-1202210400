public class Waiters implements Runnable{
    private final int customerID;
    private final int orderQty;
    static int foodPrice = 69000;  
    public Waiters(int customerID, int orderQty) {
        this.customerID = customerID;
        this.orderQty = orderQty;
    }
    @Override
    public void run(){
        while (true) {
            getFood();
            try{
                Thread.sleep(22345);
            }catch(InterruptedException l){
                l.printStackTrace();
            }
        }
    }
    public void orderInfo(){
        System.out.println("======================================================");
        System.out.println("ID yang beli : " + this.customerID);
        System.out.println("Banyak : " + this.orderQty);
        System.out.println("Harus bayar segini : " + this.orderQty * foodPrice);
        System.out.println("======================================================");
    }
    public void getFood() {
        synchronized(Restaurant.getLock()){
            System.out.println("Yang layanin : Masakan siap diluncurkan");
            Restaurant wr = new Restaurant();
            wr.setWaitingForPickup(false);
            if (Restaurant.getfoodNumber() == this.orderQty + 1){
                orderInfo();
                System.exit(0);
            }
            Restaurant.getLock().notifyAll();
            System.out.println("Yang layanin : Nyuruh kang masak, masak lagi yang lain");
        }
    }
}