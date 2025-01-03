module ledgersystem.ledger_system {
    requires javafx.controls;
    requires javafx.fxml;


    opens ledgersystem.ledger_system to javafx.fxml;
    exports ledgersystem.ledger_system;
}