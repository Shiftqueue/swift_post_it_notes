package com.swift.controller;

import com.swift.domain.Note;
import com.swift.domain.Paper;
import com.swift.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notes")
public class NoteController {
    @Autowired
    private NoteService noteService;
    @PostMapping
    public Result save(@RequestBody Note note) {
        boolean flag=noteService.save(note);
        String msg= flag ?"":"出现问题:'( ";
        return new Result(flag?Code.SAVE_OK:Code.SAVE_ERR,msg);
    }
    @PutMapping
    public Result update(@RequestBody Note note) {
        boolean flag=noteService.update(note);
        String msg= flag ?"":"出现问题:'( ";
        return new Result(flag?Code.UPDATE_OK:Code.UPDATE_ERR,msg);
    }

    @GetMapping("/update/{id}")
    public Result updateById(@PathVariable Integer id) {
        boolean flag=noteService.updateById(id);
        String msg= flag ?"":"出现问题:'( ";
        return new Result(flag?Code.UPDATE_OK:Code.UPDATE_ERR,msg);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag=noteService.delete(id);
        String msg= flag ?"":"出现问题:'( ";
        return new Result(flag?Code.DELETE_OK:Code.DELETE_ERR,msg);
    }
    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Note note = noteService.getById(id);
        Integer code = note != null ? Code.GET_OK : Code.GET_ERR;
        String msg=note!=null?"":"查询失败:-( 请重试";
        return new Result(code,note,msg);
    }
    @PostMapping("/page")
    public Result getAllByPage(@RequestBody Paper paper) {
        List<Note> list = noteService.getAllByPage(paper);
        Integer code = list != null ? Code.GET_OK : Code.GET_ERR;
        String msg=list!=null?"":"查询失败:-( 请重试";
        return new Result(code,list,msg);
    }
    @GetMapping("/count")
    public Result getCount() {
        int count= noteService.getCount();
        Integer code = count>=0 ? Code.GET_OK : Code.GET_ERR;
        String msg=count>=0?"":"查询失败:-( 请重试";
        return new Result(code,count,msg);
    }
}
