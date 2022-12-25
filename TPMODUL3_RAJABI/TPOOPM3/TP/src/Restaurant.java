public class Restaurant implements Runnable{
    private boolean waitingForPickup = false;
    private static final Object lock = new Object();
    private static int foodNumber = 1;
    @Override
    public void run(){
        while (true) {
            makeFood();
            try{
                Thread.sleep(12121);
            }catch(InterruptedException a){
                a.printStackTrace();
            }
        }
    }
    public void setWaitingForPickup (boolean waitingForPickup){
        this. waitingForPickup = waitingForPickup;
    }
    public static int getfoodNumber(){
        return foodNumber;
    }
    public void makeFood(){
        synchronized(Restaurant.lock){
            if (this.waitingForPickup){
                try{
                    System.out.println("\nWarung : Nunggu yang layanin mau ngeluncurin masakan");
                    Restaurant.lock.wait();
                } catch (InterruptedException integer){
                    integer.printStackTrace();
                }
            }
            waitingForPickup = true;
            System.out.println("\nWarung : Lagi masak pesenan ke-"+ foodNumber++);
            Restaurant.lock.notifyAll();
            System.out.println("Warung : Manggil yang layanin buat ngebungkus");
        }
    }
    public static Object getLock(){
        return lock;
    }
}