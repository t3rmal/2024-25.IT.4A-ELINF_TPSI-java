// Un oggetto di questa classe rappresenta un hacker che cerca di violare
// la password segreta per aprire il file protetto che viene ricevuto nel
// costruttore.
public class PasswordCracker {
    private PasswordGenerator passwordGenerator;
    private PasswordProtectedFile fileToCrack;
    private int password_length;
    private String password;

    public PasswordCracker(PasswordProtectedFile file, int password_length) {
        this.password_length = password_length;
        this.passwordGenerator = new PasswordGenerator();
        this.fileToCrack = file;
    }
    public String crack_it() {
        while(fileToCrack.open(password)==false){
            password = passwordGenerator.generate(password_length);
        }
        // TODO: continua a generaqre password tramite un generatore
        // fino a quando non ottiene la corrispondenza con la password
        // del file. A questo punto ritorna la password al chiamante.
        return password;
    }

}
