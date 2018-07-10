package cn.linhome.lib.statelayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;


public class SDStateView extends FrameLayout
{
    public SDStateView(Context context)
    {
        super(context);
    }

    public SDStateView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }

    public SDStateView(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
    }

    public SDStateView setContentView(int layoutId)
    {
        removeAllViews();
        LayoutInflater.from(getContext()).inflate(layoutId, this, true);
        return this;
    }
}
