package handson3;

public class forLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i == 15) {
                break;
            }
            if (i % 3 == 0) {
                continue;
            }
            System.out.println("Nilai I : " + i);
        }
    }
}
