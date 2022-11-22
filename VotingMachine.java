import java.util.Random;
public class VotingMachine {

    int L_votes=0;
    int C_votes=0;

    public void clearState(){
        L_votes=0;
        C_votes=0;
    }

    public void L_add(){
        Random random=new Random();
        int votes= random.nextInt(5);
        L_votes=L_votes+votes;

    }

    public void C_add(){
        C_votes++;

    }


}
