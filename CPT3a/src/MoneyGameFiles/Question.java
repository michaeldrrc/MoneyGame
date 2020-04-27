package MoneyGameFiles;

import javax.swing.*;

public class Question {

    public String question = "";
    public ImageIcon img;
    public ImageIcon[] imgarr;
    public int elements = 0;

    public Question() {
    }

    public Question(String question) {
        this.question = question;
        elements = 0;
    }

    /*public Question(String question, ImageIcon img) {
        this.question = question;
        this.img = img;
        elements = 1;
    }*/

    public Question(String question, ImageIcon... img) {
        this.question = question;
        this.imgarr = img;
        elements = this.imgarr.length;
    }

    public String GetQString() {
        return question;
    }

    public ImageIcon GetQImage() {
        return img;
    }

    public ImageIcon GetQImage(int index) {
        return imgarr[index];
    }

    public int GetElements() {
        return elements;
    }
}
