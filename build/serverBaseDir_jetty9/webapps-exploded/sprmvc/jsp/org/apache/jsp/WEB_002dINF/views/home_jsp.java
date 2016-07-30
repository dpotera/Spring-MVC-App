package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import sprmvc.web.HomeController;
import java.util.Date;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


        private String createList(String[] array){
            String result = "<ul class=\"collection\">\n";
            for(String li:array)
                result += "<li class=\"collection-item\">"+li+"</li>\n";
            return result+"</ul>\n";
        }
    
 HomeController controller = new HomeController(); 
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_escapeBody_htmlEscape;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_message_code_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_escapeBody_htmlEscape = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_message_code_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_escapeBody_htmlEscape.release();
    _jspx_tagPool_s_message_code_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col s12\">\n");
      out.write("                <h1>");
      if (_jspx_meth_s_message_0(_jspx_page_context))
        return;
      out.write("</h1>\n");
      out.write("                ");
      out.write("\n");
      out.write("                <h3>Today is: ");
      out.print( new Date() );
      out.write("</h3>\n");
      out.write("\n");
      out.write("                <code class=\"card card-panel black-text indigo lighten-5\">\n");
      out.write("                    <div class=\"card-title\">HTML code using &lt;spring:escapeBody htmlEscape</div>\n");
      out.write("                    ");
      if (_jspx_meth_s_escapeBody_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </code>\n");
      out.write("\n");
      out.write("                ");
      out.print( createList(new String[] {"Dominik","Adam","Name","Surname","Lorem","Ipsum"}) );
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_s_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_s_message_0 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_s_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_s_message_0.setPageContext(_jspx_page_context);
    _jspx_th_s_message_0.setParent(null);
    _jspx_th_s_message_0.setCode("home.helloWorld");
    int[] _jspx_push_body_count_s_message_0 = new int[] { 0 };
    try {
      int _jspx_eval_s_message_0 = _jspx_th_s_message_0.doStartTag();
      if (_jspx_th_s_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_s_message_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_s_message_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_s_message_0.doFinally();
      _jspx_tagPool_s_message_code_nobody.reuse(_jspx_th_s_message_0);
    }
    return false;
  }

  private boolean _jspx_meth_s_escapeBody_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:escapeBody
    org.springframework.web.servlet.tags.EscapeBodyTag _jspx_th_s_escapeBody_0 = (org.springframework.web.servlet.tags.EscapeBodyTag) _jspx_tagPool_s_escapeBody_htmlEscape.get(org.springframework.web.servlet.tags.EscapeBodyTag.class);
    _jspx_th_s_escapeBody_0.setPageContext(_jspx_page_context);
    _jspx_th_s_escapeBody_0.setParent(null);
    _jspx_th_s_escapeBody_0.setHtmlEscape(true);
    int[] _jspx_push_body_count_s_escapeBody_0 = new int[] { 0 };
    try {
      int _jspx_eval_s_escapeBody_0 = _jspx_th_s_escapeBody_0.doStartTag();
      if (_jspx_eval_s_escapeBody_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_s_escapeBody_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_s_escapeBody_0[0]++;
          _jspx_th_s_escapeBody_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_s_escapeBody_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("                        <div class=\"html-escaped\">\n");
          out.write("                            Div content\n");
          out.write("                        </div>\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_s_escapeBody_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_s_escapeBody_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_s_escapeBody_0[0]--;
      }
      if (_jspx_th_s_escapeBody_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_s_escapeBody_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_s_escapeBody_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_s_escapeBody_0.doFinally();
      _jspx_tagPool_s_escapeBody_htmlEscape.reuse(_jspx_th_s_escapeBody_0);
    }
    return false;
  }
}
