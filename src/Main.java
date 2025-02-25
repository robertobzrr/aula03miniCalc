import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Nums n = new Nums();
        int i = 0;

        do{

        System.out.println("Write one number: ");
        n.num1 = sc.nextInt();

        System.out.println("Write another number: ");
        n.num2 = sc.nextInt();

        System.out.println("Choose what you want to do with the 2 numbers:\n[1] Addition\n[2] Subtraction\n[3] Multiplication\n[4] Divison");


        int calc = sc.nextInt();
        switch (calc) {
            case 1:
                System.out.println("The addition result: " + n.add(n.num1, n.num2));
                break;

            case 2:
                System.out.println("The subtration result: " + n.sub(n.num1, n.num2));
                break;

            case 3:
                System.out.println("The multiplication result: " + n.multi(n.num1, n.num2));
                break;

            case 4:
                System.out.println("The division result: " + n.div(n.num1, n.num2));
                break;

        }

        System.out.println("[0] if you want to continue");
        i = sc.nextInt();
        }while (i == 0);

        System.out.println("The End!");
        System.out.println("The End!!!!");
    }
}




      /*      case 2:
                n.sub();
                System.out.println("The subtration result: "+ n.sub);
                break;

            case 3:
                n.mult();
                System.out.println("The multiplication result: "+ n.mult);
                break;

            case 4:
                n.div();
                System.out.println("The division result: "+ n.div);
                break;
*/