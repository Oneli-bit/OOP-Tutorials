public class VendingMachine {

    int numOfCans=0;
    int tokens=0;

    //methods
    public void fillUp(int cans){
        numOfCans=numOfCans+cans;
    }

    public void insertToken(){
        tokens++;
        numOfCans--;

    }

    public int getTokenCount(){
        return tokens;
    }

    public int getCanCount(){
        return numOfCans;
    }

    public static void main(String[] args)
    {
        VendingMachine machine = new VendingMachine();
        machine.fillUp(0); // fill up with ten cans
        machine.insertToken();
        machine.insertToken();
        System.out.print("Token count = ");
        System.out.println(machine.getTokenCount());
        System.out.print("Can count = ");
        System.out.println(machine.getCanCount());
    }

    public VendingMachine(){
        numOfCans=10;
    }

    public VendingMachine(int cans){
        numOfCans=cans;
    }



}
