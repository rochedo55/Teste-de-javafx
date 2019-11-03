package application;
	
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	@FXML
	public Label label1;
	public Stage primeiro;
	@FXML
	public BorderPane telap;
	
	@FXML
	public Button botao;
	
	private void initPrincipal() {
		//essa funcao faz com que as coisas setadas no scene
		//aparecao quando a janela for aberta,logo ela precisa ser chamada ao iniciar
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("../view/Tela.fxml"));
			loader.setController(this);
			telap = (BorderPane) loader.load();

			Scene scene = new Scene(telap);
			primeiro.setScene(scene);
			primeiro.show();
		} catch (Exception e) {
			System.err.println(e);
		}
	}
	@Override
	public void start(Stage primaryStage) {
		primeiro = primaryStage;
		primeiro.setTitle("Titulo");
		initPrincipal();
//		try {
//			BorderPane root = new BorderPane();
//			Scene scene = new Scene(root,400,400);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			primaryStage.setScene(scene);
//			primaryStage.show();
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
