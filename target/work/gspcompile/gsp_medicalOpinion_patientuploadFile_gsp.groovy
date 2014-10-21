import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_medicalOpinion_patientuploadFile_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/patient/uploadFile.gsp" }
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
invokeTag('select','g',32,['name':("panel"),'id':("panel"),'class':("university-size-1-2"),'optionKey':("id"),'optionValue':("panelName"),'value':(newIns?.panel?.id),'onchange':("loadSpeciality(this)"),'from':(panelTypeList),'noSelection':(['': ' Select Panel '])],-1)
printHtmlPart(11)
invokeTag('select','g',41,['name':("speciality"),'id':("speciality"),'class':("university-size-1-2"),'optionKey':(""),'optionValue':(""),'value':(""),'onchange':("loadDoctor(this)"),'from':(""),'noSelection':(['': ' Select Specialist'])],-1)
printHtmlPart(12)
invokeTag('select','g',50,['name':("doctor"),'id':("doctor"),'class':("university-size-1-2"),'optionKey':(""),'optionValue':(""),'value':(""),'from':(""),'noSelection':(['': ' Select Doctor'])],-1)
printHtmlPart(13)
invokeTag('textArea','g',56,['rows':("4"),'cols':("50"),'id':("description"),'name':("description")],-1)
printHtmlPart(14)
})
invokeTag('uploadForm','g',73,['controller':("patient"),'action':("saveFile")],2)
printHtmlPart(15)
})
invokeTag('captureBody','sitemesh',75,[:],1)
printHtmlPart(16)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1413875651582L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
