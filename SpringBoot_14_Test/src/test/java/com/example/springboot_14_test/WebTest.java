package com.example.springboot_14_test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.ContentResultMatchers;
import org.springframework.test.web.servlet.result.HeaderResultMatchers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.result.StatusResultMatchers;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
//开启虚拟MVC调用
@AutoConfigureMockMvc
public class WebTest {
    @Test
    void test(){

    }

    @Test
    void testWeb(@Autowired  MockMvc mvc) throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
        mvc.perform(builder);
    }

    @Test
    void tesStatus(@Autowired  MockMvc mvc) throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
        ResultActions action = mvc.perform(builder);

        // 设置预期值与真实值进行比较，成果测试通过，失败测试失败
        // 定义本次调用的预期值
        StatusResultMatchers status = MockMvcResultMatchers.status();
        // 预计本次调用时成果的：状态200
        ResultMatcher ok = status.isOk();
        // 添加预期值与本次调用过程中进行匹配
        action.andExpect(ok);

    }

    @Test
    void testBody(@Autowired  MockMvc mvc) throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
        ResultActions action = mvc.perform(builder);


        ContentResultMatchers content = MockMvcResultMatchers.content();
        ResultMatcher resultMatcher = content.string("StringBoot is running");
        action.andExpect(resultMatcher);

    }

    @Test
    void testBodyJson(@Autowired  MockMvc mvc) throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
        ResultActions action = mvc.perform(builder);


        ContentResultMatchers content = MockMvcResultMatchers.content();
        ResultMatcher resultMatcher = content.json("{\"id\":1,\"name\":\"sd1fsdf\",\"type\":null,\"description\":\"asddas\"}");
        action.andExpect(resultMatcher);

    }

    @Test
    void testContentType(@Autowired  MockMvc mvc) throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
        ResultActions action = mvc.perform(builder);


        HeaderResultMatchers header = MockMvcResultMatchers.header();
        ResultMatcher resultMatcher = header.string("Content-Type", "application/json");
        action.andExpect(resultMatcher);
    }
}
