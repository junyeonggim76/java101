package day08;

public class Member {
    private String id;
    private String password;
    private String name;
    private String adress;
    private String phonenumber;

    void registerMember(String id, String phonenumber, String adress, String name, String password) {
        this.id = id;
        this.phonenumber = phonenumber;
        this.adress = adress;
        this.name = name;
        this.password = password;
    }
}
