import java.util.Scanner;
//
public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        System.err.println(ch);
        if (ch >= 'a' && ch <='z'){
            System.out.println(ch);
        }
        System.out.println("Upper Case , Need To Convert toLoweCase");
        ch = Character.toLowerCase(ch);
        System.out.println(ch);
    }
}

