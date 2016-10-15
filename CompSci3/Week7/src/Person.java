
public class Person {

    protected String name;
    protected char sex;
    protected String id;

    public Person() {
    }

    public Person(String name1, char sex1, String id1) {
        name = name1;
        sex = sex1;
        id = id1;
    }

    public Person(String name1) {
        name = name1;
    }

    public Person(String name1, char sex1) {
        name = name1;
        sex = sex1;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public String getId() {
        return id;
    }

    public void setName(String name1) {
        name = name1;
    }

    public void setSex(char sex1) {
        sex = sex1;
    }

    public void setId(String id1) {
        id = id1;
    }

}
