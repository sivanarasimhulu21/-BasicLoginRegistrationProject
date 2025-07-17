import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public loginservlet() {
		super();
	}

	public void init(ServletConfig config) throws ServletException {
		// Initialization code if needed
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // Updated driver class
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/login?useUnicode=true&characterEncoding=utf8&useSSL=false",
					"root", "Shimbu@123456");

			PreparedStatement ps = con.prepareStatement("SELECT * FROM user WHERE username=? AND password=?");
			ps.setString(1, username);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			pw.println("<html><body bgcolor='cyan' text='red'><h1>");
			if (rs.next()) {
				pw.println("Welcome " + username);
			} else {
				pw.println("Invalid Username or Password<br><br>");
				pw.println("please Register if your a new one<br><br>");
				pw.println("<center><a href=Registration.html>Registration</a></center>");
			}
			pw.println("</h1></body></html>");

			con.close();
		} catch (Exception e) {
			e.printStackTrace(pw); // Show error in browser (for debugging only)
		}
	}
}
