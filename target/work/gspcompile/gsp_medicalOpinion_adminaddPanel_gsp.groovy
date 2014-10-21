import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_medicalOpinion_adminaddPanel_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/admin/addPanel.gsp" }
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
createTagBody(2, {->
printHtmlPart(5)
if(true && (flash.message)) {
printHtmlPart(6)
expressionOut.print(flash.message)
printHtmlPart(7)
}
printHtmlPart(8)
loop:{
int i = 0
for( specInst in (specList) ) {
printHtmlPart(9)
expressionOut.print(specInst.id)
printHtmlPart(10)
expressionOut.print(specInst.specName)
printHtmlPart(11)
i++
}
}
printHtmlPart(12)
})
invokeTag('form','g',47,['controller':("admin"),'action':("savePanel"),'id':("savePanel"),'name':("savePanel")],2)
printHtmlPart(13)
})
invokeTag('captureBody','sitemesh',50,[:],1)
printHtmlPart(14)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1413891202561L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
