package handson1;

public class forEach {
    public static void main(String[] args) {
        String[] kumpulanBuah = new String[]{"Apel","Pisang","Mangga", "Jeruk"};

        for(String namaBuah : kumpulanBuah){

            //namaBuah.equals() adalah method untuk mengecek nilai string yang disimpan oleh variabel tersebut

            if(namaBuah.equals("Mangga") || namaBuah.equals("Pisang")){
                continue;
            }
            System.out.println(namaBuah);
        }
    }
}
