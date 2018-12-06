/* This class demonstrates dynamic dispatch in Java*/
public class DemoInheritance {
  
  public static void main(String args[]){
    System.out.println("This is Inheritance Demo");
  
  
  Person person, newPerson;
  
  //creating a person
  newPerson = new Person("Nihar",131282);
  //display in Person Called
  newPerson.display();
  
  Student student = new Student("Student",1234,5678);
  //display in Student Called
  student.display();
  
  Teacher teacher = new Teacher("Teacher",4321,8765);
  //display in Teacher called
  teacher.display();
  
  person = student;
  //runtime polymorphism, display in student called
  person.display();
  
  person = teacher;
  //display in Teacher called 
  person.display();
  }
  
}
                       
class Person {
  private String name;
  private int ssn;
  
  public Person(String name, int ssn){
    this.name=name;
    this.ssn=ssn;
    ssn=0;
  }
  
  public void setName(String name){
    this.name=name;
  }
  public void setSSN(int ssn){
    this.ssn=ssn;
  }
  
  public String toString(){
    return name+" "+ssn;
  }
  
  public void display(){
    System.out.println(this);
  }
};
   
class Student extends Person{
  private int rollNumber;
  
  public Student(String name, int ssn, int rollNumber){
    super(name,ssn);
    this.rollNumber=rollNumber;
  }
  
  public void setrollNumber(int num){
    rollNumber=num;
  }
  public void display(){
    super.display();
    System.out.println(rollNumber);
  }
};

class Teacher extends Person{
  private int empNumber;
  
  public Teacher(String name, int ssn, int empNumber){
    super(name,ssn);
    this.empNumber=empNumber;
  }
  
  public void setempNumber(int num){
    empNumber=num;
  }
  
  public void display(){
    super.display();
    System.out.println(empNumber);
    
  }                     
};
