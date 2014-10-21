<%--
  Created by IntelliJ IDEA.
  User: damyant
  Date: 10/20/14
  Time: 2:50 PM
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
        <h3>Create Panel</h3>

        <g:form controller="admin" action="savePanel"  id="savePanel"  name="savePanel" >
            <g:if test="${flash.message}">
                <div class="message"><div class="university-status-message">${flash.message}</div></div>
            </g:if>

            <table class="university-size-full-1-1 inner spinner">
                 <tr>
                    <td class="university-size-1-3">Panel Name<span class="university-obligatory">*</span></td>
                    <td class="university-size-1-3"><input type="text" name="panelName" class="university-size-1-2" value=""></td>
                </tr>
                <tr>
                    <td class="university-size-1-3">Select Speciality<span class="university-obligatory">*</span></td>
                    <td class="university-size-1-3">
                        <div style="width: 100%;display: compact;">
                        <g:each in="${specList}" var="specInst" status="i">
                            <div style="width: 40%;margin-right: 3%;">
                       <label> <input type="checkbox" name="speciality" value="${specInst.id}">${specInst.specName}</label>
                            </div>
                        </g:each>
                        </div>
                    </td>
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