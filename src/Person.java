/**
 * Created by Lenovo on 22.07.2017.
 */
public class Person implements Comparable<Person>{
    private int age;
    private String name;


    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    // zwracamy 0 gdy obiekty są takie same (mają być na równi z sobą)
    // zwracamy 1 gdy coś ma pójść niżej niż coś
    // zwracamy -1 gdy coś ma pójść wyżej niż coś
    @Override
    public int compareTo(Person o) {
        if(age == o.getAge() ){
            return  name.compareTo(o.getName());
        }else if(age > o.getAge()){
            return 1;
        }
        return -1;
    }
}
