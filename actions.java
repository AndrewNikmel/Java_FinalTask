public class actions {
    public static void main(String[] args) {
        Set<Notebook> set = new HashSet<>();
        set.add(new noteBooks("Notebook 1", 8, "Windows10", 80000, "HP"));
        set.add(new noteBooks("Notebook 2", 16, "Windows10", 85000, "Asus"));
        set.add(new noteBooks("Notebook 3", 32, "linux", 85000, "Lenovo"));
        set.add(new noteBooks("Notebook 4", 64, "linux", 90000, "Lenovo"));

        actions operation = new actions(set);
        operation.start();
    }
}
