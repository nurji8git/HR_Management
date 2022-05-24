package sample;

import com.jfoenix.controls.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.util.Callback;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Pane leftbuttonsbar;

    @FXML
    private JFXButton all_employees_btn;

    @FXML
    private JFXButton addIntern_MainButton;

    @FXML
    private JFXButton addEmp_MainButton;

    @FXML
    private JFXButton resumes_MainButton;

    @FXML
    private JFXButton table_vac_busTrip_MainButton;

    @FXML
    private JFXButton allInterns_MainButton;

    @FXML
    private JFXButton archive_MainButton;

    @FXML
    private JFXButton timesheet_MainButton;

    @FXML
    private Pane topbar;

    @FXML
    private JFXButton settings_Button;

    @FXML
    private JFXTextField searchByName_MainJFXTextField;

    @FXML
    private JFXButton searchByName_MainJFXButton;

    @FXML
    private Text cur_time;

    @FXML
    private Pane menuPane;

    @FXML
    private Pane menuUserButton;

    @FXML
    private JFXButton logotipUser;

    @FXML
    private JFXTextField nameUser_JFXTextField;

    @FXML
    private JFXButton changeAccountButton;

    @FXML
    private JFXButton logotip_ChangeAccount;

    @FXML
    private JFXButton logotip_AboutProgram;

    @FXML
    private JFXButton aboutProgramButton;

    @FXML
    private Text current_scene;

    @FXML
    private Pane main_content;

    @FXML
    private JFXListView<Employee> employee_list;

    @FXML
    private JFXListView<Interns> intern_list;

    @FXML
    private JFXListView<Resumes> resume_list;

    @FXML
    private JFXListView<Otpusk> absence_list;

    @FXML
    private Pane login_page;

    @FXML
    private Pane login;

    @FXML
    private JFXTextField login_userName;

    @FXML
    private JFXPasswordField login_password;

    @FXML
    private JFXButton login_btn;

    @FXML
    private JFXButton login_forgot_password_btn;

    @FXML
    private Pane forgot_password;

    @FXML
    private JFXTextField forgot_password_email;

    @FXML
    private JFXButton send_password_btn;

    @FXML
    private JFXButton to_login_page_btn;

    @FXML
    private Pane password_sended;

    @FXML
    private Pane addEmp_Pane;

    @FXML
    private TextField addEmp_TextField_FirstName;

    @FXML
    private TextField addEmp_TextField_SecondName;

    @FXML
    private TextField addEmp_TextField_DateBirth;

    @FXML
    private TextField addEmp_TextField_PhoneNumber;

    @FXML
    private TextField addEmp_TextField_Email;

    @FXML
    private ChoiceBox<String> addEmp_ChoiceBox_Department;

    @FXML
    private ChoiceBox<String> addEmp_ChoiceBox_Position;

    @FXML
    private DatePicker addEmp_DatePicker_HireDate;

    @FXML
    private ChoiceBox<String> addEmp_ChoiceBox_HasFamily;

    @FXML
    private ChoiceBox<String> addEmp_ChoiceBox_Sex;

    @FXML
    private JFXButton add_emp_Button;

    @FXML
    private ChoiceBox<String> addEmp_TextField_Country;

    @FXML
    private ChoiceBox<String> addEmp_TextField_State;

    @FXML
    private ChoiceBox<String> addEmp_TextField_City;

    @FXML
    private ChoiceBox<String> addEmp_TextField_Street;

    @FXML
    private Pane timeTracking_Pane;

    @FXML
    private JFXTextField timeTracking_JFXTextField_SearchByName;

    @FXML
    private JFXButton timeTracking_JFXButton_SearchByName;

    @FXML
    private TableView<Timesheet> timeTracking_Table;

    @FXML
    private TableColumn<Timesheet, Integer> timeTracking_Emps;

    @FXML
    private TableColumn<Timesheet, String> timeTracking_Date;

    @FXML
    private TableColumn<Timesheet, Double> timeTracking_ArrivalTime;

    @FXML
    private TableColumn<Timesheet, Double> timeTracking_LeaveTime;

    @FXML
    private TableColumn<Timesheet, Double> timeTracking_AmountHours;

    @FXML
    private JFXTextField timeTracking_JFXTextField_TotalAmountHours;

    @FXML
    private Pane archive_Pane;

    @FXML
    private JFXTextField searchByName_archiveJFXTextField;

    @FXML
    private JFXButton searchByName_archiveButton;

    @FXML
    private TableView<?> timeTracking_Table1;

    @FXML
    private TableColumn<?, ?> archive_Numeration;

    @FXML
    private TableColumn<?, ?> archive_EmpFirstName;

    @FXML
    private TableColumn<?, ?> archive_EmpSecondName;

    @FXML
    private TableColumn<?, ?> archive_EmpBirthDate;

    @FXML
    private TableColumn<?, ?> archive_EmpPhoneNumber;

    @FXML
    private TableColumn<?, ?> archive_EmpEmail;

    @FXML
    private TableColumn<?, ?> archive_EmpCountry;

    @FXML
    private TableColumn<?, ?> archive_EmpState;

    @FXML
    private TableColumn<?, ?> archive_EmpCity;

    @FXML
    private TableColumn<?, ?> archive_EmpStreet;

    @FXML
    private TableColumn<?, ?> archive_EmpHireDate;

    @FXML
    private TableColumn<?, ?> archive_EmpDismissDate;

    @FXML
    private TableColumn<?, ?> archive_EmpSex;

    @FXML
    private TableColumn<?, ?> archive_EmpHasFamily;

    @FXML
    private Pane edit_emp;

    @FXML
    private TextField edit_emp_fname;

    @FXML
    private TextField edit_emp_sname;

    @FXML
    private TextField edit_emp_bdate;

    @FXML
    private TextField edit_emp_pnymber;

    @FXML
    private TextField edit_emp_email;
    @FXML
    private Pane edit_emp_pane;
    @FXML
    private ChoiceBox<String> edit_emp_country;

    @FXML
    private ChoiceBox<String> edit_emp_state;

    @FXML
    private ChoiceBox<String> edit_emp_city;

    @FXML
    private ChoiceBox<String> edit_emp_street;

    @FXML
    private ChoiceBox<String> edit_emp_department;

    @FXML
    private ChoiceBox<String> edit_emp_position;

    @FXML
    private ChoiceBox<String> edit_emp_has_family;

    @FXML
    private ChoiceBox<String> edit_emp_sex;

    @FXML
    private JFXButton edit_emp_button;

    @FXML
    private JFXButton edit_emp_cancel_button;

    @FXML
    private TextField edit_emp_fname1;

    @FXML
    private TextField edit_emp_sname1;

    @FXML
    private TextField edit_emp_bdate1;

    @FXML
    private TextField edit_emp_pnymber1;

    @FXML
    private TextField edit_emp_email1;
    @FXML
    private Pane edit_emp_pane1;
    @FXML
    private ChoiceBox<String> edit_emp_country1;

    @FXML
    private ChoiceBox<String> edit_emp_state1;

    @FXML
    private ChoiceBox<String> edit_emp_city1;

    @FXML
    private ChoiceBox<String> edit_emp_street1;

    @FXML
    private ChoiceBox<String> edit_emp_department1;

    @FXML
    private ChoiceBox<String> edit_emp_position1;

    @FXML
    private ChoiceBox<String> edit_emp_has_family1;

    @FXML
    private ChoiceBox<String> edit_emp_sex1;

    @FXML
    private JFXButton edit_emp_button1;

    @FXML
    private JFXButton edit_emp_cancel_button1;


    @FXML
    private Text about_emp_fname;

    @FXML
    private Text about_emp_sname;

    @FXML
    private Text about_emp_bdate;

    @FXML
    private Text about_emp_sex;

    @FXML
    private Text about_emp_has_family;

    @FXML
    private Text about_emp_email;

    @FXML
    private Text about_emp_phone_number;

    @FXML
    private Text about_emp_country;

    @FXML
    private Text about_emp_state;

    @FXML
    private Text about_emp_city;

    @FXML
    private Text about_emp_street;

    @FXML
    private Text about_emp_department;

    @FXML
    private Text about_emp_position;

    @FXML
    private Pane about_emp_pane;

    @FXML
    private JFXButton delete_emp_button;

    @FXML
    private JFXButton about_emp_back_button;

    @FXML
    private Text about_emp_fname1;

    @FXML
    private Text about_emp_sname1;

    @FXML
    private Text about_emp_bdate1;

    @FXML
    private Text about_emp_sex1;

    @FXML
    private Text about_emp_has_family1;

    @FXML
    private Text about_emp_email1;

    @FXML
    private Text about_emp_phone_number1;

    @FXML
    private Text about_emp_country1;

    @FXML
    private Text about_emp_state1;

    @FXML
    private Text about_emp_city1;

    @FXML
    private Text about_emp_street1;

    @FXML
    private Text about_emp_department1;

    @FXML
    private Text about_emp_position1;

    @FXML
    private Pane about_emp_pane1;

    @FXML
    private JFXButton delete_emp_button1;

    @FXML
    private JFXButton about_emp_back_button1;

    @FXML
    private Text currentUser;

    @FXML
    private Pane otpravit;

    @FXML
    private TextField otpravit_name;

    @FXML
    private TextField otpravit_cause;

    @FXML
    private TextField otpravit_start_date;

    @FXML
    private JFXButton otpravit_ok;

    @FXML
    private JFXButton otpravit_cancel;

    @FXML
    private TextField otpravit_end_date;

    @FXML
    private JFXButton otpravit_button;

    @FXML
    void initialize(){
        login_btn.setOnAction(event -> {
            try{
                String userName = login_userName.getText();
                String userPassword = login_password.getText();
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/hr_department", userName, userPassword);
                Statement st = cn.createStatement();
                currentUser.setText(userName);
                login_page.setDisable(true);
                login_page.setVisible(false);
                topbar.setVisible(true);
                topbar.setDisable(false);
                leftbuttonsbar.setDisable(false);
                leftbuttonsbar.setVisible(true);

                all_employees_btn.setOnAction(event1 ->{

                    current_scene.setText("Все сотрудники");
                    try{
                        addEmp_Pane.setDisable(true);
                        addEmp_Pane.setVisible(false);
                        employee_list.setDisable(false);
                        employee_list.setVisible(true);
                        intern_list.setDisable(true);
                        intern_list.setVisible(false);
                        timeTracking_Pane.setDisable(true);
                        timeTracking_Pane.setVisible(false);
                        archive_Pane.setDisable(true);
                        archive_Pane.setVisible(false);
                        resume_list.setDisable(true);
                        resume_list.setVisible(false);
                        absence_list.setVisible(false);
                        absence_list.setDisable(true);
                        edit_emp_pane.setDisable(true);
                        edit_emp_pane.setVisible(false);
                        otpravit.setVisible(false);
                        otpravit.setDisable(true);
                    ObservableList<Employee> pane =FXCollections.observableArrayList();
                    ResultSet rst = st.executeQuery("SELECT * FROM employees");
                    while(rst.next()){
                        pane.add(new Employee(rst.getInt("id"),rst.getString("first_name"),rst.getString("second_name"),rst.getString("birth_date"),rst.getString("phone_number"),rst.getString("email"),rst.getString("country"),rst.getString("state"),rst.getString("city"),rst.getString("street"),rst.getString("department"),rst.getString("position"),rst.getString("hire_date"),rst.getBoolean("has_family"),rst.getString("sex")));
                    }

                    employee_list.setItems(pane);
                    employee_list.setCellFactory(
                            list -> new ColorRectCell()
                    );}catch (Exception e){e.printStackTrace();}
                });


                allInterns_MainButton.setOnAction(event1 ->{

                    current_scene.setText("Все стажеры");
                    try{
                        addEmp_Pane.setDisable(true);
                        addEmp_Pane.setVisible(false);
                        employee_list.setDisable(true);
                        employee_list.setVisible(false);
                        timeTracking_Pane.setDisable(true);
                        timeTracking_Pane.setVisible(false);
                        archive_Pane.setDisable(true);
                        archive_Pane.setVisible(false);
                        intern_list.setVisible(true);
                        intern_list.setDisable(false);
                        resume_list.setDisable(true);
                        resume_list.setVisible(false);
                        absence_list.setVisible(false);
                        absence_list.setDisable(true);
                        edit_emp_pane.setDisable(true);
                        edit_emp_pane.setVisible(false);
                        otpravit.setVisible(false);
                        otpravit.setDisable(true);
                        ObservableList<Interns> pane =FXCollections.observableArrayList();
                        ResultSet rst = st.executeQuery("SELECT * FROM interns");
                        while(rst.next()){
                            pane.add(new Interns(rst.getInt("id"),rst.getString("first_name"),rst.getString("second_name"),rst.getString("birth_date"),rst.getString("phone_number"),rst.getString("email"),rst.getString("country"),rst.getString("state"),rst.getString("city"),rst.getString("street"),rst.getString("department"),rst.getString("to_position"),rst.getString("start_date"),rst.getBoolean("has_family"),rst.getString("sex")));
                        }

                        intern_list.setItems(pane);
                        intern_list.setCellFactory(
                                list -> new Intern()
                        );}catch (Exception e){e.printStackTrace();}
                });

                addEmp_MainButton.setOnAction(event1 -> {
                    current_scene.setText("Добавить сотрудника");
                    employee_list.setDisable(true);
                    employee_list.setVisible(false);
                    intern_list.setDisable(true);
                    intern_list.setVisible(false);
                    addEmp_Pane.setDisable(false);
                    addEmp_Pane.setVisible(true);
                    timeTracking_Pane.setDisable(true);
                    timeTracking_Pane.setVisible(false);
                    archive_Pane.setDisable(true);
                    archive_Pane.setVisible(false);
                    resume_list.setDisable(true);
                    resume_list.setVisible(false);
                    absence_list.setVisible(false);
                    absence_list.setDisable(true);
                    edit_emp_pane.setDisable(true);
                    edit_emp_pane.setVisible(false);
                    otpravit.setVisible(false);
                    otpravit.setDisable(true);
                    try{
                    ObservableList<String> countries = FXCollections.observableArrayList();
                    ObservableList<String> states = FXCollections.observableArrayList();
                    ObservableList<String> cities = FXCollections.observableArrayList();
                    ObservableList<String> streets = FXCollections.observableArrayList();
                    ObservableList<String> departments = FXCollections.observableArrayList();
                    ObservableList<String> positions = FXCollections.observableArrayList();
                    ObservableList<String> has_family = FXCollections.observableArrayList("Yes","No");
                    ObservableList<String> sex = FXCollections.observableArrayList("Male","Female");
                    ResultSet rst = cn.createStatement().executeQuery("SELECT * FROM countries");
                    while(rst.next()){
                        countries.add(rst.getString("name"));
                    }
                    rst=cn.createStatement().executeQuery("SELECT * FROM states");
                    while(rst.next()){
                        states.add(rst.getString("name"));
                    }
                    rst = cn.createStatement().executeQuery("SELECT * FROM cities");
                    while(rst.next()){
                        cities.add(rst.getString("name"));
                    }
                        rst = cn.createStatement().executeQuery("SELECT * FROM streets");
                        while(rst.next()){
                            streets.add(rst.getString("name"));
                        }
                        rst = cn.createStatement().executeQuery("SELECT * FROM departments");
                        while(rst.next()){
                            departments.add(rst.getString("name"));
                        }
                    rst = cn.createStatement().executeQuery("SELECT * FROM positions");
                    while(rst.next()){
                        positions.add(rst.getString("name"));
                    }
                    addEmp_TextField_Country.setItems(countries);
                    addEmp_TextField_State.setItems(states);
                    addEmp_TextField_City.setItems(cities);
                        addEmp_TextField_Street.setItems(streets);
                        addEmp_ChoiceBox_Department.setItems(departments);
                    addEmp_ChoiceBox_Position.setItems(positions);
                        addEmp_ChoiceBox_HasFamily.setItems(has_family);
                        addEmp_ChoiceBox_Sex.setItems(sex);
                    add_emp_Button.setOnAction(event2 -> {

                        try{
                            PreparedStatement pst = cn.prepareStatement("INSERT INTO employees VALUES(null,?,?,?,?,?,?,?,?,?,?,?,CURRENT_DATE,?,?)");
                            pst.setString(1,addEmp_TextField_FirstName.getText());
                            pst.setString(2,addEmp_TextField_SecondName.getText());
                            pst.setString(3,addEmp_TextField_DateBirth.getText());
                            pst.setString(4,addEmp_TextField_PhoneNumber.getText());
                            pst.setString(5,addEmp_TextField_Email.getText());
                            if(addEmp_ChoiceBox_HasFamily.getValue()=="Yes"){
                                pst.setString(12,"1");
                            }
                            else {pst.setString(12,"0");}

                            pst.setString(13,addEmp_ChoiceBox_Sex.getValue());
                            ResultSet rst1 = cn.createStatement().executeQuery("SELECT id FROM countries WHERE name = '"+addEmp_TextField_Country.getValue()+"'");
                            while(rst1.next()){
                                pst.setString(6,rst1.getString("id"));
                            }
                            rst1 = cn.createStatement().executeQuery("SELECT id FROM states WHERE name = '"+addEmp_TextField_State.getValue()+"'");
                            while(rst1.next()){
                                pst.setString(7,rst1.getString("id"));
                            }
                            rst1 = cn.createStatement().executeQuery("SELECT id FROM cities WHERE name = '"+addEmp_TextField_City.getValue()+"'");
                            while(rst1.next()){
                                pst.setString(8,rst1.getString("id"));
                            }
                            rst1 = cn.createStatement().executeQuery("SELECT id FROM streets WHERE name = '"+addEmp_TextField_Street.getValue()+"'");
                            while(rst1.next()){
                                pst.setString(9,rst1.getString("id"));
                            }
                            rst1 = cn.createStatement().executeQuery("SELECT id FROM departments WHERE name = '"+addEmp_ChoiceBox_Department.getValue()+"'");
                            while(rst1.next()){
                                pst.setString(10,rst1.getString("id"));
                            }
                            rst1 = cn.createStatement().executeQuery("SELECT id FROM positions WHERE name = '"+addEmp_ChoiceBox_Position.getValue()+"'");
                            while(rst1.next()){
                                pst.setString(11,rst1.getString("id"));
                            }
                            pst.execute();
                        }catch (Exception e){e.printStackTrace();}

                    });}catch (Exception e){e.printStackTrace();}
                });
                otpravit_button.setOnAction(event3 ->{
                    current_scene.setText("Отправить сотрудника на отпуск");
                    employee_list.setDisable(true);
                    employee_list.setVisible(false);
                    addEmp_Pane.setDisable(true);
                    addEmp_Pane.setVisible(false);
                    timeTracking_Pane.setDisable(true);
                    timeTracking_Pane.setVisible(false);
                    archive_Pane.setDisable(true);
                    archive_Pane.setVisible(false);
                    intern_list.setDisable(true);
                    intern_list.setVisible(false);
                    resume_list.setDisable(true);
                    resume_list.setVisible(false);
                    absence_list.setVisible(false);
                    absence_list.setDisable(true);
                    edit_emp_pane.setDisable(true);
                    edit_emp_pane.setVisible(false);
                    otpravit.setVisible(true);
                    otpravit.setDisable(false);
                    otpravit_ok.setOnAction(event1 -> {
                        try {
                            PreparedStatement pst = cn.prepareStatement("INSERT INTO absence_table values(null,?,?,?,?)");
                            pst.setString(1,otpravit_cause.getText());
                            ResultSet rst = cn.createStatement().executeQuery("SELECT id FROM employees WHERE CONCAT(first_name,' ',second_name) = '"+otpravit_name.getText()+"'");
                            while(rst.next()){
                                pst.setString(2,rst.getString("id"));
                            }
                            pst.setString(3,otpravit_start_date.getText());
                            pst.setString(4,otpravit_end_date.getText());
                            pst.execute();
                        } catch (SQLException throwables) {
                            throwables.printStackTrace();
                        }
                        otpravit_name.clear();
                        otpravit_cause.clear();
                        otpravit_start_date.clear();
                        otpravit_end_date.clear();
                    });

                });
                addIntern_MainButton.setOnAction(event1 -> {
                    current_scene.setText("Добавить стажера");
                    employee_list.setDisable(true);
                    employee_list.setVisible(false);
                    addEmp_Pane.setDisable(false);
                    addEmp_Pane.setVisible(true);
                    timeTracking_Pane.setDisable(true);
                    timeTracking_Pane.setVisible(false);
                    archive_Pane.setDisable(true);
                    archive_Pane.setVisible(false);
                    intern_list.setDisable(true);
                    intern_list.setVisible(false);
                    resume_list.setDisable(true);
                    resume_list.setVisible(false);
                    absence_list.setVisible(false);
                    absence_list.setDisable(true);
                    edit_emp_pane.setDisable(true);
                    edit_emp_pane.setVisible(false);
                    otpravit.setVisible(false);
                    otpravit.setDisable(true);
                    try{
                        ObservableList<String> countries = FXCollections.observableArrayList();
                        ObservableList<String> states = FXCollections.observableArrayList();
                        ObservableList<String> cities = FXCollections.observableArrayList();
                        ObservableList<String> streets = FXCollections.observableArrayList();
                        ObservableList<String> departments = FXCollections.observableArrayList();
                        ObservableList<String> positions = FXCollections.observableArrayList();
                        ObservableList<String> has_family = FXCollections.observableArrayList("Yes","No");
                        ObservableList<String> sex = FXCollections.observableArrayList("Male","Female");
                        ResultSet rst = cn.createStatement().executeQuery("SELECT * FROM countries");
                        while(rst.next()){
                            countries.add(rst.getString("name"));
                        }
                        rst=cn.createStatement().executeQuery("SELECT * FROM states");
                        while(rst.next()){
                            states.add(rst.getString("name"));
                        }
                        rst = cn.createStatement().executeQuery("SELECT * FROM cities");
                        while(rst.next()){
                            cities.add(rst.getString("name"));
                        }
                        rst = cn.createStatement().executeQuery("SELECT * FROM streets");
                        while(rst.next()){
                            streets.add(rst.getString("name"));
                        }
                        rst = cn.createStatement().executeQuery("SELECT * FROM departments");
                        while(rst.next()){
                            departments.add(rst.getString("name"));
                        }
                        rst = cn.createStatement().executeQuery("SELECT * FROM positions");
                        while(rst.next()){
                            positions.add(rst.getString("name"));
                        }
                        addEmp_TextField_Country.setItems(countries);
                        addEmp_TextField_State.setItems(states);
                        addEmp_TextField_City.setItems(cities);
                        addEmp_TextField_Street.setItems(streets);
                        addEmp_ChoiceBox_Department.setItems(departments);
                        addEmp_ChoiceBox_Position.setItems(positions);
                        addEmp_ChoiceBox_HasFamily.setItems(has_family);
                        addEmp_ChoiceBox_Sex.setItems(sex);
                        add_emp_Button.setOnAction(event2 -> {

                            try{
                                PreparedStatement pst = cn.prepareStatement("INSERT INTO interns VALUES(null,?,?,?,?,?,?,?,?,?,?,?,CURRENT_DATE,?,?)");
                                pst.setString(1,addEmp_TextField_FirstName.getText());
                                pst.setString(2,addEmp_TextField_SecondName.getText());
                                pst.setString(3,addEmp_TextField_DateBirth.getText());
                                pst.setString(4,addEmp_TextField_PhoneNumber.getText());
                                pst.setString(5,addEmp_TextField_Email.getText());
                                if(addEmp_ChoiceBox_HasFamily.getValue()=="Yes"){
                                    pst.setString(12,"1");
                                }
                                else {pst.setString(12,"0");}

                                pst.setString(13,addEmp_ChoiceBox_Sex.getValue());
                                ResultSet rst1 = cn.createStatement().executeQuery("SELECT id FROM countries WHERE name = '"+addEmp_TextField_Country.getValue()+"'");
                                while(rst1.next()){
                                    pst.setString(6,rst1.getString("id"));
                                }
                                rst1 = cn.createStatement().executeQuery("SELECT id FROM states WHERE name = '"+addEmp_TextField_State.getValue()+"'");
                                while(rst1.next()){
                                    pst.setString(7,rst1.getString("id"));
                                }
                                rst1 = cn.createStatement().executeQuery("SELECT id FROM cities WHERE name = '"+addEmp_TextField_City.getValue()+"'");
                                while(rst1.next()){
                                    pst.setString(8,rst1.getString("id"));
                                }
                                rst1 = cn.createStatement().executeQuery("SELECT id FROM streets WHERE name = '"+addEmp_TextField_Street.getValue()+"'");
                                while(rst1.next()){
                                    pst.setString(9,rst1.getString("id"));
                                }
                                rst1 = cn.createStatement().executeQuery("SELECT id FROM departments WHERE name = '"+addEmp_ChoiceBox_Department.getValue()+"'");
                                while(rst1.next()){
                                    pst.setString(10,rst1.getString("id"));
                                }
                                rst1 = cn.createStatement().executeQuery("SELECT id FROM positions WHERE name = '"+addEmp_ChoiceBox_Position.getValue()+"'");
                                while(rst1.next()){
                                    pst.setString(11,rst1.getString("id"));
                                }
                                pst.execute();
                            }catch (Exception e){e.printStackTrace();}

                        });}catch (Exception e){e.printStackTrace();}
                    addEmp_TextField_FirstName.clear();
                    addEmp_TextField_SecondName.clear();
                    addEmp_TextField_DateBirth.clear();
                    addEmp_TextField_PhoneNumber.clear();
                    addEmp_TextField_Email.clear();

                });

                timesheet_MainButton.setOnAction(event1 -> {

                    current_scene.setText("Табель учета рабочего времени");
                    employee_list.setDisable(true);
                    employee_list.setVisible(false);
                    addEmp_Pane.setDisable(true);
                    addEmp_Pane.setVisible(false);
                    timeTracking_Pane.setDisable(false);
                    timeTracking_Pane.setVisible(true);
                    archive_Pane.setDisable(true);
                    archive_Pane.setVisible(false);
                    intern_list.setDisable(true);
                    intern_list.setVisible(false);
                    resume_list.setDisable(true);
                    resume_list.setVisible(false);
                    absence_list.setVisible(false);
                    absence_list.setDisable(true);
                    edit_emp_pane.setDisable(true);
                    edit_emp_pane.setVisible(false);
                    otpravit.setVisible(false);
                    otpravit.setDisable(true);
                    try {
                        timeTracking_Table.setEditable(true);

                        Scanner sn = new Scanner(System.in);
                        System.out.println("Введите идентификатор сотрудника: ");
                        int id_emp = sn.nextInt();

                        System.out.println("Введите сегодняшнюю дату: ");
                        Date todayDate = Date.valueOf(sn.next());

                        System.out.println("Время прихода на работу: ");
                        Double arrival_time = sn.nextDouble();

                        System.out.println("Время ухода с работы: ");
                        Double leave_time = sn.nextDouble();

                        double amountHours = leave_time - arrival_time;

                        st.executeUpdate("INSERT INTO time_sheet SET" +
                                " emp_id = '" + id_emp + "'," +
                                " date = '" + todayDate + "'," +
                                " time_from = '" + arrival_time + "'," +
                                " time_to = '" + leave_time + "'," +
                                " hours = '" + amountHours + "'");

                        ResultSet rst = st.executeQuery("SELECT emp_id, date, time_from, time_to, hours FROM time_sheet");
                        ObservableList<Timesheet> att = FXCollections.observableArrayList();

                        while (rst.next()) {
                            att.add(new Timesheet(rst.getInt("emp_id"),
                                    rst.getString("date"),
                                    rst.getDouble("time_from"),
                                    rst.getDouble("time_to"),
                                    rst.getDouble("hours")));
                        }

                        rst = st.executeQuery("Select * from time_sheet");

                        timeTracking_Emps.setCellValueFactory(new PropertyValueFactory<Timesheet,Integer>("empId"));
                        timeTracking_Date.setCellValueFactory(new PropertyValueFactory<Timesheet,String>("dateCome"));
                        timeTracking_ArrivalTime.setCellValueFactory(new PropertyValueFactory<Timesheet,Double>("timeFrom"));
                        timeTracking_LeaveTime.setCellValueFactory(new PropertyValueFactory<Timesheet,Double>("timeTo"));
                        timeTracking_AmountHours.setCellValueFactory(new PropertyValueFactory<Timesheet,Double>("amountHours"));


                        rst = st.executeQuery("Select SUM(hours) from time_sheet");
                        while (rst.next()) {
                            timeTracking_JFXTextField_TotalAmountHours.setText(String.valueOf(rst.getDouble("SUM(hours)")));
                        }

                        timeTracking_JFXButton_SearchByName.setOnAction(event2 -> {
                            FilteredList<Timesheet> filteredData = new FilteredList<Timesheet>(att, p -> true);

                            timeTracking_JFXTextField_SearchByName.textProperty().addListener((observable, oldValue, newValue) -> {
                                filteredData.setPredicate(myObject -> {

                                    if (newValue == null || newValue.isEmpty()) {
                                        return true;
                                    }

                                    String lowerCaseFilter = newValue.toLowerCase();
                                    if (String.valueOf(myObject.getEmpId()).toLowerCase().contains(lowerCaseFilter)) {
                                        try {

                                            PreparedStatement preparedStatement = cn.prepareStatement("SELECT SUM(hours) FROM time_sheet WHERE emp_id = ?");
                                            preparedStatement.setInt(1, id_emp);
                                            ResultSet resultSet = preparedStatement.executeQuery();
                                            while(resultSet.next()){
                                                timeTracking_JFXTextField_TotalAmountHours.setText(String.valueOf(resultSet.getInt("SUM(hours)")));
                                            }

                                        } catch (SQLException e) {
                                            e.printStackTrace();
                                        }
                                        return true;
                                    }

                                    return false;

                                });

                            });

                            SortedList<Timesheet> sortedData = new SortedList<Timesheet>(filteredData);

                            sortedData.comparatorProperty().bind(timeTracking_Table.comparatorProperty());

                            timeTracking_Table.setItems(sortedData);
                        });

                        timeTracking_Table.setItems(att);

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });

                table_vac_busTrip_MainButton.setOnAction(event1 -> {
                    current_scene.setText("Отпуски и командировки");
                    employee_list.setDisable(true);
                    employee_list.setVisible(false);
                    addEmp_Pane.setDisable(true);
                    addEmp_Pane.setVisible(false);
                    timeTracking_Pane.setDisable(true);
                    timeTracking_Pane.setVisible(false);
                    archive_Pane.setDisable(true);
                    archive_Pane.setVisible(false);
                    intern_list.setDisable(true);
                    intern_list.setVisible(false);
                    resume_list.setDisable(true);
                    resume_list.setVisible(false);
                    absence_list.setVisible(true);
                    absence_list.setDisable(false);
                    edit_emp_pane.setDisable(true);
                    edit_emp_pane.setVisible(false);
                    otpravit.setVisible(false);
                    otpravit.setDisable(true);
                    try{
                    ObservableList<Otpusk> otps =FXCollections.observableArrayList();
                    ResultSet rst = st.executeQuery("SELECT * FROM absence_table");
                    while(rst.next()){
                        otps.add(new Otpusk(rst.getInt("id"),rst.getString("cause"),rst.getString("emp_name"),rst.getString("start_date"),rst.getString("end_date")));
                    }

                    absence_list.setItems(otps);
                    absence_list.setCellFactory(
                            new Callback<ListView<Otpusk>,ListCell<Otpusk>>()
                            {
                                @Override
                                public ListCell<Otpusk> call(ListView<Otpusk> list) {
                                    return new OtpuskCell();
                                }
                            }
                    );
                    //main_content.getChildren().add(absence_list);
                    }catch (Exception e){e.printStackTrace();}
            });

                resumes_MainButton.setOnAction(event1 -> {
                    current_scene.setText("Резюме и анкеты");
                    employee_list.setDisable(true);
                    employee_list.setVisible(false);
                    addEmp_Pane.setDisable(true);
                    addEmp_Pane.setVisible(false);
                    timeTracking_Pane.setDisable(true);
                    timeTracking_Pane.setVisible(false);
                    archive_Pane.setDisable(true);
                    archive_Pane.setVisible(false);
                    intern_list.setDisable(true);
                    intern_list.setVisible(false);
                    resume_list.setDisable(false);
                    resume_list.setVisible(true);
                    absence_list.setVisible(false);
                    absence_list.setDisable(true);
                    edit_emp_pane.setDisable(true);
                    edit_emp_pane.setVisible(false);
                    otpravit.setVisible(false);
                    otpravit.setDisable(true);
                    try{
                        resume_list.setPrefSize(1300,800);
                        ObservableList<Resumes> otps =FXCollections.observableArrayList();
                        ResultSet rst = st.executeQuery("SELECT * FROM resumes");
                        while(rst.next()){
                            otps.add(new Resumes(rst.getInt("id"),rst.getString("first_name"),rst.getString("second_name"),rst.getString("email"),rst.getString("phone_number"),rst.getString("country"),rst.getString("state"),rst.getString("city"),rst.getString("job_history"),rst.getString("languages"),rst.getString("personal_traits"),rst.getString("to_position")));
                        }

                        resume_list.setItems(otps);
                        resume_list.setCellFactory(
                                new Callback<ListView<Resumes>,ListCell<Resumes>>()
                                {
                                    @Override
                                    public ListCell<Resumes> call(ListView<Resumes> list) {
                                        return new ResumeCell();
                                    }
                                }
                        );
                        //main_content.getChildren().add(resume_list);
                    }catch (Exception e){e.printStackTrace();}
                });


                settings_Button.setOnAction(event1 -> {
                    settings_Button.setVisible(false);
                    settings_Button.setDisable(true);
                    menuPane.setDisable(false);
                    menuPane.setVisible(true);
                });
                logotipUser.setOnAction(event1 -> {
                    settings_Button.setVisible(true);
                    settings_Button.setDisable(false);
                    menuPane.setDisable(true);
                    menuPane.setVisible(false);
                });


            }catch (Exception e){e.printStackTrace();}
        });

        login_forgot_password_btn.setOnAction(event -> {
            login.setDisable(true);
            login.setVisible(false);
            login_forgot_password_btn.setDisable(true);
            login_forgot_password_btn.setVisible(false);
            forgot_password.setDisable(false);
            forgot_password.setVisible(true);
            to_login_page_btn.setDisable(false);
            to_login_page_btn.setVisible(true);
            to_login_page_btn.setOnAction(event1 -> {
                to_login_page_btn.setDisable(true);
                to_login_page_btn.setVisible(false);
                login.setDisable(false);
                login.setVisible(true);
                login_forgot_password_btn.setDisable(false);
                login_forgot_password_btn.setVisible(true);
                forgot_password.setDisable(true);
                forgot_password.setVisible(false);
            });
            send_password_btn.setOnAction(event1 -> {
            });
        });

        changeAccountButton.setOnAction(event -> {System.exit(0);});

    }
    public void EditAddressChoiceBoxes(){
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/hr_department", "root", "");
            ObservableList<String> countries = FXCollections.observableArrayList();
            ObservableList<String> states = FXCollections.observableArrayList();
            ObservableList<String> cities = FXCollections.observableArrayList();
            ObservableList<String> streets = FXCollections.observableArrayList();
            ObservableList<String> departments = FXCollections.observableArrayList();
            ObservableList<String> positions = FXCollections.observableArrayList();
            ObservableList<String> has_family = FXCollections.observableArrayList("Yes","No");
            ObservableList<String> sex = FXCollections.observableArrayList("Male","Female");
            ResultSet rst = cn.createStatement().executeQuery("SELECT * FROM countries");
            while(rst.next()){
                countries.add(rst.getString("name"));
            }
            rst=cn.createStatement().executeQuery("SELECT * FROM states");
            while(rst.next()){
                states.add(rst.getString("name"));
            }
            rst = cn.createStatement().executeQuery("SELECT * FROM cities");
            while(rst.next()){
                cities.add(rst.getString("name"));
            }
            rst = cn.createStatement().executeQuery("SELECT * FROM streets");
            while(rst.next()){
                streets.add(rst.getString("name"));
            }
            rst = cn.createStatement().executeQuery("SELECT * FROM departments");
            while(rst.next()){
                departments.add(rst.getString("name"));
            }
            rst = cn.createStatement().executeQuery("SELECT * FROM positions");
            while(rst.next()){
                positions.add(rst.getString("name"));
            }
            edit_emp_country.setItems(countries);
            edit_emp_state.setItems(states);
            edit_emp_city.setItems(cities);
            edit_emp_street.setItems(streets);
            edit_emp_department.setItems(departments);
            edit_emp_position.setItems(positions);
            edit_emp_has_family.setItems(has_family);
            edit_emp_sex.setItems(sex);

        }catch (Exception e){e.printStackTrace();}
    }

    public void EditAddressChoiceBoxes1(){
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/hr_department", "root", "");
            ObservableList<String> countries = FXCollections.observableArrayList();
            ObservableList<String> states = FXCollections.observableArrayList();
            ObservableList<String> cities = FXCollections.observableArrayList();
            ObservableList<String> streets = FXCollections.observableArrayList();
            ObservableList<String> departments = FXCollections.observableArrayList();
            ObservableList<String> positions = FXCollections.observableArrayList();
            ObservableList<String> has_family = FXCollections.observableArrayList("Yes","No");
            ObservableList<String> sex = FXCollections.observableArrayList("Male","Female");
            ResultSet rst = cn.createStatement().executeQuery("SELECT * FROM countries");
            while(rst.next()){
                countries.add(rst.getString("name"));
            }
            rst=cn.createStatement().executeQuery("SELECT * FROM states");
            while(rst.next()){
                states.add(rst.getString("name"));
            }
            rst = cn.createStatement().executeQuery("SELECT * FROM cities");
            while(rst.next()){
                cities.add(rst.getString("name"));
            }
            rst = cn.createStatement().executeQuery("SELECT * FROM streets");
            while(rst.next()){
                streets.add(rst.getString("name"));
            }
            rst = cn.createStatement().executeQuery("SELECT * FROM departments");
            while(rst.next()){
                departments.add(rst.getString("name"));
            }
            rst = cn.createStatement().executeQuery("SELECT * FROM positions");
            while(rst.next()){
                positions.add(rst.getString("name"));
            }
            edit_emp_country1.setItems(countries);
            edit_emp_state1.setItems(states);
            edit_emp_city1.setItems(cities);
            edit_emp_street1.setItems(streets);
            edit_emp_department1.setItems(departments);
            edit_emp_position1.setItems(positions);
            edit_emp_has_family1.setItems(has_family);
            edit_emp_sex1.setItems(sex);

        }catch (Exception e){e.printStackTrace();}
    }

    public static void AEditEmpData(){
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/hr_department", "root", "");
            PreparedStatement pst = cn.prepareStatement("UPDATE employees SET first_name = ?, second_name = ?, birth_date = ?, phone_number = ?, email = ?, country = ?, state = ?, city = ?, street = ?, department = ?, position = ?, hire_date = ?, has_family = ?, sex = ?   WHERE id = ?");

        }catch(Exception e){e.printStackTrace();}
    }

   public class ColorRectCell extends ListCell<Employee> {
        @Override
        public void updateItem(Employee id, boolean empty) {
            super.updateItem(id, empty);
            if (id != null) {
                try{
                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/hr_department", "root", "");
                    Statement st = cn.createStatement();
                    ResultSet rst = st.executeQuery("SELECT * FROM employees");
                    Image avatarImg=new Image("sample/EmployeeAvatars/Nurjigit.jpg");

                    Circle avatar = new Circle();
                    //avatar.setFill(Color.color(0.9,0.9,0.9));
                    avatar.setStroke(Color.color(0.55,0.66,0.77));
                    avatar.relocate(100,75);
                    avatar.setRadius(50);
                    avatar.setFill(new ImagePattern(avatarImg));
                    Pane pane = new Pane();
                    pane.setPrefHeight(170);
                    Text full_name = new Text(id.getFName()+" "+id.getSName());
                    full_name.setFill(Color.color(0.2,0.6,0.7));
                    full_name.setStyle("-fx-font-weight:bold");
                    full_name.relocate(200,20);
                    rst = st.executeQuery("select departments.name from departments where departments.id="+id.getDepartent());
                    Text department = new Text();
                    while(rst.next()){department=new Text(rst.getString("name"));}
                    department.relocate(200,40);
                    rst = st.executeQuery("select positions.name from positions where positions.id="+id.getPosition());
                    Text position = new Text();
                    while(rst.next()){position=new Text(rst.getString("name"));}
                    position.relocate(200,60);

                    Hyperlink email = new Hyperlink(id.getEmail());
                    Text email_txt = new Text("Эл. почта: ");
                    email_txt.relocate(510,20);
                    email.relocate(580,15);

                    Hyperlink phone_number = new Hyperlink(id.getPhoneNumber());
                    Text phone_num = new Text("Номер телефона: ");
                    phone_num.relocate(458,40);
                    phone_number.relocate(578,37);

                    JFXButton editData = new JFXButton("Редактировать");
                    JFXButton showMore = new JFXButton("Показать больше");
                    editData.setStyle("-fx-background-color:#FFFFFF;-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.4) , 10, 0.0 , 0 , 2 );-fx-background-radius:40");
                    showMore.setStyle("-fx-background-color:#FFFFFF;-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.4) , 10, 0.0 , 0 , 2 );-fx-background-radius:40");
                    editData.setTextFill(Color.color(0,0,0));
                    showMore.setTextFill(Color.color(0,0,0));
                    editData.relocate(1195,20);
                    showMore.relocate(1180,60);
                    editData.setOnAction(event -> {
                        edit_emp_pane.setDisable(false);
                        edit_emp_pane.setVisible(true);
                        EditAddressChoiceBoxes();
                        edit_emp_button.setOnAction(event1 -> {
                            try {
                                PreparedStatement pst = cn.prepareStatement("UPDATE employees SET first_name = ?, second_name = ?, birth_date = ?, phone_number = ?, email = ?, country = ?, state = ?, city = ?, street = ?, department = ?, position = ?, has_family = ?, sex = ?   WHERE id = ?");
                                pst.setString(1,edit_emp_fname.getText());
                                pst.setString(2,edit_emp_sname.getText());
                                pst.setString(3,edit_emp_bdate.getText());
                                pst.setString(4,edit_emp_pnymber.getText());
                                pst.setString(5,edit_emp_email.getText());
                                if(edit_emp_has_family.getValue()=="Yes"){
                                    pst.setString(12,"1");
                                }
                                else {pst.setString(12,"0");}

                                pst.setString(13,edit_emp_sex.getValue());
                                ResultSet rst1 = cn.createStatement().executeQuery("SELECT id FROM countries WHERE name = '"+edit_emp_country.getValue()+"'");
                                while(rst1.next()){
                                    pst.setString(6,rst1.getString("id"));
                                }
                                rst1 = cn.createStatement().executeQuery("SELECT id FROM states WHERE name = '"+edit_emp_state.getValue()+"'");
                                while(rst1.next()){
                                    pst.setString(7,rst1.getString("id"));
                                }
                                rst1 = cn.createStatement().executeQuery("SELECT id FROM cities WHERE name = '"+edit_emp_city.getValue()+"'");
                                while(rst1.next()){
                                    pst.setString(8,rst1.getString("id"));
                                }
                                rst1 = cn.createStatement().executeQuery("SELECT id FROM streets WHERE name = '"+edit_emp_street.getValue()+"'");
                                while(rst1.next()){
                                    pst.setString(9,rst1.getString("id"));
                                }
                                rst1 = cn.createStatement().executeQuery("SELECT id FROM departments WHERE name = '"+edit_emp_department.getValue()+"'");
                                while(rst1.next()){
                                    pst.setString(10,rst1.getString("id"));
                                }
                                rst1 = cn.createStatement().executeQuery("SELECT id FROM positions WHERE name = '"+edit_emp_position.getValue()+"'");
                                while(rst1.next()){
                                    pst.setString(11,rst1.getString("id"));
                                }
                                pst.setInt(14,id.getID());
                                pst.execute();
                            } catch (SQLException throwables) {
                                throwables.printStackTrace();
                            }
                            edit_emp_fname.clear();
                            edit_emp_sname.clear();
                            edit_emp_bdate.clear();
                            edit_emp_email.clear();
                            edit_emp_pnymber.clear();
                            edit_emp_pane.setDisable(true);
                            edit_emp_pane.setVisible(false);
                        });

                        edit_emp_cancel_button.setOnAction(event1 -> {
                            edit_emp_fname.clear();
                            edit_emp_sname.clear();
                            edit_emp_bdate.clear();
                            edit_emp_email.clear();
                            edit_emp_pnymber.clear();
                            edit_emp_pane.setDisable(true);
                            edit_emp_pane.setVisible(false);});

                    });

                    showMore.setOnAction(event -> {
                        about_emp_pane.setDisable(false);
                        about_emp_pane.setVisible(true);
                        about_emp_fname.setText(id.getFName());
                        about_emp_sname.setText(id.getSName());
                        about_emp_bdate.setText(id.getBirthDate());
                        about_emp_phone_number.setText(id.getPhoneNumber());
                        about_emp_email.setText(id.getEmail());
                        try {
                            ResultSet rst2 = cn.createStatement().executeQuery("SELECT name FROM countries WHERE id = "+id.getCountry());
                            while(rst2.next()){
                            about_emp_country.setText(rst2.getString("name"));}
                            rst2 = cn.createStatement().executeQuery("SELECT name FROM states WHERE id = "+id.getState());
                            while(rst2.next()){
                                about_emp_state.setText(rst2.getString("name"));}
                            rst2 = cn.createStatement().executeQuery("SELECT name FROM cities WHERE id = "+id.getCity());
                            while(rst2.next()){
                                about_emp_city.setText(rst2.getString("name"));}
                            rst2 = cn.createStatement().executeQuery("SELECT name FROM streets WHERE id = "+id.getStreet());
                            while(rst2.next()){
                                about_emp_street.setText(rst2.getString("name"));}
                            rst2 = cn.createStatement().executeQuery("SELECT name FROM departments WHERE id = "+id.getDepartent());
                            while(rst2.next()){
                                about_emp_department.setText(rst2.getString("name"));}
                            rst2 = cn.createStatement().executeQuery("SELECT name FROM positions WHERE id = "+id.getPosition());
                            while(rst2.next()){
                                about_emp_position.setText(rst2.getString("name"));}
                            about_emp_sex.setText(id.getSex());
                            if(id.getHasFamily()==false){about_emp_has_family.setText("Нет");}
                            else{about_emp_has_family.setText("Да");}
                        } catch (SQLException throwables) {
                            throwables.printStackTrace();
                        }
                        about_emp_back_button.setOnAction(event1 -> {
                            about_emp_pane.setDisable(true);
                            about_emp_pane.setVisible(false);});
                        delete_emp_button.setOnAction(event1 -> {
                            try {
                                cn.createStatement().executeUpdate("DELETE FROM employees WHERE id = "+id.getID());
                            } catch (SQLException throwables) {
                                throwables.printStackTrace();
                            }
                            about_emp_pane.setDisable(true);
                            about_emp_pane.setVisible(false);
                        });
                    });

                    pane.getChildren().addAll(full_name,avatar,department,position,email,email_txt,phone_num,phone_number,editData,showMore);
                    setGraphic(pane);
                    }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

    static class OtpuskCell extends ListCell<Otpusk> {
        @Override
        public void updateItem(Otpusk id, boolean empty) {
            super.updateItem(id, empty);
            if (id != null) {
                try{
                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/hr_department", "root", "");
                    Statement st = cn.createStatement();
                    ResultSet rst = st.executeQuery("SELECT first_name,second_name FROM employees WHERE id="+id.getEmp_name());
                    Pane pane = new Pane();
                    pane.setPrefHeight(75);
                    Text full_name = new Text();
                    while(rst.next()){
                        full_name=new Text(rst.getString("first_name")+" "+rst.getString("second_name"));
                    }
                    full_name.setFill(Color.color(0.2,0.6,0.7));
                    full_name.setStyle("-fx-font-weight:bold");
                    full_name.relocate(100,35);
                    Text cause = new Text("Событие: "+id.getCause());
                    cause.relocate(900,35);
                    Text email_txt = new Text("C "+id.getStartDate());
                    email_txt.relocate(450,35);
                    Text phone_num = new Text("до "+id.getEndDate());
                    phone_num.relocate(550,35);

                    pane.getChildren().addAll(full_name,email_txt,phone_num,cause);
                    setGraphic(pane);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

    public class ResumeCell extends ListCell<Resumes> {
        @Override
        public void updateItem(Resumes id, boolean empty) {
            super.updateItem(id, empty);
            if (id != null) {
                try{
                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/hr_department", "root", "");
                    Statement st = cn.createStatement();
                    Pane pane = new Pane();
                    pane.setPrefHeight(150);
                    Text full_name = new Text();
                    full_name=new Text(id.getFName()+" "+id.getSName());
                    full_name.setFill(Color.color(0.2,0.6,0.7));
                    full_name.setStyle("-fx-font-weight:bold");
                    full_name.relocate(100,35);
                    Text cause = new Text("Опыт: "+id.getJobHistory());
                    cause.relocate(300,45);
                    Text email_txt = new Text("Знание языков: "+id.getLanguages());
                    email_txt.relocate(600,35);
                    String position;
                    Text phone_num = new Text("На должность:  ");
                    ResultSet rst = cn.createStatement().executeQuery("SELECT name FROM positions WHERE id="+id.getPosition());
                    while(rst.next()){
                        phone_num=new Text("На должность:  "+rst.getString("name"));
                    }

                    phone_num.relocate(300,25);

                    Hyperlink email = new Hyperlink(id.getEmail());
                    Text email1 = new Text("Эл. почта: ");
                    email1.relocate(910,20);
                    email.relocate(980,15);

                    Hyperlink phone_number = new Hyperlink(id.getPhoneNumber());
                    Text phone_num1 = new Text("Номер телефона: ");
                    phone_num1.relocate(858,40);
                    phone_number.relocate(978,37);

                    pane.getChildren().addAll(full_name,email_txt,phone_num,cause,email, email1,phone_num1,phone_number);
                    setGraphic(pane);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }


    public class Intern extends ListCell<Interns> {
        @Override
        public void updateItem(Interns id, boolean empty) {
            super.updateItem(id, empty);
            if (id != null) {
                try{
                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/hr_department", "root", "");
                    Statement st = cn.createStatement();
                    ResultSet rst = st.executeQuery("SELECT * FROM interns");
                    Image avatarImg=new Image("sample/EmployeeAvatars/Nurjigit.jpg");

                    Circle avatar = new Circle();
                    //avatar.setFill(Color.color(0.9,0.9,0.9));
                    avatar.setStroke(Color.color(0.55,0.66,0.77));
                    avatar.relocate(100,75);
                    avatar.setRadius(50);
                    avatar.setFill(new ImagePattern(avatarImg));
                    Pane pane = new Pane();
                    pane.setPrefHeight(170);
                    Text full_name = new Text(id.getFName()+" "+id.getSName());
                    full_name.setFill(Color.color(0.2,0.6,0.7));
                    full_name.setStyle("-fx-font-weight:bold");
                    full_name.relocate(200,20);
                    rst = st.executeQuery("select departments.name from departments where departments.id="+id.getDepartent());
                    Text department = new Text();
                    while(rst.next()){department=new Text(rst.getString("name"));}
                    department.relocate(200,40);
                    rst = st.executeQuery("select positions.name from positions where positions.id="+id.getToPosition());
                    Text position = new Text();
                    while(rst.next()){position=new Text(rst.getString("name"));}
                    position.relocate(200,60);

                    Hyperlink email = new Hyperlink(id.getEmail());
                    Text email_txt = new Text("Эл. почта: ");
                    email_txt.relocate(510,20);
                    email.relocate(580,15);

                    Hyperlink phone_number = new Hyperlink(id.getPhoneNumber());
                    Text phone_num = new Text("Номер телефона: ");
                    phone_num.relocate(458,40);
                    phone_number.relocate(578,37);

                    JFXButton editData = new JFXButton("Редактировать");
                    JFXButton showMore = new JFXButton("Показать больше");
                    editData.setStyle("-fx-background-color:#FFFFFF;-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.4) , 10, 0.0 , 0 , 2 );-fx-background-radius:40");
                    showMore.setStyle("-fx-background-color:#FFFFFF;-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.4) , 10, 0.0 , 0 , 2 );-fx-background-radius:40");
                    editData.setTextFill(Color.color(0,0,0));
                    showMore.setTextFill(Color.color(0,0,0));
                    editData.relocate(1195,20);
                    showMore.relocate(1180,60);

                    editData.setOnAction(event -> {

                        edit_emp_pane1.setDisable(false);
                        edit_emp_pane1.setVisible(true);
                        EditAddressChoiceBoxes1();
                        edit_emp_button1.setOnAction(event1 -> {
                            try {
                                PreparedStatement pst = cn.prepareStatement("UPDATE interns SET first_name = ?, second_name = ?, birth_date = ?, phone_number = ?, email = ?, country = ?, state = ?, city = ?, street = ?, department = ?, to_position = ?, has_family = ?, sex = ?   WHERE id = ?");
                                pst.setString(1,edit_emp_fname1.getText());
                                pst.setString(2,edit_emp_sname1.getText());
                                pst.setString(3,edit_emp_bdate1.getText());
                                pst.setString(4,edit_emp_pnymber1.getText());
                                pst.setString(5,edit_emp_email1.getText());
                                if(edit_emp_has_family1.getValue()=="Yes"){
                                    pst.setString(12,"1");
                                }
                                else {pst.setString(12,"0");}

                                pst.setString(13,edit_emp_sex1.getValue());
                                ResultSet rst1 = cn.createStatement().executeQuery("SELECT id FROM countries WHERE name = '"+edit_emp_country1.getValue()+"'");
                                while(rst1.next()){
                                    pst.setString(6,rst1.getString("id"));
                                }
                                rst1 = cn.createStatement().executeQuery("SELECT id FROM states WHERE name = '"+edit_emp_state1.getValue()+"'");
                                while(rst1.next()){
                                    pst.setString(7,rst1.getString("id"));
                                }
                                rst1 = cn.createStatement().executeQuery("SELECT id FROM cities WHERE name = '"+edit_emp_city1.getValue()+"'");
                                while(rst1.next()){
                                    pst.setString(8,rst1.getString("id"));
                                }
                                rst1 = cn.createStatement().executeQuery("SELECT id FROM streets WHERE name = '"+edit_emp_street1.getValue()+"'");
                                while(rst1.next()){
                                    pst.setString(9,rst1.getString("id"));
                                }
                                rst1 = cn.createStatement().executeQuery("SELECT id FROM departments WHERE name = '"+edit_emp_department1.getValue()+"'");
                                while(rst1.next()){
                                    pst.setString(10,rst1.getString("id"));
                                }
                                rst1 = cn.createStatement().executeQuery("SELECT id FROM positions WHERE name = '"+edit_emp_position1.getValue()+"'");
                                while(rst1.next()){
                                    pst.setString(11,rst1.getString("id"));
                                }
                                pst.setInt(14,id.getID());
                                pst.execute();
                            } catch (SQLException throwables) {
                                throwables.printStackTrace();
                            }
                            edit_emp_fname1.clear();
                            edit_emp_sname1.clear();
                            edit_emp_bdate1.clear();
                            edit_emp_email1.clear();
                            edit_emp_pnymber1.clear();
                            edit_emp_pane1.setDisable(true);
                            edit_emp_pane1.setVisible(false);
                        });

                        edit_emp_cancel_button1.setOnAction(event1 -> {
                            edit_emp_fname1.clear();
                            edit_emp_sname1.clear();
                            edit_emp_bdate1.clear();
                            edit_emp_email1.clear();
                            edit_emp_pnymber1.clear();
                            edit_emp_pane1.setDisable(true);
                            edit_emp_pane1.setVisible(false);});
                    });

                    showMore.setOnAction(event -> {
                        about_emp_pane1.setDisable(false);
                        about_emp_pane1.setVisible(true);
                        about_emp_fname1.setText(id.getFName());
                        about_emp_sname1.setText(id.getSName());
                        about_emp_bdate1.setText(id.getBirthDate());
                        about_emp_phone_number1.setText(id.getPhoneNumber());
                        about_emp_email1.setText(id.getEmail());
                        try {
                            ResultSet rst2 = cn.createStatement().executeQuery("SELECT name FROM countries WHERE id = "+id.getCountry());
                            while(rst2.next()){
                                about_emp_country1.setText(rst2.getString("name"));}
                            rst2 = cn.createStatement().executeQuery("SELECT name FROM states WHERE id = "+id.getState());
                            while(rst2.next()){
                                about_emp_state1.setText(rst2.getString("name"));}
                            rst2 = cn.createStatement().executeQuery("SELECT name FROM cities WHERE id = "+id.getCity());
                            while(rst2.next()){
                                about_emp_city1.setText(rst2.getString("name"));}
                            rst2 = cn.createStatement().executeQuery("SELECT name FROM streets WHERE id = "+id.getStreet());
                            while(rst2.next()){
                                about_emp_street1.setText(rst2.getString("name"));}
                            rst2 = cn.createStatement().executeQuery("SELECT name FROM departments WHERE id = "+id.getDepartent());
                            while(rst2.next()){
                                about_emp_department1.setText(rst2.getString("name"));}
                            rst2 = cn.createStatement().executeQuery("SELECT name FROM positions WHERE id = "+id.getToPosition());
                            while(rst2.next()){
                                about_emp_position1.setText(rst2.getString("name"));}
                            about_emp_sex1.setText(id.getSex());
                            if(id.getHasFamily()==false){about_emp_has_family1.setText("Нет");}
                            else{about_emp_has_family1.setText("Да");}
                        } catch (SQLException throwables) {
                            throwables.printStackTrace();
                        }
                        about_emp_back_button1.setOnAction(event1 -> {
                            about_emp_pane1.setDisable(true);
                            about_emp_pane1.setVisible(false);});
                        delete_emp_button1.setOnAction(event1 -> {
                            try {
                                cn.createStatement().executeUpdate("DELETE FROM employees WHERE id = "+id.getID());
                            } catch (SQLException throwables) {
                                throwables.printStackTrace();
                            }
                            about_emp_pane1.setDisable(true);
                            about_emp_pane1.setVisible(false);
                        });
                    });

                    pane.getChildren().addAll(full_name,avatar,department,position,email,email_txt,phone_num,phone_number,editData,showMore);
                    setGraphic(pane);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

}