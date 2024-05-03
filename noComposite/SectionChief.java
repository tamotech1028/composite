package noComposite;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
// 係長
public class SectionChief {

    private String name;
    private int salary;
    private int executiveCompensation;
    private List<Employee> subordinate;


    public SectionChief(String name, int salary, int executiveCompensation) {
        this.name = name;
        this.salary = salary;
        this.executiveCompensation = executiveCompensation;
        this.subordinate = new ArrayList<>();
    }

    public void addSubordinate(Employee employee) {
        subordinate.add(employee);
    }

    public String getEmployeeInfo() {
        StringBuilder builder = new StringBuilder();
        String sectionChiefInfo = "役職：係長、氏名：" + this.name + "、給料：" + this.salary + "、役員報酬：" + this.executiveCompensation + "\n";
        builder.append(sectionChiefInfo);
        
        Iterator<Employee> iterator = this.subordinate.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            builder.append("      " + employee.getEmployeeInfo());
        }
        return builder.toString();
    }
}
