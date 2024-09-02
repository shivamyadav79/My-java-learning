import java.util.Scanner;
class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length");
        int len = sc.nextInt();
        System.out.println("Enter Breath");
        int br = sc.nextInt();
        System.out.println(len *br);
    }
}
