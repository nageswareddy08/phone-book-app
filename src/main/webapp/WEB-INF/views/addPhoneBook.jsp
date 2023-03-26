<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Registration</title>
<link
	href="<c:url value="/resources//bootstrap/css/bootstrap.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/styles.css" />"
	rel="stylesheet">
</head>
	<div class="page-content container">
		<div class="row">
			<div class="col-md-4 col-md-offset-4">
				<div class="login-wrapper">
					<div class="box">
						<div class="content-wrap">
							<form:form modelAttribute="newPhoneBook">
								<label>Name*</label>
								<form:input class="form-control" path="name" />
								<label>Phone Number*</label>
								<form:input class="form-control" path="phoneNumber" />
								<form:errors path="phoneNumber"></form:errors>
                                <div class="action">
									<button type="submit" class="btn btn-primary signup">
										<c:if test="${adding }">Add Phone Book</c:if>
									</button>
								</div>
							</form:form>
						</div>
					</div>
					<div class="already">
						<p></p>
						<a href="/home">Back</a>
					</div>
				</div>
			</div>
		</div>
	</div>



	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="https://code.jquery.com/jquery.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="resources/bootstrap/js/bootstrap.min.js"></script>
	<script src="resources/js/custom.js"></script>
</body>
</html>