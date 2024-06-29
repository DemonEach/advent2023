package ru.demoneach.day1;

import java.util.List;

import ru.demoneach.helper.IDayPartSolution;

public class Day1Part1 implements IDayPartSolution {

    @Override
    public int solve(List<String> lines) {
        int sum = 0;

        for (String line : lines) {
            line = line.replaceAll("\\D", "");

            sum += Integer.parseInt("%s%s".formatted(line.charAt(0), line.charAt(line.length() - 1)));
        }

        return sum;
    }

}
