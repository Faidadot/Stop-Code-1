public class EsercizioDue {
    public static void main(String[] args) {

        byte eta;
        int timestamp;
        short redditoMedio;
        String nomeCompleto;
        boolean isMaggiorenne;
        String[] cognome; // splitto per ricavare il cognome visto che ho nomeCompleto
        char inizialeCognome;


        eta = 27;
        timestamp = 1_763_078_400;
        redditoMedio = 21000;
        nomeCompleto = "Federica Vargas";
        isMaggiorenne = (eta > 18) ? true : false;

        cognome = nomeCompleto.split(" ");
        inizialeCognome = cognome[1].toUpperCase().charAt(0);


        System.out.println("L'età è: " + eta);
        System.out.println("Dal 1970 sono trascorsi " + timestamp + " secondi");
        System.out.println("Il reddito medio è: " + redditoMedio + " euro");
        System.out.println("Il nome completo è: " + nomeCompleto);
        System.out.println("L'iniziale del cognome è: " + inizialeCognome);

        if (isMaggiorenne)
            System.out.println("È maggiorenne");
        else
            System.out.println("Non è maggiorenne");
    }
}
