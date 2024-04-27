package noComposite;

public class Main {
    public static void main(String[] args) {
        President president = new President("前田", 100, 15);
        Manager manager1 = new Manager("田中", 90, 10);
        Manager manager2 = new Manager("佐藤", 90, 10);
        SectionChief sectionChief1 = new SectionChief("鈴木", 80, 5);
        SectionChief sectionChief2 = new SectionChief("中野", 80, 5);
        SectionChief sectionChief3 = new SectionChief("藤井", 80, 5);
        SectionChief sectionChief4 = new SectionChief("荒木", 80, 5);
        Employee employee1 = new Employee("斉藤", 50);
        Employee employee2 = new Employee("藤本", 50);
        Employee employee3 = new Employee("河村", 50);
        Employee employee4 = new Employee("森田", 50);
        Employee employee5 = new Employee("大谷", 50);
        Employee employee6 = new Employee("山本", 50);
        Employee employee7 = new Employee("松井", 50);
        Employee employee8 = new Employee("藤浪", 50);
        Employee employee9 = new Employee("千賀", 50);
        Employee employee10 = new Employee("河合", 50);
        Employee employee11 = new Employee("中西", 50);

        president.addSubordinate(manager1);
        president.addSubordinate(manager2);
        president.addSubordinate(employee10);

        manager1.addSubordinate(sectionChief1);
        manager1.addSubordinate(sectionChief2);
        manager1.addSubordinate(employee11);

        manager2.addSubordinate(sectionChief3);
        manager2.addSubordinate(sectionChief4);

        sectionChief1.addMember(employee1);
        sectionChief1.addMember(employee2);
        sectionChief1.addMember(employee3);

        sectionChief2.addMember(employee4);
        sectionChief2.addMember(employee5);

        sectionChief3.addMember(employee6);
        sectionChief3.addMember(employee7);

        sectionChief4.addMember(employee8);
        sectionChief4.addMember(employee9);

        president.showEmployeeListInfo();
    }
}
