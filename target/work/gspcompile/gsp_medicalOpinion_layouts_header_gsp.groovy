import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_medicalOpinion_layouts_header_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/_header.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(resource(dir: 'images', file: 'logo.png'))
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('username','sec',9,[:],-1)
printHtmlPart(3)
createClosureForHtmlPart(4, 2)
invokeTag('link','g',9,['controller':("logout")],2)
printHtmlPart(5)
})
invokeTag('ifLoggedIn','sec',11,[:],1)
printHtmlPart(6)
createTagBody(1, {->
printHtmlPart(7)
createClosureForHtmlPart(8, 2)
invokeTag('link','g',15,['controller':("patient"),'action':("newUser")],2)
printHtmlPart(9)
})
invokeTag('ifNotLoggedIn','sec',16,[:],1)
printHtmlPart(10)
createTagBody(1, {->
printHtmlPart(11)
createTagBody(2, {->
printHtmlPart(12)
invokeTag('message','g',21,['code':("default.mainMenu1")],-1)
printHtmlPart(13)
createTagBody(3, {->
invokeTag('message','g',26,['code':("default.mainMenu1.subMenu1")],-1)
})
invokeTag('link','g',26,['controller':("doctor"),'action':("newDoctor")],3)
printHtmlPart(14)
})
invokeTag('ifAnyGranted','sec',27,['roles':("ROLE_ADMIN")],2)
printHtmlPart(15)
createTagBody(2, {->
printHtmlPart(16)
invokeTag('message','g',29,['code':("default.mainMenu2")],-1)
printHtmlPart(17)
createTagBody(3, {->
printHtmlPart(18)
invokeTag('message','g',36,['code':("default.mainMenu2.subMenu1")],-1)
})
invokeTag('link','g',36,['controller':("patient"),'action':("viewFile")],3)
printHtmlPart(19)
})
invokeTag('ifNotGranted','sec',37,['roles':("ROLE_PATIENT")],2)
printHtmlPart(15)
createTagBody(2, {->
printHtmlPart(20)
createTagBody(3, {->
invokeTag('message','g',41,['code':("default.mainMenu3")],-1)
})
invokeTag('link','g',41,['controller':("patient"),'action':("delUser")],3)
printHtmlPart(21)
})
invokeTag('ifAnyGranted','sec',43,['roles':("ROLE_ADMIN")],2)
printHtmlPart(22)
createTagBody(2, {->
printHtmlPart(16)
invokeTag('message','g',45,['code':("default.mainMenu4")],-1)
printHtmlPart(23)
createTagBody(3, {->
invokeTag('message','g',52,['code':("default.mainMenu4.subMenu1")],-1)
})
invokeTag('link','g',52,['controller':("admin"),'action':("addPanel")],3)
printHtmlPart(24)
})
invokeTag('ifAnyGranted','sec',54,['roles':("ROLE_ADMIN")],2)
printHtmlPart(25)
createTagBody(2, {->
printHtmlPart(16)
invokeTag('message','g',55,['code':("default.mainMenu5")],-1)
printHtmlPart(23)
createTagBody(3, {->
invokeTag('message','g',56,['code':("default.mainMenu5.subMenu1")],-1)
})
invokeTag('link','g',56,['controller':("admin"),'action':("addSpecialist")],3)
printHtmlPart(24)
})
invokeTag('ifAnyGranted','sec',56,['roles':("ROLE_ADMIN")],2)
printHtmlPart(11)
})
invokeTag('ifLoggedIn','sec',57,[:],1)
printHtmlPart(26)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1413893214096L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
