<%--
  Created by IntelliJ IDEA.
  User: damyant
  Date: 10/16/14
  Time: 1:33 PM
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
        <h3> Delete Files</h3>
        <table>

            <thead>
            <tr>
                <g:sortableColumn property="Name" title="Name" class="university-size-1-4"/>
                <g:sortableColumn  property="Name" title="E-mail" class="university-size-1-2"/>
                <g:sortableColumn  property="Name" title="Role" class="university-size-1-2"/>
                <g:sortableColumn property="fileName"  title="Delete" class="university-size-1-4"/>
                <g:hiddenField name="id" value="id"/>

            </tr>
            </thead>
            <tbody>
            <g:each in="${userList}" status="i" var="userInst">
                <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

                    <td>${userInst.name} </td>
                    <td>${userInst.email}</td>
                    <td> ${roleList[i]}</td>
                    <td><g:link controller="patient" action="delete" params="[userInstId:userInst.id]" >Delete</g:link></td>

                </tr>
            </g:each>
            </tbody>
        </table>

    </fieldset>
</div>
</body>
</html>