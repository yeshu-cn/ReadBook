package work.yeshu.readbook.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import work.yeshu.readbook.R;

/**
 * Created by yeshu on 2017/9/8.
 */

public class BookFragment extends Fragment {

    private RecyclerView mRecycleView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_book, container, false);

        mRecycleView = (RecyclerView) view.findViewById(R.id.recycle_view);
        return view;
    }
}
