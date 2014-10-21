<%--
  Created by IntelliJ IDEA.
  User: damyant
  Date: 10/14/14
  Time: 6:49 PM
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
        <h3>ENTER DESCRIPTION</h3>

        <g:uploadForm controller="patient" action="saveFile">
            <g:if test="${flash.message}">
                <div class="message"><div class="university-status-message">${flash.message}</div></div>
            </g:if>

            <table class="university-size-full-1-1 inner spinner">
                <tr>

                    <td class="university-size-1-3">Panel<span class="university-obligatory">*</span></td>
                    <td class="university-size-1-3">  <g:select name="panel" id="panel" class="university-size-1-2" optionKey="id"
                                                                optionValue="panelName"  value="${newIns?.panel?.id}" onchange="loadSpeciality(this)"
                                                                from="${panelTypeList}" noSelection="['': ' Select Panel ']"
                                                               /></td>
                </tr>

                <tr>

                    <td class="university-size-1-3">Speciality<span class="university-obligatory">*</span></td>
                    <td class="university-size-1-3">  <g:select name="speciality" id="speciality" class="university-size-1-2" optionKey=""
                                                                optionValue=""  value="" onchange="loadDoctor(this)"
                                                                from="" noSelection="['': ' Select Specialist']"
                                                                 /></td>
                </tr>

                <tr>

                    <td class="university-size-1-3">Doctor<span class="university-obligatory">*</span></td>
                    <td class="university-size-1-3">   <g:select name="doctor" id="doctor" class="university-size-1-2" optionKey=""
                                                                 optionValue=""  value=""
                                                                 from="" noSelection="['': ' Select Doctor']"
                                                                  /></td>
                </tr>
                <tr>

                    <td class="university-size-1-3">Description<span class="university-obligatory">*</span></td>
                    <td class="university-size-1-3">  <g:textArea rows="4" cols="50" id="description" name="description" /></td>
                </tr>
                <tr>

                    <td class="university-size-1-3">Upload File<span class="university-obligatory">*</span></td>
                    <td class="university-size-1-3">  <input type='file' id="file" name="file" ></td>
                </tr>






                <tr>
                    <td></td>
                    <td>
                        <input type="submit" class="university-size-1-2 university-button"  value="Submit"/>
                    </td>
                    <td></td>
                </tr>
            </table>
        </g:uploadForm>
    </fieldset>
</div>


</body>
</html>