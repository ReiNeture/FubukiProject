package ako.main;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ako.main.dao.KanataProducts;
import ako.main.info.ProductsInfo;

@WebServlet("/KanataForm")
public class InsertSvl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    public InsertSvl() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("name: " + request.getParameter("name"));
		System.out.println("info: " + request.getParameter("info"));
		System.out.println("price: " + request.getParameter("price"));
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final String name = request.getParameter("name");
		final String info = request.getParameter("info");
		final String price = request.getParameter("price");
		
		ProductsInfo product = new ProductsInfo();
		product.setName(name);
		product.setInfo(info);
		product.setPrice(Integer.valueOf(price));
		KanataProducts.insert(product);
		
	}

}
