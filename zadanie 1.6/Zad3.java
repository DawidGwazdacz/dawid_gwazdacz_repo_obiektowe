import java.util.Scanner;
class Zad3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String imie = "";
        String nazwisko = "";
        int wiek = 0;
        int waga = 0;
        int wzrost = 0;
        System.out.println("Podaj imie");
            imie = scanner.next();
        System.out.println("Podaj nazwisko");
            nazwisko = scanner.next();
        System.out.println("Podaj wiek");
            wiek = scanner.nextInt();
        System.out.println("Podaj wage");
            waga = scanner.nextInt();
        System.out.println("Podaj wzrost");
            wiek = scanner.nextInt();

        float wzrostwmetrach = wzrost/100;   
            float bmi = waga/(wzrostwmetrach*wzrostwmetrach);
            
            System.out.println("Twoje BMI jest równe: "+bmi);
    }
}