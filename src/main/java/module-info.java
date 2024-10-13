module jsd.tictactoe {
    requires javafx.controls;
    requires javafx.fxml;


    opens jsd.tictactoe to javafx.fxml;
    exports jsd.tictactoe;
}