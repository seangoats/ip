package parser;

import constant.Constants;
import exception.EmptyCommandException;
import exception.InvalidCommandException;
import exception.UnknownCommandException;
import task.Task;

/**
 * Represents a class that parses the input to get a Task subclass.
 */
public class TaskParser {
    /**
     * Processes the input, and calls the relevant parser to return the relevant Task subclass Object.
     * @param input The full input entered by the user.
     * @return Task subclass Object, either DeadLine, Event or ToDo.
     * @throws UnknownCommandException If the input does not contain the string corresponding to any of the tasks.
     */
    public static Task processTaskToAdd(String input) throws UnknownCommandException {
        try {
            if (input.contains(Constants.STRING_TASK_TODO)) {
                return ToDoParser.processToDo(input);
            } else if (input.contains(Constants.STRING_TASK_DEADLINE)) {
                return DeadlineParser.processDeadline(input);
            } else if (input.contains(Constants.STRING_TASK_EVENT)) {
                return EventParser.processEvent(input);
            } else {
                throw new UnknownCommandException();
            }
        } catch (EmptyCommandException e) {
            System.out.println(e.getMessage());
            return null;
        } catch (InvalidCommandException e) {
            System.out.println(e.getMessage());
            return null;
        }

    }
}
