package day1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import helper.Helper;

/**
 * Day1
 */
public class Day1 {

    private static final Logger log = Logger.getLogger(Day1.class.getName());

    public static void main(String[] args) {
        Day1Part1 day1Part1 = new Day1Part1();
        Day1Part2 day1Part2 = new Day1Part2();

        List<String> lines = Helper.INSTANCE.readLinesFromFile("./day1/day1_input.txt");

        log.info("Part1: %d".formatted(day1Part1.solve(lines)));
        log.info("Part2: %d".formatted(day1Part2.solve(lines)));
    }
}