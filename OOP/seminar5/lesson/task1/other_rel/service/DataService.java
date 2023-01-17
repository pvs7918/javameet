package service;

import data.User;

import java.util.List;

public interface DataService <U extends User> {
    public  void add(U user);
    public void saveUser();
    public List<U> loadUser();
}
