package ie.atu.week3;

public class Student {
    String name, email,  id;

    public Student(String name, String email, String id) {
        this.name = name;
        this.email = email;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return id;
    }


    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Student: \n" +
                "Name= " + name + "\n" +
                "Email= " + email + "\n" +
                "ID= " + id + "\n" +
                "----------------------";
    }
}
