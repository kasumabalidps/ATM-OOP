import java.util.ArrayList;
import java.util.Scanner;

public class RentalVCD {
    private final ArrayList<VCD> vcdList = new ArrayList<>();

    public void addVCD(VCD vcd) {
        vcdList.add(vcd);
    }

    public void displayVCDs() {
        for (VCD vcd : vcdList) {
            System.out.println("---------------------");
            vcd.displayInfo();
            System.out.println("---------------------");
        }
    }

    public static void main(String[] args) {
        RentalVCD rental = new RentalVCD();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah VCD yang ingin diinput: ");
        int jumlah = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("VCD #" + (i + 1));
            System.out.print("Judul: ");
            String judul = scanner.nextLine();
            System.out.print("Aktor: ");
            String aktor = scanner.nextLine();
            System.out.print("Sutradara: ");
            String sutradara = scanner.nextLine();
            System.out.print("Publisher: ");
            String publisher = scanner.nextLine();
            System.out.print("Kategori (SU/D/R/A): ");
            String kategori = scanner.nextLine();
            System.out.print("Stok: ");
            int stok = scanner.nextInt();
            scanner.nextLine();

            VCD vcd = new VCD(judul, aktor, sutradara, publisher, kategori, stok);
            rental.addVCD(vcd);
        }

        System.out.println("\nDaftar VCD:");
        rental.displayVCDs();
    }
}