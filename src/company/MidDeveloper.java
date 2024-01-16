package company;

public class MidDeveloper extends Employee {
    public MidDeveloper(long id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        setSalary(Salaries.MID.getSalary());
        System.out.println(getName() + " mid developer starts to working...");
    }
}
