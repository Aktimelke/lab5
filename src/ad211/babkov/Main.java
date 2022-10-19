package ad211.babkov;

public class Main {
    public static void main (String[] args){
        Person[] people = new Person[5];
        people[0] = new Student("Ad-211","Дмитро","Ветохин",18,1337);
        people[1] = new Student("Ad-211","Андрей","Бабков",19,1338);
        people[2] = new Lecturer("ics","Виталий","Громяко",31,30000);
        people[3] = new Lecturer("ics","Билли","Херинктон",28,120000);
        people[4] = new Person("Van","Darkholme",30);

        for(Person o :people){
            o.printInfo();
        }

    }
}
