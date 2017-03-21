package com.example.android.miwok;


class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceID = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mSoundID;

    public Word(String mDefaultTranslation, String mMiwokTranslation, int mSoundID) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
        this.mSoundID = mSoundID;
    }

    public Word(String mDefaultTranslation, String mMiwokTranslation, int mImageResourceID, int mSoundID) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
        this.mImageResourceID = mImageResourceID;
        this.mSoundID = mSoundID;

    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getmImageResourceID() {
        return mImageResourceID;
    }

    public int getmSoundID() {
        return mSoundID;
    }

    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }
}
