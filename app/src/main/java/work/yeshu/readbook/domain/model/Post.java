package work.yeshu.readbook.domain.model;

/**
 * Created by yeshu on 2017/9/7.
 */

public class Post {
    public long id;
    public String quote;
    public String comment;

    public Post(long id, String quote, String comment) {
        this.id = id;
        this.quote = quote;
        this.comment = comment;
    }
}
