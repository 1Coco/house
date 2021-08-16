package com.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import com.entity.*;
import com.service.*;
import com.service.impl.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class workingAction extends HttpServlet {

	private IWorkingService ws=new WorkingService();
	/**
	 * Constructor of the object.
	 */
	public workingAction() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		
		String method=request.getParameter("method");
		
		if(method.equals("all")){
			all(request,response);
		}else if(method.equals("selectId")){
			selectId(request,response);
		}else if(method.equals("insert")){
			insert(request,response);
		}
	}
	
	public void all(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<working>list=ws.selectAllWorking();
		
		request.setAttribute("list", list);
		
		request.getRequestDispatcher("list.jsp").forward(request, response);
		
	}
	
	public void selectId(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id=request.getParameter("id");
		
		working w=ws.selectWorkingById(Integer.parseInt(id));
		
		request.setAttribute("wobj", w);
		//System.out.println("1");
		request.getRequestDispatcher("chakan.jsp").forward(request, response);
		
	}
	public void insert(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id=request.getParameter("id");
		String title=request.getParameter("title");
		String content=request.getParameter("content");
		String createDate=request.getParameter("createDate");
		String type=request.getParameter("type");
		
		working w=new working(0,title,content,createDate,Integer.parseInt(type));
		int num=ws.insertWorking(w);
		
		if(num>0){
			request.setAttribute("insertCode", "true");
		}else{
			request.setAttribute("id", id);
			request.setAttribute("insertCode", "false");
		}
		
		request.getRequestDispatcher("insert.jsp").forward(request, response);
	
	}
	
	

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
