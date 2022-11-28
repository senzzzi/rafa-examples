
public class Main {
    public static void main(String[] args) {

        Department department = new Department("Finance");

        Employee director = new Director("Bruno", department, "test@test.com", "bmw");

        Employee engineer = new Engineer("Rafa", department, "rafa@test.com", "rafa_pc");

        Employee[] employees = new Employee[]{director, engineer};
        for (Employee employee : employees) {

            System.out.println(employee.getName() + " that makes " + employee.getSalary() + " per month");
        }

        GeometricFigure square = new Square(5, 5);

        GeometricFigure circle = new Circle(3);
        for (GeometricFigure geometricFigure : new GeometricFigure[]{square, circle}) {
            System.out.println(geometricFigure.toString() + " has area: " + geometricFigure.getArea());
        }

    }

}