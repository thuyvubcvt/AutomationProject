package tests.models;

public class TextBoxEntity {
    private String userName ;


    private String userEmail ;
    private String currentAddress ;
    private String permanentAddress;

    public TextBoxEntity(String userName, String userEmail, String currentAddress, String permanentAddress) {
        this.userEmail = userEmail;
        this.userName = userName;
        this.currentAddress = currentAddress;
        this.permanentAddress = permanentAddress;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

}
