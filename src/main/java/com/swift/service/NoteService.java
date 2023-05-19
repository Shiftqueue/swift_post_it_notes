package com.swift.service;

import com.swift.domain.Note;
import com.swift.domain.Paper;

import java.util.List;

public interface NoteService {
    public boolean save(Note note);

    public boolean update(Note note);
    public boolean updateById(Integer id);

    public boolean delete(Integer id);

    public Note getById(Integer id);

    public List<Note> getAllByPage(Paper paper);

    public Integer getCount();
}
