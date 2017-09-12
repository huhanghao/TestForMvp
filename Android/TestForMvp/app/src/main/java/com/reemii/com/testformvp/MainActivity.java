package com.reemii.com.testformvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, IUserView {
    private TextView tvID;
    private TextView tvFirstName;
    private TextView tvLastName;
    private UserPresenter presenter;
    private View tvLoad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvID = (TextView) findViewById(R.id.tv_id);
        tvFirstName = (TextView) findViewById(R.id.tv_first_name);
        tvLastName = (TextView) findViewById(R.id.tv_last_name);
        tvLoad = findViewById(R.id.tv_load);
        tvLoad.setOnClickListener(this);

        presenter = new UserPresenter(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_load:
                presenter.loadUser(getID());
                break;
            default:
                break;
        }
    }

    @Override
    public int getID() {
        return new Integer( tvID.getText().toString());
    }

    @Override
    public void setFirstName(String firstName) {
        tvFirstName.setText(firstName);
    }

    @Override
    public void setLastName(String lastName) {
        tvLastName.setText(lastName);
    }
}
