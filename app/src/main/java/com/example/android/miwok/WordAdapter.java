package com.example.android.miwok;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


class WordAdapter extends ArrayAdapter<Word> {

    private int categoryBackgroundColor;

    public WordAdapter(Context context, ArrayList<Word> words, int categoryBackgroundColor) {
        super(context, 0, words);
        this.categoryBackgroundColor = categoryBackgroundColor;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Word currentWord = getItem(position);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getmDefaultTranslation());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        if (currentWord.hasImage()) {
            iconView.setImageResource(currentWord.getmImageResourceID());
            iconView.setVisibility(View.VISIBLE);

        } else {
            iconView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), categoryBackgroundColor);
        textContainer.setBackgroundColor(color);




        return listItemView;
    }
}
