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