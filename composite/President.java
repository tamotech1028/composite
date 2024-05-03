package composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
// 社長
public class President implements EmployeeEntry{

    private String name;
    private int salary;
    private int executiveCompensation;
    private List<EmployeeEntry> subordinate;

    public President(String name, int salary, int executiveCompensation) {
        this.name = name;
        this.salary = salary;
        this.executiveCompensation = executiveCompensation;
        this.subordinate = new ArrayList<>();
    }

    public void addSubordinate(EmployeeEntry employee) {
        subordinate.add(employee);
    }

    @Override
    public String getEmployeeInfo() {
        StringBuilder builder = new StringBuilder();
        String presidentInfo = "役職：社長、氏名：" + this.name + "、給料：" + this.salary + "、役員報酬：" + this.executiveCompensation + "\n";
        builder.append(presidentInfo);

        Iterator<EmployeeEntry> iterator = this.subordinate.iterator();
        while (iterator.hasNext()) {
            EmployeeEntry employee = iterator.next();
            builder.append("  " + employee.getEmployeeInfo());
        }
        return builder.toString();
    }
}
