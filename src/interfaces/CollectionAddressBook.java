package interfaces;

import interfaces.impls.AddressBook;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import objects.Person;

import java.util.ArrayList;

public class CollectionAddressBook implements AddressBook {
//    private ArrayList<Person> personList = new ArrayList<Person>();

    private ObservableList<Person> personList = FXCollections.observableArrayList();

    @Override
    public void add(Person person) {
        personList.add(person);
    }

    @Override
    public void update(Person person) {

    }

    @Override
    public void delete(Person person) {

    }

    public ObservableList<Person> getPersonList() {
        return personList;
    }

    public void printDisplay() {
        int numberPerson = 0;
        System.out.println();
        for (Person person : personList) {
            numberPerson++;
            System.out.println(numberPerson +". "+ person.getFio() +"_____"+ person.getPhone());
        }
    }

    public void fillTestData() {
        personList.add(new Person("Ivan", "066 111-11-11"));
        personList.add(new Person("Petro", "066 222-22-22"));
        personList.add(new Person("Dina", "066 333-33-22"));
        personList.add(new Person("Sergii", "066 444-44-22"));
        personList.add(new Person("Yurii", "066 555-55-22"));
        personList.add(new Person("Semen", "066 666-66-22"));
        personList.add(new Person("Andre", "066 777-77-22"));
    }
}
