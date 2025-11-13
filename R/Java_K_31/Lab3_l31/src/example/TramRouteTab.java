package example;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;
import javafx.scene.control.Tab;


public class TramRouteTab extends Tab {

    public static String getRouteInfo(int routeNumber) {
        return switch (routeNumber) {
            case 1 -> "Початкова: Депо → Кінцева: Центр";
            case 2 -> "Початкова: Центр → Кінцева: Вокзал";
            case 3 -> "Початкова: Вокзал → Кінцева: Парк";
            case 4 -> "Початкова: Парк → Кінцева: Ринок";
            case 5 -> "Початкова: Ринок → Кінцева: Університет";
            case 6 -> "Початкова: Університет → Кінцева: Стадіон";
            case 7 -> "Початкова: Стадіон → Кінцева: Госпіталь";
            case 8 -> "Початкова: Госпіталь → Кінцева: Аеропорт";
            case 9 -> "Початкова: Аеропорт → Кінцева: Депо";
            default -> "Невірний номер маршруту (1-9)";
        };
    }

    public TramRouteTab() {
        super("Трамвайні маршрути");

        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(20));
        vbox.setAlignment(Pos.CENTER);

        // Текст завдання (для звіту)
        Label taskLabel = new Label("Завдання 2: Для 9 маршрутів трамваю за введеним їх номером вивести початкову та кінцеву зупинки.\nВикористовувати конструкцію switch…case.");
        taskLabel.setWrapText(true);
        taskLabel.setStyle("-fx-font-weight: bold;");

        Label labelRoute = new Label("Номер маршруту (1-9):");
        TextField tfRoute = new TextField("4");
        Button findButton = new Button("Знайти маршрут");
        Label resultLabel = new Label("Результат з'явиться тут");


        findButton.setOnAction((ActionEvent event) -> {
            try {
                int route = Integer.parseInt(tfRoute.getText());
                String info = getRouteInfo(route);
                resultLabel.setText(info);
            } catch (NumberFormatException e) {
                resultLabel.setText("Помилка: Введіть ціле число 1-9!");
            }
        });

        vbox.getChildren().addAll(taskLabel, labelRoute, tfRoute, findButton, resultLabel);
        setContent(vbox);
    }
}