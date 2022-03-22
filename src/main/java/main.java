import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try {
            parnNeparn();
        }catch (InputMismatchException n){
            n.printStackTrace();
        }

    }
    public static void parnNeparn() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть число :");
        Double n = sc.nextDouble();
            if (n % 2 == 0 & n % 1 == 0){
                System.out.println("Число є парним.");
            }else if(n % 2 == 1 & n % 1 == 0) {
             System.out.println("Число є непарним");
            }else {
                throw new InputMismatchException("Ви ввели не коректне число!");
            }
    }
}
