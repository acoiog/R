package example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Створюємо вкладки з окремих класів
        ParallelepipedTab tab1 = new ParallelepipedTab();
        TramRouteTab tab2 = new TramRouteTab();

        TabPane tabPane = new TabPane(tab1, tab2);

        Scene scene = new Scene(tabPane, 450, 400);
        primaryStage.setTitle("Завдання 4: GUI JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        launch(args);
    }
}