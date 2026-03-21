package Question_OOPs.encap.emp;

public class empclass {
    public static void main(String[] args) {
        employee em = new employee("Swayam", 20, 10000);
        System.out.println(em.getName());
        em.setName("Doreamon");
        System.out.println(em.display());
        System.out.println(em.getSalary());
        em.setSalary(100000);
        System.out.println(em.getSalary());
        System.out.println(em.display());
    }
}
