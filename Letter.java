interface Printable{
     void print();
}
public class Letter implements Printable{
    String text="Test";

    @Override
    public void print() {
        System.out.println(text);
    }


}

class Student implements Printable{
    String name="Oni";
    String[] grade=new String[5];

    @Override
    public void print() {
        System.out.println(name);
        System.out.println(grade);
    }
}

class Main{
    public static void main(String[] args) {
        Letter letter=new Letter();
        letter.print();
    }
}

