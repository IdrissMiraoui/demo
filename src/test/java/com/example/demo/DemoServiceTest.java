package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
    @SpringBootTest
    public class DemoServiceTest {

        @Autowired
        DemoServiceImpl helloService;

        @Mock
        DemoRepository demoRepository;

        @Test
        public void testGetHello() {
            Assert.assertEquals("Hello hello", helloService.getHello());
        }

    @Test
    public void testGetBonjour() {
        Assert.assertEquals("Hello Bonjour", helloService.getBonjour());
    }

    }
