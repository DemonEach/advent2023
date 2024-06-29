import ru.demoneach.helper.Helper;
import ru.demoneach.helper.IDayPartSolution;

import java.io.InputStream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BasicTestChecker {

    public static void basicTestCheck(IDayPartSolution daySolver, String testResourcePath, int expectedAnswer) {
        InputStream inputStream = BasicTestChecker.class.getResourceAsStream(testResourcePath);

        int answer = daySolver.solve(Helper.INSTANCE.readLinesFromInputStream(inputStream));
        assertThat(answer).isEqualTo(expectedAnswer);
    }
}
