public class oop1 {
    public static void main(String[] args) {
        class Rectangle {
            double w;
            double l;
        }
        Rectangle rec = new Rectangle();
        rec.w = 10;
        rec.l = 15;
        System.out.println(rec.w + "x" + rec.l);

        class Rectangle1 {
            double w;
            double h;

            Rectangle1(double w, double h) {
                this.w = w;
                this.h = h;
            }


        }
        Rectangle1 rec1 = new Rectangle1(10, 20);
        System.out.println(rec1.w + "x" + rec1.h);
    }
}