package ru.javabegin.training.fastjava2.javafx.start;

import ru.javabegin.training.fastjava2.javafx.start.Employee;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * Created by User on 30.04.2015.
 */
public class Data {
    ObservableList<Employee> employee = FXCollections.observableArrayList();
    @FXML//поле или метод класса доступны для разметки fxml
            TableView<Employee> tableEmployees;
    @FXML
    TableColumn<Employee, Integer> idColumn;
    @FXML
    TableColumn<Employee, String> full_nameColumn;
    @FXML
    TableColumn<Employee, String> phone_numColumn;
    @FXML
    private void initialize(){
        initData();

        //устанавливаем тип и значение которое должно хранится в колонке
        idColumn.setCellValueFactory(new PropertyValueFactory<Employee, Integer>("№"));
        full_nameColumn.setCellValueFactory(new PropertyValueFactory<Employee, String>("ФИО"));
        phone_numColumn.setCellValueFactory(new PropertyValueFactory<Employee, String>("Телефон"));

        //заполнение таблицы данными
        tableEmployees.setItems(employee);
    }

    public void initData() {
        employee.add(new Employee(1, "Denisenko Ivan Sergeevich", "+380987856744"));
        employee.add(new Employee(2, "Lanskoi Sergei PEtrovich", "+380638907654"));
        employee.add(new Employee(3, "Kostomarova Arina Nikolaevna", "+380569318657"));
        employee.add(new Employee(4, "Polonskii Igor Mihajlovich", "+380569690753"));
        employee.add(new Employee(5, "Lebedeva Victoria Nikitovna", "null"));
        employee.add(new Employee(6, "Morozov Petr Sergeevich", "+380687654532"));
        employee.add(new Employee(7, "Tailor Marta Nikiforovna", "null"));
        employee.add(new Employee(8, "Baluev Petr Igorevich", "+380679086754"));
        employee.add(new Employee(9, "Golub Marina Petrovna", "+380987509886"));
        employee.add(new Employee(10, "Bud'ko Ivan Ivanovich", "null"));
        employee.add(new Employee(11, "Loza Ekaterina Evgenjevna", "+380506753412"));
        employee.add(new Employee(12, "Simonov Vladislav Victorovich", "+380967904531"));
        employee.add(new Employee(13, "Stavickij Alksandr Vsevolodovich", "+380958967534"));
        employee.add(new Employee(14, "Chernij Igor Andreevich", "null"));
        employee.add(new Employee(15, "Suhoj Nikolaj Olegovich", "null"));
        employee.add(new Employee(16, "Grigorenko Evgenii Msticlavovich", "+380509874512"));
        employee.add(new Employee(17, "Balueva Aleksandra Andreevna", "+380967894534"));
        employee.add(new Employee(18, "Chernenko Elena Petrovna", "+380665678902"));
        employee.add(new Employee(19, "Belaja Lidiia Arturovna", "null"));
        employee.add(new Employee(20, "Samsonova Maria Ivanovna", "+380984501230"));
        employee.add(new Employee(21, "Sidorov Anatolij Jurjevich", "+380958907652"));
        employee.add(new Employee(22, "Katz Kamalia Albertovna", "+380675431222"));
    }

}
