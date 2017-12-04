import java.io.*;

public class ExceptionTester2 {
    public static void main(String[] args) {
       int num;

       try {
       num = getNumber();

       System.out.println("To diplasio tou arithmou einai " + 2 * num);
        }
        catch (IOException e) {
            System.out.println(e);
        }
        catch(NumberFormatException e) {
           System.out.println(e);
        }
 }



public static int getNumber() throws IOException, NumberFormatException {
    String line;
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    System.out.println("Dwse enan arithmo:");
    line=br.readLine();
    return Integer.parseInt(line);
    }
}
