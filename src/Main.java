public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "James", "Smith");
        Student student2 = new Student(2, "Lily", "Brown");

        Group group = new Group(student1);
        group.addStudent(student2);

        group.addTask("Learn encapsulation");
        group.addTask("Write a code");

        group.markTaskAsDone(student1, "Learn encapsulation");
        group.markTaskAsDone(student2, "Write a code");

        System.out.println("Group leader: " + group.getGroupLeader().getFirstName() + " " + group.getGroupLeader().getLastName());
        System.out.println("Students: ");
        for (Student s : group.getStudents()) {
            System.out.println(s.getFirstName() + " " + s.getLastName());
        }

        System.out.println("Tasks: ");
        for (String task : group.getTasks()) {
            System.out.println(task);
        }

        System.out.println("Completed tasks for " + student1.getFirstName() + " " + student1.getLastName() + ":");
        for (String task : student1.getCompletedTasks()) {
            System.out.println(task);
        }

        System.out.println("Completed tasks for " + student2.getFirstName() + " " + student2.getLastName() + ":");
        for (String task : student2.getCompletedTasks()) {
            System.out.println(task);
        }
    }
}
