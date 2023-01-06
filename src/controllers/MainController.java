package controllers;

import interfaces.CollectionAddressBook;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
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
    private void initialize() {
        columnFIO.setCellValueFactory(new PropertyValueFactory<Person, String>("fio"));
        columnPhone.setCellValueFactory((new PropertyValueFactory<Person, String>("phone")));

        addressBookImpl.fillTestData();

        tableAddressBook.setItems(addressBookImpl.getPersonList());
    }
}
