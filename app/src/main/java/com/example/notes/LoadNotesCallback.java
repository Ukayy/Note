package com.example.notes;

import com.example.notes.Note.Note;

import java.util.ArrayList;

interface LoadNotesCallback {
    void preExecute();
    void postExecute(ArrayList<Note> notes);
}
