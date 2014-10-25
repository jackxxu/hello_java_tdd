package hello_tdd;

import static org.junit.Assert.*;

import java.io.IOException;

import org.apache.commons.httpclient.HttpException;
import org.junit.Test;

public class TestHTTPClient {

    @Test
    public void test() throws HttpException, IOException {
        assertTrue(HttpClient1.get("http://www.google.com").contains("Lucky"));
    }

    public void test_request() throws HttpException, IOException {
        assertTrue(HttpClient1.get_request("http://www.google.com").contains("Lucky"));
    }
}
