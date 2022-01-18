package com.hnh.service;

import com.xkcoding.dubbo.common.service.DubboService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-dubbo.xml")
public class DubboTest {
    @Resource(name = "demoService")
    private DubboService dubboService;


    @Test
    public void testDubbo() {
        List<String> haha = dubboService.getData("haha");
        System.out.println(haha.get(0));
    }
}
