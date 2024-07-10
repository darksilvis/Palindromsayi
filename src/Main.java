import java.util.Scanner;

public class Main {

    static boolean isPalindrom(int number) {
        int temp = number, reversenumber = 0, lastNumber;
        while (temp != 0) {

            lastNumber = temp % 10;
            reversenumber = (reversenumber * 10) + lastNumber;


            temp /= 10;
        }
        return number == reversenumber;
    }

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi girin: ");
        number = input.nextInt();

        if (isPalindrom(number)) {
            System.out.println(number + " bir palindrom sayidir.");
        } else {
            System.out.println(number + " bir palindrom sayi degildir.");
        }

        input.close();
    }
}
