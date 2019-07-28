package profession;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfessionTest {
    @Test
    public void testAllProfessions() {
        Profession[] professions = new Profession[4];
        professions[0] = new Builder("name1", "surname1", "education1", 19880101);
        professions[1] = new Dentist("name2", "surname2", "education2", 19771231);
        professions[2] = new Programmer("name3", "surname3", "education3", 19990615);
        professions[3] = new Surgeon("name4", "surname4", "education4", 19660408);
        StringBuilder result = new StringBuilder();
        for (Profession profession: professions) {
            result.append(profession.getName()).append(" ").append(profession.getSurname()).append(" ")
                    .append(profession.getEducation()).append(" ").append(profession.getBirthday()).append(" ");
        }
        assertThat(result.toString(), is("name1 surname1 education1 19880101 name2 surname2 education2 19771231 name3 surname3" +
                " education3 19990615 name4 surname4 education4 19660408 "));
    }
}
