package com.example.appengine.helloworld;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    Map<String, String[]> params = req.getParameterMap();
    PrintWriter out = resp.getWriter();
    String[] e = params.get("env");
    if (e != null) {
      out.println(System.getenv().get(e[0]));
    }
    else {
      Map<String, String> env = System.getenv();
      for (String envName : env.keySet()) {
        out.format("\n%s=%s%n", envName, env.get(envName));
      }
    }
  }
}
