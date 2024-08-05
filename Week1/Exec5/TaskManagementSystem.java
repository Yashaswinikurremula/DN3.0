package Exec5;

public class TaskManagementSystem {
    private Node head;

    private class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public Task searchTaskById(String taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.getTaskId().equals(taskId)) {
                return current.task;
            }
            current = current.next;
        }
        return null; 
    }


    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }


    public void deleteTaskById(String taskId) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.task.getTaskId().equals(taskId)) {
            head = head.next;
            return;
        }


        Node current = head;
        Node previous = null;
        while (current != null && !current.task.getTaskId().equals(taskId)) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Task not found.");
            return;
        }


        previous.next = current.next;
    }

    public static void main(String[] args) {
        TaskManagementSystem tms = new TaskManagementSystem();

        Task t1 = new Task("T001", "Task One", "Pending");
        Task t2 = new Task("T002", "Task Two", "In Progress");
        Task t3 = new Task("T003", "Task Three", "Completed");

        tms.addTask(t1);
        tms.addTask(t2);
        tms.addTask(t3);

        System.out.println("All Tasks:");
        tms.traverseTasks();

        System.out.println("\nSearching for T002:");
        System.out.println(tms.searchTaskById("T002"));

        System.out.println("\nDeleting T002:");
        tms.deleteTaskById("T002");

        System.out.println("\nAll Tasks after deletion:");
        tms.traverseTasks();
    }
}
