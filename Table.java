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