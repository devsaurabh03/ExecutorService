public class Employee {

    private String name;
    private int age;

    private long hashed;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        Employee emp = (Employee) o;
        return this.getName().equals(emp.getName());
    }

    @Override
    public int hashCode() {
        int result = this.getName().hashCode();
        this.hashed = result;
        System.out.println(this.getName()+"->"+this.getName().hashCode());

        //result = 31 * result + getAge();
        return result;
    }

    public long getHashed() {
        return hashed;
    }

    public void setHashed(long hashed) {
        this.hashed = hashed;
    }
}
