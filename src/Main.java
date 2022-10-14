import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws tamgiac {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** KIEM TRA TAM GIAC ***");
        System.out.println("Nhap vao 3 canh tam giac");
        int a;
        int b;
        int c;
        do {
            try {
                System.out.print("  Canh a : ");
                a = Integer.parseInt(sc.nextLine());
                System.out.print("  Canh b : ");
                b = Integer.parseInt(sc.nextLine());
                System.out.print("  Canh c : ");
                c = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e ) {
                System.out.println("Vui long nhap 1 so nguyen !");
            }
        } while (true);
        if ( a + b > c && a + c > b && b + c > a && a>0 && b>0 && c>0){
            System.out.println(" LA 1 TAM GIAC !");
        }else {
            throw new tamgiac(" KHONG PHAI TAM GIAC !");
        }
    }
}