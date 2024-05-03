package noComposite;

// 委託
public class Delegate {
    private String name;
    public Delegate(String name) {
        this.name = name;
    }
    public String getEmployeeInfo() {
        return "役職：委託、氏名：" + this.name + "\n";
    }
}
