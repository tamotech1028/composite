package composite;
// 社員
public class Employee implements EmployeeEntry {

    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getEmployeeInfo() {
        return "役職：なし、氏名：" + this.name + "、給料：" + this.salary + "\n";
    }
}