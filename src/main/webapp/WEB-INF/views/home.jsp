<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <title>Home</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <!-- Bootstrap -->
        <link href="resources/bootstrap/css/bootstrap.min.css" rel="stylesheet" />
        <!-- styles -->
        <link href="resources/css/styles.css" rel="stylesheet" />
    </head>
    <body>
        <div class="row col-lr-10 center">
            <h1>Phone Book</h1>
        </div>
        <div class="page-content">
            <div class="row">
                <div class="col-md-2">
                    <jsp:include page="template/sidebar.jsp" />
                </div>
                <div class="col-md-10">
                    <div class="row">
                        <div class="col-md-12 panel-warning">
                            <div class="content-box-header panel-heading">
                                <div class="panel-title">
                                    <input type="text" id="myInput" onkeyup="searching()" placeholder="Search for names.." />
                                </div>
                            </div>
                            <div class="content-box-large box-with-header">
                                <table border="1" width="100%" cellpadding="4" cellpacing="3" id="myTable">
                                    <th>Name</th>
                                    <th>Phone Number</th>
                                    <c:forEach items="${phoneBookList}" var="phoneBook">
                                        <tr align="center">
                                            <td>${phoneBook.name}</td>
                                            <td>${phoneBook.phoneNumber }</td>
                                        </tr>
                                    </c:forEach>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script>
            function searching() {
                // Declare variables
                var input, filter, table, tr, td, i;
                input = document.getElementById("myInput");
                filter = input.value.toUpperCase();
                table = document.getElementById("myTable");
                tr = table.getElementsByTagName("tr");

                // Loop through all table rows, and hide those who don't match the search query
                for (i = 0; i < tr.length; i++) {
                    td = tr[i].getElementsByTagName("td")[0];
                    if (td) {
                        if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {
                            tr[i].style.display = "";
                        } else {
                            tr[i].style.display = "none";
                        }
                    }
                }
            }
        </script>
    </body>
</html>
