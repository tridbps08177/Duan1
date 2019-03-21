/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhom3.qlcf.dao;

import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author Kanbi
 * @param <T>
 */
public interface DAO<T> {
    public boolean insert(T t);
    
    public boolean delete(T t);
    
    public boolean update(T t);
    
    public List<T> selectAll();
    
    public List<T> select(String sql, Object... args);
    
    public T readFromResultSet(ResultSet rs);
}
