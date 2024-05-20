public class CommandLine {

    public static void main(String[] args) {
        
        for (String arg : args) {
            double fahrenheit = Double.parseDouble(arg);
            double celsius = convertF2C(fahrenheit);
            System.out.printf("F = %.2f; C = %.2f%n", fahrenheit, celsius);    
        }
        
    } 

    private static double convertF2C(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }    

}
