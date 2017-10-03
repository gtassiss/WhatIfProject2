import java.util.Scanner;
public class Hurricane {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How fast was the wind blowing?" );
        int windSpeed = scan.nextInt();

        if (windSpeed <  74)
            System.out.println("Get over it. That was not a hurricane");
        else if (windSpeed <  95)
            System.out.println("It was a class 1 hurricane");
        else if (windSpeed < 111)
            System.out.println("It was a class 2 hurricane");
        else if (windSpeed < 131)
            System.out.println("It was a class 3 hurricane");
        else if (windSpeed < 155)
            System.out.println("It was a class 4 hurricane");
        else {

            System.out.println("It was a class 5 hurricane");
            System.out.println("Class 5 is the most severe hurricane");
            System.out.println("Hurricane Katrina was class 5");
        }
    }
}

