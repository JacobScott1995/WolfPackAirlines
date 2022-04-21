package View;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class SceneController {
    public static final int WIDTH = 1024;
    public static final int HEIGHT = 768;
    private static Stage mainStage;
    private static final Display display = new Display();
    private static final Scene displayScene = display.getDisplayScene();

    public SceneController(){
        mainStage = new Stage();
        String ICON_PATH = "wolf_icon.png";
        Image icon = new Image(ICON_PATH);
        mainStage.setTitle("Wolf Pack Airlines");
        mainStage.getIcons().add(icon);
        mainStage.setResizable(false);
        mainStage.setScene(displayScene);
    }

    public Stage getMainStage() {
        return mainStage;
    }
}
