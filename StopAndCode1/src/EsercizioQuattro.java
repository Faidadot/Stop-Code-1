public class EsercizioQuattro {
    public static void main(String[] args) {
        final short annoNascita = 1998;
        short annoAttuale = 2025;

        byte eta = (byte) (annoAttuale - annoNascita);
        System.out.println(eta);

        String isMaggiorenne = (eta > 18) ? "Maggiorenne" : "Non maggiorenne";

        System.out.println(isMaggiorenne);
    }
}
