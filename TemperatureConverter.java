package tempereatur_converter;
 import java.util.Scanner;
 
public class TemperatureConverter
{

	public static void main(String[] args)
	{
	 Scanner input=new Scanner(System.in);
	 System.out.println("Enter the temperature:");
	 double temperature =input.nextDouble();	
	 System.out.print("Enter the scale of the temperature(C, F, or K):");
	 String scale = input.next();
	 double convertedTemperature = 0;
     // Convert the temperature to the desired scale
     switch(scale) {
         case "C":
             // Convert from Celsius to Fahrenheit
             convertedTemperature = (temperature * 9/5) + 32;
             System.out.println(temperature + " degrees Celsius is " + convertedTemperature + " degrees Fahrenheit");
             // Convert from Celsius to Kelvin
             convertedTemperature = temperature + 273.15;
             System.out.println(temperature + " degrees Celsius is " + convertedTemperature + " Kelvin");
             break;
         case "F":
             // Convert from Fahrenheit to Celsius
             convertedTemperature = (temperature - 32) * 5/9;
             System.out.println(temperature + " degrees Fahrenheit is " + convertedTemperature + " degrees Celsius");
             // Convert from Fahrenheit to Kelvin
             convertedTemperature = (temperature + 459.67) * 5/9;
             System.out.println(temperature + " degrees Fahrenheit is " + convertedTemperature + " Kelvin");
             break;
         case "K":
             // Convert from Kelvin to Celsius
             convertedTemperature = temperature - 273.15;
             System.out.println(temperature + " Kelvin is " + convertedTemperature + " degrees Celsius");
             // Convert from Kelvin to Fahrenheit
             convertedTemperature = (temperature * 9/5) - 459.67;
             System.out.println(temperature + " Kelvin is " + convertedTemperature + " degrees Fahrenheit");
             break;
         default:
             System.out.println("Invalid scale. Please enter C, F, or K.");
             break;
     }
       }

}


