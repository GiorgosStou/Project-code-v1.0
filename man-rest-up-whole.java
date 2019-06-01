//Pseudokwdikas tou logismikou ManRestUp se JAVA format

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

    

}
//Klassi gia dimiourgia object servitorou klironomontas vasika stoixeia Employee kai 
//prosthetontas sugkekrimena gia servitoro
public class Waiter extends Employee {
    int waiter_id;
    int my_tables;

    public void submit_leave(waiter_id);
    public void set_waiter_id(waiter_id){
        this.waiter_id = waiter_id;
    }
    public int get_waiter_id(){
        return this.waiter_id;
    }
}
//Klassi pou afora to ReceptionInterface kai sunartiseis pou tha xrisimopoiithoun
public class ReceptionInterface {
    public void call_waiter();
    public Table available_tables(Table table_list){
        Table[] available_table_list = new Table[table_list.length + 1] ;
        for(int i=0; i < table_list.length; i++){
            if Array.get(table_list,i).get_availability() {
                available_table_list[i] = Array.get(table_list, i);
            }}
        return available_table_list;    

    }
    
    static void table_select(Table table){
        this.set_availability(false);
    }

    static void take_out(){
        call_waiter();
    }
    static void reserve(String date, int table_id);
}
//Klassi gia dimiourgia object trapeziwn kai vasikes sunertiseis
public class Table {
    int table_id;
    boolean availability;

    static void set_id(table_id){
        this.table_id = table_id;
    }

    static int get_id(){
        return this.table_id;
    }

    static void set_availability(availability){
        this.availability = availability;
    }

    static boolean get_availability(){
        return this.availability;
    }

    public void call_waiter(table_id); //Sunartisi pou kalei ton servitoro sto sugkekrimeno trapezi
    public void pos_needed(); //Sunartisi pou enimerwnei ton servitoro na ferei sto trapezi to POS mixanima
                              // gia plirwmi me pistwtiki
    static void rate(); //Sunartiseis gia enimerwsi i paraleipsi enimerwsis tis vasis me to score pou dinei o pelatis
    static void norate();

    //Auti i sunartisi tha kaleite otan epilegei o pelatis na plirwsei mesw pistwtikis kartas sto trapezi tou 
    public void call_inform(table_id, boolean credit_card){
        if credit_card {
            call_waiter(table_id);
            pos_needed();
            
        }
        else {
            call_waiter(table_id);
        }
    }
 

}