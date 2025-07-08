package viikko2;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print( "Anna auton merkki: " );
        String merkki = scanner.nextLine();

        System.out.print( "Anna auton malli: " );
        String malli = scanner.nextLine();

       
        Car newCar= null; // Auto-olio, joka luodaan myöhemmin

        // Luodaan auto-olio
        newCar = new Car(merkki, malli);


        boolean exit = false;
        while(!exit) {
            System.out.println("1) Näytä auton tila");
            System.out.println("2) Muokka auton merkkiä ja mallia");
            System.out.println("3) Kiihdytä autoa");
            System.out.println("4) Hidasta autoa");
            System.out.println("0) Lopeta ohjelma");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    newCar.printSpecs();
                    break;
                case 2:
                    System.out.print("Anna uusi auton merkki: ");
                    newCar.setMerkki(scanner.next());
                    System.out.print("Anna uusi auton malli: ");
                    newCar.setMalli(scanner.next());
                    break;
                case 3:
                    System.out.println("Kuinka monta km/h haluat kiihdyttää?");
                    newCar.kiihdyta(scanner.nextInt());
                    break;
                case 4:
                    System.out.println("Kuinka monta km/h haluat hidastaa?");
                    newCar.hidasta(scanner.nextInt());
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Virheellinen valinta, yritä uudelleen.");
            }


        }
        scanner.close();
    
    }
}
