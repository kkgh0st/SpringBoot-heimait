package com.example.springboot_quick_starter.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot_quick_starter.domain.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookDao extends BaseMapper<Book> {

}
