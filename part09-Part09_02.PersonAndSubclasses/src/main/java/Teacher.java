public class Teacher extends Person {
  
  private Integer salary;

  public Teacher(String name, String address, int startingSalary) {
    super(name, address); // Pass name and address to the Person constructor
    this.salary = startingSalary; // Set salary
}


  @Override
  public String toString() {
      return super.toString() + "\n" + "  salary " + this.salary + " euro/month";
  }
  

}
