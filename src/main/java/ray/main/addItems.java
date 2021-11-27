package ray.main;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ray.main.dao.ItemsRepository;
import ray.main.entity.Items;

@WebServlet("/addItems")
public class addItems extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public addItems() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
		final String title = request.getParameter("title");
		final String info = request.getParameter("info");
		final String url = request.getParameter("url");
	
		Items item = new Items(title, info, url, LocalDateTime.now());
		
		if( !illegalItem( item ) ) {
			ItemsRepository.insert(item);
		} else {
			System.err.println("Err!");
		}
		
	}
	
	private boolean illegalItem(Items item) {
		return item.getTitle().isBlank() || item.getInfo().isBlank();
	}

}
