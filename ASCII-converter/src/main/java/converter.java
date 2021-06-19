import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Scanner;

public class converter {
    public static void main(String[] args) throws ParseException {
        System.out.println("Please enter the string to be converted: ");
        Scanner userInput = new Scanner(System.in);
        String text = userInput.next();
        byte[] bytes = text.getBytes(StandardCharsets.US_ASCII);
        System.out.println(text);
        System.out.println(Arrays.toString(bytes));

    }



}
