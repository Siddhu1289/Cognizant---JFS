public class TaskLinkedList {

    private Node head;

    // Add Task
    public void addTask(Task task) {

        Node newNode = new Node(task);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Search Task
    public Task searchTask(int id) {

        Node current = head;

        while (current != null) {

            if (current.task.getTaskId() == id) {
                return current.task;
            }

            current = current.next;
        }

        return null;
    }

    // Delete Task
    public void deleteTask(int id) {

        if (head == null)
            return;

        if (head.task.getTaskId() == id) {
            head = head.next;
            System.out.println("Task Deleted.");
            return;
        }

        Node current = head;

        while (current.next != null &&
                current.next.task.getTaskId() != id) {

            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            System.out.println("Task Deleted.");
        } else {
            System.out.println("Task Not Found.");
        }
    }

    // Display Tasks
    public void displayTasks() {

        Node current = head;

        while (current != null) {
            current.task.display();
            current = current.next;
        }
    }
}