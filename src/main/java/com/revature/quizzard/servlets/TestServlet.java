package com.revature.quizzard.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


    @WebServlet("/test")
    public class TestServlet extends HttpServlet{

        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
            resp.getWriter().write("Application successfully deployed using AWS CodeBuild, CodePipeline, and Elastic Beanstalk");
            }
    }

