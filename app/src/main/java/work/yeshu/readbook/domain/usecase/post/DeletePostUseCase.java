package work.yeshu.readbook.domain.usecase.post;

import work.yeshu.readbook.domain.repository.PostRepository;
import work.yeshu.readbook.domain.usecase.type.CompletableUseCase;

/**
 * Created by yeshu on 2017/9/8.
 */

public class DeletePostUseCase implements CompletableUseCase {

    private PostRepository mPostRepository;
    private long mId;

    public DeletePostUseCase(PostRepository postRepository) {
        mPostRepository = postRepository;
    }

    @Override
    public void execute(Callback callback) {
        if (mPostRepository.deletePost(mId)) {
            callback.onSuccess();
        } else {
            callback.onError(new Exception("delete post failed"));
        }
    }
}
