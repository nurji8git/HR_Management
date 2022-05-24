package sample;

import javafx.beans.property.*;

public class Timesheet {
    private SimpleIntegerProperty idTimesheet;
    private SimpleIntegerProperty empId;
    private SimpleStringProperty dateCome;
    private SimpleDoubleProperty timeFrom;
    private SimpleDoubleProperty timeTo;
    private SimpleDoubleProperty amountHours;

    private SimpleDoubleProperty totalAmountHours;
    private SimpleStringProperty firstName;

    Timesheet(int empId, String date, double arrive, double leave, double hours){

        this.empId = new SimpleIntegerProperty(empId);
        this.dateCome = new SimpleStringProperty(date);
        this.timeFrom = new SimpleDoubleProperty(arrive);
        this.timeTo = new SimpleDoubleProperty(leave);
        this.amountHours = new SimpleDoubleProperty(hours);
    }

    Timesheet(double totalAmountHours){
        this.totalAmountHours = new SimpleDoubleProperty(totalAmountHours);
    }

    Timesheet(String first_name){
        this.firstName = new SimpleStringProperty(first_name);
    }

    Timesheet(int empId){
        this.empId = new SimpleIntegerProperty(empId);
    }

    public String getFirstName() { return firstName.get(); }
    public void setFirstName(String first_name) { dateCome.set(first_name); }

    public double getTotalAmountHours() { return totalAmountHours.get(); }
    public void setTotalAmountHours(double totalHours) { totalAmountHours.set(totalHours); }

    public int getIdTimesheet() { return idTimesheet.get(); }
    public void setIdTimesheet(int id) { idTimesheet.set(id); }

    public int getEmpId() { return empId.get(); }
    public void setEmpId(int empId1) { empId.set(empId1); }

    public String getDateCome() { return dateCome.get(); }
    public void setDateCome(String date) { dateCome.set(date); }

    public double getTimeFrom() { return timeFrom.get(); }
    public void setTimeFrom(double arrive) { timeFrom.set(arrive); }

    public double getTimeTo() { return timeTo.get(); }
    public void setTimeTo(double leave) { timeTo.set(leave); }

    public double getAmountHours() { return amountHours.get(); }
    public void setAmountHours(double hours) { amountHours.set(hours); }


    public IntegerProperty idTimesheetProperty(){
        return idTimesheet;
    }
    public IntegerProperty empIdProperty(){
        return empId;
    }
    public StringProperty dateComeProperty(){ return dateCome; }
    public DoubleProperty timeFromProperty(){ return timeFrom; }
    public DoubleProperty timeToProperty(){ return timeTo; }
    public DoubleProperty amountHoursProperty(){ return amountHours; }

    public DoubleProperty totalAmountHoursProperty(){ return totalAmountHours; }
    public StringProperty firstNameProperty(){ return firstName; }
}
