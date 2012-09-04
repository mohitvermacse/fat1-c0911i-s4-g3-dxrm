package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_html;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_styleId_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_errors_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_password_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_radio_value_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_styleId_styleClass_size_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_property;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_option_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_iterate_id_collection;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_submit_value_property_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_html = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_form_styleId_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_errors_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_password_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_radio_value_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_styleId_styleClass_size_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_select_property = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_option_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_iterate_id_collection = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_submit_value_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_html.release();
    _jspx_tagPool_html_form_styleId_action.release();
    _jspx_tagPool_html_text_property_nobody.release();
    _jspx_tagPool_html_errors_property_nobody.release();
    _jspx_tagPool_html_password_property_nobody.release();
    _jspx_tagPool_html_radio_value_property_nobody.release();
    _jspx_tagPool_html_text_styleId_styleClass_size_property_nobody.release();
    _jspx_tagPool_html_select_property.release();
    _jspx_tagPool_html_option_value_nobody.release();
    _jspx_tagPool_logic_iterate_id_collection.release();
    _jspx_tagPool_html_submit_value_property_nobody.release();
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      //  html:html
      org.apache.struts.taglib.html.HtmlTag _jspx_th_html_html_0 = (org.apache.struts.taglib.html.HtmlTag) _jspx_tagPool_html_html.get(org.apache.struts.taglib.html.HtmlTag.class);
      _jspx_th_html_html_0.setPageContext(_jspx_page_context);
      _jspx_th_html_html_0.setParent(null);
      int _jspx_eval_html_html_0 = _jspx_th_html_html_0.doStartTag();
      if (_jspx_eval_html_html_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("    <head>\n");
          out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
          out.write("        <title>Matrimony</title>\n");
          out.write("        <script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.4.4/jquery.min.js\"></script>\n");
          out.write("        <style type=\"text/css\">@import \"jquery.datepick.package-4.0.6/jquery.datepick.css\";</style> \n");
          out.write("        <style type=\"text/css\">\n");
          out.write("            label { width: 10em; float: left; }\n");
          out.write("            label.error { float: none; color: red; padding-left: .5em; vertical-align: top; }\n");
          out.write("        </style>\n");
          out.write("        <script type=\"text/javascript\" src=\"jquery.datepick.package-4.0.6/jquery.validate.js\"></script>\n");
          out.write("        <script type=\"text/javascript\" src=\"jquery.datepick.package-4.0.6/jquery.mousewheel.js\"></script>\n");
          out.write("        <script type=\"text/javascript\" src=\"jquery.datepick.package-4.0.6/jquery.datepick.js\"></script>\n");
          out.write("        <script type=\"text/javascript\" src=\"jquery.datepick.package-4.0.6/jquery.datepick.validation.js\"></script>\n");
          out.write("        <script type=\"text/javascript\">            \n");
          out.write("            function customRange(dates) { \n");
          out.write("                if (this.id == 'startPicker') { \n");
          out.write("                    $('#endPicker').datepick('option', 'minDate', dates[0] || null); \n");
          out.write("                } \n");
          out.write("                else { \n");
          out.write("                    $('#startPicker').datepick('option', 'maxDate', dates[0] || null); \n");
          out.write("                } \n");
          out.write("            }\n");
          out.write("            $(function() {                \n");
          out.write("                $('#startPicker').datepick({onSelect:customRange, showTrigger: '#calImg', dateFormat: 'mm/dd/yyyy'});\n");
          out.write("                $('#endPicker').datepick({onSelect: customRange, showTrigger: '#calImg', dateFormat: 'mm/dd/yyyy'}); \n");
          out.write("                $('#aDayPicker').datepick({showTrigger: '#calImg', dateFormat: 'mm/dd/yyyy'});\n");
          out.write("                $('#aMonthPicker').datepick({onSelect: customRange, showTrigger: '#calImg', dateFormat: 'mm/dd/yyyy'});\n");
          out.write("                $('#validateForm').validate({ \n");
          out.write("                    errorPlacement: $.datepick.errorPlacement, \n");
          out.write("                    rules: { \n");
          out.write("                        startPicker: { \n");
          out.write("                            required: true, \n");
          out.write("                            dpDate: true \n");
          out.write("                        },\n");
          out.write("                        endPicker: { \n");
          out.write("                            required: true, \n");
          out.write("                            dpDate: true \n");
          out.write("                        }\n");
          out.write("       \n");
          out.write("                    }, \n");
          out.write("                    messages: {                         \n");
          out.write("                        startPicker: 'Please enter a valid date',\n");
          out.write("                        endPicker: 'Please enter a valid date'\n");
          out.write("                    }});\n");
          out.write("                \n");
          out.write("            });\n");
          out.write("        </script>\n");
          out.write("    </head>\n");
          out.write("    <body>\n");
          out.write("        <div style=\"display: none;\">\n");
          out.write("            <img id=\"calImg\" src=\"jquery.datepick.package-4.0.6/calendar.gif\" alt=\"Popup\" class=\"trigger\">\n");
          out.write("        </div>\n");
          out.write("        <h1>Register</h1>\n");
          out.write("        ");
          bean.UserManager userManager = null;
          synchronized (session) {
            userManager = (bean.UserManager) _jspx_page_context.getAttribute("userManager", PageContext.SESSION_SCOPE);
            if (userManager == null){
              userManager = new bean.UserManager();
              _jspx_page_context.setAttribute("userManager", userManager, PageContext.SESSION_SCOPE);
            }
          }
          out.write("\n");
          out.write("        ");
          //  html:form
          org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_styleId_action.get(org.apache.struts.taglib.html.FormTag.class);
          _jspx_th_html_form_0.setPageContext(_jspx_page_context);
          _jspx_th_html_form_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
          _jspx_th_html_form_0.setAction("RegisterAction");
          _jspx_th_html_form_0.setStyleId("validateForm");
          int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
          if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("            <table>\n");
              out.write("                <tr>\n");
              out.write("                    <td>UserName: </td>\n");
              out.write("                    <td>\n");
              out.write("                        ");
              if (_jspx_meth_html_text_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("                        <font style=\"color: red\">*</font>\n");
              out.write("                    </td>\n");
              out.write("                    <td>\n");
              out.write("                        <font style=\"color: red\">\n");
              out.write("                            ");
              if (_jspx_meth_html_errors_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("                            ");
              if (_jspx_meth_html_errors_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("                        </font>\n");
              out.write("                    </td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Password: </td>\n");
              out.write("                    <td>\n");
              out.write("                        ");
              if (_jspx_meth_html_password_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("                        <font style=\"color: red\">*</font>\n");
              out.write("                    </td>\n");
              out.write("                    <td>\n");
              out.write("                        <font style=\"color: red\">\n");
              out.write("                            ");
              if (_jspx_meth_html_errors_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("                        </font>\n");
              out.write("                    </td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Re-enter passwword: </td>\n");
              out.write("                    <td>\n");
              out.write("                        ");
              if (_jspx_meth_html_password_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("                        <font style=\"color: red\">*</font>\n");
              out.write("                    </td>\n");
              out.write("                    <td>\n");
              out.write("                        <font style=\"color: red\">\n");
              out.write("                            ");
              if (_jspx_meth_html_errors_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("                        </font>\n");
              out.write("                    </td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Full Name: </td>\n");
              out.write("                    <td>\n");
              out.write("                        ");
              if (_jspx_meth_html_text_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("                        <font style=\"color: red\">*</font>\n");
              out.write("                    </td>\n");
              out.write("                    <td>\n");
              out.write("                        <font style=\"color: red\">\n");
              out.write("                            ");
              if (_jspx_meth_html_errors_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("                        </font>\n");
              out.write("                    </td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Address: </td>\n");
              out.write("                    <td>\n");
              out.write("                        ");
              if (_jspx_meth_html_text_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("                        <font style=\"color: red\">*</font>\n");
              out.write("                    </td>\n");
              out.write("                    <td>\n");
              out.write("                        <font style=\"color: red\">\n");
              out.write("                            ");
              if (_jspx_meth_html_errors_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("                        </font>\n");
              out.write("                    </td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Gender: </td>\n");
              out.write("                    <td>\n");
              out.write("                        Male ");
              if (_jspx_meth_html_radio_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("                        Female ");
              if (_jspx_meth_html_radio_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("                        <font style=\"color: red\">*</font>\n");
              out.write("                    </td>\n");
              out.write("                    <td>\n");
              out.write("                        <font style=\"color: red\">\n");
              out.write("                            ");
              if (_jspx_meth_html_errors_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("                        </font>\n");
              out.write("                    </td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>BirthDay: </td>\n");
              out.write("                    <td>\n");
              out.write("                        ");
              if (_jspx_meth_html_text_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("                        \n");
              out.write("                        <font style=\"color: red\">*</font> Format: mm/dd/yyyy\n");
              out.write("                    </td>\n");
              out.write("                    <td>\n");
              out.write("                        <font style=\"color: red\">\n");
              out.write("                            ");
              if (_jspx_meth_html_errors_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("                        \n");
              out.write("                            ");
              if (_jspx_meth_html_errors_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("                        </font>    \n");
              out.write("                    </td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Email: </td>\n");
              out.write("                    <td>\n");
              out.write("                        ");
              if (_jspx_meth_html_text_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write(" \n");
              out.write("                        <font style=\"color: red\">*</font> Exam: luka@org.com.vn\n");
              out.write("                    </td>\n");
              out.write("                    <td>\n");
              out.write("                        <font style=\"color: red\">\n");
              out.write("                            ");
              if (_jspx_meth_html_errors_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("                            ");
              if (_jspx_meth_html_errors_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("                        </font>\n");
              out.write("                    </td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Phone Number: </td>\n");
              out.write("                    <td>\n");
              out.write("                        ");
              if (_jspx_meth_html_text_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("                        <font style=\"color: red\">*</font>\n");
              out.write("                    </td>\n");
              out.write("                    <td>\n");
              out.write("                        <font style=\"color: red\">\n");
              out.write("                            ");
              if (_jspx_meth_html_errors_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("                        </font>\n");
              out.write("                    </td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Marital Status: </td>\n");
              out.write("                    <td>\n");
              out.write("                        ");
              if (_jspx_meth_html_select_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("                        <font style=\"color: red\">*</font>\n");
              out.write("                    </td>\n");
              out.write("                    <td></td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Country: </td>\n");
              out.write("                    <td>\n");
              out.write("                        ");
              //  html:select
              org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_1 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_property.get(org.apache.struts.taglib.html.SelectTag.class);
              _jspx_th_html_select_1.setPageContext(_jspx_page_context);
              _jspx_th_html_select_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
              _jspx_th_html_select_1.setProperty("countryName");
              int _jspx_eval_html_select_1 = _jspx_th_html_select_1.doStartTag();
              if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_select_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_select_1.doInitBody();
                }
                do {
                  out.write("\n");
                  out.write("                            ");
                  //  logic:iterate
                  org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_0 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_id_collection.get(org.apache.struts.taglib.logic.IterateTag.class);
                  _jspx_th_logic_iterate_0.setPageContext(_jspx_page_context);
                  _jspx_th_logic_iterate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_1);
                  _jspx_th_logic_iterate_0.setId("country");
                  _jspx_th_logic_iterate_0.setCollection((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userManager.countryList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
                  int _jspx_eval_logic_iterate_0 = _jspx_th_logic_iterate_0.doStartTag();
                  if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_logic_iterate_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_logic_iterate_0.doInitBody();
                    }
                    do {
                      out.write("\n");
                      out.write("                                ");
                      if (_jspx_meth_html_option_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_logic_iterate_0, _jspx_page_context))
                        return;
                      out.write("\n");
                      out.write("                            ");
                      int evalDoAfterBody = _jspx_th_logic_iterate_0.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                      out = _jspx_page_context.popBody();
                  }
                  if (_jspx_th_logic_iterate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_iterate_id_collection.reuse(_jspx_th_logic_iterate_0);
                    return;
                  }
                  _jspx_tagPool_logic_iterate_id_collection.reuse(_jspx_th_logic_iterate_0);
                  out.write("\n");
                  out.write("                        ");
                  int evalDoAfterBody = _jspx_th_html_select_1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = _jspx_page_context.popBody();
              }
              if (_jspx_th_html_select_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_html_select_property.reuse(_jspx_th_html_select_1);
                return;
              }
              _jspx_tagPool_html_select_property.reuse(_jspx_th_html_select_1);
              out.write("\n");
              out.write("                        <font style=\"color: red\">*</font>\n");
              out.write("                    </td>\n");
              out.write("                    <td></td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>City: </td>\n");
              out.write("                    <td>\n");
              out.write("                        ");
              //  html:select
              org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_2 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_property.get(org.apache.struts.taglib.html.SelectTag.class);
              _jspx_th_html_select_2.setPageContext(_jspx_page_context);
              _jspx_th_html_select_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
              _jspx_th_html_select_2.setProperty("cityName");
              int _jspx_eval_html_select_2 = _jspx_th_html_select_2.doStartTag();
              if (_jspx_eval_html_select_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_select_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_select_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_select_2.doInitBody();
                }
                do {
                  out.write("\n");
                  out.write("                            ");
                  //  logic:iterate
                  org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_1 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_id_collection.get(org.apache.struts.taglib.logic.IterateTag.class);
                  _jspx_th_logic_iterate_1.setPageContext(_jspx_page_context);
                  _jspx_th_logic_iterate_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_2);
                  _jspx_th_logic_iterate_1.setId("city");
                  _jspx_th_logic_iterate_1.setCollection((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userManager.cityList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
                  int _jspx_eval_logic_iterate_1 = _jspx_th_logic_iterate_1.doStartTag();
                  if (_jspx_eval_logic_iterate_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_logic_iterate_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_logic_iterate_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_logic_iterate_1.doInitBody();
                    }
                    do {
                      out.write("\n");
                      out.write("                                ");
                      if (_jspx_meth_html_option_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_logic_iterate_1, _jspx_page_context))
                        return;
                      out.write("\n");
                      out.write("                            ");
                      int evalDoAfterBody = _jspx_th_logic_iterate_1.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_logic_iterate_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                      out = _jspx_page_context.popBody();
                  }
                  if (_jspx_th_logic_iterate_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_iterate_id_collection.reuse(_jspx_th_logic_iterate_1);
                    return;
                  }
                  _jspx_tagPool_logic_iterate_id_collection.reuse(_jspx_th_logic_iterate_1);
                  out.write("\n");
                  out.write("                        ");
                  int evalDoAfterBody = _jspx_th_html_select_2.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_select_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = _jspx_page_context.popBody();
              }
              if (_jspx_th_html_select_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_html_select_property.reuse(_jspx_th_html_select_2);
                return;
              }
              _jspx_tagPool_html_select_property.reuse(_jspx_th_html_select_2);
              out.write("\n");
              out.write("                        <font style=\"color: red\">*</font>\n");
              out.write("                    </td>\n");
              out.write("                    <td></td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Height: </td>\n");
              out.write("                    <td>\n");
              out.write("                        ");
              if (_jspx_meth_html_text_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write(" Cm \n");
              out.write("                        <font style=\"color: red\">*</font>\n");
              out.write("                    </td>\n");
              out.write("                    <td>\n");
              out.write("                        <font style=\"color: red\">\n");
              out.write("                            ");
              if (_jspx_meth_html_errors_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("                        </font>    \n");
              out.write("                    </td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Languages: </td>\n");
              out.write("                    <td>");
              if (_jspx_meth_html_text_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("</td>\n");
              out.write("                    <td></td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Caste: </td>\n");
              out.write("                    <td>");
              if (_jspx_meth_html_text_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("</td>\n");
              out.write("                    <td></td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Family Details: </td>\n");
              out.write("                    <td>");
              if (_jspx_meth_html_text_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("</td>\n");
              out.write("                    <td></td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Qualification: </td>\n");
              out.write("                    <td>");
              if (_jspx_meth_html_text_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("</td>\n");
              out.write("                    <td></td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Working At: </td>\n");
              out.write("                    <td>");
              if (_jspx_meth_html_text_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("</td>\n");
              out.write("                    <td></td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Hobbies: </td>\n");
              out.write("                    <td>");
              if (_jspx_meth_html_text_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("</td>\n");
              out.write("                    <td></td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Favorite Music: </td>\n");
              out.write("                    <td>");
              if (_jspx_meth_html_text_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("</td>\n");
              out.write("                    <td></td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Movies: </td>\n");
              out.write("                    <td>");
              if (_jspx_meth_html_text_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("</td>\n");
              out.write("                    <td></td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Cuisine: </td>\n");
              out.write("                    <td>");
              if (_jspx_meth_html_text_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("</td>\n");
              out.write("                    <td></td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Books: </td>\n");
              out.write("                    <td>");
              if (_jspx_meth_html_text_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("</td>\n");
              out.write("                    <td></td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>");
              if (_jspx_meth_html_submit_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("</td>\n");
              out.write("                    <td></td>\n");
              out.write("                    <td></td>\n");
              out.write("                </tr>\n");
              out.write("            </table>\n");
              out.write("        ");
              int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_html_form_styleId_action.reuse(_jspx_th_html_form_0);
            return;
          }
          _jspx_tagPool_html_form_styleId_action.reuse(_jspx_th_html_form_0);
          out.write("\n");
          out.write("    </body>\n");
          int evalDoAfterBody = _jspx_th_html_html_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_html_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_html_html.reuse(_jspx_th_html_html_0);
        return;
      }
      _jspx_tagPool_html_html.reuse(_jspx_th_html_html_0);
      out.write('\n');
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

  private boolean _jspx_meth_html_text_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_0 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_0.setPageContext(_jspx_page_context);
    _jspx_th_html_text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_0.setProperty("userName");
    int _jspx_eval_html_text_0 = _jspx_th_html_text_0.doStartTag();
    if (_jspx_th_html_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_0);
      return true;
    }
    _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_0);
    return false;
  }

  private boolean _jspx_meth_html_errors_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_0 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_property_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_0.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_errors_0.setProperty("userNameError");
    int _jspx_eval_html_errors_0 = _jspx_th_html_errors_0.doStartTag();
    if (_jspx_th_html_errors_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_0);
      return true;
    }
    _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_0);
    return false;
  }

  private boolean _jspx_meth_html_errors_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_1 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_property_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_1.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_errors_1.setProperty("existed");
    int _jspx_eval_html_errors_1 = _jspx_th_html_errors_1.doStartTag();
    if (_jspx_th_html_errors_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_1);
      return true;
    }
    _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_1);
    return false;
  }

  private boolean _jspx_meth_html_password_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:password
    org.apache.struts.taglib.html.PasswordTag _jspx_th_html_password_0 = (org.apache.struts.taglib.html.PasswordTag) _jspx_tagPool_html_password_property_nobody.get(org.apache.struts.taglib.html.PasswordTag.class);
    _jspx_th_html_password_0.setPageContext(_jspx_page_context);
    _jspx_th_html_password_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_password_0.setProperty("password");
    int _jspx_eval_html_password_0 = _jspx_th_html_password_0.doStartTag();
    if (_jspx_th_html_password_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_password_property_nobody.reuse(_jspx_th_html_password_0);
      return true;
    }
    _jspx_tagPool_html_password_property_nobody.reuse(_jspx_th_html_password_0);
    return false;
  }

  private boolean _jspx_meth_html_errors_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_2 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_property_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_2.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_errors_2.setProperty("passwordError");
    int _jspx_eval_html_errors_2 = _jspx_th_html_errors_2.doStartTag();
    if (_jspx_th_html_errors_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_2);
      return true;
    }
    _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_2);
    return false;
  }

  private boolean _jspx_meth_html_password_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:password
    org.apache.struts.taglib.html.PasswordTag _jspx_th_html_password_1 = (org.apache.struts.taglib.html.PasswordTag) _jspx_tagPool_html_password_property_nobody.get(org.apache.struts.taglib.html.PasswordTag.class);
    _jspx_th_html_password_1.setPageContext(_jspx_page_context);
    _jspx_th_html_password_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_password_1.setProperty("rePassword");
    int _jspx_eval_html_password_1 = _jspx_th_html_password_1.doStartTag();
    if (_jspx_th_html_password_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_password_property_nobody.reuse(_jspx_th_html_password_1);
      return true;
    }
    _jspx_tagPool_html_password_property_nobody.reuse(_jspx_th_html_password_1);
    return false;
  }

  private boolean _jspx_meth_html_errors_3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_3 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_property_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_3.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_errors_3.setProperty("passwordNotMatch");
    int _jspx_eval_html_errors_3 = _jspx_th_html_errors_3.doStartTag();
    if (_jspx_th_html_errors_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_3);
      return true;
    }
    _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_3);
    return false;
  }

  private boolean _jspx_meth_html_text_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_1 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_1.setPageContext(_jspx_page_context);
    _jspx_th_html_text_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_1.setProperty("fullName");
    int _jspx_eval_html_text_1 = _jspx_th_html_text_1.doStartTag();
    if (_jspx_th_html_text_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_1);
      return true;
    }
    _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_1);
    return false;
  }

  private boolean _jspx_meth_html_errors_4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_4 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_property_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_4.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_errors_4.setProperty("fullNameError");
    int _jspx_eval_html_errors_4 = _jspx_th_html_errors_4.doStartTag();
    if (_jspx_th_html_errors_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_4);
      return true;
    }
    _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_4);
    return false;
  }

  private boolean _jspx_meth_html_text_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_2 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_2.setPageContext(_jspx_page_context);
    _jspx_th_html_text_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_2.setProperty("address");
    int _jspx_eval_html_text_2 = _jspx_th_html_text_2.doStartTag();
    if (_jspx_th_html_text_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_2);
      return true;
    }
    _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_2);
    return false;
  }

  private boolean _jspx_meth_html_errors_5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_5 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_property_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_5.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_errors_5.setProperty("addressError");
    int _jspx_eval_html_errors_5 = _jspx_th_html_errors_5.doStartTag();
    if (_jspx_th_html_errors_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_5);
      return true;
    }
    _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_5);
    return false;
  }

  private boolean _jspx_meth_html_radio_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:radio
    org.apache.struts.taglib.html.RadioTag _jspx_th_html_radio_0 = (org.apache.struts.taglib.html.RadioTag) _jspx_tagPool_html_radio_value_property_nobody.get(org.apache.struts.taglib.html.RadioTag.class);
    _jspx_th_html_radio_0.setPageContext(_jspx_page_context);
    _jspx_th_html_radio_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_radio_0.setProperty("gender");
    _jspx_th_html_radio_0.setValue("Male");
    int _jspx_eval_html_radio_0 = _jspx_th_html_radio_0.doStartTag();
    if (_jspx_th_html_radio_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_radio_value_property_nobody.reuse(_jspx_th_html_radio_0);
      return true;
    }
    _jspx_tagPool_html_radio_value_property_nobody.reuse(_jspx_th_html_radio_0);
    return false;
  }

  private boolean _jspx_meth_html_radio_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:radio
    org.apache.struts.taglib.html.RadioTag _jspx_th_html_radio_1 = (org.apache.struts.taglib.html.RadioTag) _jspx_tagPool_html_radio_value_property_nobody.get(org.apache.struts.taglib.html.RadioTag.class);
    _jspx_th_html_radio_1.setPageContext(_jspx_page_context);
    _jspx_th_html_radio_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_radio_1.setProperty("gender");
    _jspx_th_html_radio_1.setValue("Female");
    int _jspx_eval_html_radio_1 = _jspx_th_html_radio_1.doStartTag();
    if (_jspx_th_html_radio_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_radio_value_property_nobody.reuse(_jspx_th_html_radio_1);
      return true;
    }
    _jspx_tagPool_html_radio_value_property_nobody.reuse(_jspx_th_html_radio_1);
    return false;
  }

  private boolean _jspx_meth_html_errors_6(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_6 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_property_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_6.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_errors_6.setProperty("genderError");
    int _jspx_eval_html_errors_6 = _jspx_th_html_errors_6.doStartTag();
    if (_jspx_th_html_errors_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_6);
      return true;
    }
    _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_6);
    return false;
  }

  private boolean _jspx_meth_html_text_3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_3 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleId_styleClass_size_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_3.setPageContext(_jspx_page_context);
    _jspx_th_html_text_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_3.setProperty("birthDay");
    _jspx_th_html_text_3.setStyleId("aDayPicker");
    _jspx_th_html_text_3.setSize("12");
    _jspx_th_html_text_3.setStyleClass("dpDate");
    int _jspx_eval_html_text_3 = _jspx_th_html_text_3.doStartTag();
    if (_jspx_th_html_text_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_styleId_styleClass_size_property_nobody.reuse(_jspx_th_html_text_3);
      return true;
    }
    _jspx_tagPool_html_text_styleId_styleClass_size_property_nobody.reuse(_jspx_th_html_text_3);
    return false;
  }

  private boolean _jspx_meth_html_errors_7(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_7 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_property_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_7.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_errors_7.setProperty("birthdayError");
    int _jspx_eval_html_errors_7 = _jspx_th_html_errors_7.doStartTag();
    if (_jspx_th_html_errors_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_7);
      return true;
    }
    _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_7);
    return false;
  }

  private boolean _jspx_meth_html_errors_8(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_8 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_property_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_8.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_errors_8.setProperty("birthdayInvalid");
    int _jspx_eval_html_errors_8 = _jspx_th_html_errors_8.doStartTag();
    if (_jspx_th_html_errors_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_8);
      return true;
    }
    _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_8);
    return false;
  }

  private boolean _jspx_meth_html_text_4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_4 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_4.setPageContext(_jspx_page_context);
    _jspx_th_html_text_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_4.setProperty("email");
    int _jspx_eval_html_text_4 = _jspx_th_html_text_4.doStartTag();
    if (_jspx_th_html_text_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_4);
      return true;
    }
    _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_4);
    return false;
  }

  private boolean _jspx_meth_html_errors_9(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_9 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_property_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_9.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_errors_9.setProperty("emailExisted");
    int _jspx_eval_html_errors_9 = _jspx_th_html_errors_9.doStartTag();
    if (_jspx_th_html_errors_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_9);
      return true;
    }
    _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_9);
    return false;
  }

  private boolean _jspx_meth_html_errors_10(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_10 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_property_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_10.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_errors_10.setProperty("invalidEmail");
    int _jspx_eval_html_errors_10 = _jspx_th_html_errors_10.doStartTag();
    if (_jspx_th_html_errors_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_10);
      return true;
    }
    _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_10);
    return false;
  }

  private boolean _jspx_meth_html_text_5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_5 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_5.setPageContext(_jspx_page_context);
    _jspx_th_html_text_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_5.setProperty("phoneNumber");
    int _jspx_eval_html_text_5 = _jspx_th_html_text_5.doStartTag();
    if (_jspx_th_html_text_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_5);
      return true;
    }
    _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_5);
    return false;
  }

  private boolean _jspx_meth_html_errors_11(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_11 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_property_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_11.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_errors_11.setProperty("phoneInvalid");
    int _jspx_eval_html_errors_11 = _jspx_th_html_errors_11.doStartTag();
    if (_jspx_th_html_errors_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_11);
      return true;
    }
    _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_11);
    return false;
  }

  private boolean _jspx_meth_html_select_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_0 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_property.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_select_0.setPageContext(_jspx_page_context);
    _jspx_th_html_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_select_0.setProperty("maritalStatus");
    int _jspx_eval_html_select_0 = _jspx_th_html_select_0.doStartTag();
    if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_select_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_select_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_html_option_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_select_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_html_option_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_select_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_html_select_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_select_property.reuse(_jspx_th_html_select_0);
      return true;
    }
    _jspx_tagPool_html_select_property.reuse(_jspx_th_html_select_0);
    return false;
  }

  private boolean _jspx_meth_html_option_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_0 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value_nobody.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_0.setPageContext(_jspx_page_context);
    _jspx_th_html_option_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_0);
    _jspx_th_html_option_0.setValue("Single");
    int _jspx_eval_html_option_0 = _jspx_th_html_option_0.doStartTag();
    if (_jspx_th_html_option_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_option_value_nobody.reuse(_jspx_th_html_option_0);
      return true;
    }
    _jspx_tagPool_html_option_value_nobody.reuse(_jspx_th_html_option_0);
    return false;
  }

  private boolean _jspx_meth_html_option_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_1 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value_nobody.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_1.setPageContext(_jspx_page_context);
    _jspx_th_html_option_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_0);
    _jspx_th_html_option_1.setValue("Marrie");
    int _jspx_eval_html_option_1 = _jspx_th_html_option_1.doStartTag();
    if (_jspx_th_html_option_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_option_value_nobody.reuse(_jspx_th_html_option_1);
      return true;
    }
    _jspx_tagPool_html_option_value_nobody.reuse(_jspx_th_html_option_1);
    return false;
  }

  private boolean _jspx_meth_html_option_2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_2 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value_nobody.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_2.setPageContext(_jspx_page_context);
    _jspx_th_html_option_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
    _jspx_th_html_option_2.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${country}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_html_option_2 = _jspx_th_html_option_2.doStartTag();
    if (_jspx_th_html_option_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_option_value_nobody.reuse(_jspx_th_html_option_2);
      return true;
    }
    _jspx_tagPool_html_option_value_nobody.reuse(_jspx_th_html_option_2);
    return false;
  }

  private boolean _jspx_meth_html_option_3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_3 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value_nobody.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_3.setPageContext(_jspx_page_context);
    _jspx_th_html_option_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_1);
    _jspx_th_html_option_3.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${city}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_html_option_3 = _jspx_th_html_option_3.doStartTag();
    if (_jspx_th_html_option_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_option_value_nobody.reuse(_jspx_th_html_option_3);
      return true;
    }
    _jspx_tagPool_html_option_value_nobody.reuse(_jspx_th_html_option_3);
    return false;
  }

  private boolean _jspx_meth_html_text_6(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_6 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_6.setPageContext(_jspx_page_context);
    _jspx_th_html_text_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_6.setProperty("height");
    int _jspx_eval_html_text_6 = _jspx_th_html_text_6.doStartTag();
    if (_jspx_th_html_text_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_6);
      return true;
    }
    _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_6);
    return false;
  }

  private boolean _jspx_meth_html_errors_12(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_12 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_property_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_12.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_errors_12.setProperty("heightInvalid");
    int _jspx_eval_html_errors_12 = _jspx_th_html_errors_12.doStartTag();
    if (_jspx_th_html_errors_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_12);
      return true;
    }
    _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_12);
    return false;
  }

  private boolean _jspx_meth_html_text_7(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_7 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_7.setPageContext(_jspx_page_context);
    _jspx_th_html_text_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_7.setProperty("languages");
    int _jspx_eval_html_text_7 = _jspx_th_html_text_7.doStartTag();
    if (_jspx_th_html_text_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_7);
      return true;
    }
    _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_7);
    return false;
  }

  private boolean _jspx_meth_html_text_8(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_8 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_8.setPageContext(_jspx_page_context);
    _jspx_th_html_text_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_8.setProperty("caste");
    int _jspx_eval_html_text_8 = _jspx_th_html_text_8.doStartTag();
    if (_jspx_th_html_text_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_8);
      return true;
    }
    _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_8);
    return false;
  }

  private boolean _jspx_meth_html_text_9(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_9 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_9.setPageContext(_jspx_page_context);
    _jspx_th_html_text_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_9.setProperty("familyDetails");
    int _jspx_eval_html_text_9 = _jspx_th_html_text_9.doStartTag();
    if (_jspx_th_html_text_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_9);
      return true;
    }
    _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_9);
    return false;
  }

  private boolean _jspx_meth_html_text_10(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_10 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_10.setPageContext(_jspx_page_context);
    _jspx_th_html_text_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_10.setProperty("qualification");
    int _jspx_eval_html_text_10 = _jspx_th_html_text_10.doStartTag();
    if (_jspx_th_html_text_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_10);
      return true;
    }
    _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_10);
    return false;
  }

  private boolean _jspx_meth_html_text_11(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_11 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_11.setPageContext(_jspx_page_context);
    _jspx_th_html_text_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_11.setProperty("workingAt");
    int _jspx_eval_html_text_11 = _jspx_th_html_text_11.doStartTag();
    if (_jspx_th_html_text_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_11);
      return true;
    }
    _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_11);
    return false;
  }

  private boolean _jspx_meth_html_text_12(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_12 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_12.setPageContext(_jspx_page_context);
    _jspx_th_html_text_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_12.setProperty("hobbies");
    int _jspx_eval_html_text_12 = _jspx_th_html_text_12.doStartTag();
    if (_jspx_th_html_text_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_12);
      return true;
    }
    _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_12);
    return false;
  }

  private boolean _jspx_meth_html_text_13(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_13 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_13.setPageContext(_jspx_page_context);
    _jspx_th_html_text_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_13.setProperty("favoriteMusic");
    int _jspx_eval_html_text_13 = _jspx_th_html_text_13.doStartTag();
    if (_jspx_th_html_text_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_13);
      return true;
    }
    _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_13);
    return false;
  }

  private boolean _jspx_meth_html_text_14(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_14 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_14.setPageContext(_jspx_page_context);
    _jspx_th_html_text_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_14.setProperty("movies");
    int _jspx_eval_html_text_14 = _jspx_th_html_text_14.doStartTag();
    if (_jspx_th_html_text_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_14);
      return true;
    }
    _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_14);
    return false;
  }

  private boolean _jspx_meth_html_text_15(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_15 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_15.setPageContext(_jspx_page_context);
    _jspx_th_html_text_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_15.setProperty("cuisine");
    int _jspx_eval_html_text_15 = _jspx_th_html_text_15.doStartTag();
    if (_jspx_th_html_text_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_15);
      return true;
    }
    _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_15);
    return false;
  }

  private boolean _jspx_meth_html_text_16(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_16 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_16.setPageContext(_jspx_page_context);
    _jspx_th_html_text_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_16.setProperty("books");
    int _jspx_eval_html_text_16 = _jspx_th_html_text_16.doStartTag();
    if (_jspx_th_html_text_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_16);
      return true;
    }
    _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_16);
    return false;
  }

  private boolean _jspx_meth_html_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_submit_0 = (org.apache.struts.taglib.html.SubmitTag) _jspx_tagPool_html_submit_value_property_nobody.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_html_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_submit_0.setProperty("submit");
    _jspx_th_html_submit_0.setValue("Register");
    int _jspx_eval_html_submit_0 = _jspx_th_html_submit_0.doStartTag();
    if (_jspx_th_html_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_submit_value_property_nobody.reuse(_jspx_th_html_submit_0);
      return true;
    }
    _jspx_tagPool_html_submit_value_property_nobody.reuse(_jspx_th_html_submit_0);
    return false;
  }
}
