package com.example.expansionnotes.domein.usecases

import com.example.expansionnotes.domein.NotesRepository
import com.example.expansionnotes.domein.model.Note

class DeleteNoteUseCase (private val notesRepository: NotesRepository) {

    fun deleteNote(note: Note) {
        notesRepository.deleteNote(note)
    }
}