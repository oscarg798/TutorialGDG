package com.gdg.tutorial.tutorial;

import android.graphics.Bitmap;

/**
 * Created by oscargallon on 18/07/15.
 */
public class Pais {

    private String name;
    private String description;
    private Bitmap flag;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Bitmap getFlag() {
        return flag;
    }

    public void setFlag(Bitmap flag) {
        this.flag = flag;
    }
}
