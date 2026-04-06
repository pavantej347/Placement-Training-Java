class manager {
    public manager() {
        System.out.println("manager data");
        System.out.println("----------");
    }

    public manager(int sal) {
        this();
        System.out.println("manager salary" + sal);
    }

    public manager(float exp) {
        this(930000);
        System.out.println("experiance" + exp);
    }
}

class employee extends manager {
    public employee() {
        super(4.6f);
        System.out.println("employee details");
        System.out.println("--------------");
    }

    public employee(int sal) {
        this();
        System.out.println("employee salary" + sal);
    }

    public employee(String des) {
        this(83000);
        System.out.println("destination" + des);
    }
}

public class this_super {
    public static void main(String[] args) {
        // employee em = new employee();
        // employee me = new employee(800);
        // employee mme = new employee("chennai");
        employee em = new employee("chennai");
    }
}
