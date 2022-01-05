import java.util.Scanner;
class Zad2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String wyraz = "";
        System.out.println("Podaj wyraz");
        wyraz = scanner.next();
        int dlugosc = wyraz.length();
        System.out.println(dlugosc);
    }
}
