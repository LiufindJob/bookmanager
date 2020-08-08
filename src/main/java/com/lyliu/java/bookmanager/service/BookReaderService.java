package com.lyliu.java.bookmanager.service;

import com.lyliu.java.bookmanager.bean.BookReaderBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface BookReaderService {

    ArrayList<BookReaderBean> getBookReadersInfo();
    BookReaderBean getBookReaderInfo(String code);
    int updateBookReader(BookReaderBean bookReaderBean);
    int dropBookReader(String code);
    int addBookReader(BookReaderBean bookReaderBean);
}
