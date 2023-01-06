package controllers;

import interfaces.CollectionAddressBook;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import objects.Person;

public class MainController {
    private CollectionAddressBook addressBookImpl = new CollectionAddressBook();
    @FXML
    private TableView tableAddressBook;

    @FXML
    private TableColumn<Person, String> columnFIO;

    @FXML
    private TableColumn<Person, String> columnPhone;

    @FXML
    private AnchorPane formAddressBook;

    @FXML
    private void initialize() {
        columnFIO.setCellValueFactory(new PropertyValueFactory<Person, String>("fio"));
        columnPhone.setCellValueFactory((new PropertyValueFactory<Person, String>("phone")));

        addressBookImpl.fillTestData();

        tableAddressBook.setItems(addressBookImpl.getPersonList());
    }


    public void showDialog(ActionEvent actionEvent) {
        Object source = actionEvent.getSource();

        if (!(source instanceof Button)) {
            return;
        }

        Button clickedButton = (Button) source;
        System.out.println(clickedButton.getId());

        Person seletedPerson = (Person) tableAddressBook.getSelectionModel().getSelectedItem();


        switch (clickedButton.getId()) {
            case "btnAdd":
                System.out.println("add: " + seletedPerson);
                formAddressBook.setDisable(false);
                break;
            case "btnEdit":
                System.out.println("edit: " + seletedPerson);
                break;
            case "btnDelete":
                System.out.println("delete: " + seletedPerson);
                break;
        }
    }
}
