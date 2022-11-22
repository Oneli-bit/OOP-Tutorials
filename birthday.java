import java.util.Random;

public class birthday {


    public static void main(String[] args) {
        boolean[] DaysintheYear= new boolean[365];
        int numOfPeople=0;

        Random random=new Random();

        while(true){
            ++numOfPeople;
            int birthday= random.nextInt(365);
            System.out.println(birthday);

            if (DaysintheYear[birthday]){
                break;
            }else{
                DaysintheYear[birthday]=true;
            }

        }
        System.out.println("Number of people with twin birthdays : "+numOfPeople);
    }

}
