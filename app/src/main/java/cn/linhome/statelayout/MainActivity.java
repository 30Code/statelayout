package cn.linhome.statelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import cn.linhome.lib.statelayout.FStateLayout;

public class MainActivity extends AppCompatActivity
{
    private FStateLayout mStateLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mStateLayout = (FStateLayout) findViewById(R.id.view_state);
        mStateLayout.getErrorView().setContentView(R.layout.layout_state_error);

        mStateLayout.setContentTop(false);
    }

    public void onClickBtn(View view)
    {
        mStateLayout.showError();
    }
}
