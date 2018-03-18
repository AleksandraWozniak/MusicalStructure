package com.example.ola.musicalstructure;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by Ola on 2018-03-13.
 */

/**
 * {@link SongAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Song} objects.
 */

public class SongAdapter extends ArrayAdapter<Song> {
    /**
     * Create a new {@link SongAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param songs is the list of {@link Song}s to be displayed.
     */

    //creating constructor of adapter

    public SongAdapter(Activity context, ArrayList<Song> songs) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, songs);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Song currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView authorTextView = (TextView) listItemView.findViewById(R.id.author);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        authorTextView.setText(currentWord.getAuthor());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        titleTextView.setText(currentWord.getTitle());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
        }
    }