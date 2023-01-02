import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        int kilo;
        float boy;
        Scanner girdi= new Scanner(System.in);
        System.out.print("Kilonuzu Giriniz:");
        kilo=girdi.nextInt();
        System.out.print("Boyunuzu Giriniz:");
        boy=girdi.nextFloat();
        System.out.println("Vücut Kitle İndeksiniz: "+(kilo/(boy*boy)));

    }
}
