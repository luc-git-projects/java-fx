module br.com.luciano.loja {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.com.luciano.loja to javafx.fxml;
    exports br.com.luciano.loja;
}
