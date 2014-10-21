<div>
<div class="logo">
    <div class="header-parts"><img id="logo-images" src="${resource(dir: 'images', file: 'logo.png')}" alt="Medical Opinion"
                                   class="window"></div>

    <div class="header-parts" name="logout">
        <sec:ifLoggedIn>
            <div class="university-session-management">
                <sec:username/><label>  </label>||<label>  </label>  <g:link controller="logout">Logout</g:link>
                %{--<sec:ifAnyGranted roles="ROLE_ADMIN,ROLE_SUPERVISOR">--}%
                    %{--<g:link controller="user" action="index">Manage User</g:link>--}%
                %{--</sec:ifAnyGranted>--}%
            </div>
        </sec:ifLoggedIn>
        <sec:ifNotLoggedIn>
            <div class="university-session-management">
               <g:link controller="patient" action="newUser">Sign Up</g:link>
            </div>
        </sec:ifNotLoggedIn>
    </div>
</div>

<div id="cssmenu">
%{--<div id="header-Menu">--}%
<ul id="menu"><sec:ifLoggedIn>
<sec:ifAnyGranted roles="ROLE_ADMIN">
    <li><a href="#"><g:message code="default.mainMenu1"/></a>
    <ul>
        <li><g:link controller="doctor" action="newDoctor"><g:message code="default.mainMenu1.subMenu1"/></g:link></li>

    </ul>

    </li>
</sec:ifAnyGranted>
    <sec:ifNotGranted roles="ROLE_PATIENT">
        <li><a href="#"><g:message code="default.mainMenu2"/></a>
         <ul>
             <li><g:link controller="patient" action="viewFile"> <g:message code="default.mainMenu2.subMenu1"/></g:link></li>


         </ul>
        </li>
    </sec:ifNotGranted>
    <sec:ifAnyGranted roles="ROLE_ADMIN">
        <li><g:link controller="patient" action="delUser"><g:message code="default.mainMenu3"/></g:link></li>

    </sec:ifAnyGranted>



    <sec:ifAnyGranted roles="ROLE_ADMIN">
        <li><a href="#"><g:message code="default.mainMenu4"/></a>
            <ul>
                <li><g:link controller="admin" action="addPanel"><g:message code="default.mainMenu4.subMenu1"/></g:link></li>
                %{--<li><g:link controller="admin" action="editPanel"><g:message code="default.mainMenu4.subMenu2"/></g:link></li>--}%
                %{--<li><g:link controller="admin" action="delPanel"><g:message code="default.mainMenu4.subMenu3"/></g:link></li>--}%
            </ul>

        </li>
    </sec:ifAnyGranted>

    <sec:ifAnyGranted roles="ROLE_ADMIN">
        <li><a href="#"><g:message code="default.mainMenu5"/></a>
            <ul>
                <li><g:link controller="admin" action="addSpecialist"><g:message code="default.mainMenu5.subMenu1"/></g:link></li>
                %{--<li><g:link controller="admin" action="editSpecialist"><g:message code="default.mainMenu5.subMenu2"/></g:link></li>--}%
                %{--<li><g:link controller="admin" action="delSpecialist"><g:message code="default.mainMenu5.subMenu3"/></g:link></li>--}%
            </ul>

        </li>
    </sec:ifAnyGranted>
</sec:ifLoggedIn>


    </li>
</ul>
</div>

%{--<div class="scroller"><!-- this is for emulating position fixed of the nav -->--}%
    %{--<div class="scroller-inner">--}%
        %{--<g:render template="/layouts/statusPopup"/>--}%
    %{--</div>--}%
%{--</div>--}%
</div>