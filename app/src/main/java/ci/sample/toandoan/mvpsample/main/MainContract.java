package ci.sample.toandoan.mvpsample.main;

import ci.sample.toandoan.mvpsample.data.model.Task;

/**
 * Created by framgia on 7/7/17.
 */

public interface MainContract {
    interface View {

        void onAddTaskSuccess(Task task);

        void onAddTaskFailed(String msg);
    }

    interface Presenter {

        void addTask();
    }
}
