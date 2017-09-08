package work.yeshu.readbook.domain.usecase.post;

import java.util.List;

import work.yeshu.readbook.domain.model.Post;
import work.yeshu.readbook.domain.repository.PostRepository;
import work.yeshu.readbook.domain.usecase.type.UseCase;

/**
 * Created by yeshu on 2017/9/8.
 */

public class GetPostListUseCase implements UseCase<List<Post>>{

    private PostRepository mPostRepository;

    public GetPostListUseCase(PostRepository postRepository) {
        mPostRepository = postRepository;
    }

    @Override
    public void execute(Callback<List<Post>> callback) {
        callback.onSuccess(mPostRepository.getPostList());
    }
}
