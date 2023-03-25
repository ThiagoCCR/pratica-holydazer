import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira uma data- ");
        String date = scan.nextLine();
        HolydaysChecker check = new HolydaysChecker();
        check.searchHoliday(date);
        scan.close();

    }
}
