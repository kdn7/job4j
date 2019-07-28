package profession;

public class Surgeon extends Doctor {
    public Surgeon(String name, String surname, String education, int birthday) {
        super(name, surname, education, birthday);
    }
    public void operate(){}
}
