package noComposite;

import java.util.Iterator;
import java.util.List;
// 部長
public class Manager {

    private String name;
    private int salary;
    private int executiveCompensation;
    private List<Object> subordinate;

    public Manager(String name, int salary, int executiveCompensation, List<Object> subordinate) {
        this.name = name;
        this.salary = salary;
        this.executiveCompensation = executiveCompensation;
        this.subordinate = subordinate;
    }

    private void showEmployeeInfo() {
        System.out.println(
            "役職：部長、氏名：" + this.name
            + "、給料：" + this.salary
            + "、役員報酬：" + this.executiveCompensation
        );
    }

    public void showEmployeeListInfo() {
        showEmployeeInfo();
        Iterator<Object> iterator = this.subordinate.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            if (obj instanceof SectionChief sectionChief ) {
                sectionChief.showEmployeeListInfo();
            } else if (obj instanceof Employee employee) {
                employee.showEmployeeInfo();
            } else {
                System.out.println("存在しない役職の社員です。");
            }
        }
    }
}
