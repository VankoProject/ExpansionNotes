package com.example.expansionnotes.domein

import com.example.expansionnotes.domein.model.Note

interface NotesRepository {

    fun getAllNotes(): List<Note>

    fun getNote(noteId: Int): Note

    fun addNewNote(note: Note)

    fun deleteNote(note: Note)

    fun editNote(note: Note)


}