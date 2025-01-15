import java.util.Random;

// Un oggetto di questa classe rappresenta un generatore di password
// casuali di una determinata lunghezza.
// Le password devono essere composte da soli CARATTERI MAIUSCOLI.
public class PasswordGenerator {

    String password;

    // metodo che genera una password di lunghezza password_length
    // e la ritorna al chiamante.
    public String generate(int password_length) {
        password = "";
        Random r = new Random();
        for(int i = 0; i < password_length; i++){ 
            char c = (char) ('A' +(r.nextInt(26)));
            password +=c;
        }
        // TODO: genera una password causale composta da sole
        // lettere maiuscole.
        
        return password;
    }
}
