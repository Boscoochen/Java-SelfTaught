package com.hspedu.generic_;

import org.junit.jupiter.api.Test;

import java.util.*;

public class Homework01 {
    public static void main(String[] args) {

    }

    @Test
    public void testList() {
        DAO<User> userDAO = new DAO<>();

        userDAO.save("1", new User(1, 20, "smith"));
        userDAO.save("2", new User(2, 10, "jack"));
        userDAO.save("3", new User(3, 1, "milan"));

        System.out.println(userDAO.get("2"));
        userDAO.update("2", new User(2, 15, "hsp"));
        System.out.println(userDAO.get("2"));
        System.out.println(userDAO.list());
        userDAO.delete("3");
        System.out.println(userDAO.getMap());
    }
}

class DAO<T> {

    private Map<String, T> map = new HashMap<>();

//    public DAO(Map<String, T> map) {
//        this.map = map;
//    }

    public Map<String, T> getMap() {
        return map;
    }

    public void setMap(Map<String, T> map) {
        this.map = map;
    }

    public void save(String id, T entity){
        map.put(id, entity);
    }

    public T get(String id) {
        return map.get(id);
    }

    public void update(String id, T entity) {
        map.put(id, entity);
    }

    public List<T> list() {
        Set<Map.Entry<String, T>> entries = map.entrySet();
        Iterator<Map.Entry<String, T>> iterator = entries.iterator();
        List<T> ts = new ArrayList<>();
        while (iterator.hasNext()) {
            Map.Entry<String, T> next =  iterator.next();
            ts.add(next.getValue());
        }
        return ts;
    }

    public void delete(String id) {
        map.remove(id);
    }
}

class User {
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nUser{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
