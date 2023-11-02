import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Car {
    int price;
    String color;
    double motor;
    String model;
    int milAge;

    String createdAt = "15-11-2020";
    SimpleDateFormat date = new SimpleDateFormat(createdAt);
    Car(int myPrice, String myColor, double myMotor, String myModel, String myDate,int myMilAge) {
        price = myPrice;
        color = myColor;
        motor = myMotor;
        model = myModel;
        createdAt =myDate;
        milAge = myMilAge;
    }

    public int start(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Start=");
        int n = scanner.nextInt();
        return milAge+n;
    }
    public int stop(){
        return milAge;
    }
    void display(){
        System.out.println("Price"+price);
        System.out.println("Color"+color);
        System.out.println("Motor"+motor);
        System.out.println("CreatedAt"+createdAt);
        System.out.println("Model"+model);
        System.out.println("MilAge"+milAge);

    }
    public static void main(String[] args){
        Car car1=new Car(1000,"white",3);
        car1.display();
        System.out.println(car1.start());
        System.out.println(car1.stop());
    }

}

