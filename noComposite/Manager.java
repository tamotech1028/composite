package noComposite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
// 部長
public class Manager {

    private String name;
    private int salary;
    private int executiveCompensation;
    private List<Object> subordinate;

    public Manager(String name, int salary, int executiveCompensation) {
        this.name = name;
        this.salary = salary;
        this.executiveCompensation = executiveCompensation;
        this.subordinate = new ArrayList<>();
    }

    public void addSubordinate(Object object) {
        subordinate.add(object);
    }

    public String getEmployeeInfo() {
        StringBuilder builder = new StringBuilder();
        String managerInfo = "役職：部長、氏名：" + this.name + "、給料：" + this.salary + "、役員報酬：" + this.executiveCompensation + "\n";
        builder.append(managerInfo);

        Iterator<Object> iterator = this.subordinate.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            if (obj instanceof SectionChief sectionChief ) {
                builder.append("    " + sectionChief.getEmployeeInfo());
            } else if (obj instanceof Employee employee) {
                builder.append("    " + employee.getEmployeeInfo());
            } else {
                System.out.println("存在しない役職の社員です。");
            }
        }
        return builder.toString();
    }
}
