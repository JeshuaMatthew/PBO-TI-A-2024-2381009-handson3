package handson1;

public class forLoop {
    public static void main(String[] args) {
        String[] kumpulanBuah = new String[]{"Apel","Pisang","Mangga", "Jeruk"};

        for (int i = 0; i < 4; i++){
            if(i == 1 || i == 2){
                continue;
            }
            System.out.println("Elemnen ke " + (i + 1) + " : " + kumpulanBuah[i]);
        }
    }
}
