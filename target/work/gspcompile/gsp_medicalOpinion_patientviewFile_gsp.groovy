import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_medicalOpinion_patientviewFile_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/patient/viewFile.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
expressionOut.print(resource(dir: 'js', file: 'admin.js'))
printHtmlPart(3)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
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
if(true && (fileList.size()>0)) {
printHtmlPart(7)
invokeTag('sortableColumn','g',25,['property':("fileName"),'title':("Name"),'class':("university-size-1-4")],-1)
printHtmlPart(8)
invokeTag('sortableColumn','g',26,['property':("fileName"),'title':("E-mail"),'class':("university-size-1-2")],-1)
printHtmlPart(8)
invokeTag('sortableColumn','g',27,['property':("fileName"),'title':("Description"),'class':("university-size-1-2")],-1)
printHtmlPart(8)
invokeTag('sortableColumn','g',28,['property':("fileName"),'title':("Link"),'class':("university-size-1-4")],-1)
printHtmlPart(9)
loop:{
int i = 0
for( fileInst in (fileList) ) {
printHtmlPart(10)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(11)
expressionOut.print(fileInst.userId.name)
printHtmlPart(12)
expressionOut.print(fileInst.userId.email)
printHtmlPart(13)
expressionOut.print(fileInst?.description)
printHtmlPart(14)
createTagBody(4, {->
printHtmlPart(15)
expressionOut.print(resource(dir: 'images', file: 'download.png'))
printHtmlPart(16)
})
invokeTag('link','g',39,['controller':("patient"),'action':("download"),'params':([fileName: fileInst.fileName]),'target':("_blank")],4)
printHtmlPart(17)
i++
}
}
printHtmlPart(18)
}
else {
printHtmlPart(19)
}
printHtmlPart(20)
})
invokeTag('captureBody','sitemesh',49,[:],1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1413538628750L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
