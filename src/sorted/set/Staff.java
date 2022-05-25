package sorted.set;

public class Staff {
    private String fullName;
    private  int id;
    private float salary;


    public Staff() {
    }

    public Staff(String fullName,float salary) {
        this.fullName = fullName;
        this.salary = salary;
    }



    public String getFullName() {
        return fullName;
    }


    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }


}
