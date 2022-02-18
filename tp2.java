import java.util.ArrayList;
import java.util.Scanner;
public class TP2 {
    public static void main(String[] arg) {
        System.out.println("Quel exercice ? Saisissez :\n"
                    + "1. Discriminant\n"
                    + "2. Parité d’un nombre\n"
                    + "3. Calcul d’extremum\n"
                    + "4. Égalité entre chaînes de caractères\n"
                    + "5. Factorielle\n"
                    + "6. Compte à rebours\n"
                    + "7. Valeurs de carrés\n"
                    + "8. Table de multiplication\n"
                    + "9. Division d’entiers\n"
                    + "10. Règle graduée\n"
                    + "11. Nombres premier\n"
                    + "12. Manipulations sur un tableau\n");

            Scanner scan = new Scanner(System.in);
            int choix=scan.nextInt();
            int n=12;
            if (choix==1)
            {
                discriminant();
            }
            else if (choix==2)
            {
                parite();
            }
            else if (choix==3)
            {
                max();
            }
            else if (choix==4)
            {
                egaliteStr();
            }
            else if (choix==5)
            {
                factorielle();
            }
            else if (choix==6)
            {
                countdown();
            }
            else if (choix==7)
            {
                carres();
            }
            else if (choix==8){
                tableMultiplication();
            }
            else if (choix==9){
                division();
            }
            else if (choix==10){
                regle();
            }
            else if (choix==11){
                nombrePremier();
            }
            else if (choix==12){
                initialisationTableau();
            }
            else{
                System.out.println("sorry no more exercise ...");
            }
        }
    


    
    public static void discriminant() {
        double X0 ;
        double X1 ;

        System.out.println("Quelle est la valeur de a ?");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();
        System.out.println("Quelle est la valeur de c ?");
        int c = scanner.nextInt();
        
        int delta = (int) (Math.pow(b, 2) - 4 * a * c);
        
        
        if (delta < 0) {
            int d= -delta;
            double r = -b/(2*a);
            double d1 = Math.pow(d, 0.5)/(2*a);
            System.out.println("Ce polynome n’a pas de racine reelle");
            System.out.println(r + " + i" + d1);
            System.out.println(r + " - i" + d1);
        }
        else if (delta == 0) {
            X0 = (-b/2*a);
            System.out.println("Ce polynome a une racine :" + X0);
        }
        else if (delta > 0) {
            X0 = (-b - Math.sqrt(delta))/2*a;
            X1 = (-b + Math.sqrt(delta))/2*a;
            System.out.println("Ce polynome a deux racines :" + X0 + "  " + X1);
        }
    }
    public static void parite(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();

        if (a%2 == 0){
            System.out.println("pair");
        }
        else {
            System.out.println("impair");
        }

    }
    public static void max() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();

        if (b > a) {
            System.out.println("B est plus grand que A");
        }

        else {
            System.out.println("A est plus grand que B");
        }
    }
    public static void egaliteStr(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle la première chaine de caractère ?");
        String a = scanner.nextLine();
        System.out.println("Quelle la deuxième chaine de caractère ?");
        String b = scanner.nextLine();

        if (a.equals(b)){
            System.out.println("Ce sont les même chaine");
        }
        else {
            System.out.println("Ce ne sont pas les même chaines");
        }

    }
    public static void factorielle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier positif ou nul");
        int n = scanner.nextInt();
        int factorielle = 1;
    
        for (int i = 1; i <= n; i++) {
            factorielle *= i;
        }
    
        System.out.println(n + "! = " + factorielle);
    }

    public static void countdown(){
        int count = 10;
        while (count != 0){
            System.out.println(count);
            count -= 1;

        }
        System.out.println("BOOOOOOOOOOOOOOOOOOOOOOOOOOM");
    }
    public static void carres(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier positif ou nul");
        int n = scanner.nextInt();
        System.out.println(n + "    " + n*n);

    }
    public static void tableMultiplication(){
        int a = 10;
        int b = 10;

        for (int i = 1; i<= a ; i++){
            for (int y = 1; y<= b ; y++){
                System.out.print(y*i + " ");
            }
            System.out.print("\r\n");
        }
    }
    public static void division(){
        Scanner scanner = new Scanner(System.in);
        int b;
        System.out.println("Veuillez saisir un numérateur");
        int a = scanner.nextInt();
        do {
        System.out.println("Veuillez saisir un dénominateur nul");
        b = scanner.nextInt();
        } while (b == 0);
        System.out.println(a/b);
    }
    public static void regle(){
        Scanner scanner = new Scanner(System.in);
        int a;
        do{
            System.out.println("Veuillez saisir la longueur");
            a = scanner.nextInt();
        } while (a < 0);
        
        int i = 0;
        while (i != a) {
            if (i%10 == 0){
                System.out.print("|");
                i += 1;
            }
            else{
                System.out.print("-");
                i += 1;
            } 
        }
    }
    public static void nombrePremier(){
        
        Scanner scanner = new Scanner(System.in);
        int a;
        do{
            System.out.println("Veuillez saisir un nombre");
            a = scanner.nextInt();
        } while (a < 0);

        boolean premier = true;
        int i = 2;
        while (i != a) {
            if (a%i == 0){
                
                premier = false;
                break;
            }
            i += 1;
        }   
        
        if (premier == false){
            System.out.print("le nombre n'est pas premier");
        }
        else{
            System.out.print("le nombre est premier");
        }
    
    }

    public static void initialisationTableau() {
        int[] tableau = new int[4];

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        int sum = 0;
        ArrayList pair = new ArrayList<>();
        ArrayList indicePair = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Saisir un entier");
            int entier = scanner.nextInt();
            tableau[i] = entier;
            sum += tableau[i];
            if (tableau[i]%2 == 0){
                pair.add(tableau[i]);
            }
            if (i%2 == 0){
                indicePair.add(tableau[i]);
            }
            if (i == 0){
                min = tableau[0];
                max = tableau[0];
            }
            else if ( tableau[i] < min){
                min = tableau[i];
            }
            else if ( tableau[i] > max){
                max = tableau[i];
            }
    
        }
    System.out.println("min : "+ min); 
    System.out.println("sum : "+ sum); 
    System.out.println("pair : "+ pair); 
    }

    
}
