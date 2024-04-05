package Ifelse;

import java.util.Scanner;

public class SpeedMeterKilometerMiles {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float timeSeconds;
        float speedkilometerhours, speedmeterpersecond, speedmilesperhour;

        System.out.println("Distance in meters: ");
        float distance = scanner.nextFloat();

        System.out.println("Enter the time taken (hours minutes seconds) ");
        float hours = scanner.nextFloat();
        float minutes = scanner.nextFloat();
        float seconds = scanner.nextFloat();

        timeSeconds = hours * 3600 + minutes * 60 + seconds;     // Convert time to seconds
 
        speedmeterpersecond = distance / timeSeconds;        // Calculate speed in meters per second

        speedkilometerhours = speedmeterpersecond* (18.0f / 5.0f);    // Convert meters per second to kilometers per hour

        speedmilesperhour = speedkilometerhours / 1.609f;    // Convert meters per second to miles per hour

        System.out.println("Speed in meters per second: " + speedmeterpersecond);
        System.out.println("Speed in kilometers per hour: " + speedkilometerhours);
        System.out.println("Speed in miles per hour: " +speedmilesperhour);

        scanner.close();
    }
}
