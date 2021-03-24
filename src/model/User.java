package model;

public class User {

    public String getUsername() {
        return username;
    }

    private String username;
    private CalendarCollection collection;

    public User(String username){
        this.username = username;
    }

    public void setCollection(CalendarCollection cc){
        this.collection = cc;
    }

    public CalendarCollection getCollection(){
        return collection;
    }
}

