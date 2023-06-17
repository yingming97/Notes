package pham.hien.notes.feature_note.data.data_soure

import androidx.room.Database
import androidx.room.RoomDatabase
import pham.hien.notes.feature_note.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase  : RoomDatabase() {

    abstract val noteDao: NoteDao

    companion object {
        const val DATABASE_NAME = "notes_db"
    }
}