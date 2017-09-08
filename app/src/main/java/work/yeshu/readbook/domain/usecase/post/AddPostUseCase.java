package work.yeshu.readbook.domain.usecase.post;

import work.yeshu.readbook.domain.repository.PostRepository;
import work.yeshu.readbook.domain.usecase.type.CompletableUseCase;

/**
 * Created by yeshu on 2017/9/7.
 * 有多个参数怎么办
 */

public class AddPostUseCase implements CompletableUseCase {

    private PostRepository mRepository;
    private String mQuote;
    private String mComment;

    public AddPostUseCase(PostRepository repository, String quote, String comment) {
        mRepository = repository;
        mQuote = quote;
        mComment = comment;
    }

    @Override
    public void execute(Callback callback) {
        if (mRepository.addPost(mQuote, mComment) > 0) {
            callback.onSuccess();
        } else {
            callback.onError(new Exception("post add failed"));
        }
    }
}
