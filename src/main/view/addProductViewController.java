package main.view;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import main.Main;//kadhsj


public class addProductViewController {
    private Main main;
    @FXML
    Label errorLabel;
    @FXML
    private TextField name;
    @FXML
    private TextField producer;
    @FXML
    private TextField price;
    @FXML
    public void logout(ActionEvent event) throws Exception {
        main.showStartView();
    }
    public void goBack(ActionEvent event) throws Exception {
        main.goHomeWorker();
    }
    public void addProduct(ActionEvent event) throws Exception{
        errorLabel.setText("");
        if(name.getText().equals("") || producer.getText().equals("")){
            errorLabel.setText("Error");
        }
    }
}
