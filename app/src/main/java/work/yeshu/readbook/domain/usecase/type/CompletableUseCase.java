package work.yeshu.readbook.domain.usecase.type;

/**
 * Created by yeshu on 2017/9/6.
 */

public interface CompletableUseCase {

    interface Callback {
        void onSuccess();
        void onError(Throwable throwable);
    }

    void execute(Callback callback);

}
