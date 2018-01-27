
package fizzbuzzjava;

/**
 * FizzBuzzJava
 * Iterates from 1 to 100, printing "Fizz" if divisible by 3, "Buzz" if divisible
 * by 5, both if both apply, and the number if none apply.
 * @author Mike Brooks
 */
public class FizzBuzzJava {

    /**
     * @param args the command line arguments. None expected.
     */
    public static void main(String[] args) {
        
        for (int i = 1; i <= 100; i++)
        {
            String output = "";
            output += i % 3 == 0 ? "Fizz" : "";
            output += i % 5 == 0 ? "Buzz" : "";
            System.out.println(output.equals("") ? i : output);
        }        
    }
    
}
