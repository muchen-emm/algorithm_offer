public class _01_58_II_左旋转字符串 {

    public static void main(String[] args) {
        int n = 2;
        String s = "abcdefg";
        System.out.println(s.substring(n) + s.substring(0,n));

        StringBuilder tail = new StringBuilder();
        StringBuilder head = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i < n) tail.append(s.charAt(i));
            else head.append(s.charAt(i));
        }
        head.append(tail.toString());
        String ans = head.toString();
        System.out.println(ans);
        System.out.println(1);  // master
        System.out.println(2);  // somin
        System.out.println(3);  // github
    }
}
