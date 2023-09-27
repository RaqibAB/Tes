package prak3soal3;
import java.util.Scanner;
public class Prak3Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int beli, cashback, bonus, jumlah;
        
        System.out.println("=====Selamat Datang di Toko Pro=====");
        System.out.print("Banyak Pembelian Barang : ");beli = input.nextInt();
        System.out.println("====================================");
        
        cashback = (beli/7)*5500;
        bonus = beli/3;
        jumlah = beli+bonus;
        
        if(beli>0){
            System.out.println("Cashback : Rp." + cashback);
            System.out.println("Tambahan Barang : " + bonus);
            System.out.println("Jumlah Barang : " + jumlah);
        }else{
            System.out.println("Error!");
        }
        
        
        
        
    }
    
}
