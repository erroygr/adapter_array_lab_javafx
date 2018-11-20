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
        demo.insert(Long.valueOf(value.getText()));
        list_w.getItems().add(demo.display());
    }
    public void met_del()//удалить
    {
        if(demo.delete(Long.valueOf(value.getText()))) {
            System.out.println(value.toString()+" удален");
        }else   System.out.println(value.toString()+"не удален или не найден");

        list_w.getItems().add(demo.display());
    }
    public void met_search()//поиск
    {
        long fK;
        fK= demo.find(Long.valueOf(value.getText()));

            System.out.println(fK+" Найден");

        list_w.getItems().add(demo.display());
    }

}
