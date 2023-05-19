package com.swift.service.impl;

import com.swift.controller.Code;
import com.swift.domain.Paper;
import com.swift.exception.SystemException;
import com.swift.mapper.NoteMapper;
import com.swift.domain.Note;
import com.swift.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {
    @Autowired
    private NoteMapper noteMapper;
    @Override
    public boolean save(Note note) {
        return noteMapper.save(note);
    }
    @Override
    public boolean update(Note note) {
        return noteMapper.update(note);
    }
    @Override
    public boolean updateById(Integer id) {
        Note note = null;
        try {
            note = noteMapper.getById(id);
            if (note.getVisible() == 1) {
                note.setVisible(0);
                noteMapper.update(note);
            } else {
                note.setVisible(1);
                noteMapper.update(note);
            }
        } catch (Exception e) {
            throw new SystemException(Code.SYSTEM_TIMEOUT_ERR,
                    "出错了:'( ERROR", e);
        }
        return true;
    }
    @Override
    public boolean delete(Integer id) {
        return noteMapper.delete(id);
    }
    @Override
    public Note getById(Integer id) {
        Note note = null;
        try {
            note = noteMapper.getById(id);
        } catch (Exception e) {
            throw new SystemException(Code.SYSTEM_TIMEOUT_ERR,
                    "出错了:'( ERROR", e);
        }
        return note;
    }
    @Override
    public List<Note> getAllByPage(Paper paper) {
        int size=paper.getPaperSize();
        int begin=(paper.getCurrentPaper()-1)*size;
        return noteMapper.getAllByPage(begin,size);
    }
    @Override
    public Integer getCount() {
        String count=noteMapper.getCount();
        return Integer.parseInt(count);
    }
}
