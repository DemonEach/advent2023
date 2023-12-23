package day2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import helper.IDayPartSolution;

public class Day2Part1 implements IDayPartSolution {
    private static Map<String, Integer> colors = Map.of(
            "red", 12,
            "green", 13,
            "blue", 14);

    private boolean isItemValid(String item) {
        String[] itemParts = item.split(" ");
        return Integer.valueOf(itemParts[0]) <= colors.get(itemParts[1]);
    }

    @Override
    public int solve(List<String> lines) {
        int total = 0;

        for (String line : lines) {
            String[] gameInfo = line.split(":");

            int gameId = Integer.parseInt(gameInfo[0].split(" ")[1]);
            Boolean isValid = List.of(gameInfo[1].split(";")).stream().map(item -> item.split(", "))
                    .flatMap(Arrays::stream)
                    .map(String::trim)
                    .allMatch(this::isItemValid);

            if (Boolean.TRUE.equals(isValid)) {
                total += gameId;
            }
        }

        return total;
    }
}
