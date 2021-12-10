package ako.main;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ako.main.dao.KanataProducts;
import ako.main.info.ProductsInfo;

@WebServlet("/QuerySvl")
public class QuerySvl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public QuerySvl() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<ProductsInfo> list = KanataProducts.query();
		request.setAttribute("list", list);
		request.getRequestDispatcher("\\amanekanata\\showalldb.jsp").forward(request, response);
	}

}
