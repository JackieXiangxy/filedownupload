package com.jackie.myapp.server;

import com.jackie.myapp.model.*;

import java.util.List;


public interface FileInfoServer {
    public Fileinfo selectById(Integer id);

    public List<Fileinfo> selectAll();

}
