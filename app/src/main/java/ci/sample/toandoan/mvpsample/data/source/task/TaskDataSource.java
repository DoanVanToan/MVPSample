package ci.sample.toandoan.mvpsample.data.source.task;

import ci.sample.toandoan.mvpsample.data.model.Task;
import java.util.List;

/**
 * Created by framgia on 7/7/17.
 */

public interface TaskDataSource {
    void addTask(Task task, Callback<Boolean> callback);

    void editTask(Task task, Callback<Boolean> callback);

    void deleteTask(Task task, Callback<Boolean> callback);

    void finishTask(Task task, Callback<Boolean> callback);

    void getTasks(Callbacks<Task> callbacks);

    void getTaskById(int id, Callback<Task> callback);

    void getTaskByName(String taskName, Callbacks<Task> callbacks);

    interface Callback<T> {
        void onSuccessFull(T data);

        void onFailed(String msg);
    }

    interface Callbacks<T> {

        void onSuccessFull(List<T> data);

        void onFailed(String msg);
    }
}
