/**
 * @author StuartBanannaa
 * The core idea of the problem is if we can divide the number to 2 even numbers i.e if we can divide by 2 or not 
 * Prints YES if divisible by 2 and NO if not divisible by 2
 * Note weight should be grater than 2 since we cannot split 2 into two even numbers
 */
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        sc.close();
        if (w > 2 && w % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}