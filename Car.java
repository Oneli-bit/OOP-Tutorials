public class Car {
    private String licensePlate;
    private double speed;
    private double maxSpeed;
    // kilometers per hour
    // kilometers per hour
    // constructors
    public Car(String licensePlate1, double maxSpeed1) {
        this.licensePlate = licensePlate1;
        this.speed  = 0.0;
        if (maxSpeed1 >= 0.0) {
            maxSpeed = maxSpeed1;
        }
        else {
            maxSpeed = 0.0;
        }
    }


    public Car(String licensePlate1, double maxSpeed1,double speed1) {
        this.licensePlate = licensePlate1;
        this.speed  = 0.0;
        if (maxSpeed1 >= 0.0) {
            maxSpeed = maxSpeed1;
        }
        else {
            maxSpeed = 0.0;
        }

        this.speed=speed1;

        if (speed1<0){
            this.speed=0;
        }

        if (speed1>maxSpeed1){
            this.speed=maxSpeed1;

        }
    }

    public Car() {

    }
}

class CarMain{
    public static void main(String[] args) {
        Car car=new Car();
    }
}
