package ru.demoneach.day2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import ru.demoneach.helper.IDayPartSolution;

public class Day2Part2 implements IDayPartSolution {

    @Override
    public int solve(List<String> lines) {
        int total = 0;

        for (String line : lines) {
            int tmp = 1;
            HashMap<String, Integer> colors = new HashMap<>();

            List<String> items = Stream.of(line.split(":")[1].split("([,;])")).map(String::trim)
                    .toList();

            for (String item : items) {
                String[] itemParts = item.split(" ");
                Integer value = Integer.parseInt(itemParts[0]);
                Integer valueInMap = colors.get(itemParts[1]);

                if (valueInMap != null) {
                    if (value > valueInMap) {
                        colors.put(itemParts[1], value);
                    }
                } else {
                    colors.put(itemParts[1], value);
                }
            }

            for (Map.Entry<String, Integer> entry : colors.entrySet()) {
                tmp *= entry.getValue();
            }

            total += tmp;
        }

        return total;
    }

}
