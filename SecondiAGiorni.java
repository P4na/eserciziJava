import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class SecondiAGiorni {

    public static void main(String[] args) {
        // creo lo scanner e prendo in input i secondi come INTERI
        // timestamps are interpreted in milliseconds, not seconds, so do x 1000
        Scanner scanner = new Scanner(System.in);
        System.out.println("scrivi un numero in secondi");
        long inputSeconds = scanner.nextLong();
        long milliseconds = inputSeconds * 1000;

        Date date = new Date(milliseconds);
        SimpleDateFormat sdf = new SimpleDateFormat("d MMMM yyyy");
        String formattedDate = sdf.format(date);
        System.out.println(formattedDate);
    }

    /*
    dato in input un numero di secondi, restituisce una
    stringa che dice «Giorni: numero di giorni, Ore: numero di ore etc...»
     */

}
