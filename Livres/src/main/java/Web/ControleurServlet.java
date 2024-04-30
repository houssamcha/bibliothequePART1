package Web;
import java.io.IOException;
import java.util.List;

import LivresPackage.Livres;
import dao.LivreDao;
import dao.LivreDaoImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ControleurServlet extends HttpServlet{
    private LivreDao metier;

    @Override
    public void init() throws ServletException {
         metier=new LivreDaoImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getServletPath();
        if(path.equals("/home.java")) {
        	LivreModel Livre = new LivreModel();
        	 List<Livres> Livres=metier.Afficher();
        	 Livre.setStringList(Livres);
             req.setAttribute("Livre", Livre);
            req.getRequestDispatcher("NewFile.jsp").forward(req, resp);
        }else if(path.equals("/ajouter.java")) {
            req.getRequestDispatcher("Ajouter.jsp").forward(req, resp);
        }
        else {
            resp.sendError(resp.SC_NOT_FOUND);
        }

    }
}