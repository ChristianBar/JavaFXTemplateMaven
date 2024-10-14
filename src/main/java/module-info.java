module javafxtemplatemaven {
    requires javafx.controls;
    requires javafx.fxml;

    opens javafxtemplate to javafx.fxml;
    exports javafxtemplate;
}
