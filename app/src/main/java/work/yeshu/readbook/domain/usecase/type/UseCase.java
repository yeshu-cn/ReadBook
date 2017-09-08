package work.yeshu.readbook.domain.usecase.type;

/**
 * Created by yeshu on 2017/9/6.
 * 一个UseCase只干一件事情
 */

public interface UseCase<T> {

    interface Callback<T> {
        void onSuccess(T result);
        void onError(Throwable throwable);
    }

    //这些callback最好都是在主线程回调，否则得单独说明
    //Rxjava可以很方便得处理线程问题
    void execute(Callback<T> callback);

}
