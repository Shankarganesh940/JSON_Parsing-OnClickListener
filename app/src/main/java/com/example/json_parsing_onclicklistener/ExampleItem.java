package com.example.json_parsing_onclicklistener;

public class ExampleItem {

    private String mCreator;
    private int mLikes;

    public ExampleItem(String imageUrl, String creator, int likes) {

        mCreator = creator;
        mLikes = likes;
    }


    public String getCreator() {
        return mCreator;
    }

    public int getLikeCount() {
        return mLikes;
    }
}
