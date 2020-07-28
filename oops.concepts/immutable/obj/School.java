package immutable.obj;

public class School {
    int id;
    int age;

    School(int idValue, int ageValue) {
        this.id = idValue;
        this.age = ageValue;
    }

    @Override
    public String toString() {
        return "School{" +
                "id=" + id +
                ", age=" + age +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
