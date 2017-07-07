package ci.sample.toandoan.mvpsample.data.source.task;

import ci.sample.toandoan.mvpsample.data.model.Task;
import java.util.List;

/**
 * Created by framgia on 7/7/17.
 */

public class TaskRepository implements TaskDataSource {
    private TaskDataSource mLocalDataSource;
    private TaskDataSource mRemoteDataSource;

    public TaskRepository(TaskDataSource localDataSource, TaskDataSource remoteDataSource) {
        mLocalDataSource = localDataSource;
        mRemoteDataSource = remoteDataSource;
    }

    @Override
    public void addTask(Task task, Callback<Boolean> callback) {
        mLocalDataSource.addTask(task, callback);
        mRemoteDataSource.addTask(task, callback);
    }

    @Override
    public void editTask(Task task, Callback<Boolean> callback) {
        mLocalDataSource.editTask(task, callback);
        mRemoteDataSource.editTask(task, callback);
    }

    @Override
    public void deleteTask(Task task, Callback<Boolean> callback) {
        //// TODO: 7/7/17
    }

    @Override
    public void finishTask(Task task, Callback<Boolean> callback) {
        // TODO: 7/7/17
    }

    @Override
    public void getTasks(final Callbacks<Task> callbacks) {
        mLocalDataSource.getTasks(new Callbacks<Task>() {
            @Override
            public void onSuccessFull(List<Task> data) {
                callbacks.onSuccessFull(data);
            }

            @Override
            public void onFailed(String msg) {
                mRemoteDataSource.getTasks(callbacks);
            }
        });
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
