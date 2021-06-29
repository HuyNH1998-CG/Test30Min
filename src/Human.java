public class Human {
    private String name;
    private int age;
    private String gender;
    private String phonenumber;

    public Human(String name, int age, String gender, String phonenumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phonenumber = phonenumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String display() {
        return name + "," +
                age + "," +
                gender + "," +
                phonenumber;
    }
}
