package company;

import java.util.Arrays;

public class HRManager extends Employee {

    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, JuniorDeveloper[] juniorDevelopers,
                     MidDeveloper[] midDevelopers, SeniorDeveloper[] seniorDevelopers) {
        super(id, name);
        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniorDevelopers = seniorDevelopers;
        this.work();
    }

    public void addEmployee(int index, JuniorDeveloper juniorDeveloper) {
        try {
            if (juniorDevelopers[index] == null) {
                juniorDevelopers[index] = juniorDeveloper;
            } else {
                System.out.println("index is full some record exist!");
            }
            
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
            System.out.println("Index not found: " + index);
        }
    }

    public void addEmployee(int index, MidDeveloper midDeveloper) {
        try {
            if (midDevelopers[index] == null) {
                midDevelopers[index] = midDeveloper;
            } else {
                System.out.println("index is full some record exist!");
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
            System.out.println("Index not found: " + index);
        }
    }

    public void addEmployee(int index, SeniorDeveloper seniorDeveloper) {
        try {
            if (seniorDevelopers[index] == null) {
                seniorDevelopers[index] = seniorDeveloper;
            } else {
                System.out.println("index is full some record exist!");
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
            System.out.println("Index not found: " + index);
        }
    }

    @Override
    public void work() {
        setSalary(Salaries.HRMANAGER.getSalary());
        System.out.println(getName() + " hr manager starts to working...");
    }

    @Override
    public String toString() {
        return "HrManager{" +
                "id=" + super.getId() +
                "name=" + super.getName() +
                "salary=" + super.getSalary() +
                "juniorDevelopers=" + Arrays.toString(juniorDevelopers) +
                ", midDevelopers=" + Arrays.toString(midDevelopers) +
                ", seniorDevelopers=" + Arrays.toString(seniorDevelopers) +
                '}';
    }

   /* @Override
    public String toString() {
        return "HrManager{" +
                "super=" + super.toString() +
                "juniorDevelopers=" + Arrays.toString(juniorDevelopers) +
                ", midDevelopers=" + Arrays.toString(midDevelopers) +
                ", seniorDevelopers=" + Arrays.toString(seniorDevelopers) +
                '}';
    }*/
}
