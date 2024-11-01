import java.util.Scanner;

public class menucafe03 {
    public static void main(String[] args) {
        String[] menu = {"Nasi Goreng","Mie Goreng","Roti Bakar","Kentang Goreng","Teh Tarik", "Chocolate Ice"};

        Scanner scanner = new Scanner(System.in);
        System.err.print("Masukkan nama makanan atau minuman yang ingin dicari: ");
        String namaMakanan = scanner.nextLine();
        boolean ditemukan = false;
        for (String item : menu) {
            if (item.equalsIgnoreCase(namaMakanan)) {
                ditemukan = true;
                break;
                
            }
        }
        if (ditemukan) {
            System.out.println("Makanan/Minuman \"" + namaMakanan + "\" tersedia di menu.");
        } else {
            System.out.println("Maaf, makanan/minuman \"" + namaMakanan + "\" tidak tersedia di menu.");
        }

        scanner.close();
    }
}
