package com.example.expansionnotes.domein.usecases

import com.example.expansionnotes.domein.NotesRepository
import com.example.expansionnotes.domein.model.Note

class AddNewNoteUseCase (private val notesRepository: NotesRepository) {

    fun addNewNote(note: Note) {
       notesRepository.addNewNote(note)
    }
}