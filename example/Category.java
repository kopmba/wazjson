public class Category extends Entity<Category> {
    private String name;
    private String description;

    public Category() {
        setProperties(new String[]{"name", "description"});
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "{\\" +
                        "\\name : \\" + name + ", \\" +
                        "\\description : \\" + description + "\\" +
                    "\\}";
    }

    public String content() {
        return "{" +
                UtilFormat.jsonFormatProperty("name") +  UtilFormat.propertyValueFormat(name) + ", " +
                UtilFormat.jsonFormatProperty("description")+ UtilFormat.propertyValueFormat(description) +
                "}";
    }

    @Override
    public String content(String ...properties) {
        return "{" +
                UtilFormat.jsonFormatProperty(properties[0]) +  UtilFormat.propertyValueFormat(name) + ", " +
                UtilFormat.jsonFormatProperty(properties[1])+ UtilFormat.propertyValueFormat(description) +
                "}";
    }
}
