package step2_00_boardBasic.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import step2_00_boardBasic.dao.BoardBasicDao;
import step2_00_boardBasic.dto.BoardBasicDto;


@WebServlet("/bUpdate.do")
public class _06_bUpdate extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	
	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		BoardBasicDto mdto = BoardBasicDao.getInstance().getOneUpdateBoard(Integer.parseInt(request.getParameter("num")));
		request.setAttribute("mdto", mdto);
		
		RequestDispatcher dis = request.getRequestDispatcher("step2_01_boardBasicEx/06_bUpdate.jsp");
		dis.forward(request, response);
		
	}

}
