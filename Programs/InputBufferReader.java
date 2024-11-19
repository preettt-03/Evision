import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputBufferReader {
    public static void main(String[] args) throws IOException {
        BufferedReader ip =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter your name -- ");
        String str =  ip.readLine();

        System.out.print("enter age -- ");
        int i = Integer.parseInt(ip.readLine());
        System.out.println( "your name "+ str);
        System.out.println("your age is -- "+ i);

    }
}
