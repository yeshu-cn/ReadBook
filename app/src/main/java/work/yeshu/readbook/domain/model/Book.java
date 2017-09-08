package work.yeshu.readbook.domain.model;

/**
 * Created by yeshu on 2017/9/6.
 */

public class Book {
    public long id;
    public String name;
    public String desc;
    public String picture;

    public Book(long id, String name, String desc, String picture) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.picture = picture;
    }




}
