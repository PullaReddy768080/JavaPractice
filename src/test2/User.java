package test2;


import java.util.List;

public class User {
    private int id;
    private String name;
    private String contactNo;
    private String address;
    private String panCard;
    private List<Message> messageList;


    public User(int id, String name, String contactNo, String address, String panCard, List<Message> messageList) {
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
        this.address = address;
        this.panCard = panCard;
        this.messageList = messageList;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", address='" + address + '\'' +
                ", panCard='" + panCard + '\'' +
                ", messageList=" + messageList +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPanCard() {
        return panCard;
    }

    public void setPanCard(String panCard) {
        this.panCard = panCard;
    }

    public List<Message> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<Message> messageList) {
        this.messageList = messageList;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



}
