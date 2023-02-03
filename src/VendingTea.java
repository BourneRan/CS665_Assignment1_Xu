import java.util.Scanner;

public class VendingTea extends Vending{
    private double[] price = new double[]{2.99, 3.99, 4.99};
    private int flag = 0;
    private String[] Tea = new String[]{"BlackTea", "GreenTea", "YellowTea"};
    public void TeaChoice(){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Please select tea favor you like:");
        System.out.println("Tea Menu:");
        for(int i=0; i< Tea.length; i++){
            System.out.println((i+1) + " for " + Tea[i] + " " + price[i] + "$");
        }
        while(flag==0){
            System.out.println("Enter the number to choose:");
            int choice = s1.nextInt();
            if(choice<1 || choice>3){
                System.out.println("Invalid input, please enter 1 to " + Tea.length);
            }
            else{
                flag = 1;
                System.out.println("Please pay " + price[choice-1] + "$ and complete!\n");
            }
        }
    }
}
