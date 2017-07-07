package ci.sample.toandoan.mvpsample.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import ci.sample.toandoan.mvpsample.R;
import ci.sample.toandoan.mvpsample.data.model.Task;
import ci.sample.toandoan.mvpsample.data.source.task.TaskRepository;
import ci.sample.toandoan.mvpsample.data.source.task.local.TaskLocalDataSource;
import ci.sample.toandoan.mvpsample.data.source.task.remote.TaskRemoteDataSource;

public class MainActivity extends AppCompatActivity
        implements MainContract.View, View.OnClickListener {
    private MainContract.Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter = new MainPresenter(this,
                new TaskRepository(new TaskLocalDataSource(), new TaskRemoteDataSource()));
        findViewById(R.id.button_add_task).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_add_task:
                mPresenter.addTask();
                break;
            default:
                break;
        }
    }

    @Override
    public void onAddTaskSuccess(Task task) {
        // TODO: 7/7/17
    }

    @Override
    public void onAddTaskFailed(String msg) {
        // TODO: 7/7/17
    }
}
