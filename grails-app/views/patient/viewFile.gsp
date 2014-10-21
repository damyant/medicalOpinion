<%--
  Created by IntelliJ IDEA.
  User: damyant
  Date: 10/15/14
  Time: 12:30 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <script type='text/javascript' charset='utf-8' src='${resource(dir: 'js', file: 'admin.js')}'></script>
    <meta name="layout" content="main"/>
    <title></title>
</head>

<body>
<div id="main">
    <fieldset class="form">
        <h3>Files</h3>
        <g:if test="${fileList.size()>0}">
        <table>

            <thead>
            <tr>
                <g:sortableColumn property="fileName" title="Name" class="university-size-1-4"/>
                <g:sortableColumn  property="fileName" title="E-mail" class="university-size-1-2"/>
                <g:sortableColumn  property="fileName" title="Description" class="university-size-1-2"/>
                <g:sortableColumn property="fileName"  title="Link" class="university-size-1-4"/>
            </tr>
            </thead>
            <tbody>
            <g:each in="${fileList}" status="i" var="fileInst">
                <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
                    <td>${fileInst.userId.name} </td>
                    <td>${fileInst.userId.email}</td>
                    <td><button onclick="alertPopup('${fileInst?.description}')">Show Description</button></td>
                    <td><g:link controller="patient" action="download" params="[fileName: fileInst.fileName]"
                                target="_blank"><img style="width:30px; "
                                                     src="${resource(dir: 'images', file: 'download.png')}"
                                                     class="window"></g:link></td>

                </tr>
            </g:each>
            </tbody>
        </table>
        </g:if>
        <g:else>
            <br/>  <br/>
            <div class="university-status-message">No Patient File Uploaded.</div>
        </g:else>
     </fieldset>
</div>

</body>
</html>