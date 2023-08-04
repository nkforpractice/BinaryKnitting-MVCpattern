/**
 * Name: Jue Wu
 * Date: 04/20/2023
 * Assignment2 - Main class
 * */
public class Main {
    public static void main(String[] args) {
        BinaryKnittingModel model = new BinaryKnittingModel();
        BinaryKnittingView view = new BinaryKnittingView();
        BinaryKnittingController controller = new BinaryKnittingController(model, view);
        controller.knitting();
    }
}