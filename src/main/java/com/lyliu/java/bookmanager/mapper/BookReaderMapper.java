package com.lyliu.java.bookmanager.mapper;

import com.lyliu.java.bookmanager.bean.BookReaderBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface BookReaderMapper {
    ArrayList<BookReaderBean> getBookReadersInfo();
    BookReaderBean getBookReaderInfo(String code);
    int updateBookReader(BookReaderBean bookReaderBean);
    int dropUser(String code);
}
