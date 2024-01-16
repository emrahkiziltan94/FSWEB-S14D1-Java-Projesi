package company;

public class SeniorDeveloper extends Employee {
    public SeniorDeveloper(long id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        setSalary(Salaries.SENIOR.getSalary());
        System.out.println(getName() + " senior developer starts to working...");
    }
}
