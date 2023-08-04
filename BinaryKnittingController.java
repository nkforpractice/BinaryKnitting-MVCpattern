/**
 * Name: Jue Wu
 * Date: 04/20/2023
 * Assignment2 - Binary Knitting Controller class
 * */

import java.util.List;

public class BinaryKnittingController implements KnittingControllerInterface {

    private final BinaryKnittingModel model;
    private final BinaryKnittingView view;

    public BinaryKnittingController(BinaryKnittingModel model, BinaryKnittingView view) {
        this.model = model;
        this.view = view;

    }
    /**
     * This method is to knit the binary message
     * */
    @Override
    public void knitting() {
        view.addButtonListener(e -> {
            String message = view.getMessage();
            String noSpaceM = model.removeSpace(message);
            String finalM = model.toBinary(noSpaceM);
            List<String> knitway = model.knit(finalM);

            view.setBinaryMessage(finalM);
            view.setKnitPattern((knitway).toString(), finalM);
        });
    }
}
