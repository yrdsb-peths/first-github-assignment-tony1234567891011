public class Student 
{
  private int gradeLevel;
  private String firstName;
  private String lastName;
  
  public Student(int level, String name1, String name2) 
  {
    firstName = name1;
    gradeLevel = level;
    lastName = name2;
  }
  public String getFirstName()
  {
    return firstName;
  }
  public String getLastName() 
  {
    return lastName;
  }
  public String toString()
  {
    return "the Student is called: " + firstName + " " + lastName + " and is in grade " + gradeLevel;
  }
    
}
