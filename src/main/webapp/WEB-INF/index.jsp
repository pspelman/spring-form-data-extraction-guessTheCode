<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
<h1>This is the page</h1>
<c:out value="${errors}" />
<br/>
<h2>Get to Enlightenment</h2>
<%--<form action="/user_guess" method="post">--%>

    <%--<label for="user_guess">Enter the code</label>--%>

    <%--<input:input type="text" name="user_guess" id="user_guess" />--%>

<%--</form>--%>

<form name="user_guess_form" method="post" action="/user_guess">
    <input type="text" name="user_guess"/><br/>
    <button type="submit">Try Code</button>
</form>