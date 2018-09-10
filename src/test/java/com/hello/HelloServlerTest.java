package com.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.StringWriter;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import org.junit.Test;



public class HelloServlerTest {

    @Test
    public void testServlet() throws Exception {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);

        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        when(response.getWriter()).thenReturn(writer);

        new HelloServlet().doGet(request, response);

        writer.flush(); // it may not have been flushed yet...
        assertTrue(stringWriter.toString().contains("Hello"));
    }

}
