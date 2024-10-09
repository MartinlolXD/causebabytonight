import java.util.Scanner;

class main{
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Jak se máš?");
    System.out.println("");
    System.out.println("1. Dobrý a ty?");
    System.out.println("2. Asi dobrý");
    String line = sc.nextLine();
    

    
    if(line.equals("1")){
        System.out.println("Tak to je super a já se mám též dobře");
        System.out.println("...Cesta do školy...");
    }
    if(line.equals("2")){
        System.out.println("Dobrý nezníž moc nadšeně");
        System.out.println("...Cesta do školy...");
    }
    


}

}
