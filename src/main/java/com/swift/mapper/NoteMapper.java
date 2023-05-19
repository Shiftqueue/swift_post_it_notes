package com.swift.mapper;

import com.swift.domain.Note;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface NoteMapper {
    @ResultMap("noteResultMap")
    @Insert("insert into spring_db.post_it_notes " +
            "values(null,#{cardTitle},#{cardBody}," +
            "#{publicationDate},#{visible},#{expirationDate});")
    public boolean save(Note note);
    @Update("update spring_db.post_it_notes set " +
            "card_title=#{cardTitle},card_body=#{cardBody}," +
            "publication_date=#{publicationDate}," +
            "visible=#{visible},expiration_date=#{expirationDate} " +
            "where card_id=#{cardId}")
    public boolean update(Note note);
    @Delete("delete from spring_db.post_it_notes where card_id=#{id}")
    public boolean delete(Integer id);
    @ResultMap("noteResultMap")
    @Select("select * from spring_db.post_it_notes where card_id=#{id}")
    public Note getById(Integer id);
    @ResultMap("noteResultMap")
    @Select("select * from spring_db.post_it_notes " +
            "order by publication_date desc limit #{begin},#{size}")
    public List<Note> getAllByPage(@Param("begin") Integer begin,
                                   @Param("size") Integer size);
    @Select("select count(*) from spring_db.post_it_notes;")
    public String getCount();
}
