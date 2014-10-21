import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_medicalOpinion_patientdelUser_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/patient/delUser.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',10,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
createTagBody(2, {->
invokeTag('captureTitle','sitemesh',11,[:],-1)
})
invokeTag('wrapTitleTag','sitemesh',11,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',12,[:],1)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('sortableColumn','g',23,['property':("Name"),'title':("Name"),'class':("university-size-1-4")],-1)
printHtmlPart(5)
invokeTag('sortableColumn','g',24,['property':("Name"),'title':("E-mail"),'class':("university-size-1-2")],-1)
printHtmlPart(5)
invokeTag('sortableColumn','g',25,['property':("Name"),'title':("Role"),'class':("university-size-1-2")],-1)
printHtmlPart(5)
invokeTag('sortableColumn','g',26,['property':("fileName"),'title':("Delete"),'class':("university-size-1-4")],-1)
printHtmlPart(5)
invokeTag('hiddenField','g',26,['name':("id"),'value':("id")],-1)
printHtmlPart(6)
loop:{
int i = 0
for( userInst in (userList) ) {
printHtmlPart(7)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(8)
expressionOut.print(userInst.name)
printHtmlPart(9)
expressionOut.print(userInst.email)
printHtmlPart(10)
expressionOut.print(roleList[i])
printHtmlPart(11)
createClosureForHtmlPart(12, 3)
invokeTag('link','g',38,['controller':("patient"),'action':("delete"),'params':([userInstId:userInst.id])],3)
printHtmlPart(13)
i++
}
}
printHtmlPart(14)
})
invokeTag('captureBody','sitemesh',41,[:],1)
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1413532652024L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
