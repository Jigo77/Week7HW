package Java3;

public class Person {
        String fname="Avani",lname="Patel";
        int age=18;

        public String getFirstName(){

            return fname;
        }
        public String getLastname(){
            return lname;
        }
    public int getAge(){
        return age;
    }
    public String setFirstname(String fname){
            return fname;
    }
    public String setLastname(String lname){
        return lname;
    }
    public int setAge(int age){
            if(age < 0 || age> 100 ){
                age=0;
            }else {
                age=age;
            }
            return age;
    }
    public boolean isTeen(){
            if(age >=12 && age <=20){
                return true;
            }else {
                return false;
            }

    }
    public void getFullName(){
        System.out.println(fname+" "+lname);

    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.setFirstname("Meet")); // firstName is set to empty string
        System.out.println(person.setLastname("Patel")); // lastName is set to empty string
        System.out.println(person.setAge(10));
        person.getFullName();
        System.out.println("teen= " + person.isTeen());
        person.setFirstname("Avani"); // firstName is set to John
        System.out.println(person.setAge(18));
        person.getFullName();
        System.out.println("teen= " + person.isTeen());
        person.setLastname("Patel"); // lastName is set to Smith
        person.getFullName();
    }

}
