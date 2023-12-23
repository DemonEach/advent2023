package helper;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public enum Helper {
    INSTANCE;

    private static final Logger log = Logger.getLogger(Helper.class.getName());

    public List<String> readLinesFromFile(String filePathStr) {
        Path filePath = Paths.get(filePathStr);
        Charset charset = StandardCharsets.UTF_8;
        try {

            return Files.readAllLines(filePath, charset);
        } catch (IOException ex) {
            log.log(Level.SEVERE, "I/O error: %s%n", ex);
        }

        return new ArrayList<>();
    }
}
