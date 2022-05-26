public class Contacts {
    private String name;
    private String phoneNumber;

    public Contacts(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    private void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void changeName(String newName){
        setName(newName);
    }

    public void modifyPhoneNumber(String newPhoneNumber){
        setPhoneNumber(newPhoneNumber);
    }

    public void modifyName(String name){
        setName(name);
    }
}
