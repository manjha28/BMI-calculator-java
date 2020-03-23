import java.util.Scanner; //Scanner Class is used to take user's input from keyboard
import java.io.*;
class FahrenToCelsius
{
 int f;
 int c;
 void GetData(int fahrenheit)
 {
 f = fahrenheit;
 }
double ConvertFhrToCelc()
{
 double Celsius ; // Local Variables i.e. variables belongs to this function only
 Celsius = (f - 32)/1.8;
 return Celsius;
 }
}
class Experiment2
{
 public static void main(String args[])
 {
 int Fahrnht;
 double Cels;
 Scanner s = new Scanner(System.in);
 System.out.println("Enter the temperature in Fahrenheit. The value shouild be an integer.");
 Fahrnht = s.nextInt(); // to read integer value
 FahrenToCelsius t = new FahrenToCelsius(); // object creation
 t.GetData(Fahrnht); // setting value into instance variable: f
 Cels = t.ConvertFhrToCelc();
 System.out.println("Fahrenheit Celsius");
 System.out.println(Fahrnht + " " + Cels);
 }}
