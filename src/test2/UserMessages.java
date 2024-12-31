package test2;

import java.util.*;

public class UserMessages {
    public static void main(String[] args) {


        //int id, String name, String contactNo, String address, String panCard, List<Message> messageList

        Message message1 = new Message(1, 1, 2, "Hi");
        Message message2 = new Message(2, 1, 3, "Hi");
        Message message3 = new Message(3, 1, 4, "Hello");
        Message message4 = new Message(4, 1, 5, "Hello");
        Message message5 = new Message(5, 2, 1, "Hi");
        Message message6 = new Message(6, 2, 3, "Hi");
        Message message7 = new Message(7, 2, 4, "Hi");
        Message message8 = new Message(8, 2, 5, "Hello");
        Message message9 = new Message(9, 3, 1, "Hello");
        Message message10 = new Message(10, 3, 2, "Hi");
        Message message11 = new Message(11, 3, 4, "Hi");
        Message message12 = new Message(12, 3, 5, "Hi");
        Message message13 = new Message(13, 4, 1, "Hello");
        Message message14 = new Message(14, 4, 2, "Hello");
        Message message15 = new Message(15, 4, 3, "Hi");
        Message message16 = new Message(16, 4, 5, "Hi");
        Message message17 = new Message(17, 5, 1, "Hi");
        Message message18 = new Message(18, 5, 2, "Hello");
        Message message19 = new Message(19, 5, 3, "Hello");
        Message message20 = new Message(20, 5, 4, "Hi");
        Message message21 = new Message(21, 0, 0, "Hi");
        Message message22 = new Message(22, 0, 0, "Hello");


        List<Message> messages = new ArrayList<>();
        messages.add(message1);
        messages.add(message2);
        messages.add(message3);
        messages.add(message4);
        messages.add(message5);
        messages.add(message6);
        messages.add(message7);
        messages.add(message8);
        messages.add(message9);
        messages.add(message10);
        messages.add(message11);
        messages.add(message12);
        messages.add(message13);
        messages.add(message14);
        messages.add(message15);
        messages.add(message16);
        messages.add(message17);
        messages.add(message18);
        messages.add(message19);
        messages.add(message20);
        messages.add(message21);
        messages.add(message22);


        System.out.println("messages: "+messages);




        User user1 = new User(1, "user1", "1122332211", "", "", new ArrayList<>());

        User user2 = new User(2, "user2", "1122334311", "", "", new ArrayList<>());
        User user3 = new User(3, "user3", "11223321", "", "", new ArrayList<>());

        User user4 = new User(4, "user4", "11223311", "", "", new ArrayList<>());

        User user5 = new User(5, "user5", "1124311", "", "", new ArrayList<>());

        List<User> users = new ArrayList<>();

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);

        System.out.println("\nusers: "+ users);





        for (User user : users) {
            List<Message> messageList = new ArrayList<>();

            for (Message message : messages) {
                if (user.getId() == message.getSenderId()) {
                    messageList.add(message);
                }
                user.setMessageList(messageList);


            }


            System.out.println("\nSenderMessageList : "+ user.getMessageList());
            System.out.println("\nUserSenderList: "+user);


        }


        for (User user : users) {
            List<Message> messageList = new ArrayList<>();

            for (Message message : messages) {
                if (user.getId() == message.getReceiverId()) {
                    messageList.add(message);
                }
                user.setMessageList(messageList);


            }

            System.out.println("\nReceiverMessageList :" + user.getMessageList());
            System.out.println("\nUserReceiverList: "+ user);


        }



        for (User user : users) {
            List<Message> messageList = new ArrayList<>();

            for (Message message : messages) {
                if (user.getId() == message.getSenderId() || user.getId() == message.getReceiverId()) {
                    messageList.add(message);
                }
                user.setMessageList(messageList);


            }

            System.out.println("\nSender&ReceiverMessageList: " + user.getMessageList());
            System.out.println("\nUserSender&ReceiverMessageList: "+user);


        }


        System.out.println("DummyList");

        List<Message> dummyMessageList = new ArrayList<>();
        for (Message message : messages) {
            if (message.getSenderId()==0 || message.getReceiverId()==0 )
            {
                dummyMessageList.add(message);
            }




        }
        System.out.println("\nDummyList: " + dummyMessageList);


    }
}





