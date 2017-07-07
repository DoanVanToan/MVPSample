package ci.sample.toandoan.mvpsample.main;

import ci.sample.toandoan.mvpsample.data.model.Task;
import ci.sample.toandoan.mvpsample.data.source.task.TaskDataSource;

/**
 * Created by framgia on 7/7/17.
 */

public class MainPresenter implements MainContract.Presenter {
    private MainContract.View mView;
    private TaskDataSource mTaskRepository;

    public MainPresenter(MainContract.View view, TaskDataSource taskRepository) {
        mView = view;
        mTaskRepository = taskRepository;
    }

    @Override
    public void addTask() {
        final Task task = new Task("DEFAULT");
        mTaskRepository.addTask(task, new TaskDataSource.Callback<Boolean>() {
            @Override
            public void onSuccessFull(Boolean data) {
                mView.onAddTaskSuccess(task);
            }

            @Override
            public void onFailed(String msg) {
                mView.onAddTaskFailed(msg);
            }
        });
    }
}
