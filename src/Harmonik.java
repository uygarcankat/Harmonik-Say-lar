import java.util.Scanner;



public class Harmonik {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double x= 1.0;
        double sum=0;
        double kesir;
        System.out.println( "Lütfen sayı giriniz");
        int number = input.nextInt();

        for (int i=1; number>=i; i++) {

            kesir = 1 / x;

            sum += kesir;

            x++;
        }
        System.out.println(sum);


    }
}
