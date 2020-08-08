package com.lyliu.java.bookmanager.serviceImpl;

import com.lyliu.java.bookmanager.bean.BookReaderBean;
import com.lyliu.java.bookmanager.mapper.BookReaderMapper;
import com.lyliu.java.bookmanager.service.BookReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BookReaderServiceImpl implements BookReaderService {

    @Autowired
    BookReaderMapper bookReaderMapper;

    @Override
    public ArrayList<BookReaderBean> getBookReadersInfo() {
        return bookReaderMapper.getBookReadersInfo();
    }

    @Override
    public BookReaderBean getBookReaderInfo(String code) {
        return bookReaderMapper.getBookReaderInfo(code);
    }

    @Override
    public int updateBookReader(BookReaderBean bookReaderBean) {
        return bookReaderMapper.updateBookReader(bookReaderBean);

    }


    @Override
    public int dropReader(String code) {
        return bookReaderMapper.dropUser(code);
    }

}
