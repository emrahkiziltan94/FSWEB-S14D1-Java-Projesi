package company;

public class JuniorDeveloper extends Employee {

    public JuniorDeveloper(long id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        setSalary(Salaries.JUNIOR.getSalary());
        System.out.println(getName() + "junior developer starts to working...");
    }




}
