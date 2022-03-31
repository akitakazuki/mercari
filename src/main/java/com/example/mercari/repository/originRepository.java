package com.example.mercari.repository;

import java.util.List;

import javax.lang.model.util.Elements.Origin;
import javax.swing.tree.RowMapper;

import com.example.mercari.domain.Original;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import lombok.Data;
@Data
@Repository
public class originRepository {
    private final RowMapper ROWMAPPE_ORIGINALS = (rs,i) ->{
        Original original = new Original();
        original.
        
        return original;
    };

    @Autowired
    private NamedParameterJdbcTemplate template;

    public List<Original> findAll(){
        String sql = "SELECT * FROM original";
        SqlParameterSource param = new MapSqlParameterSource();
        List<Original> originalList = template.query(sql, param, );
        return originalList;
    }
}
