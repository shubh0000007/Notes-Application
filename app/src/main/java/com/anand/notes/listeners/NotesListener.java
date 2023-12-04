package com.anand.notes.listeners;

import com.anand.notes.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
