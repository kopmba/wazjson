package main;

import java.util.Set;

public class UtilFormat<T> {

    public static String propertyValueFormat(String value) {
        return String.valueOf('"').concat(value).concat(String.valueOf('"'));
    }
    public static String jsonFormatProperty(String property) {
        return String.valueOf('"').concat(property).concat(String.valueOf('"')).concat(": ");
    }

    public static String jsonFormatArrayProperty(Set<String> array) {
        StringBuilder sb = new StringBuilder("[");
        for(int i = 0; i < array.size(); i++) {
            sb.append(String.valueOf('"')
                    .concat(array.toArray()[i].toString())
                    .concat(String.valueOf('"')));
            if(i < array.size()-1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static String jsonFormatObjectProperty(Entity e) {
        return e.content(e.getProperties());
    }

    public static String jsonFormatArrayObjectProperty(Set array) {
        StringBuilder sb = new StringBuilder("[");
        for(int i = 0; i < array.size(); i++) {
            Entity e = (Entity) array.toArray()[i];
            sb.append(e.content(e.getProperties()));
            if(i < array.size()-1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
