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
    public void insert(long value){
        this.value = value;
        this.ordArray.insert(value);
    }
    public int find(long searchKey)   //найти
    {
        return this.ordArray.find(searchKey);
    }

    public String display () {
            return this.ordArray.display();
    }

    public boolean delete(long value)  // удалить элемент
    {
            return this.ordArray.delete(value);
    }




}
