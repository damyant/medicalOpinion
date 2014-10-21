<%--
  Created by IntelliJ IDEA.
  User: damyant
  Date: 10/16/14
  Time: 12:12 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <script src="${resource(dir: 'js', file: 'admin.js')}"></script>
    <title></title>
</head>

<body>
<div id="main">
    <fieldset class="form">
        <h3>Sign Up for Doctor</h3>

        <g:form controller="doctor" action="saveDoctor"  id="saveDoctor"  name="saveDoctor" >
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

                    <td class="university-size-1-3">Panel<span class="university-obligatory">*</span></td>
                    <td class="university-size-1-3">  <g:select name="panel" id="panel" class="university-size-1-2" optionKey="id"
                                                                optionValue="panelName"  value="${newIns?.panel?.id}" onchange="loadSpeciality(this)"
                                                                from="${panelTypeList}" noSelection="['': ' Select Panel ']" /></td>

                </tr>

                <tr>

                    <td class="university-size-1-3">Speciality<span class="university-obligatory">*</span></td>
                    <td class="university-size-1-3">  <g:select name="speciality" id="speciality" class="university-size-1-2" optionKey=""
                                                                optionValue=""  value=""
                                                                from="" noSelection="['': ' Select Specialist']" /></td>

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