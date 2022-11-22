import java.util.Scanner;

public class VotingMachine_main {
    public static void main(String[] args) {

        VotingMachine votes=new VotingMachine();
        votes.C_add();
        votes.L_add();
        System.out.println("C: "+votes.C_votes);
        System.out.println("L: "+votes.L_votes);



    }
}
