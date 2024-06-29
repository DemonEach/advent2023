package ru.demoneach.day1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ru.demoneach.helper.IDayPartSolution;

public class Day1Part2 implements IDayPartSolution {

    @Override
    public int solve(List<String> lines) {
        int sum = 0;
        HashMap<String, String> words = new HashMap<>();
        words.put("one", "1");
        words.put("two", "2");
        words.put("three", "3");
        words.put("four", "4");
        words.put("five", "5");
        words.put("six", "6");
        words.put("seven", "7");
        words.put("eight", "8");
        words.put("nine", "9");

        Pattern pattern = Pattern.compile("(?=(\\d|one|two|three|four|five|six|seven|eight|nine))");

        for (String line : lines) {
            Matcher matcher = pattern.matcher(line);
            List<String> matches = new ArrayList<>();

            while (matcher.find()) {
                matches.add(matcher.group(1));
            }

            String l1 = words.containsKey(matches.get(0)) ? words.get(matches.get(0)) : matches.get(0);
            String l2 = words.containsKey(matches.get(matches.size() - 1))
                    ? words.get(matches.get(matches.size() - 1))
                    : matches.get(matches.size() - 1);

            sum += Integer.parseInt("%s%s".formatted(l1, l2));
        }

        return sum;
    }

}
