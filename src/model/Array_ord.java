package model;

import java.util.ArrayList;

public interface Array_ord {
     int size();
     String  find(String searchKey);
     void insert(String value);
     boolean delete(String value);
     ArrayList<String> display();

}
