package work.yeshu.readbook.ui.base;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import work.yeshu.readbook.R;

/**
 * Created by yeshu on 2017/9/6.
 */

public class BaseTitleActivity extends BaseActivity {
    private LinearLayout mRoot;
    private ImageView mBtnBack;
    private TextView mTextTitle;
    private ImageView mBtnRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_base_title);
        mRoot = (LinearLayout) findViewById(R.id.root);
        mBtnBack = (ImageView) findViewById(R.id.btn_back);
        mTextTitle = (TextView) findViewById(R.id.text_title);
        mBtnRight = (ImageView) findViewById(R.id.btn_right);
    }


    @Override
    public void setContentView(int layoutResID) {
        View view = getLayoutInflater().inflate(layoutResID, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        mRoot.addView(view, layoutParams);
    }

    protected void setTitle(String title) {
        mTextTitle.setText(title);
    }
}
