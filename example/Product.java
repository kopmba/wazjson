import java.util.Date;
import java.util.Set;

public class Product extends Entity<Product> {
    private String name;
    private Date releaseDate;
    private Person owner;
    private Set<Category> tags;

    public Product() {
        setProperties(new String[]{"name", "releaseDate", "owner", "tags"});
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Set<Category> getTags() {
        return tags;
    }

    public void setTags(Set<Category> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", releaseDate=" + releaseDate +
                ", owner=" + owner +
                ", tags=" + tags +
                '}';
    }

    @Override
    public String content(String... properties) {
        return "{" +
                UtilFormat.jsonFormatProperty(properties[0]) +  UtilFormat.propertyValueFormat(name) + ", " +
                UtilFormat.jsonFormatProperty(properties[1]) + UtilFormat.propertyValueFormat(releaseDate.toString()) + ", " +
                UtilFormat.jsonFormatProperty(properties[2]) + UtilFormat.jsonFormatObjectProperty(owner) + ", " +
                UtilFormat.jsonFormatProperty(properties[3]) + UtilFormat.jsonFormatArrayObjectProperty(tags) +
                "}";
    }


}
