package com.hotweather.android.gson;

import android.media.session.MediaController;

import com.google.gson.annotations.SerializedName;

/**
 * Created by PKUCCERZJ on 2018/7/12.
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort{

        @SerializedName("txt")
        public String info;
    }

    public class CarWash{

        @SerializedName("txt")
        public String info;
    }

    public class Sport{

        @SerializedName("txt")
        public String info;
    }
}
