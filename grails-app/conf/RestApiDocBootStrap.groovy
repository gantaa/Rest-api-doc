import grails.converters.JSON
import grails.util.Holders
import org.restapidoc.JSONUtils


class RestApiDocBootStrap {

    def grailsApplication



    def init = { servletContext ->
        println "Init bootstrap restapidoc!"
        JSONUtils.registerMarshallers ()
    }
}
