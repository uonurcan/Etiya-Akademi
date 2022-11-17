public class Main {
    public static void main(String[] args) {

        int i;
        for (i= 0; i<10; i+=2){
            System.out.println(i); //çift rakamlar
        }
        System.out.println("For Döngüsü Bitti");

        i = 1;

        while (i<10){
            System.out.println(i); //tek rakamlar
            i+=2;
        }
        System.out.println("While Döngüsü Bitti");

        int j = 0;
        do {
            System.out.println(j); //tüm rakamlar
            j++;
        }while(j<10);
            System.out.println("Do-While Döngüsü Bitti");

    }
}