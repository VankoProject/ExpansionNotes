package com.example.expansionnotes.domein.usecases

import com.example.expansionnotes.domein.NotesRepository
import com.example.expansionnotes.domein.model.Note

class GetNoteUseCase(private val notesRepository: NotesRepository) {

    fun getNote(noteId: Int): Note {
        return notesRepository.getNote(noteId)
    }
}