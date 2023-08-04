/**
 * Name: Jue Wu
 * Date: 04/20/2023
 * Assignment2 - Knitting Model Interface
 * */

import java.util.List;

public interface KnittingModelInterface {
    public String removeSpace(String message);
    public String toBinary(String message);
    public List<String> knit(String message);
}
