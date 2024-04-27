package noComposite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
// 社長
public class President {

    private String name;
    private int salary;
    private int executiveCompensation;
    private List<Object> subordinate;

    public President(String name, int salary, int executiveCompensation) {
        this.name = name;
        this.salary = salary;
        this.executiveCompensation = executiveCompensation;
        this.subordinate = new ArrayList<>();
    }

    public void addSubordinate(Object object) {
        subordinate.add(object);
    }

    private void showEmployeeInfo() {
        System.out.println(
            "役職：社長、氏名：" + this.name
            + "、給料：" + this.salary
            + "、役員報酬：" + this.executiveCompensation
        );
    }

    public void showEmployeeListInfo() {
        showEmployeeInfo();
        Iterator<Object> iterator = this.subordinate.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            if (obj instanceof Manager manager) {
                manager.showEmployeeListInfo();
            } else if (obj instanceof SectionChief sectionChief) {
                sectionChief.showEmployeeListInfo();
            } else if (obj instanceof Employee employee) {
                employee.showEmployeeInfo();
            } else {
                System.out.println("存在しない役職の社員です。");
            }
        }
    }
}
