import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_medicalOpinion_doctornewDoctor_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/doctor/newDoctor.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',10,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(3)
expressionOut.print(resource(dir: 'js', file: 'admin.js'))
printHtmlPart(4)
createTagBody(2, {->
invokeTag('captureTitle','sitemesh',12,[:],-1)
})
invokeTag('wrapTitleTag','sitemesh',12,[:],2)
printHtmlPart(5)
})
invokeTag('captureHead','sitemesh',13,[:],1)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(6)
createTagBody(2, {->
printHtmlPart(7)
if(true && (flash.message)) {
printHtmlPart(8)
expressionOut.print(flash.message)
printHtmlPart(9)
}
printHtmlPart(10)
expressionOut.print(userIns?.name)
printHtmlPart(11)
expressionOut.print(userIns?.name)
printHtmlPart(12)
expressionOut.print(userIns?.password)
printHtmlPart(13)
expressionOut.print(userIns?.address)
printHtmlPart(14)
expressionOut.print(userIns?.email)
printHtmlPart(15)
expressionOut.print(userIns?.phone)
printHtmlPart(16)
invokeTag('select','g',66,['name':("panel"),'id':("panel"),'class':("university-size-1-2"),'optionKey':("id"),'optionValue':("panelName"),'value':(newIns?.panel?.id),'onchange':("loadSpeciality(this)"),'from':(panelTypeList),'noSelection':(['': ' Select Panel '])],-1)
printHtmlPart(17)
invokeTag('select','g',75,['name':("speciality"),'id':("speciality"),'class':("university-size-1-2"),'optionKey':(""),'optionValue':(""),'value':(""),'from':(""),'noSelection':(['': ' Select Specialist'])],-1)
printHtmlPart(18)
})
invokeTag('form','g',84,['controller':("doctor"),'action':("saveDoctor"),'id':("saveDoctor"),'name':("saveDoctor")],2)
printHtmlPart(19)
})
invokeTag('captureBody','sitemesh',86,[:],1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1413878353426L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
