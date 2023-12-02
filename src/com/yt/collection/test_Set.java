package com.yt.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class test_Set {
    public static void main(String[] args) {
        List<Message> received = List.of(

                new Message(1, "Hello!"),
                new Message(2, "今天发工资了吗？"),
                new Message(2, "今天发工资了吗？"),
                new Message(3, "去哪里吃饭"),
                new Message(3, "去哪里吃饭"),
                new Message(4, "再见"),
                new Message(5, "Bye,看到请回复")
        );
        for(Message message : received) {
            System.out.println(message.sequence + ", " + message.text);
        }

        System.out.println("********** 去重之后 **********");

        List<Message> messageSet = precess(received);

        for(Message ms : messageSet) {
            System.out.println(ms.sequence + ", " + ms.text);
        }

    }
    public static List<Message> precess(List<Message> received) {
        List<Message> ret = new ArrayList<>();

        Set<Integer> set = new HashSet<>();

        for(Message message : received) {


            if(!set.contains(message.sequence)) {
                ret.add(message);
                set.add(message.sequence);
            }

        }

        return ret;

    }
}


class Message {
    public final int sequence;
    public final String text;
    public Message(int sequence, String text) {
        this.sequence = sequence;
        this.text = text;
    }
}
