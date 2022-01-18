package com.hnh.service;

import com.xkcoding.dubbo.common.service.DubboService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author user
 * @date 2022-01-18 9:31
 */
public class IDubboServiceImpl implements DubboService {

    @Override
    public List<String> getData(String data) {
        ArrayList<String> list = new ArrayList<>();
        list.add("这是dubbo中provider 返回的数据："+data);
        return list;
    }
}
