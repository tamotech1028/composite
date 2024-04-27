package noComposite;
// 社員
public class Employee {

    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void showEmployeeInfo() {
        System.out.println("役職：なし、氏名：" + this.name + "、給料：" + this.salary);
    }

}