public class EsercizioTre {
    public static void main(String[] args) {
        final String nome = "Federica";
        final String cognome = "Vargas Francisco";

        int totaleCaratteri = nome.trim().length() + cognome.replace(" ", "").trim().length();
        System.out.println(totaleCaratteri);
    }
}
