package net.marcogallegos.messenger.database;

import net.marcogallegos.messenger.model.Message;
import net.marcogallegos.messenger.model.Profile;

import java.util.HashMap;
import java.util.Map;
//NOT THREAD SAFE - coz we use static. every class and object can access this
//NO CONCURRENCY PROTECTION. ONLY FOR EDUCATIONAL PURPOSE
public class DatabaseClass {

    private static Map<Long, Message> messages = new HashMap<>();
    private static Map<String, Profile> profiles = new HashMap<>();

    public static Map<Long, Message> getMessages() {
        return messages;
    }

    public static Map<String, Profile> getProfiles() {
        return profiles;
    }

}
