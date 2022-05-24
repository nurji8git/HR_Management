package sample;

import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Otpusk extends RecursiveTreeObject<Otpusk> {
    private SimpleIntegerProperty id;
    private SimpleStringProperty cause;
    private SimpleStringProperty emp_name;
    private SimpleStringProperty start_date;
    private SimpleStringProperty end_date;

    public Otpusk(Integer id,String cause,String emp_name, String start_date, String end_date){
        this.id = new SimpleIntegerProperty(id);
        this.cause = new SimpleStringProperty(cause);
        this.emp_name = new SimpleStringProperty(emp_name);
        this.start_date = new SimpleStringProperty(start_date);
        this.end_date = new SimpleStringProperty(end_date);
    }

    public int getID(){ return id.get();}
    public void setID(int value){ id.set(value);}

    public String getCause(){ return cause.get();}
    public void setCause(String value){ cause.set(value);}

    public String getEmp_name(){ return emp_name.get();}
    public void setEmp_name(String value){ emp_name.set(value);}

    public String getStartDate(){ return start_date.get();}
    public void setStart_date(String value){ start_date.set(value);}

    public String getEndDate(){ return end_date.get();}
    public void setEnd_date(String value){ end_date.set(value);}

    public IntegerProperty idProperty(){
        return id;
    }
    public StringProperty causeProperty(){
        return cause;
    }
    public StringProperty empNameProperty(){
        return emp_name;
    }
    public StringProperty startProperty(){
        return start_date;
    }
    public StringProperty endProperty(){
        return end_date;
    }

}
