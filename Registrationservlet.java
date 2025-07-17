import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class Registrationservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Registrationservlet() {
		super();
	}

	public void init(ServletConfig config) throws ServletException {
		// Initialization code if needed
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
				    "jdbc:mysql://localhost:3306/login?useSSL=false&useUnicode=true&characterEncoding=UTF-8",
				    "root", "Shimbu@123456");
//
//			Connection con = DriverManager.getConnection(
//					"jdbc:mysql://localhost:3306/login?useUnicode=true&characterEncoding=utf8&useSSL=false",
//					"root", "Shimbu@123456");

			PreparedStatement ps = con.prepareStatement("INSERT INTO user (firstname, lastname, username, password) VALUES (?, ?, ?, ?)");
			ps.setString(1, firstname);
			ps.setString(2, lastname);
			ps.setString(3, username);
			ps.setString(4, password);

			int i = ps.executeUpdate();

			pw.println("<html><body bgcolor='lightgreen' text='blue'><h1>");
			if (i > 0) {
				pw.println("Registration successful! Welcome  please login<br><br>");
				pw.println("<center><a href=login.html>Login</a></center>");
			} else {
				pw.println("Registration failed! Please try again.");
			}
			pw.println("</h1></body></html>");

			con.close();
		} catch (Exception e) {
			pw.println("<html><body bgcolor='pink'><h2>Error: " + e.getMessage() + "</h2></body></html>");
			e.printStackTrace(pw);
		}
	}
}
