package batutour.com.batutour.adapter;

import android.graphics.Bitmap;

/**
 * Created by MSI on 26/08/2017.
 */

public class Data {
    private Bitmap photo;
    private String date, desc;

    public Data() {
    }

    public Data(Bitmap photo, String date, String desc) {
        this.photo = photo;
        this.desc = desc;
        this.date = date;
    }

    public Bitmap getPhoto() {
        return photo;
    }

    public void setPhoto(Bitmap photo) {
        this.photo = photo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
