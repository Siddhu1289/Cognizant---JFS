public class TaskManagementSystem {

    public static void main(String[] args) {

        TaskLinkedList list = new TaskLinkedList();

        list.addTask(new Task(101, "Design Database", "Pending"));
        list.addTask(new Task(102, "Develop Login Module", "In Progress"));
        list.addTask(new Task(103, "Testing", "Completed"));

        System.out.println("Task List:");
        list.displayTasks();

        System.out.println("\nSearching Task 102:");

        Task task = list.searchTask(102);

        if (task != null) {
            task.display();
        } else {
            System.out.println("Task Not Found");
        }

        System.out.println("\nDeleting Task 101");

        list.deleteTask(101);

        System.out.println("\nUpdated Task List:");

        list.displayTasks();
    }
}