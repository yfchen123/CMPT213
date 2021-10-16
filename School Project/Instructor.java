public class Instructor {
    private int age;
    private String name;


    public Instructor(int age, String name) {
        assert age > 0 : "The age should be greater than zero";
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    /**
     *
     * @param age should be greater than 0
     */
    public void setAge(int age) {
        assert age > 0 : "The age should be greater than zero.";
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
