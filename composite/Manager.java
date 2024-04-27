package composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
// 部長
public class Manager implements EmployeeEntry {

    private String name;
    private int salary;
    private int executiveCompensation;
    private List<EmployeeEntry> subordinate;

    public Manager(String name, int salary, int executiveCompensation) {
        this.name = name;
        this.salary = salary;
        this.executiveCompensation = executiveCompensation;
        this.subordinate = new ArrayList<>();
    }

    public void addSubordinate(EmployeeEntry employee) {
        subordinate.add(employee);
    }

    @Override
    public void showEmployeeInfo() {
        System.out.println(
            "   役職：部長、氏名：" + this.name
            + "、給料：" + this.salary
            + "、役員報酬：" + this.executiveCompensation
        );

        Iterator<EmployeeEntry> iterator = this.subordinate.iterator();
        while (iterator.hasNext()) {
            iterator.next().showEmployeeInfo();
        }
    }
}
