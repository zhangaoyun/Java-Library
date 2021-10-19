package gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Gson gson = new Gson();
        User user = new User("Bob", 19, "Park");
        System.out.println(gson.toJson(user)); // {"name":"Bob","age":19}

        User user1 = gson.fromJson("{\"name\":\"Bob\",\"age\":19}", User.class);
        System.out.println(user1 == user); // false

        User user2 = new User("Alice", 20, null);
        System.out.println(gson.toJson(user2)); // {"name":"Alice","age":20}

        List<String> list = new ArrayList<>();
        list.add("str1");
        list.add("str2");
        list.add("str3");
        System.out.println(list);
        String listJson = gson.toJson(list); //
        System.out.println(listJson);

        // ???
        TypeToken<List<String>> token = new TypeToken<List<String>>() {};
        Type type = token.getType();
        // 传入 type 的方法 unchecked
        List<String> list1 = gson.fromJson(listJson, type);
        System.out.println(list1);
    }
}
