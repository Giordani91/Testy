import java.net.SocketOption;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie ");
        String name = scanner.nextLine();

        System.out.println("cześć " + name);
        if (!name.isEmpty() && name.endsWith("a")) {
            System.out.println("jestes kobieta");
        }else if (!name.isEmpty() && !name.endsWith("a")) {
                System.out.println("Jestes facetem");
            } else {
                System.out.println("Podaj imie nie moze byc puste");
            }
        }


    }


