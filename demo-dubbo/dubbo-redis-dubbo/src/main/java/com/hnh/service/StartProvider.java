package com.hnh.service;

 import org.junit.Test;
 import org.springframework.context.support.ClassPathXmlApplicationContext;

 import java.io.IOException;

public class StartProvider {
    public static void main(String[] args) throws IOException {

        System.out.println("服务1启动~~~");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring-dubbo.xml"});
        context.start();

        System.in.read(); // press any key to exit
    }

    @Test
    public void test() throws Exception{
        System.in.read();
    }
}
