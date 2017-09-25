import Services.Scanner;

import java.io.IOException;

public class Input {
    public static Integer input() throws IOException {
        System.out.println("Input natural number");
        return Integer.valueOf(Scanner.scanner.readLine());
    }
}
