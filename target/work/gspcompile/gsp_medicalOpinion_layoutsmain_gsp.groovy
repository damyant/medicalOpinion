import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_medicalOpinion_layoutsmain_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/main.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("cache-control"),'content':("no-cache")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("expires"),'content':("0")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',10,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("pragma"),'content':("no-cache")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge,chrome=1")],-1)
printHtmlPart(1)
createTagBody(2, {->
invokeTag('captureTitle','sitemesh',13,[:],-1)
})
invokeTag('wrapTitleTag','sitemesh',13,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1.0")],-1)
printHtmlPart(2)
expressionOut.print(resource(dir: 'css', file: 'header.css'))
printHtmlPart(3)
expressionOut.print(resource(dir: 'css', file: 'gu_stylesheet.css'))
printHtmlPart(4)
expressionOut.print(resource(dir: 'css', file: 'jquery.ui.datepicker.css'))
printHtmlPart(4)
expressionOut.print(resource(dir: 'css', file: 'newjquery-ui.css'))
printHtmlPart(5)
invokeTag('javascript','g',19,['library':("jquery")],-1)
printHtmlPart(1)
invokeTag('javascript','g',20,['library':("application")],-1)
printHtmlPart(1)
invokeTag('layoutResources','r',21,[:],-1)
printHtmlPart(6)
expressionOut.print(resource(dir: 'js/jquery', file: 'newjquery-1.9.1.js'))
printHtmlPart(7)
expressionOut.print(resource(dir: 'js/jquery', file: 'newjquery-ui.js'))
printHtmlPart(8)
expressionOut.print(resource(dir: 'js', file: 'header.js'))
printHtmlPart(7)
expressionOut.print(resource(dir: 'js', file: 'base.js'))
printHtmlPart(7)
expressionOut.print(resource(dir: 'js', file: 'validation.js'))
printHtmlPart(9)
expressionOut.print(resource(dir: 'js/jquery', file: 'validate.js'))
printHtmlPart(10)
expressionOut.print(resource(dir: 'js/jquery', file: 'jquery.ui.datepicker.js'))
printHtmlPart(11)
expressionOut.print(resource(dir: 'js/jquery', file: 'jquery.blockUI.js'))
printHtmlPart(12)
invokeTag('layoutHead','g',31,[:],-1)
printHtmlPart(13)
})
invokeTag('captureHead','sitemesh',31,[:],1)
printHtmlPart(14)
createTagBody(1, {->
printHtmlPart(14)
invokeTag('layoutResources','r',32,[:],-1)
printHtmlPart(15)
invokeTag('render','g',32,['template':("/layouts/header")],-1)
printHtmlPart(16)
invokeTag('layoutBody','g',33,[:],-1)
printHtmlPart(16)
invokeTag('render','g',33,['template':("/layouts/footer")],-1)
printHtmlPart(17)
})
invokeTag('captureBody','sitemesh',34,['style':("margin: 0 auto")],1)
printHtmlPart(18)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1413872982169L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
