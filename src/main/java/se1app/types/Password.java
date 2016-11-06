package se1app.types;

/**
 * Created by Neak on 06.11.2016.
 */
public class Password {

    private String pw;

    /**
     * ^                 # start-of-string
     * (?=.*[0-9])       # a digit must occur at least once
     * (?=.*[a-z])       # a lower case letter must occur at least once
     * (?=.*[A-Z])       # an upper case letter must occur at least once
     * (?=.*[@#$%^&+=])  # a special character must occur at least once
     * (?=\S+$)          # no whitespace allowed in the entire string
     * .{8,}             # anything, at least eight places though
     * $                 # end-of-string
     */
    private static final String PASSWORD_PATTERN =
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";

    public Password(String pw) {
        if (!isValidPassword(pw)) {
            // Wir verhindern, dass ein ungültiges Objekt erzeugt werden kann
            throw new IllegalArgumentException("Keine gültiges PW:" + pw);
        }
        this.pw = pw;
    }

    public String getPassword() {
        return pw;
    }

    // Mit Hilfe der statischen Methode kann vor Instanziierung eines Email-Objekts geprüft werden,
    // ob eine gültige Email-Adresse vorliegt. Dies ist an vielen Stellen im Code einer Applikation
    // nützlich, bspw. in der GUI und in der Geschäftslogik. Durch die Definition des Datentyps
    // ist diese Prüfung an dieser Stelle zentralisiert.
    public static boolean isValidPassword(String pw) {
        return pw.matches(PASSWORD_PATTERN);
    }
}



