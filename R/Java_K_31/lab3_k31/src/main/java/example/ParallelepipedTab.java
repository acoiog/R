package example;

import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class ParallelepipedTab extends Tab {

    public static double calculateVolume(double a, double b, double c) {
        return a * b * c;
    }

    public static double calculateSurfaceArea(double a, double b, double c) {
        return 2 * (a * b + a * c + b * c);
    }

    public ParallelepipedTab() {
        super("Обчислення паралелепіпеда");  // Назва вкладки

        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(20));
        vbox.setAlignment(Pos.CENTER);


        Label taskLabel = new Label("Завдання 1: Дано довжини ребер прямокутного паралелепіпеда a, b та c. Знайти його об’єм та площу поверхні.\nВхідні дані: a = 1, b = 2, c = 3. Вихідні дані: V = 6, S = 22.");
        taskLabel.setWrapText(true);
        taskLabel.setStyle("-fx-font-weight: bold;");

        Label labelA = new Label("a:");
        TextField tfA = new TextField("1");
        Label labelB = new Label("b:");
        TextField tfB = new TextField("2");
        Label labelC = new Label("c:");
        TextField tfC = new TextField("3");
        Button calcButton = new Button("Обчислити");
        Label resultLabel = new Label("Результат з'явиться тут");

        // Обробник кнопки
        calcButton.setOnAction((ActionEvent event) -> {
            try {
                double a = Double.parseDouble(tfA.getText());
                double b = Double.parseDouble(tfB.getText());
                double c = Double.parseDouble(tfC.getText());
                double v = calculateVolume(a, b, c);
                double s = calculateSurfaceArea(a, b, c);
                resultLabel.setText(String.format("Об'єм V = %.2f, Площа S = %.2f", v, s));
            } catch (NumberFormatException e) {
                resultLabel.setText("Помилка: Введіть коректні числа!");
            }
        });

        vbox.getChildren().addAll(taskLabel, labelA, tfA, labelB, tfB, labelC, tfC, calcButton, resultLabel);
        setContent(vbox);
    }
}