import java.util.Scanner ;
    
    public class Celsiustest {
        public static void main(String[]agrs) {
        Scanner scanner = new Scanner(System.in);
        int mySalary = 2000;

        System.out.print("Enter Fahrenheit degee:");
        float Fahrenheit = scanner.nextFloat();
        float celsius =(Fahrenheit - 32) * 5 / 9f;
        double roundedCalsius = Math.round(celsius * 100.0) / 100.0;
        System.out.println(Fahrenheit +"Fahrenheit is equal to " + roundedCalsius + "Calsius");
        scanner.close();





        
        
        }

                            
}
