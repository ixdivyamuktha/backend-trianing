
public class Student{
  private int id,marks;
  private String name;
  public Student(int id, String name, int marks){
      this.id=id;
      this.name=name;
      this.marks=marks;
  }
  public int getMarks(){
    return marks;
  }
  public int getId(){
    return id;
  }
  public String getName(){
    return name;
  }
  public void setId(int id){
    this.id=id;
  }
  public void setName(String name){
    this.name=name;
  }
  public void setMarks(int marks){
    this.marks=marks;
  }
  public boolean isPassed(int marks){
    if(marks>=40) return true;
    return false;
  }
  public static void main(String args[]){
    Student s1=new Student(1, "abc", 35);
    System.out.println(s1.getId());
    System.out.println(s1.getMarks());
    System.out.println(s1.getName());
    System.out.println(s1.isPassed(s1.getMarks()));
  }
}