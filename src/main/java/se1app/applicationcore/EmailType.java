package se1app.applicationcore;

import java.io.Serializable;

// Diese Klasse repräsentiert einen fachlichen Datentyp und implementiert entsprechend
// das Value-object-Pattern
// @see <a href="https://en.wikipedia.org/wiki/Value_object">Value object</a>
// Damit der Datentyp von JPA gespeichert werden kann, muss er serialisierbar sein (implements Serializable)
public class EmailType implements Serializable {

    /**
     * @see <a href="http://howtodoinjava.com/2014/11/11/java-regex-validate-email-address/">E-Mail-Validation</a>
     */
    private static final String EMAIL_PATTERN =
        "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";

    private String email;

    public EmailType(String email)
    {
        if (!isValidEmailAddress(email))
        {
            // Wir verhindern, dass ein ungültiges Objekt erzeugt werden kann
            throw new IllegalArgumentException("Keine gültige Email-Adresse:" + email);
        }
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    // Mit Hilfe der statischen Methode kann vor Instanziierung eines Email-Objekts geprüft werden,
    // ob eine gültige Email-Adresse vorliegt. Dies ist an vielen Stellen im Code einer Applikation
    // nützlich, bspw. in der GUI und in der Geschäftslogik. Durch die Definition des Datentyps
    // ist diese Prüfung an dieser Stelle zentralisiert.
    public static boolean isValidEmailAddress(String email) {
        return email.matches(EMAIL_PATTERN);
    }
}
