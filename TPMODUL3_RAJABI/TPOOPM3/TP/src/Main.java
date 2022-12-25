import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner add = new Scanner(System.in);
        Restaurant wr = new Restaurant();
        int customerID, orderQty;
        try{
            System.out.println("#############################");
            System.out.print("Masukkin ID yang beli : ");
            customerID = add.nextInt();
            System.out.print("Banyak pesenan : ");
            orderQty = add.nextInt();
            System.out.print("#############################");
            Thread thr1 = new Thread(wr);
            Waiters wtr = new Waiters(customerID, orderQty);
            Thread thr2 = new Thread(wtr);
            thr1.start();
            thr2.start();
            thr1.join();
            thr2.join();
        } catch(Exception integer){
            System.out.println("Masukkin angka aja coy! \nCobain lagi deh.");
        }
    }
}