<html>
<head>
	<meta name='layout' content='main'/>
	<title><g:message code="springSecurity.login.title"/></title>
</head>

<body>
<div id='login'>
	<div class='inner'>
		<div class='fheader'><g:message code="springSecurity.login.header"/></div>
		<g:if test='${flash.message}'>
			<div class='login_message'>${flash.message}</div>
		</g:if>

		<form action='${postUrl}' method='POST' id='loginForm' class='cssform' autocomplete='off'>
				<input type='text' class='text_' name='j_username' id='username' placeholder="Username"/>
				<input type='password' class='text_' name='j_password' id='password' placeholder="Password"/>
                <p><br/></p>
			%{--<p id="remember_me_holder">--}%
				%{--<input type='checkbox' class='chk' name='${rememberMeParameter}' id='remember_me' <g:if test='${hasCookie}'>checked='checked'</g:if>/>--}%
				%{--<label for='remember_me'><g:message code="springSecurity.login.remember.me.label"/></label>--}%
			%{--</p>--}%
			<p><input type='submit' id="submit" value='SIGN IN'/></p>
		</form>
	</div>
</div>
<script type='text/javascript'>
	(function() {
		document.forms['loginForm'].elements['j_username'].focus();
	})();
</script>
</body>
</html>
