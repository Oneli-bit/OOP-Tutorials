import java.util.*;
public class Q7 {
    public static final int SET_SIZE_REQUIRED = 6;
    public static final int NUMBER_RANGE = 100;
    public static void main(String[] args) {
        Random random = new Random();

        Set set = new HashSet<Integer>(SET_SIZE_REQUIRED);

        while(set.size()< SET_SIZE_REQUIRED) {
            while (set.add(random.nextInt(NUMBER_RANGE)) != true)
                ;
        }
        assert set.size() == SET_SIZE_REQUIRED;
        System.out.println(set);

    }

}
