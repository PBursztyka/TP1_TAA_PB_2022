package servlets;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import business.Etudiant;
import dao.EtudiantDao;

@WebServlet(name="userinfotest",
urlPatterns={"/UserInfoTest"})
public class UserInfo extends HttpServlet {

	EtudiantDao etdao;
		
	@Override
	public void init() throws ServletException {		
		super.init();
		this.etdao = new EtudiantDao();		
	}		
		
	public void doPost(HttpServletRequest request, HttpServletResponse response)
     throws ServletException, IOException {
    response.setContentType("text/html");

    PrintWriter out = response.getWriter();
    
    Etudiant et = new Etudiant();
    et.setLogin(request.getParameter("login"));
    et.setPwd(request.getParameter("pwd"));
    etdao.save(et);
    
    

    
    out.println("<HTML>\n<BODY>\n" +
                "<H1>Recapitulatif des informations</H1>\n" +
                "<UL>\n" +            
        " <LI>Login: "
                + request.getParameter("login") + "\n" +
        " <LI>Password: "
                + request.getParameter("pwd") + "\n" +
                "</UL>\n" +                
        "</BODY></HTML>");
}
}
