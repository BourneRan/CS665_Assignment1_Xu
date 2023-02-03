import java.util.Scanner;

public class Vending {

    public void vending(){
        Vending o1 = new VendingCoffee();
        Vending o2 = new VendingTea();
        System.out.println("Welcome to Zhuoran's VendingMachine!");
        Scanner sc = new Scanner(System.in);
        int flag=0;
        while(flag==0){
            System.out.print(" Enter 1 for coffee and 2 for tea :\n ");
            int t = sc.nextInt();
            if(t==1){
                flag = 1;
                ((VendingCoffee) o1).CoffeeChoice();
            } else if (t==2) {
                flag = 1;
                ((VendingTea) o2).TeaChoice();
            }
            else {
                System.out.println("Invalid input, please retype:");
            }
        }
    }
}
