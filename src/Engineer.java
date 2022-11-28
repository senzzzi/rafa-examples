import java.util.Objects;

public class Engineer extends Employee {

    private String pcName;

    public Engineer(String name, Department department, String email, String pcName) {
        super(name, department, email);
        this.pcName = pcName;
    }

    public String getPcName() {
        return pcName;
    }

    public void setPcName(String pcName) {
        this.pcName = pcName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Engineer engineer = (Engineer) o;
        return Objects.equals(pcName, engineer.pcName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pcName);
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "pcName='" + pcName + '\'' +
                '}';
    }

    @Override
    public int getSalary() {
        return super.getSalary() + 1000;
    }
}
