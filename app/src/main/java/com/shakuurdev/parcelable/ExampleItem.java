package com.shakuurdev.parcelable;

import android.os.Parcel;
import android.os.Parcelable;

public class ExampleItem implements Parcelable {
    private int     mImageResource;
    private String  mText1;
    private String  mText2;

    public ExampleItem(int imageResource, String Text1, String Text2) {
        this.mImageResource = imageResource;
        this.mText1 = Text1;
        this.mText2 = Text2;
    }

    protected ExampleItem(Parcel in) {
        mImageResource = in.readInt();
        mText1 = in.readString();
        mText2 = in.readString();
    }

    public static final Creator<ExampleItem> CREATOR = new Creator<ExampleItem>() {
        @Override
        public ExampleItem createFromParcel(Parcel in) {
            return new ExampleItem(in);
        }

        @Override
        public ExampleItem[] newArray(int size) {
            return new ExampleItem[size];
        }
    };

    public int getmImageResource() {
        return mImageResource;
    }

    public String getmText1() {
        return mText1;
    }

    public String getmText2() {
        return mText2;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(mImageResource);
        parcel.writeString(mText1);
        parcel.writeString(mText2);
    }
}
