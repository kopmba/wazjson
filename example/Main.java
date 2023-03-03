import java.sql.Date;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------------------Print Categories----------------------");
        Category cat1 = new Category();
        cat1.setName("categort 1");
        cat1.setDescription("First category");
        System.out.println(cat1.toString());
        System.out.println(cat1.content(cat1.getProperties()));

        Category cat2 = new Category();
        cat2.setName("categort 2");
        cat2.setDescription("Second category");
        System.out.println(cat2.toString());
        System.out.println(cat2.content(cat2.getProperties()));

        System.out.println("--------------------Print Person----------------------");
        Person p = new Person();
        p.setId(1);
        p.setName("John doe");
        Set<String> phones = new HashSet<>();
        phones.add("4565276781");
        phones.add("4556378299");
        p.setPhones(phones);
        System.out.println(p.toString());
        System.out.println(p.content(p.getProperties()));

        System.out.println("--------------------Print Product----------------------");
        Product pr = new Product();
        pr.setName("product 1");
        pr.setReleaseDate(Date.from(Instant.now()));
        pr.setOwner(p);
        Set<Category> tags = new HashSet<>();
        tags.add(cat1);
        tags.add(cat2);
        pr.setTags(tags);
        System.out.println(pr.toString());
        System.out.println(pr.content(pr.getProperties()));
    }
}