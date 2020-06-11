package com.collect;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CollectTest {


    @Test
    public void test1() {

        User user1 = new User("jack", "123");
        User user2 = new User("tom", "123");
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        User user = userList.stream().filter(e ->
                Objects.equals(e.getUserName(), "jack")
        ).findAny().orElse(null);


    }
}
