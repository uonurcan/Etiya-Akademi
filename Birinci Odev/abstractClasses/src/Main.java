public class Main {
    public static void main(String[] args) {
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        ManGameCalculator manGameCalculator = new ManGameCalculator();
        KidsGameCalculator kidsGameCalculator = new KidsGameCalculator();
        OlderGameCalculator olderGameCalculator = new OlderGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();
        manGameCalculator.hesapla();
        manGameCalculator.gameOver();
        kidsGameCalculator.hesapla();
        kidsGameCalculator.gameOver();
        olderGameCalculator.hesapla();
        olderGameCalculator.gameOver();
    }
}