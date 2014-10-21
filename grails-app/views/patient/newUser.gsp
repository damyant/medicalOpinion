<%--
  Created by IntelliJ IDEA.
  User: damyant
  Date: 10/14/14
  Time: 5:10 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title></title>
</head>

<body>
<div id="main">
    <fieldset class="form">
        <h3>Sign Up</h3>

        <g:form controller="patient" action="saveUser"  id="saveUser"  name="saveUser" >
            <g:if test="${flash.message}">
                <div class="message"><div class="university-status-message">${flash.message}</div></div>
            </g:if>

            <table class="university-size-full-1-1 inner spinner">



                <tr>

                    <td class="university-size-1-3">Name<span class="university-obligatory">*</span></td>
                    <td class="university-size-1-3"><input type="text" name="name" class="university-size-1-2" value="${userIns?.name}"></td>
                </tr>
                <tr>

                    <td class="university-size-1-3">Username<span class="university-obligatory">*</span></td>
                    <td class="university-size-1-3"><input type="text" name="username" class="university-size-1-2" value="${userIns?.name}"></td>
                </tr>
                <tr>

                    <td class="university-size-1-3">Password<span class="university-obligatory">*</span></td>
                    <td class="university-size-1-3"><input type="password" name="password" class="university-size-1-2" value="${userIns?.password}"></td>
                </tr>
                <tr>

                    <td class="university-size-1-3">Address<span class="university-obligatory">*</span></td>
                    <td class="university-size-1-3"><input type="text" name="address" class="university-size-1-2" value="${userIns?.address}"></td>
                </tr>
                <tr>

                    <td class="university-size-1-3">E-mail ID/User Name<span class="university-obligatory">*</span></td>
                    <td class="university-size-1-3"><input type="text" name="email" class="university-size-1-2" value="${userIns?.email}"></td>
                </tr>
                <tr>

                    <td class="university-size-1-3">Phone No.<span class="university-obligatory">*</span></td>
                    <td class="university-size-1-3"><input type="text" name="phoneNo" class="university-size-1-2" value="${userIns?.phone}"></td>
                </tr>




                <tr>
                    <td></td>
                    <td>
                        <input type="submit" class="university-size-1-2 university-button"  value="Submit"/>
                    </td>
                    <td></td>
                </tr>
            </table>
        </g:form>
    </fieldset>
</div>



</body>
</html>