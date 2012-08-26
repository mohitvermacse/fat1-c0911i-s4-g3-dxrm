package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class upload_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Matrimony Image Upload</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width\">\n");
      out.write("        <!-- Bootstrap CSS Toolkit styles -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <!-- Generic page styles -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <!-- Bootstrap styles for responsive website layout, supporting different screen sizes -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap-responsive.min.css\">\n");
      out.write("        <!-- Bootstrap CSS fixes for IE6 -->\n");
      out.write("        <!--[if lt IE 7]><link rel=\"stylesheet\" href=\"http://blueimp.github.com/cdn/css/bootstrap-ie6.min.css\"><![endif]-->\n");
      out.write("        <!-- Bootstrap Image Gallery styles -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap-image-gallery.min.css\">\n");
      out.write("        <!-- CSS to style the file input field as button and adjust the Bootstrap progress bars -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/jquery.fileupload-ui.css\">\n");
      out.write("        <!-- Shim to make HTML5 elements usable in older Internet Explorer versions -->\n");
      out.write("        <!--[if lt IE 9]><script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script><![endif]-->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"page-header\">\n");
      out.write("                <h1>Matrimony Image Upload</h1>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <br>\n");
      out.write("            <!-- The file upload form used as target for the file upload widget -->\n");
      out.write("            <form id=\"fileupload\" action=\"upload\" method=\"POST\" enctype=\"multipart/form-data\">\n");
      out.write("                <!-- The fileupload-buttonbar contains buttons to add/delete files and start/cancel the upload -->\n");
      out.write("                <input type=\"hidden\" value=\"1\" name=\"id\"/>\n");
      out.write("                <div class=\"row fileupload-buttonbar\">\n");
      out.write("                    <div class=\"span7\">\n");
      out.write("                        <!-- The fileinput-button span is used to style the file input field as button -->\n");
      out.write("                        <span class=\"btn btn-success fileinput-button\">\n");
      out.write("                            <i class=\"icon-plus icon-white\"></i>\n");
      out.write("                            <span>Add files...</span>\n");
      out.write("                            <input type=\"file\" name=\"files[]\" multiple>\n");
      out.write("                        </span>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary start\">\n");
      out.write("                            <i class=\"icon-upload icon-white\"></i>\n");
      out.write("                            <span>Start upload</span>\n");
      out.write("                        </button>\n");
      out.write("                        <button type=\"reset\" class=\"btn btn-warning cancel\">\n");
      out.write("                            <i class=\"icon-ban-circle icon-white\"></i>\n");
      out.write("                            <span>Cancel upload</span>\n");
      out.write("                        </button>\n");
      out.write("                        <button type=\"button\" class=\"btn btn-danger delete\">\n");
      out.write("                            <i class=\"icon-trash icon-white\"></i>\n");
      out.write("                            <span>Delete</span>\n");
      out.write("                        </button>\n");
      out.write("                        <input type=\"checkbox\" class=\"toggle\">\n");
      out.write("                    </div>\n");
      out.write("                    <!-- The global progress information -->\n");
      out.write("                    <div class=\"span5 fileupload-progress fade\">\n");
      out.write("                        <!-- The global progress bar -->\n");
      out.write("                        <div class=\"progress progress-success progress-striped active\" role=\"progressbar\" aria-valuemin=\"0\" aria-valuemax=\"100\">\n");
      out.write("                            <div class=\"bar\" style=\"width:0%;\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- The extended global progress information -->\n");
      out.write("                        <div class=\"progress-extended\">&nbsp;</div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- The loading indicator is shown during file processing -->\n");
      out.write("                <div class=\"fileupload-loading\"></div>\n");
      out.write("                <br>\n");
      out.write("                <!-- The table listing the files available for upload/download -->\n");
      out.write("                <table role=\"presentation\" class=\"table table-striped\"><tbody class=\"files\" data-toggle=\"modal-gallery\" data-target=\"#modal-gallery\"></tbody></table>\n");
      out.write("            </form>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"well\">\n");
      out.write("                <h3>Upload Notes</h3>\n");
      out.write("                <ul>\n");
      out.write("                    <li>The maximum file size for uploads in this demo is <strong>5 MB</strong></li>\n");
      out.write("                    <li>Only image files (<strong>JPG, GIF, PNG</strong>) are allowed in this demo (by default there is no file type restriction).</li>\n");
      out.write("                    <li>Uploaded files will be deleted automatically after <strong>5 minutes</strong> (demo setting).</li>\n");
      out.write("                    <li>You can <strong>drag &amp; drop</strong> files from your desktop on this webpage with Google Chrome, Mozilla Firefox and Apple Safari.</li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- modal-gallery is the modal dialog used for the image gallery -->\n");
      out.write("        <div id=\"modal-gallery\" class=\"modal modal-gallery hide fade\" data-filter=\":odd\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <a class=\"close\" data-dismiss=\"modal\">&times;</a>\n");
      out.write("                <h3 class=\"modal-title\"></h3>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\"><div class=\"modal-image\"></div></div>\n");
      out.write("            <div class=\"modal-footer\">\n");
      out.write("                <a class=\"btn modal-download\" target=\"_blank\">\n");
      out.write("                    <i class=\"icon-download\"></i>\n");
      out.write("                    <span>Download</span>\n");
      out.write("                </a>\n");
      out.write("                <a class=\"btn btn-success modal-play modal-slideshow\" data-slideshow=\"5000\">\n");
      out.write("                    <i class=\"icon-play icon-white\"></i>\n");
      out.write("                    <span>Slideshow</span>\n");
      out.write("                </a>\n");
      out.write("                <a class=\"btn btn-info modal-prev\">\n");
      out.write("                    <i class=\"icon-arrow-left icon-white\"></i>\n");
      out.write("                    <span>Previous</span>\n");
      out.write("                </a>\n");
      out.write("                <a class=\"btn btn-primary modal-next\">\n");
      out.write("                    <span>Next</span>\n");
      out.write("                    <i class=\"icon-arrow-right icon-white\"></i>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- The template to display files available for upload -->\n");
      out.write("        <script id=\"template-upload\" type=\"text/x-tmpl\">\n");
      out.write("            {% for (var i=0, file; file=o.files[i]; i++) { %}\n");
      out.write("        <tr class=\"template-upload fade\">\n");
      out.write("            <td class=\"preview\"><span class=\"fade\"></span></td>\n");
      out.write("            <td class=\"name\"><span>{%=file.name%}</span></td>\n");
      out.write("            <td class=\"size\"><span>{%=o.formatFileSize(file.size)%}</span></td>\n");
      out.write("            {% if (file.error) { %}\n");
      out.write("            <td class=\"error\" colspan=\"2\"><span class=\"label label-important\">{%=locale.fileupload.error%}</span> {%=locale.fileupload.errors[file.error] || file.error%}</td>\n");
      out.write("            {% } else if (o.files.valid && !i) { %}\n");
      out.write("            <td>\n");
      out.write("                <div class=\"progress progress-success progress-striped active\" role=\"progressbar\" aria-valuemin=\"0\" aria-valuemax=\"100\" aria-valuenow=\"0\"><div class=\"bar\" style=\"width:0%;\"></div></div>\n");
      out.write("            </td>\n");
      out.write("            <td class=\"start\">{% if (!o.options.autoUpload) { %}\n");
      out.write("                <button class=\"btn btn-primary\">\n");
      out.write("                    <i class=\"icon-upload icon-white\"></i>\n");
      out.write("                    <span>{%=locale.fileupload.start%}</span>\n");
      out.write("                </button>\n");
      out.write("                {% } %}</td>\n");
      out.write("            {% } else { %}\n");
      out.write("            <td colspan=\"2\"></td>\n");
      out.write("            {% } %}\n");
      out.write("            <td class=\"cancel\">{% if (!i) { %}\n");
      out.write("                <button class=\"btn btn-warning\">\n");
      out.write("                    <i class=\"icon-ban-circle icon-white\"></i>\n");
      out.write("                    <span>{%=locale.fileupload.cancel%}</span>\n");
      out.write("                </button>\n");
      out.write("                {% } %}</td>\n");
      out.write("        </tr>\n");
      out.write("        {% } %}\n");
      out.write("    </script>\n");
      out.write("    <!-- The template to display files available for download -->\n");
      out.write("    <script id=\"template-download\" type=\"text/x-tmpl\">\n");
      out.write("        {% for (var i=0, file; file=o.files[i]; i++) { %}\n");
      out.write("        <tr class=\"template-download fade\">\n");
      out.write("            {% if (file.error) { %}\n");
      out.write("            <td></td>\n");
      out.write("            <td class=\"name\"><span>{%=file.name%}</span></td>\n");
      out.write("            <td class=\"size\"><span>{%=o.formatFileSize(file.size)%}</span></td>\n");
      out.write("            <td class=\"error\" colspan=\"2\"><span class=\"label label-important\">{%=locale.fileupload.error%}</span> {%=locale.fileupload.errors[file.error] || file.error%}</td>\n");
      out.write("            {% } else { %}\n");
      out.write("            <td class=\"preview\">{% if (file.thumbnail_url) { %}\n");
      out.write("                <a href=\"{%=file.url%}\" title=\"{%=file.name%}\" rel=\"gallery\" download=\"{%=file.name%}\"><img src=\"{%=file.thumbnail_url%}\"></a>\n");
      out.write("                {% } %}</td>\n");
      out.write("            <td class=\"name\">\n");
      out.write("                <a href=\"{%=file.url%}\" title=\"{%=file.name%}\" rel=\"{%=file.thumbnail_url&&'gallery'%}\" download=\"{%=file.name%}\">{%=file.name%}</a>\n");
      out.write("            </td>\n");
      out.write("            <td class=\"size\"><span>{%=o.formatFileSize(file.size)%}</span></td>\n");
      out.write("            <td colspan=\"2\"></td>\n");
      out.write("            {% } %}\n");
      out.write("            <td class=\"delete\">\n");
      out.write("                <button class=\"btn btn-danger\" data-type=\"{%=file.delete_type%}\" data-url=\"{%=file.delete_url%}\">\n");
      out.write("                    <i class=\"icon-trash icon-white\"></i>\n");
      out.write("                    <span>{%=locale.fileupload.destroy%}</span>\n");
      out.write("                </button>\n");
      out.write("                <input type=\"checkbox\" name=\"delete\" value=\"1\">\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        {% } %}\n");
      out.write("    </script>\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\n");
      out.write("    <!-- The jQuery UI widget factory, can be omitted if jQuery UI is already included -->\n");
      out.write("    <script src=\"js/vendor/jquery.ui.widget.js\"></script>\n");
      out.write("    <!-- The Templates plugin is included to render the upload/download listings -->\n");
      out.write("    <script src=\"js/tmpl.min.js\"></script>\n");
      out.write("    <!-- The Load Image plugin is included for the preview images and image resizing functionality -->\n");
      out.write("    <script src=\"js/load-image.min.js\"></script>\n");
      out.write("    <!-- The Canvas to Blob plugin is included for image resizing functionality -->\n");
      out.write("    <script src=\"js/canvas-to-blob.min.js\"></script>\n");
      out.write("    <!-- Bootstrap JS and Bootstrap Image Gallery are not required, but included for the demo -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap-image-gallery.min.js\"></script>\n");
      out.write("    <!-- The Iframe Transport is required for browsers without support for XHR file uploads -->\n");
      out.write("    <script src=\"js/jquery.iframe-transport.js\"></script>\n");
      out.write("    <!-- The basic File Upload plugin -->\n");
      out.write("    <script src=\"js/jquery.fileupload.js\"></script>\n");
      out.write("    <!-- The File Upload file processing plugin -->\n");
      out.write("    <script src=\"js/jquery.fileupload-fp.js\"></script>\n");
      out.write("    <!-- The File Upload user interface plugin -->\n");
      out.write("    <script src=\"js/jquery.fileupload-ui.js\"></script>\n");
      out.write("    <!-- The localization script -->\n");
      out.write("    <script src=\"js/locale.js\"></script>\n");
      out.write("    <!-- The main application script -->\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("    <!-- The XDomainRequest Transport is included for cross-domain file deletion for IE8+ -->\n");
      out.write("    <!--[if gte IE 8]><script src=\"js/cors/jquery.xdr-transport.js\"></script><![endif]-->\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
}
