public class concat {
    public static void main(String[] args) {
        String animal1 = "quick brown fox ";
        String animal2 = "lazy dog";
        String article = "the ";
        String action = "jumps over ";
        String s5=article.concat(animal1).concat(action).concat(article).concat(animal2);
        System.out.println(s5);
        System.out.println("-----------");
        System.out.println(article+animal1+action+article+animal2);

    }
}
