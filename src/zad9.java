public class zad9 {
    public static void main(String[] args){
        for (int j = 2; j<=100;j++) {
            boolean isProstoe = true;
            for (int i = 2; i <= Math.sqrt(j); i++) {
                if ((j % i) == 0) {
                    isProstoe = false;
                    break;
                }
            }
            if (isProstoe){
                System.out.print(j + " ");
            }
        }
    }
}
