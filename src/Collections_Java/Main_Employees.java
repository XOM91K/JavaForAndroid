package Collections_Java;

public class Main_Employees {
    public static void main(String[] args) {
        // Получить список сотрудников
        String[] employees = getEmployees();
        for (String employee : employees) {
            System.out.println(employee);
        }
        System.out.println("=====");
        //Удалить последнего сотрудника
        employees[employees.length-1] = null;
        String[] defmas = new String[employees.length - 1];
        for (int i = 0; i < defmas.length; i++) {
            defmas[i] = employees[i];
        }
        for (String employee : defmas) {
            System.out.println(employee);
        }
    }
    public static String[] getEmployees(){
        String[] employees = new String[5];
        employees[0] = "John";
        employees[1] = "Jane";
        employees[2] = "Jack";
        employees[3] = "Jill";
        employees[4] = "Joe";
        return employees;
    }
}
