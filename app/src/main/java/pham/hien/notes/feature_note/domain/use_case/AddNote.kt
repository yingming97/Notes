package pham.hien.notes.feature_note.domain.use_case

import pham.hien.notes.feature_note.domain.model.InvalidNoteException
import pham.hien.notes.feature_note.domain.model.Note
import pham.hien.notes.feature_note.domain.repository.NoteRepository

class AddNote(private val repository: NoteRepository) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("Không được bỏ trống tiêu đề!!")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("Không được bỏ trống nội dung !!")
        }
        repository.insertNote(note)
    }
}