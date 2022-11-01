import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("WOW that's awesome");
        Post p1 = new Post(sdf.parse("01/11/2022 13:05:47"),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country!", 12);
        p1.addComment(c1);
        p1.addComment(c2);


        Comment c3 = new Comment("Good night!");
        Comment c4 = new Comment("May the force be with you!");
        Comment c5 = new Comment("Happy halloween!");
        Post p2 = new Post(sdf.parse("31/10/2022 22:00:30"),
                "Good night guys",
                "See you tomorrow", 7);
        p2.addComment(c3);
        p2.addComment(c4);
        p2.addComment(c5);

        System.out.println(p1);
        System.out.println(p2);

    }
}