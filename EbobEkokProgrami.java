package Donguler;

import java.util.Scanner;

public class EbobEkokProgrami {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz : ");
        int n1 = input.nextInt();
        System.out.print("n2 sayısını giriniz ");
        int n2 = input.nextInt();

        int i = n1;
        while (i > 0) {
            if (n1 % i == 0 && n2 % i == 0) {
                System.out.println(i);
                break;
            } i--;
        }
        int k = 1;
        while (k <= n1 * n2) {
            if(k % n1 == 0 && k % n2 == 0) {
                System.out.println(k);
                break;
            } k++;
        }
    }
}
