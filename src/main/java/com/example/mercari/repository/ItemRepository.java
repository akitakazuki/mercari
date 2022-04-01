package com.example.mercari.repository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.mercari.domain.Items;

@Repository
public class ItemRepository {
    private final RowMapper<Items> ROWMAPPE_ORIGINALS = (rs,i) ->{
    	
        Items items = new Items();
        items.setId(rs.getInt("id"));
        items.setName(rs.getString("name"));
        items.setConditionId(rs.getInt("condition_id"));
        items.setCategory(rs.getString("category"));
        items.setBrand(rs.getString("brand"));
        items.setPrice(rs.getInt("price"));
        items.setShipping(rs.getInt("shipping"));
        items.setDescription(rs.getString("description"));
        return items;
    };

    @Autowired
    private NamedParameterJdbcTemplate template;

    public List<Items> findAll(){
        String sql = "SELECT * FROM original";
        SqlParameterSource param = new MapSqlParameterSource();
        List<Items> originalList = template.query(sql, param,ROWMAPPE_ORIGINALS);
        return originalList;
    }
}
