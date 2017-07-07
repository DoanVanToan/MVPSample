package ci.sample.toandoan.mvpsample.data.source.task.local;

import ci.sample.toandoan.mvpsample.data.model.Task;
import ci.sample.toandoan.mvpsample.data.source.task.TaskDataSource;

/**
 * Created by framgia on 7/7/17.
 */

public class TaskLocalDataSource implements TaskDataSource {
    @Override
    public void addTask(Task task, Callback<Boolean> callback) {
        callback.onSuccessFull(true);
    }

    @Override
    public void editTask(Task task, Callback<Boolean> callback) {
        // TODO: 7/7/17
    }

    @Override
    public void deleteTask(Task task, Callback<Boolean> callback) {
        // TODO: 7/7/17
    }

    @Override
    public void finishTask(Task task, Callback<Boolean> callback) {
        // TODO: 7/7/17
    }

    @Override
    public void getTasks(Callbacks<Task> callbacks) {
        // TODO: 7/7/17
    }

    @Override
    public void getTaskById(int id, Callback<Task> callback) {
        // TODO: 7/7/17
    }

    @Override
    public void getTaskByName(String taskName, Callbacks<Task> callbacks) {
        // TODO: 7/7/17
    }
}
