import java.util.Scanner;

public class VMmain2 {
    public static void main(String[] args) {

        VendingMachine vm=new VendingMachine(50);


        System.out.println("******************Welcome to the soda can vending machine******************");
        Scanner myObj = new Scanner(System.in);
        System.out.println("If you want to order a can of soda enter any key: ");
        String userName = myObj.nextLine();
        if (userName.length()!=0){
            if (vm.numOfCans>0){
                vm.insertToken();
                System.out.println("customer is being served!");
                System.out.println("Remaining cans: "+vm.numOfCans);
            }else {
                System.out.println("We're running out of cans!");
                System.out.println("Enter the number of cans for the refill: ");
                int refill = myObj.nextInt();
                vm.fillUp(refill);
                System.out.println("Machine is being refilled with "+refill+"cans!");
            }

        }



    }
}
