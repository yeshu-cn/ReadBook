package work.yeshu.readbook.domain.repository;

import java.util.List;

import work.yeshu.readbook.domain.model.Post;

/**
 * Created by yeshu on 2017/9/7.
 * post repository
 */

public interface PostRepository {

    long addPost(String quote, String comment);

    boolean deletePost(long id);

    List<Post> getPostList();

    void updatePost(long id, String quote, String comment);
}
