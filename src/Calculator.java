import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    
    public static void main (String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            double result = 0;
            boolean loopBreak = false;

            while (true) {

                System.out.print(">");
                String line = br.readLine();

                String[] str = line.split(" ");
 
                switch (str[0]) {
                    case "ADD":
                        result += Double.parseDouble(str[1]);
                        break;
                    
                    case "SUB":
                        result -= Double.parseDouble(str[1]);
                        break;                        
                    
                    case "MUL":
                        result = result * Double.parseDouble(str[1]);
                        break;
                    
                    case "DIV":
                        result = result / Double.parseDouble(str[1]);
                        break;
                    
                    case "CLR":
                        result = 0;
                        break;
                    
                    case "EXIT":
                        loopBreak = true;
                        break;

                    default:
                        System.out.println("Please enter correct operator value");
                        break;
                }
                if (loopBreak) break;
                System.out.println(result);
            }
        } finally {
            //System.err.println("Something wrong...");
        }
    }
}