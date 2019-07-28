package profession;

public class Doctor extends Profession {
    public Doctor(String name, String surname, String education, int birthday) {
        super(name, surname, education, birthday);
    }

    public void diagnoseHeal() {}
}
