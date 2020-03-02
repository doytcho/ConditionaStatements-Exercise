import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double imput = Double.parseDouble(scan.nextLine());
        String mernaEdinica1 = scan.nextLine();
        String mernaEdinica2 = scan.nextLine();

        switch (mernaEdinica1) {
            case "cm":
                imput = imput * 10;
                break;
            case "m":
                imput = imput * 1000;
                break;
        }
        switch (mernaEdinica2) {
            case "mm":
                System.out.printf("%.3f",imput);
                break;
            case "cm":
                System.out.printf("%.3f",imput / 10);
                break;
            case "m":
                System.out.printf("%.3f",imput / 1000);
                break;
        }


    }
}
