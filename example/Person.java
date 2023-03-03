import java.util.Set;

public class Person extends Entity<Person> {
    private int id;
    private String name;
    private Set<String> phones;

    public Person() {
        setProperties(new String[]{"id", "name", "phones"});
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getPhones() {
        return phones;
    }

    public void setPhones(Set<String> phones) {
        this.phones = phones;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phones=" + phones +
                '}';
    }

    public String content() {
        return "{" +
                UtilFormat.jsonFormatProperty("id") +  id + ", " +
                UtilFormat.jsonFormatProperty("name")+ name + ", " +
                UtilFormat.jsonFormatProperty("name")+ name +
                "}";
    }

    @Override
    public String content(String... properties) {
        return "{" +
                UtilFormat.jsonFormatProperty(properties[0]) +  id + ", " +
                UtilFormat.jsonFormatProperty(properties[1]) + UtilFormat.propertyValueFormat(name) + ", " +
                UtilFormat.jsonFormatProperty(properties[2]) + UtilFormat.jsonFormatArrayProperty(phones) +
                "}";
    }
}
