import java.util.Scanner;

public class _01_05_Ìæ»»¿Õ¸ñ {

    public static void main(String[] args) {
        String s = "We are happy.";
        System.out.println(s.replaceAll(" ", "%20"));

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ')
                ans.append("%20");
            else
                ans.append(s.charAt(i));
        }
        System.out.println(ans.toString());
    }
}
