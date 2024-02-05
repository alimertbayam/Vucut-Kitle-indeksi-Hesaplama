import java.util.Scanner;

public class VucutKitleIndex {
    public static void main(String[] args)
    {
        double boy, kilo;

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Boyunuzu (santimetre cinsinde) Giriniz.: ");
        boy = input.nextInt();
        System.out.println("Lütfen Kilonuzu Giriniz.: ");
        kilo = input.nextInt();

        double index = kilo / ((boy/100)*(boy/100));
        System.out.println("Vücut Kitle İndeksi: " + index);
    }
}
