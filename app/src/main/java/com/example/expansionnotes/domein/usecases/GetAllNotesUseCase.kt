package com.example.expansionnotes.domein.usecases

import com.example.expansionnotes.domein.NotesRepository
import com.example.expansionnotes.domein.model.Note

class GetAllNotesUseCase (private val notesRepository: NotesRepository){

    fun getAllNotes(): List<Note> = notesRepository.getAllNotes()

}