import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("camel to Pothole: 1");
        System.out.println("Pothole to camel: 2");
        String check = scanner.nextLine();
        System.out.println("write sentence!");
        String input = scanner.nextLine();

        if (check.charAt(0) == '1')
            format.toPotholeCase(input);
        else
            format.toCamelCase(input);
    }

}


