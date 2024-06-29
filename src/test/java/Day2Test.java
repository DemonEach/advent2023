import org.junit.jupiter.api.Test;
import ru.demoneach.day2.Day2Part1;
import ru.demoneach.day2.Day2Part2;

public class Day2Test {

    @Test
    void testDay2Part1() {
        BasicTestChecker.basicTestCheck(new Day2Part1(), "day2/part1_test_input.txt", 8);
    }

    @Test
    void testDay2Part2() {
        BasicTestChecker.basicTestCheck(new Day2Part2(), "day2/part2_test_input.txt", 2286);
    }
}
