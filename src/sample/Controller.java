package sample;

import com.sun.javafx.scene.layout.region.Margins;
import com.sun.xml.internal.ws.commons.xmlutil.Converter;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import model.Adapter;


public class Controller {



    @FXML
    public TextField value;
    @FXML
    public ListView list_w;

    Adapter demo=new Adapter();


    public void met_pop()//добавить
    {
        String met_pop="Добавить элемент: "+String.valueOf(value.getText())+". \n Массив:";
        demo.insert(Long.valueOf(value.getText()));
        list_w.getItems().add(met_pop);
        list_w.getItems().add(demo.display());
    }
    public void met_del()//удалить
    {
        String met_del="Удалить элемент: "+String.valueOf(value.getText());
        String met_del_1="";
        list_w.getItems().add(met_del);
        if(demo.delete(Long.valueOf(value.getText()))){
            met_del_1="Элемент удален"+".\n Массив:";
        }else  met_del_1="Элемент не удален, или его нет в массиве"+".\n Массив:";

            list_w.getItems().add(met_del_1);
        list_w.getItems().add(demo.display());
    }
    public void met_search()//поиск
    {
        String met_search_2="";
        String met_search_1=" Найти элемент: "+String.valueOf(value.getText());
        list_w.getItems().add(met_search_1);
        long val_1= Long.valueOf(demo.find(Long.valueOf(value.getText())));
         if(val_1!=demo.size()) {
              met_search_2="Элемент найден. Место элемента в массиве: "+val_1+".\n Массив:";
         } else {
              met_search_2 = "Элемент  не найден.\n Массив:";
         }

        list_w.getItems().add(met_search_2);
        list_w.getItems().add(demo.display());
    }

}
