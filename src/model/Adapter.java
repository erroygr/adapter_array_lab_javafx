package model;

import javafx.scene.control.TextField;

import java.util.ArrayList;

public class Adapter implements Array_ord {

    public OrdArray ordArray;
    public int ssize=10;
    public long value;

    public Adapter()
    {
       this.ordArray = ordArray;
        ordArray = new OrdArray(1000);
    }
    public int size(){
        return this.ordArray.size();
    }

    public void insert(String value_1){
        value=Long.valueOf(value_1);
        ordArray.insert(value);
    }
    public String find(String searchKey_1)   //найти
    {
        long searchKey=Long.valueOf(searchKey_1);
        return String.valueOf(ordArray.find(searchKey));
    }


    public ArrayList<String> display () {
        ArrayList<String> arr = new ArrayList<>(ssize);
        String[] subStr;
        String delimeter = " ";
        subStr = ordArray.display().split(delimeter);

        for (int i = 0; i < subStr.length; i++) {
            arr.add(String.valueOf(subStr[i]));
        }
        return arr;
    }

    public boolean delete(String value_1)  // удалить элемент
    {
        long value=Long.valueOf(value_1);
            return ordArray.delete(value);
    }




}
