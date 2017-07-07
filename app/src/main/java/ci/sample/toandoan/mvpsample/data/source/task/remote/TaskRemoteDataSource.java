package ci.sample.toandoan.mvpsample.data.source.task.remote;

import ci.sample.toandoan.mvpsample.data.model.Task;
import ci.sample.toandoan.mvpsample.data.source.task.TaskDataSource;

/**
 * Created by framgia on 7/7/17.
 */

public class TaskRemoteDataSource implements TaskDataSource {
    @Override
    public void addTask(Task task, Callback<Boolean> callback) {
        // TODO: 7/7/17
    }

    @Override
    public void editTask(Task task, Callback<Boolean> callback) {

    }

    @Override
    public void deleteTask(Task task, Callback<Boolean> callback) {

    }

    @Override
    public void finishTask(Task task, Callback<Boolean> callback) {

    }

    @Override
    public void getTasks(Callbacks<Task> callbacks) {

    }

    @Override
    public void getTaskById(int id, Callback<Task> callback) {

    }

    @Override
    public void getTaskByName(String taskName, Callbacks<Task> callbacks) {

    }
}
