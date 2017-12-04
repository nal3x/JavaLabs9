import java.io.*;

public class ExceptionTester1 {
    public static void main(String[] args) {
       int num;
       num = getNumber();
System.out.println("To diplasio tou arithmou einai " + 2 * num);
}


public static int getNumber(){
int ret=0;
String line;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Dwse enan arithmo:");

try {
    line = br.readLine();
    ret= Integer.parseInt(line);
}
catch (IOException e) {
    System.out.println(e);
}
catch(NumberFormatException e) {
    System.out.println(e);
    }
finally {
    return ret;
       }
    }
}
