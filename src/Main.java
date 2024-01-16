import company.HRManager;
import company.JuniorDeveloper;
import company.MidDeveloper;
import company.SeniorDeveloper;
import cylinder.Circle;
import cylinder.Cylinder;
import pool.Cuboid;
import pool.Rectangle;

public class Main {
    public static void main(String[] args) {

       /* Circle circle = new Circle(3.75);

        System.out.println("circle.radius= " + circle.getRadius());

        System.out.println("circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);

        System.out.println("cylinder.radius= " + cylinder.getRadius());

        System.out.println("cylinder.height= " + cylinder.getHeight());

        System.out.println("cylinder.area= " + cylinder.getArea());

        System.out.println("cylinder.volume= " + cylinder.getVolume());
*/



       /* Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("rectangle.width= " + rectangle.getWidth());

        System.out.println("rectangle.length= " + rectangle.getLength());

        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);

        System.out.println("cuboid.width= " + cuboid.getWidth());

        System.out.println("cuboid.length= " + cuboid.getLength());

        System.out.println("cuboid.area= " + cuboid.getArea());

        System.out.println("cuboid.height= " + cuboid.getHeight());

        System.out.println("cuboid.volume= " + cuboid.getVolume());*/


        JuniorDeveloper juniorDeveloper1 = new JuniorDeveloper(1, "ahmet");
        JuniorDeveloper juniorDeveloper2 = new JuniorDeveloper(2, "ayşe");
        juniorDeveloper1.work();
        ;
        juniorDeveloper2.work();
        System.out.println(juniorDeveloper1);
        System.out.println(juniorDeveloper2);

        MidDeveloper midDeveloper = new MidDeveloper(1, "buse");
        midDeveloper.work();
        System.out.println(midDeveloper);

        SeniorDeveloper seniorDeveloper = new SeniorDeveloper(1, "hamza");
        seniorDeveloper.work();
        System.out.println(seniorDeveloper);


        System.out.println("***********************");
        HRManager hrManager = new HRManager(1, "kerem", new JuniorDeveloper[5],
                new MidDeveloper[2], new SeniorDeveloper[1]);

        System.out.println(hrManager);
        hrManager.addEmployee(0,juniorDeveloper1);
        hrManager.addEmployee(1,juniorDeveloper2);
        hrManager.addEmployee(0,midDeveloper);
        hrManager.addEmployee(0,seniorDeveloper);
        System.out.println(hrManager);

    }
}