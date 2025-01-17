public class Book {
    private String name;
    private int age;


    public Book(String bookName, Integer ageReco) {
        this.name = bookName;
        this.age = ageReco;
    }


    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return this.name + " (recommended for " + this.age + " year-olds or older)";
    }
}
