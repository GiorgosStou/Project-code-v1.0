//Klassi Employee gia dimioyrgia object ypallilwn me tis vasikes plirofories
public class Employee {
    boolean employee_status;
    String first_name, last_name;
    double salary;

    static void set_name(first_name, last_name){
        this.first_name = first_name;
        this.last_name = last_name;
    }

    static String get_name(){
        return this.first_name,this.last_name;
    }

    static void set_status(employee_status){
        this.employee_status = employee_status;
    }
    
    static boolean get_status(){
        return this.employee_status
    }

    