/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoneyGameFiles;

/**
 *
 * @author scuba
 */
//Francesco Barranca
import java.awt.*;

import javax.swing.*;

public class Answer {

    private String answer = "";
    private ImageIcon img;
    private boolean right = false;
    private boolean type = false;

    public Answer() {
    }

    public Answer(String answer, boolean right) {
        this.answer = answer;
        this.right = right;
        type = true;
    }

    public Answer(ImageIcon img, boolean right) {
        this.answer = null;
        this.img = img;
        this.right = right;
        type = false;
    }

    public String GetAString() {
        return answer;
    }

    public ImageIcon GetAImage() {
        return img;
    }

    public boolean isRight() {
        return right;
    }

    public boolean isString() {
        return type;
    }
}
