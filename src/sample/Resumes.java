package sample;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import com.sun.org.apache.xpath.internal.operations.Bool;
import javafx.beans.property.*;

public class Resumes extends RecursiveTreeObject<Resumes> {
    private SimpleIntegerProperty id;
    private SimpleStringProperty first_name;
    private SimpleStringProperty second_name;
    private SimpleStringProperty phone_number;
    private SimpleStringProperty email;
    private SimpleStringProperty country;
    private SimpleStringProperty state;
    private SimpleStringProperty city;
    private SimpleStringProperty tp_position;
    private SimpleStringProperty personal_traits;
    private SimpleStringProperty languages;
    private SimpleStringProperty job_history;

    public Resumes(int id, String first_name, String second_name, String email, String phone_number, String country, String state, String city, String job_history, String languages, String personal_traits, String tp_position){
        this.id = new SimpleIntegerProperty(id);
        this.first_name = new SimpleStringProperty(first_name);
        this.second_name = new SimpleStringProperty(second_name);
        this.email = new SimpleStringProperty(email);
        this.phone_number = new SimpleStringProperty(phone_number);
        this.country = new SimpleStringProperty(country);
        this.state = new SimpleStringProperty(state);
        this.city = new SimpleStringProperty(city);
        this.job_history = new SimpleStringProperty(job_history);
        this.languages = new SimpleStringProperty(languages);
        this.personal_traits = new SimpleStringProperty(personal_traits);
        this.tp_position = new SimpleStringProperty(tp_position);
    }
    public int getID(){ return id.get();}
    public void setID(int value){ id.set(value);}

    public String getFName(){ return first_name.get();}
    public void setFname(String value){ first_name.set(value);}

    public String getSName(){ return second_name.get();}
    public void setSName(String value){ second_name.set(value);}

    public String getEmail(){ return email.get();}
    public void setEmail(String value){ email.set(value);}

    public String getPhoneNumber(){ return phone_number.get();}
    public void setPhone_number(String value){ phone_number.set(value);}

    public String getCountry(){ return country.get();}
    public void setCountry(String value){ country.set(value);}

    public String getState(){ return state.get();}
    public void setState(String value){ state.set(value);}

    public String getCity(){ return city.get();}
    public void setCity(String value){ city.set(value);}

    public String getJobHistory(){ return job_history.get();}
    public void setJobHistory(String value){ job_history.set(value);}

    public String getLanguages(){ return languages.get();}
    public void setLanguages(String value){ languages.set(value);}

    public String getPersonal_traits(){ return personal_traits.get();}
    public void setPersonal_traits(String value){ personal_traits.set(value);}

    public String getPosition(){ return tp_position.get();}
    public void setPosition(String value){ tp_position.set(value);}



    public IntegerProperty idProperty(){
        return id;
    }
    public StringProperty first_nameProperty(){
        return first_name;
    }
    public StringProperty second_nameProperty(){
        return second_name;
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
    public StringProperty job_history_Property() {
        return job_history;
    }
    public StringProperty languages_Property() {
        return languages;
    }
    public StringProperty personal_traitsProperty() {
        return personal_traits;
    }
    public StringProperty topositionProperty() {
        return tp_position;
    }
}

