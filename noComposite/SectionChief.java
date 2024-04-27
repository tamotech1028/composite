package noComposite;

import java.util.List;
import java.util.Iterator;
// 係長
public class SectionChief {

    private String name;
    private int salary;
    private int executiveCompensation;
    private List<Employee> member;


    public SectionChief(String name, int salary, int executiveCompensation, List<Employee> member) {
        this.name = name;
        this.salary = salary;
        this.executiveCompensation = executiveCompensation;
        this.member = member;
    }

    private void showEmployeeInfo() {
        System.out.println(
            "役職：係長、氏名：" + this.name
            + "、給料：" + this.salary
            + "、役員報酬：" + this.executiveCompensation
        );
    }

    public void showEmployeeListInfo() {
        showEmployeeInfo();
        Iterator<Employee> iterator = this.member.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            employee.showEmployeeInfo();
        }
    }
}
