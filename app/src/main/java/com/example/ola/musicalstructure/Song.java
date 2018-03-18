package com.example.ola.musicalstructure;

/**
 * Created by Ola on 2018-03-13.
 */

/**
 * {@link Song} represents a song that the user wants to play.
 * It contains an author / player and a title of the song
 */
public class Song {
    /** Author of the song / Artist Name */
    private String mAuthor;

    /** Title of the song / Song Name */
    private String mTitle;

    /**
     * Create a new Song object.
     *
     * @param author is the author / player of the song
     * @param title is the title of the song
     */
    public Song(String author, String title) {
        mAuthor = author;
        mTitle = title;
    }

    /**
     * Get the author / player of the song
     */
    public String getAuthor() {

        return mAuthor;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getTitle() {

        return mTitle;
    }
}
