<%-- 
    Document   : album
    Created on : Aug 26, 2012, 8:09:16 PM
    Author     : UTAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Matrimony Image Gallery</title>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <style>
            body {
                padding-top: 60px;
                background: #222;
                color: #fff;
            }
            header {
                margin-bottom: 30px;
            }
            header h1 {
                font-family: 'Lucida Grande', 'Lucida Sans Unicode', Arial, sans-serif;
                color: #fff;
                margin-bottom: 10px;
            }
            header a {
                color: orange;
            }
            .modal {
                color: #333;
            }
        </style>
        <link rel="stylesheet" href="css/bootstrap-responsive.min.css">
        <link rel="stylesheet" href="css/bootstrap-image-gallery.min.css">
    </head>
    <body>
        <div class="container-fluid">
            <header>
                <h1>Gallery</h1>
                <blockquote>
                    Hello There. Here is all your image.
                </blockquote>
                <p>
                    <button id="start-slideshow" class="btn btn-large btn-success" data-slideshow="5000" data-target="#modal-gallery" data-selector="#gallery a[rel=gallery]">Start Slideshow</button>
                    <button id="toggle-fullscreen" class="btn btn-large btn-primary" data-toggle="button">Toggle Fullscreen</button>
                </p>
            </header>


            <div id="gallery" data-toggle="modal-gallery" data-target="#modal-gallery">
                <jsp:useBean id="iBean" scope="session" class="bean.ImageBean"/>
                <c:forEach var="item" items="${iBean.arImg}">
                    <a href=".${item.imagePath}" rel="gallery"><img src=".${item.imagePath}" class="thumb"/></a>
                    </c:forEach>
            </div>
            <div id="modal-gallery" class="modal modal-gallery hide fade">
                <div class="modal-header">
                    <a class="close" data-dismiss="modal">&times;</a>
                    <h3 class="modal-title"></h3>
                </div>
                <div class="modal-body"><div class="modal-image"></div></div>
                <div class="modal-footer">
                    <a class="btn modal-download" target="_blank">
                        <i class="icon-download"></i>
                        <span>Download</span>
                    </a>
                    <a class="btn btn-success modal-play modal-slideshow" data-slideshow="5000">
                        <i class="icon-play icon-white"></i>
                        <span>Slideshow</span>
                    </a>
                    <a class="btn btn-info modal-prev">
                        <i class="icon-arrow-left icon-white"></i>
                        <span>Previous</span>
                    </a>
                    <a class="btn btn-primary modal-next">
                        <span>Next</span>
                        <i class="icon-arrow-right icon-white"></i>
                    </a>
                </div>
            </div>
        </div>
        <script src="js/jquery.min.js"></script>
        <script src="js/load-image.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/bootstrap-image-gallery.min.js"></script>
        <script>
            /*jslint unparam: true */
            /*global window, document, $ */
            $(function () {
                'use strict';

                // Start slideshow button:
                $('#start-slideshow').button().click(function () {
                    var options = $(this).data(),
                    modal = $(options.target),
                    data = modal.data('modal');
                    if (data) {
                        $.extend(data.options, options);
                    } else {
                        options = $.extend(modal.data(), options);
                    }
                    modal.find('.modal-slideshow').find('i')
                    .removeClass('icon-play')
                    .addClass('icon-pause');
                    modal.modal(options);
                });

                // Toggle fullscreen button:
                $('#toggle-fullscreen').button().click(function () {
                    var button = $(this),
                    root = document.documentElement;
                    if (!button.hasClass('active')) {
                        $('#modal-gallery').addClass('modal-fullscreen');
                        if (root.webkitRequestFullScreen) {
                            root.webkitRequestFullScreen(
                            window.Element.ALLOW_KEYBOARD_INPUT
                        );
                        } else if (root.mozRequestFullScreen) {
                            root.mozRequestFullScreen();
                        }
                    } else {
                        $('#modal-gallery').removeClass('modal-fullscreen');
                        (document.webkitCancelFullScreen ||
                            document.mozCancelFullScreen ||
                            $.noop).apply(document);
                    }
                });

                // Load images via flickr for demonstration purposes:
                
            });
        </script>
    </body>
</html>
