package application;
	
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Label t = new Label();
			t.setText("Hallo Welt");
			Button b = new Button("Close");
			GridPane grid= new GridPane();
			grid.setAlignment(Pos.CENTER);
			grid.prefWidthProperty().bind(primaryStage.widthProperty());
			grid.prefHeightProperty().bind(primaryStage.heightProperty());
			grid.add(t, 0, 0);
			grid.add(b, 0, 1);
			Parent root = grid;
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("BugTrackerDemo");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
