import java.util.Scanner;
class Zad1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final String poprawnehaslo = "Haslo123";
        String haslo = "";
        System.out.println("Podaj Hasło: ");
        haslo = scanner.next();
        if(haslo.equals(poprawnehaslo))
        {
            System.out.println("Poprawne hasło");
        }
        else
        {
            System.out.println("Niepoprawne hasło");
        }
    }
}