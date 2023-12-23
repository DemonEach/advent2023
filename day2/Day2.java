package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import helper.Helper;

public class Day2 {

    private static final Logger log = Logger.getLogger(Day2.class.getName());

    public static void main(String[] args) {
        Day2Part1 day2Part1 = new Day2Part1();
        Day2Part2 day2Part2 = new Day2Part2();
        List<String> lines = Helper.INSTANCE.readLinesFromFile("./day2/day2_input.txt");

        log.info("Part1: %d".formatted(day2Part1.solve(lines)));
        log.info("Part2: %d".formatted(day2Part2.solve(lines)));

    }
}
