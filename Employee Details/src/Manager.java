public class Manager extends Employee{

    private Employee[] manages = new Employee[100];
    private int lastFreePosition = 0;

    //number 1, 2, and 3

    public Manager(String lastName, String firstName, int age, Employee[] m) {
        super(lastName, firstName, age);
        for (int i = 0; i < m.length; i++) {
            manages[i] = m[i];
        }
    }

    public void addEmployee(Employee e) {
        manages[lastFreePosition] = e;
        lastFreePosition++;
    }

    //number 9
    public String getEmployeeNames() {
        String name = "";
        for(Employee em: manages) {
            if(em == null) {
                break;
            }
            String x = em.getLastName();
            name = name + " " + x;
        }
        return name;
    }

    public String getDetails() {
        return super.getDetails() + " " + "manages: " + this.getEmployeeNames();
    }

}
