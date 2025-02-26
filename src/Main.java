import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            Nums n = new Nums();
            int i = 0;

        do{

            System.out.println("Write one number: ");
            n.n1 = sc.nextInt();

            System.out.println("Write another number: ");
            n.n2 = sc.nextInt();

            System.out.println("Choose what you want to do with the 2 numbers:\n[1] Addition\n[2] Subtraction\n[3] Multiplication\n[4] Divison");


                int calc = sc.nextInt();
                switch (calc) {
                    case 1:
                        System.out.println("The addition result: " + n.add(n.n1, n.n2));
                        break;

                    case 2:
                        System.out.println("The subtration result: " + n.sub(n.n1, n.n2));
                        break;

                    case 3:
                        System.out.println("The multiplication result: " + n.multi(n.n1, n.n2));
                        break;

                    case 4:
                        System.out.println("The division result: " + n.div(n.n1, n.n2));
                        break;

                }
        String Paper;
        String Paper1; 
        String Paper2;
        
        
        System.out.println("[0] if you want to continue");
        i = sc.nextInt();
        }while (i == 0);

        System.out.println("Thanks and bye!");
        System.out.println("The End!");
        sc.close();
    }
}

