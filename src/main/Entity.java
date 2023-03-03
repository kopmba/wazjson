package main;

public abstract class Entity<T> {

    
    String[] properties;
    public abstract String content(String ...properties);
    public String[] getProperties() {
        return properties;
    }
    public void setProperties(String[] properties) {
        this.properties = properties;
    }
}
