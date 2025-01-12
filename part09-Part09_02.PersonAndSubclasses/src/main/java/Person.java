public class Person {
  
    private String name;
    private String address;

    public Person(String personName, String personAddress) {
      this.name = personName;
      this.address = personAddress;
    }

    @Override
    public String toString() {
        return this.name + "\n" + "  " + this.address;
    }
    
}
