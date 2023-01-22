package com.lixan.fajardo.collaberaweatherapp.local.dao

import androidx.room.Dao
import androidx.room.Query
import com.lixan.fajardo.collaberaweatherapp.local.base.BaseDao
import com.lixan.fajardo.collaberaweatherapp.local.models.DBGitUserNote
import io.reactivex.Single

@Dao
abstract class GitUserNoteDao: BaseDao<DBGitUserNote> {

    @Query("SELECT * FROM ${DBGitUserNote.DB_GIT_USER_NOTE_TABLE_NAME}")
    abstract fun getGitUserNotes(): Single<List<DBGitUserNote>>

    @Query("SELECT * FROM ${DBGitUserNote.DB_GIT_USER_NOTE_TABLE_NAME} WHERE id = :userId")
    abstract fun getGitUserNote(userId: Int): Single<DBGitUserNote>

}