import org.junit.jupiter.api.Test;
import ru.demoneach.day1.Day1Part1;
import ru.demoneach.day1.Day1Part2;

class Day1Test {
    @Test
    void testDay1Part1() {
        BasicTestChecker.basicTestCheck(new Day1Part1(), "day1/part1_test_input.txt", 142);
    }

    @Test
    void testDay1Part2() {
        BasicTestChecker.basicTestCheck(new Day1Part2(), "day1/part2_test_input.txt", 281);
    }
}
