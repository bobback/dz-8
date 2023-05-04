import java.util.ArrayList;
import java.util.List;

public class Group {
    private Student groupLeader;
    private final List<Student> students = new ArrayList<>();
    private final List<String> tasks = new ArrayList<>();

    public Group(Student groupLeader) {
        this.groupLeader = groupLeader;
    }

    public Student getGroupLeader() {
        return groupLeader;
    }

    public void setGroupLeader(Student groupLeader) {
        this.groupLeader = groupLeader;
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void renameStudent(Student student, String newFirstName, String newLastName) {
        student.setFirstName(newFirstName);
        student.setLastName(newLastName);
    }

    public List<String> getTasks() {
        return new ArrayList<>(tasks);
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void markTaskAsDone(Student student, String task) {
        if (students.contains(student) && tasks.contains(task)) {
            student.setTaskDone(task);
        }
    }
}
