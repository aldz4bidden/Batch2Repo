package Classes;

/**
 * Created by JPMPC-B215 on 11/10/2016.
 */
public class Employee extends Person {
    private int employeeId;
    private String department;
    private int sssId;
    private int pagibigId;

    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public String introduceYourSelf()
    {
        return super.introduceYourSelf() + " an Employee";
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSssId() {
        return sssId;
    }

    public void setSssId(int sssId) {
        this.sssId = sssId;
    }

    public int getPagibigId() {
        return pagibigId;
    }

    public void setPagibigId(int pagibigId) {
        this.pagibigId = pagibigId;
    }
}
