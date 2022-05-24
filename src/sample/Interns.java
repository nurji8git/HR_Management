package sample;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import com.sun.org.apache.xpath.internal.operations.Bool;
import javafx.beans.property.*;

public class Interns extends RecursiveTreeObject<Interns>{
    private SimpleIntegerProperty id;
    private SimpleStringProperty first_name;
    private SimpleStringProperty second_name;
    private SimpleStringProperty birth_date;
    private SimpleStringProperty phone_number;
    private SimpleStringProperty email;
    private SimpleStringProperty country;
    private SimpleStringProperty state;
    private SimpleStringProperty city;
    private SimpleStringProperty street;
    private SimpleStringProperty department;
    private SimpleStringProperty to_position;
    private SimpleStringProperty start_date;
    private SimpleBooleanProperty has_family;
    private SimpleStringProperty sex;

    public Interns(int id, String first_name, String second_name, String birth_date, String phone_number, String email, String country, String state, String city, String street, String department, String to_position, String start_date, Boolean has_family, String sex){
        this.id = new SimpleIntegerProperty(id);
        this.first_name = new SimpleStringProperty(first_name);
        this.second_name = new SimpleStringProperty(second_name);
        this.birth_date = new SimpleStringProperty(birth_date);
        this.phone_number = new SimpleStringProperty(phone_number);
        this.email = new SimpleStringProperty(email);
        this.country = new SimpleStringProperty(country);
        this.state = new SimpleStringProperty(state);
        this.city = new SimpleStringProperty(city);
        this.street = new SimpleStringProperty(street);
        this.department = new SimpleStringProperty(department);
        this.to_position = new SimpleStringProperty(to_position);
        this.start_date = new SimpleStringProperty(start_date);
        this.has_family = new SimpleBooleanProperty(has_family);
        this.sex = new SimpleStringProperty(sex);
    }
    public int getID(){ return id.get();}
    public void setID(int value){ id.set(value);}

    public String getFName(){ return first_name.get();}
    public void setFname(String value){ first_name.set(value);}

    public String getSName(){ return second_name.get();}
    public void setSName(String value){ second_name.set(value);}

    public String getBirthDate(){ return birth_date.get();}
    public void setBirth_date(String value){ birth_date.set(value);}

    public String getPhoneNumber(){ return phone_number.get();}
    public void setPhone_number(String value){ phone_number.set(value);}

    public String getEmail(){ return email.get();}
    public void setEmail(String value){ email.set(value);}

    public String getCountry(){ return country.get();}
    public void setCountry(String value){ country.set(value);}

    public String getState(){ return state.get();}
    public void setState(String value){ state.set(value);}

    public String getCity(){ return city.get();}
    public void setCity(String value){ city.set(value);}

    public String getStreet(){ return street.get();}
    public void setStreet(String value){ street.set(value);}

    public String getDepartent(){ return department.get();}
    public void setDepartment(String value){ department.set(value);}

    public String getToPosition(){ return to_position.get();}
    public void setToPosition(String value){ to_position.set(value);}

    public String getHireDate(){ return start_date.get();}
    public void setHireDate(String value){ start_date.set(value);}

    public Boolean getHasFamily(){ return has_family.get();}
    public void setHasFamily(Boolean value){ has_family.set(value);}

    public String getSex(){ return sex.get();}
    public void setSex(String value){ sex.set(value);}



    public IntegerProperty idProperty(){
        return id;
    }
    public StringProperty first_nameProperty(){
        return first_name;
    }
    public StringProperty second_nameProperty(){
        return second_name;
    }
    public StringProperty birth_dateProperty(){
        return birth_date;
    }
    public StringProperty phone_numberProperty(){
        return phone_number;
    }
    public StringProperty emailProperty(){
        return email;
    }
    public StringProperty countryProperty(){
        return country;
    }
    public StringProperty stateProperty(){
        return state;
    }
    public StringProperty cityProperty(){
        return city;
    }
    public StringProperty streetProperty(){
        return street;
    }
    public StringProperty departmentProperty(){
        return department;
    }
    public StringProperty positionProperty(){
        return to_position;
    }
    public StringProperty hireDateProperty(){
        return start_date;
    }
    public BooleanProperty hasFamilyProperty(){
        return has_family;
    }
    public StringProperty sexProperty(){
        return sex;
    }
}

