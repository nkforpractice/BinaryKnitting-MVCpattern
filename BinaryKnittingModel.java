/**
 * Name: Jue Wu
 * Date: 04/20/2023
 * Assignment2 - Binary Knitting Model class
 * */

import java.util.ArrayList;
import java.util.List;

public class BinaryKnittingModel implements KnittingModelInterface {
    /**
     * This method is to remove the space in the message
     * */
    public String removeSpace(String message) {
        return message.replaceAll(" ", "");
    }
    /**
     * This method is to convert the message to binary
     * */
    public String toBinary(String message) {
        byte[] bytes = message.getBytes();
        StringBuilder binary = new StringBuilder();
        for (byte b : bytes) {
            int value = b;
            for (int i = 0; i < 8; i++) {
                binary.append((value & 128) == 0 ? 0 : 1);
                value <<= 1;
            }
        }
        return binary.toString();
    }

    /**
     * This method is to show the knit way
     * */
    public List<String> knit(String binary) {
        List<String> knitway = new ArrayList<>();
        char prev = binary.charAt(0);
        int count = 1;
        for (int i = 1; i < binary.length(); i++) {
            char curr = binary.charAt(i);
            if (curr == prev) {
                count++;
                if (i == binary.length() - 1) {
                    knitway.add((prev == '1' ? "k" : "p") + count);
                }
            } else {
                knitway.add((prev == '1' ? "k" : "p") + count);
                prev = curr;
                count = 1;
                if (i == binary.length() - 1) {
                    knitway.add((curr == '1' ? "k" : "p") + count);
                }
            }
        }
        return knitway;
    }

    /**
     * This method is to show the pattern
     * */

    public static String pattern(String binary) {
        String pattern = binary.replaceAll("1", "\u2573").replaceAll("0", "\u2551");
        return (pattern + "\n").repeat(10);
    }
}
