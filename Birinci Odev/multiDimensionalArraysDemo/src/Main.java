public class Main {
    public static void main(String[] args) {
        String[][] sehirler = new String[3][3];
        sehirler[0][0] = "Istanbul";
        sehirler[0][1] = "Ankara";
        sehirler[0][2] = "Izmir";
        sehirler[1][0] = "Bursa";
        sehirler[1][1] = "Adana";
        sehirler[1][2] = "Konya";
        sehirler[2][0] = "Antep";
        sehirler[2][1] = "Samsun";
        sehirler[2][2] = "Diyarbakır";

        for (int i = 0; i<= 2; i++){
            if (i>0){
                System.out.println("**********");
            }
            for (int j = 0; j<=2; j++){
                System.out.println(sehirler[i][j]);
            }
        }
    }
}