import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountCalculatorServlet", urlPatterns = "/calculator")
public class ProductDiscountCalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float discountPercent = Float.parseFloat(request.getParameter("discountPercent"));
        float listPrice = Float.parseFloat(request.getParameter("listPrice"));

        float discountAmount = discountPercent * listPrice * 0.1f;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Product Description: $" + listPrice + "</h1>");
        writer.println("<h1>listPrice: $" + listPrice + "</h1>");
        writer.println("<h1>DiscountPercent: " + discountPercent + "%</h1>");
        writer.println("<h1>Discount Amount: $" + discountAmount + "</h1>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
