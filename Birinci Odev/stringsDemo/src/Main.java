public class Main {
    public static void main(String[] args) {
        String msg = "Bugün hava çok iyi.";

        System.out.println(msg);
        System.out.println("Eleman sayısı: " + msg.length());
        System.out.println("5. eleman :" + msg.charAt(4));
        System.out.println(msg.concat(" Yaşasın!"));
        System.out.println(msg.startsWith("A"));
        System.out.println(msg.endsWith("."));

        char[] karakterler = new char[5];

        msg.getChars(0,5, karakterler, 0);
        System.out.println(karakterler);
        System.out.println(msg.indexOf('a'));
        System.out.println(msg.lastIndexOf("a"));

        String yeniMsg = msg.replace(' ', '-');
        System.out.println(yeniMsg);
        System.out.println(msg.substring(2,5));

        for (String kelime: msg.split(" ")) {
            System.out.println(kelime);
        }

        System.out.println(msg.toLowerCase());
        System.out.println(msg.toUpperCase());

    }
}