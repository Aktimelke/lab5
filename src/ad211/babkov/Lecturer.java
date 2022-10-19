package ad211.babkov;

public class Lecturer extends Person{
    public Lecturer(String department,String name,String surname,int age,double salary){
        super(name,surname,age);
        this.department=department;
        this.salary=salary;

    }

    private String department;
    private double salary;

    @Override
    public void printInfo(){
        System.out.println("Преподователь кафедры "+getDepartment()+" "+getSurname()+" "+getName()+", возраст: "+getAge()+".\n"+"Зарплата: "+getSalary());
    }
    public String getDepartment(){
        return department;
    }
    public double getSalary(){
        return salary;
    }
    public void setDepartment(String department){
        this.department=department;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
}
