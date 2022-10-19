package ad211.babkov;

public class Student extends Person {

    public Student (String group,String name,String surname,int age,int ticket){
       super(name,surname,age);
       this.group=group;
       this.ticket=ticket;

    }
    private String group;
    private int ticket;


    @Override
    public void printInfo(){
        System.out.println("Студент группы "+getGroup()+" "+getSurname()+" "+getName()+", возраст: "+getAge()+".\n"+"Номер студенчиского билета: "+getTicket());
    }
    public String getGroup(){
        return group;
    }
    public int getTicket(){
        return ticket;
    }
    public void setGroup(String group){
        this.group=group;
    }
    public void setTicket(int ticket){
        this.ticket=ticket;
    }
}
