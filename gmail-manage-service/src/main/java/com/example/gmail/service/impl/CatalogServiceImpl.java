package com.example.gmail.service.impl;

import com.example.gmail.bean.PmsBaseCatalog1;
import com.example.gmail.service.CatalogService;
import com.example.gmail.service.mapper.PmsBaseCatalog1Mapper;
import com.example.gmail.service.mapper.PmsBaseCatalog2Mapper;
import com.example.gmail.service.mapper.PmsBaseCatalog3Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CatalogServiceImpl implements CatalogService {

    @Autowired
    PmsBaseCatalog1Mapper pmsBaseCatalog1Mapper;

    @Autowired
    PmsBaseCatalog2Mapper pmsBaseCatalog2Mapper;

    @Autowired
    PmsBaseCatalog3Mapper pmsBaseCatalog3Mapper;

    @Override
    public List<PmsBaseCatalog1> getCatalog1() {
        return pmsBaseCatalog1Mapper.selectAll();
    }
}
