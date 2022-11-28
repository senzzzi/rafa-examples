import java.util.Objects;

public class Director extends Employee {

    private String carBrand;

    public Director(String name, Department department, String email, String carBrand) {
        super(name, department, email);
        this.carBrand = carBrand;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    @Override
    public int getSalary() {
        return super.getSalary() + 3000;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Director director = (Director) o;
        return Objects.equals(carBrand, director.carBrand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), carBrand);
    }

    @Override
    public String toString() {
        return "Director{" +
                "carBrand='" + carBrand + '\'' +
                '}';
    }
}
