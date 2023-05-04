import java.util.ArrayList;
import java.util.List;

public class Student {
    private final int id;
    private String firstName;
    private String lastName;
    private final List<String> completedTasks;


    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.completedTasks = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTaskDone(String task) {
        completedTasks.add(task);
    }

    public List<String> getCompletedTasks() {
        return new ArrayList<>(completedTasks);
    }
}
