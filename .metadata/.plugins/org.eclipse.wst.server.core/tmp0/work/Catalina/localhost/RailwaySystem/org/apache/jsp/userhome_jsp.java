/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.43
 * Generated at: 2019-10-02 08:19:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userhome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"header.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"userhome.css\">\r\n");
      out.write("<title>HomePage</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write(" ");
 HttpSession sn = request.getSession(false);
 String uname=(String)sn.getAttribute("userid");
      out.write("\r\n");
      out.write(" <div class=\"topnav\">\r\n");
      out.write("  <a  href=\"userhome.jsp\">Home</a>\r\n");
      out.write("  <a href=\"booking.jsp\">Ticket Booking</a>\r\n");
      out.write("  <a href=\"\">Cancellation</a>\r\n");
      out.write("  <a href=\"complaint.jsp\">Complaints Box</a>\r\n");
      out.write("  <a  href=\"RegisterController?action=history\">View History</a>\r\n");
      out.write("  <a>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userid }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</a>\r\n");
      out.write("  <a href=\"RegisterController?action=profile\">Profile</a>\r\n");
      out.write("  <a href=\"RegisterController?action=logout\">logout</a>\r\n");
      out.write("  <!-- <a href=\"RegisterController?action=myprofile\"> My Profile </a> -->\r\n");
      out.write("  </div><br><br>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("<div class=\"slideshow-container\">\r\n");
      out.write("<div class=\"mySlides fade\">\r\n");
      out.write("  <img src=\"ban3.jpg\" style=\"width:100%; height:250px;\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"mySlides fade\">\r\n");
      out.write("  <img src=\"ban2.jpg\" style=\"width:100% ; height:250px;\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"mySlides fade\">\r\n");
      out.write("  <img src=\"ban5.jpg\" style=\"width:100% ; height:250px;\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"mySlides fade\">\r\n");
      out.write("  <img src=\"ban1.jpg\" style=\"width:100%; height:250px\">\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<div style=\"text-align:center\">\r\n");
      out.write("  <span class=\"dot\"></span> \r\n");
      out.write("  <span class=\"dot\"></span> \r\n");
      out.write("  <span class=\"dot\"></span> \r\n");
      out.write("  <span class=\"dot\"></span> \r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<button class=\"collapsible\">ABOUT</button>\r\n");
      out.write("<div class=\"content\">\r\n");
      out.write("  <p>About Indian Railways\r\n");
      out.write("The first railway on Indian sub-continent ran over a stretch of 21 miles from Bombay to Thane. The idea of a railway to connect Bombay with Thane, Kalyan and with the Thal and Bhore Ghats inclines first occurred to Mr. George Clark, the Chief Engineer of the Bombay Government, during a visit to Bhandup in 1843.\r\n");
      out.write("\r\n");
      out.write("The formal inauguration ceremony was performed on 16th April 1853, when 14 railway carriages carrying about 400 guests left Bori Bunder at 3.30 pm \"amidst the loud applause of a vast multitude and to the salute of 21 guns.\" The first passenger train steamed out of Howrah station destined for Hooghly, a distance of 24 miles, on 15th August, 1854. Thus the first section of the East Indian Railway was opened to public traffic, inaugurating the beginning of railway transport on the Eastern side of the subcontinent.  \r\n");
      out.write("\r\n");
      out.write("In south the first line was opened on Ist July, 1856 by the Madras Railway Company. It ran between Vyasarpadi Jeeva Nilayam (Veyasarpandy) and Walajah Road (Arcot), a distance of 63 miles. In the North a length of 119 miles of line was laid from Allahabad to Kanpur on 3rd March 1859. The first section from Hathras Road to Mathura Cantonment was opened to traffic on 19th October, 1875. These were the smallâs beginnings which is due course developed into a network of railway lines all over the country. By 1880 the Indian Railway system had a route mileage of about 9000 miles. INDIAN RAILWAYS, the premier transport organization of the country is the largest rail network in Asia and the worldâs second largest under one management..</p>\r\n");
      out.write("</div>\r\n");
      out.write("<br><br>\r\n");
      out.write("<button class=\"collapsible\">MISSION</button>\r\n");
      out.write("<div class=\"content\">\r\n");
      out.write("<p>The Railway Mission is a British mission devoted to the rail industry. It was founded in 1881 based in mission halls, and now operates a chaplaincy service. In the early days of the Railway Mission there were a number of mission halls at railway stations throughout the country, including one at Bury St. Edmunds, completed in 1900,[1] and a 1906 building at Salisbury.[2] An excellent example of a Railway Mission Hall is to be found at Norwich Prince of Wales Road Evangelical Church.[3]\r\n");
      out.write("\r\n");
      out.write("The Railway Mission[4] is a care provider to the rail industry and British Transport Police through the provision of The National Rail Chaplaincy Service (NRCS). Operating in partnership with London City Mission, the Railway Mission is the principal partner in the NRCS which provides around 25 mainly full-time chaplains to the Railways enabling pastoral care across the whole of the mainland UK railway network. The National Rail Chaplaincy Service (NRCS) is designed to enhance and support the chain of care provided by the rail businesses.</p>\r\n");
      out.write("</div><br><br>\r\n");
      out.write("<button class=\"collapsible\">CONTACT</button>\r\n");
      out.write("<div class=\"content\">\r\n");
      out.write("  <p><div class=\"chip\">\r\n");
      out.write("  <img src=\"shahnwaj.JPG\" alt=\"shahnwaj\" width=\"96\" height=\"96\">\r\n");
      out.write(" Shahnwaj\r\n");
      out.write("</div></p>\r\n");
      out.write("</div><br><br>\r\n");
      out.write("<script>\r\n");
      out.write("var slideIndex = 0;\r\n");
      out.write("showSlides();\r\n");
      out.write("\r\n");
      out.write("function showSlides() {\r\n");
      out.write("  var i;\r\n");
      out.write("  var slides = document.getElementsByClassName(\"mySlides\");\r\n");
      out.write("  var dots = document.getElementsByClassName(\"dot\");\r\n");
      out.write("  for (i = 0; i < slides.length; i++) {\r\n");
      out.write("    slides[i].style.display = \"none\";  \r\n");
      out.write("  }\r\n");
      out.write("  slideIndex++;\r\n");
      out.write("  if (slideIndex > slides.length) {slideIndex = 1}    \r\n");
      out.write("  for (i = 0; i < dots.length; i++) {\r\n");
      out.write("    dots[i].className = dots[i].className.replace(\" active\", \"\");\r\n");
      out.write("  }\r\n");
      out.write("  slides[slideIndex-1].style.display = \"block\";  \r\n");
      out.write("  dots[slideIndex-1].className += \" active\";\r\n");
      out.write("  setTimeout(showSlides, 2000); // Change image every 2 seconds\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write("var coll = document.getElementsByClassName(\"collapsible\");\r\n");
      out.write("var i;\r\n");
      out.write("\r\n");
      out.write("for (i = 0; i < coll.length; i++) {\r\n");
      out.write("  coll[i].addEventListener(\"click\", function() {\r\n");
      out.write("    this.classList.toggle(\"active\");\r\n");
      out.write("    var content = this.nextElementSibling;\r\n");
      out.write("    if (content.style.display === \"block\") {\r\n");
      out.write("      content.style.display = \"none\";\r\n");
      out.write("    } else {\r\n");
      out.write("      content.style.display = \"block\";\r\n");
      out.write("    }\r\n");
      out.write("  });\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}