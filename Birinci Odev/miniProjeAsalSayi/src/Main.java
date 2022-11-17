public class Main {
    public static void main(String[] args) {
        int number = 22;
        int remainder = number % 2;
        System.out.println("Sayı: " + number);
        boolean isPrime = true;
        if (number == 1){System.out.println("Sayı Asal Değil");
        return;}
        if (number <1) {System.out.println("İşlem yapılamaz.");
        return;}
        for (int i=2; i<number; i++){
            if(number % i == 0){isPrime = false;}
        }

        if (isPrime){
            System.out.println("Sayı Asal");
        } else {System.out.println("Sayı Asal Değil.");}
    }
}