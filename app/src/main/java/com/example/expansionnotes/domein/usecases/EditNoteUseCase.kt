package com.example.expansionnotes.domein.usecases

import com.example.expansionnotes.domein.NotesRepository
import com.example.expansionnotes.domein.model.Note

class EditNoteUseCase(private val notesRepository: NotesRepository) {

    fun editNote(note: Note) {
        notesRepository.editNote(note)
    }
}