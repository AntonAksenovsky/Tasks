public class zad16 {
    public static void main(String[] args) {

        int b = 0;
        for (int i = 2; i <= 50000; i++) {
            String s = String.valueOf(i);
            if (s.indexOf('2') != -1) {
                b++;
            }
        }
        System.out.println(b);
    }
}