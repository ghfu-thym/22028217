package Messenger;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class BaseController implements Initializable {

    public Pane view0;
    public Pane view1;
    public Pane view2;
    public Pane view3;
    public Pane view4;
    public Pane view5;
    public Pane message1;
    public Pane message2;
    public Pane message3;
    public Pane message4;
    public Pane message5;
    public ImageView setAvt;
    public Label name;
    public ImageView call;
    public ImageView video;
    public ImageView infor;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        message1.setOnMouseClicked(mouseEvent -> setBox(1));
        message2.setOnMouseClicked(mouseEvent -> setBox(2));
        message3.setOnMouseClicked(mouseEvent -> setBox(3));
        message4.setOnMouseClicked(mouseEvent -> setBox(4));
        message5.setOnMouseClicked(mouseEvent -> setBox(5));
    }
    private void setBox(int i){
        setDisable(i);
        setVisible(i);
        setNameAvt(i);
    }
    private void setDisable(int i){
        switch (i){
            case 1:
                message1.setDisable(true);
                message2.setDisable(false);
                message3.setDisable(false);
                message4.setDisable(false);
                message5.setDisable(false);
                break;
            case 2:
                message1.setDisable(false);
                message2.setDisable(true);
                message3.setDisable(false);
                message4.setDisable(false);
                message5.setDisable(false);
                break;
            case 3:
                message1.setDisable(false);
                message2.setDisable(false);
                message3.setDisable(true);
                message4.setDisable(false);
                message5.setDisable(false);
                break;
            case 4:
                message1.setDisable(false);
                message2.setDisable(false);
                message3.setDisable(false);
                message4.setDisable(true);
                message5.setDisable(false);
                break;
            case 5:
                message1.setDisable(false);
                message2.setDisable(false);
                message3.setDisable(false);
                message4.setDisable(false);
                message5.setDisable(true);
                break;
            default:
        }
    }
    private void setVisible(int i){
        switch (i){
            case 0:
                view0.setVisible(true);
                view1.setVisible(false);
                view2.setVisible(false);
                view3.setVisible(false);
                view4.setVisible(false);
                view5.setVisible(false);
                break;
            case 1:
                view0.setVisible(false);
                view1.setVisible(true);
                view2.setVisible(false);
                view3.setVisible(false);
                view4.setVisible(false);
                view5.setVisible(false);
                break;
            case 2:
                view0.setVisible(false);
                view1.setVisible(false);
                view2.setVisible(true);
                view3.setVisible(false);
                view4.setVisible(false);
                view5.setVisible(false);
                break;
            case 3:
                view0.setVisible(false);
                view1.setVisible(false);
                view2.setVisible(false);
                view3.setVisible(true);
                view4.setVisible(false);
                view5.setVisible(false);
                break;
            case 4:
                view0.setVisible(false);
                view1.setVisible(false);
                view2.setVisible(false);
                view3.setVisible(false);
                view4.setVisible(true);
                view5.setVisible(false);
                break;
            case 5:
                view0.setVisible(false);
                view1.setVisible(false);
                view2.setVisible(false);
                view3.setVisible(false);
                view4.setVisible(false);
                view5.setVisible(true);
                break;
            default:
        }
    }
    private void setNameAvt(int i){
        Image tmp;
        switch (i){
            case 1:
                name.setText("Mèo");
                tmp=new Image(getClass().getResourceAsStream("/Image/cat.png"));
                setAvt.setImage(tmp);
                break;
            case 2:
                name.setText("Gà");
                tmp=new Image(getClass().getResourceAsStream("/Image/chicken.png"));
                setAvt.setImage(tmp);
                break;
            case 3:
                name.setText("Chó");
                tmp=new Image(getClass().getResourceAsStream("/Image/dog.png"));
                setAvt.setImage(tmp);
                break;
            case 4:
                name.setText("Chim");
                tmp=new Image(getClass().getResourceAsStream("/Image/bird.png"));
                setAvt.setImage(tmp);
                break;
            case 5:
                name.setText("Lợn");
                tmp=new Image(getClass().getResourceAsStream("/Image/pig.png"));
                setAvt.setImage(tmp);
                break;
            default:
        }
    }
}