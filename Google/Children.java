package Google;

public class Children {
    private String childName;
    private String childDay;

    public Children(String childName, String childDay) {
        this.childName = childName;
        this.childDay = childDay;
    }
    @Override
    public String toString() {
        return String.format("%s %s", childName,childDay);
    }
}
