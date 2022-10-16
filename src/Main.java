import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie groß ist Tasos Penis? \nBitte geben Sie die Zahl in cm ein und drücken Sie dann auf ENTER, Sie Hurensohn: ");
        int b = scanner.nextInt();
        if(b>=20) {
            System.out.println("Diese Antwort ist realistisch!");
        } else {
            System.out.println("Größer du Hurensohn");
        }
        System.out.println("Jetzt gib eine 3-stellige Zahl ein du Hund");
        int a = scanner.nextInt();

        while(a>0) {
            if (a>99) {
                System.out.println("Mehr als " + a +   " Tage ohne Alexi sind so geil!!!!!!!!!!");
            } else if(a>10) {
                System.out.println("Mehr als " + a + " Tage OHNE Alexi sind super");
            } else {
                System.out.println("Hautsache OHNE ALEXI");
            }

            a--;
        }
        scanner.close();
    }
    
    //Das ist ein Pull Test

}
