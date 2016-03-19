import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;


public class BeanMachine extends Application{
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage){
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(new BeanMachinePane(), 400, 300); 
		primaryStage.setTitle("BeanMachine"); // Set the scene title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
}

