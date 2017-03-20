package com.example.android.miwok;


class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;

    public Word(String mDefaultTranslation, String mMiwokTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }
}
