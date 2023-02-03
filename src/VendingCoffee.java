import java.util.Scanner;

public class VendingCoffee extends Vending{
    private static double[] price = new double[]{5.49, 4.49, 3.49};
    private static int flag_1 = 0;
    private static int flag_2 = 0;
    private static int flag_3 = 0;

    private static String[] Coffee = new String[]{"Espresso", "Americano", "Latte Macchiato"};
    private static Scanner s2 = new Scanner(System.in);

    public static void addsugarmilk(int choice){
        flag_1 = 1;
        while(flag_2==0){
            System.out.println("Please input 0-3 unit sugar if you want");
            int s = s2.nextInt();

            if(s>3 || s<0){
                System.out.println("Invalid input, please retype:");
            }
            else{
                flag_2 = 1;
                while(flag_3==0){
                    System.out.println("Please input 0-3 unit milk if you want");
                    int m = s2.nextInt();
                    if(m>3 || m<0){
                        System.out.println("Invalid input, please retype:");
                    }
                    else{
                        flag_3 = 1;
                        System.out.println("Your "+Coffee[choice-1]+" is ready with "
                                + s +" unit of sugar and "+m+" unit of milk");
                        System.out.println("Please pay " + price[choice-1] + "$ and complete!\n");
                    }
                }
            }
        }
    }
    public void CoffeeChoice(){
        System.out.println("Please select Coffee favor you like:");
        System.out.println("Coffee Menu:");
        for(int i=0; i< Coffee.length; i++){
            System.out.println((i+1) + " for " + Coffee[i] + " " + price[i] + "$");
        }

        while(flag_1==0){
            System.out.println("Enter the number to choose:");
            int choice = s2.nextInt();
            if(choice<1 || choice>3){
                System.out.println("Invalid input, please enter 1 to " + Coffee.length);
            }
            else{
                addsugarmilk(choice);
            }
        }
    }



}
