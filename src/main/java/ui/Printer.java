package ui;

import task.Task;

import java.util.ArrayList;
import java.util.Arrays;

public class Printer {

    private static final String LOGO = " ____        _        \n"
            + "|  _ \\ _   _| | _____ \n"
            + "| | | | | | | |/ / _ \\\n"
            + "| |_| | |_| |   <  __/\n"
            + "|____/ \\__,_|_|\\_\\___|\n";

    public static void printStartUpMessage() {
        System.out.println(LOGO);
        System.out.println("____________________________________________________________");
        System.out.println("Hello I'm Duke");
        System.out.println("What can I do for you?");
        System.out.println("____________________________________________________________");
    }

    public static void printExitMessage() {
        System.out.println("____________________________________________________________");
        System.out.println("Bye. Hope to see you again soon!");
        System.out.println("____________________________________________________________");
    }

    public static void printTaskList(ArrayList<Task> tasks, int taskCount) {
        System.out.println("____________________________________________________________");
        System.out.println("Here are the tasks in your list:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, tasks.get(i));
        }
        System.out.println("____________________________________________________________");
    }

    public static void addTaskSuccessfulMessage(Task taskToAdd, int taskCount) {
        System.out.println("____________________________________________________________");
        System.out.println("Got it. I've added this task:");
        System.out.println(taskToAdd);
        System.out.println("Now you have " + taskCount + " tasks in the list.");
        System.out.println("____________________________________________________________");
    }

    public static void taskMarkedAsDoneMessage(Task taskToMarkDone) {
        System.out.println("____________________________________________________________");
        System.out.println("Nice! I've marked this task as done:");
        System.out.println(taskToMarkDone);
        System.out.println("____________________________________________________________");
    }

    public static void deleteTaskSuccessfulMessage(Task taskToDelete, int taskCount) {
        System.out.println("____________________________________________________________");
        System.out.println("Noted. I've removed this task.");
        System.out.println(taskToDelete);
        System.out.println("Now you have " + taskCount + " tasks in the list.");
        System.out.println("____________________________________________________________");
    }

    public static void taskIndexOutOfBoundsMessage() {
        System.out.println("____________________________________________________________");
        System.out.println("The index you entered is out of bounds, please enter a valid index.");
        System.out.println("____________________________________________________________");
    }

    public static void keyWordCannotBeEmptyMessage() {
        System.out.println("____________________________________________________________");
        System.out.println("Keyword for find command cannot be empty");
        System.out.println("____________________________________________________________");
    }

    public static void printNoMatchingTasks(String keyword) {
        System.out.println("____________________________________________________________");
        System.out.println("No tasks matching with " + keyword + " was found in your task list.");
        System.out.println("____________________________________________________________");
    }

    public static void printMatchingTaskList(ArrayList<Task> matchingTasks) {
        System.out.println("____________________________________________________________");
        System.out.println("Here are the matching tasks in your list:");
        for (int i = 0; i < matchingTasks.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, matchingTasks.get(i));
        }
        System.out.println("____________________________________________________________");
    }
}
