import java.util.*;
public class CelsiustoFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in Celcius: ");
        int temp= sc.nextInt();
        int Fahrenheit=0;
        Fahrenheit=(temp*9/5)+32;
        System.out.println("The Temperature in Fahrenheit is: "+Fahrenheit);
    }
}
