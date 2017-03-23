<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>

<head>

	<title>로그인</title>
	<link href="<c:url value="/css/bootstrap/bootstrap.css" />" rel="stylesheet">

</head>

<body>

<c:if test="${param.error == 'true'}">
<strong>아이디와 암호가 일치하지 않습니다.</strong>
</c:if>

<!--     <label for="name">아이디</label>:<input type="text" name="userid" /><br/>    
    <label for="password">암호</label>:<input type="password" name="password" /><br/>
    
    <input type="submit" value="로그인" />
 -->

<br /><br /><br /><br /><br /><br />

<div class="container">

    <div class="row">
    
        <div class="col-md-4 col-md-offset-4">
        
            <div class="login-panel panel panel-default">
            
                <div class="panel-heading">
                    <h3 class="panel-title">Please Sign In</h3>
                </div>
                
                <div class="panel-body">
                    <form action="<c:url value='/login/process'/>" method="post">
                        <fieldset>
                            <div class="form-group">
                                <input class="form-control" placeholder="User ID" name="userid" type="text" autofocus>
                            </div>
                            <div class="form-group">
                                <input class="form-control" placeholder="Password" name="password" type="password" value="">
                            </div>
                            <div class="checkbox">
                                <label>
                                    <input name="remember" type="checkbox" value="Remember Me">Remember Me
                                </label>
                            </div>
                            <button type="submit" class="btn btn-lg btn-success btn-block">Login</button>
                        </fieldset>
                    </form>
                </div>
                
            </div>
            
        </div>
        
    </div>
    
</div>

</body>
</html>