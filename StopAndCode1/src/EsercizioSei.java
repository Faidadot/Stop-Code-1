public class EsercizioSei {
    public static void main(String[] args) {
        final short annoNascita = 1998;
        short annoAttuale = 2025;
        byte eta = (byte) ((byte) (annoAttuale - annoNascita) + 1);

        System.out.println("Il numero dei tuoi anni +1 è un numero pari?");
        String isPari = (eta % 2 == 0) ? "Il numero è pari" : "Il numero è dispari";
        System.out.println(isPari);
    }
}

