package kirill.helper;
import java.util.LinkedList;

public class LLTasksHw4 {

    public static LinkedList<Object> revert(LinkedList<Object> ll) {
        LinkedList<Object> revertList = new LinkedList<>();
        for (Object item: ll) {
            revertList.addFirst(item);
        }
        return revertList;
    }
}
