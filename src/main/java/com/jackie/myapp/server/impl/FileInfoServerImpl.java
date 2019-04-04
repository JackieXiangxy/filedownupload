package com.jackie.myapp.server.impl;

import com.jackie.myapp.mapper.FileinfoMapper;
import com.jackie.myapp.model.*;
import com.jackie.myapp.server.FileInfoServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Service
@CacheConfig(cacheNames = "fileInfoServer")
public class FileInfoServerImpl implements FileInfoServer {

    @Resource
    private FileinfoMapper fMapper;

    @Override
    public Fileinfo selectById(Integer id) {
        Fileinfo info=fMapper.selectByPrimaryKey(id);
        return info;
    }

    @Override
    public List<Fileinfo> selectAll() {
        return null;
    }

}
