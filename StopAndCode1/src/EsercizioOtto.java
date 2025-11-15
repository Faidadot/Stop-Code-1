public class EsercizioOtto {
    public static void main(String[] args) {
        String testo = "Ciao Mondo";
        char carattere = 'o';
        int pos = testo.indexOf(carattere);

        if (pos % 2 == 0)
            System.out.println("L'indice della prima lettera " + carattere + " è pari");
        else
            System.out.println("L'indice della prima lettera " + "\"" + carattere + "\"" + " non è pari");
    }
}
