package com.example.demo.service;

import com.example.demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// JpaRepository 是一个泛型接口，一个参数为仓库操作的领域对象类型，一个是ID属性的类型
public interface ReadingListRepository extends JpaRepository<Book,Long> {
    List<Book> findByReader(String reader);
}
