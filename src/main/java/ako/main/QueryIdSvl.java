package ako.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ako.main.dao.KanataProducts;
import ako.main.info.ProductsInfo;

@WebServlet("/QueryIdSvl")
public class QueryIdSvl extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public QueryIdSvl() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final String id = request.getParameter("id");
		
		if(id == null)
			System.err.println("Err!");
		
		ProductsInfo product = KanataProducts.queryId(Integer.valueOf(id));
		request.setAttribute("product", product);
		request.getRequestDispatcher("\\amanekanata\\kanatashop.jsp").forward(request, response);
	}

}
