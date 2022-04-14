package com.example.springboot_quick_starter;

import com.example.springboot_quick_starter.dao.BookDao;
import org.apache.http.HttpHost;
import org.elasticsearch.action.admin.indices.create.CreateIndexRequest;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;

import java.io.IOException;

@SpringBootTest
class SpringBootQuickStarterApplicationTests {

/*    @Autowired
    private ElasticsearchRestTemplate elasticsearchRestTemplate;

    @Test
    void fu(){
        elasticsearchRestTemplate.bulkUpdate();
    }*/


    @Autowired
    private RestHighLevelClient restHighLevelClient;


    @Test
    void TestCreateIndex() throws IOException {
        // 编写客户端
        HttpHost httpHost = HttpHost.create("http://localhost:9200");
        RestClientBuilder restClientBuilder = RestClient.builder(httpHost);
        restHighLevelClient = new RestHighLevelClient(restClientBuilder);
        // 创建索引
        CreateIndexRequest request = new CreateIndexRequest("books");
        restHighLevelClient.indices().create(request, RequestOptions.DEFAULT);
        restHighLevelClient.close();
    }
}
