import java.util.Scanner;

class Weather {
    String cityName;
    double temperatureCelsius;

    
    Weather(String cityName, double temperatureCelsius) {
        this.cityName = cityName;
        this.temperatureCelsius = temperatureCelsius;
    }

    
    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    
    void display() {
        System.out.println("City: " + cityName);
        System.out.println("Temperature in Celsius: " + temperatureCelsius);
        System.out.println("Temperature in Fahrenheit: "
                + celsiusToFahrenheit(temperatureCelsius));
        System.out.println();
    }
}


public class Q9{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of cities: ");
        int n = sc.nextInt();
        sc.nextLine();

        Weather[] weather = new Weather[n];

        
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of City " + (i + 1));

            System.out.print("Enter City Name: ");
            String city = sc.nextLine();

            System.out.print("Enter Temperature in Celsius: ");
            double temp = sc.nextDouble();
            sc.nextLine();

            weather[i] = new Weather(city, temp);
        }

        
        System.out.println("\n===== WEATHER DETAILS =====");

        for (int i = 0; i < n; i++) {
            weather[i].display();
        }

        
        int highest = 0;

        for (int i = 1; i < n; i++) {
            if (Weather.celsiusToFahrenheit(weather[i].temperatureCelsius)
                > Weather.celsiusToFahrenheit(weather[highest].temperatureCelsius)) {
                highest = i;
            }
        }

        System.out.println("===== CITY WITH HIGHEST TEMPERATURE =====");
        weather[highest].display();
    }
}