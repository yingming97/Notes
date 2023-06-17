package pham.hien.notes.feature_note.domain.use_case

import pham.hien.notes.feature_note.domain.model.Note
import pham.hien.notes.feature_note.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository,
) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}