package org.restapidoc.pojo

import org.restapidoc.annotation.RestApiResponseObject
import org.jsondoc.core.pojo.ApiResponseObjectDoc

import java.lang.reflect.Method

/**
 * RestApiMethodDoc must be used instead of ApiMethodDoc to use a light rest api doc
 * @author Loïc Rollus
 *
 */
public class RestApiResponseObjectDoc extends ApiResponseObjectDoc {

    public static RestApiResponseObjectDoc buildFromAnnotation(RestApiResponseObject annotation, Method method) {
        return new RestApiResponseObjectDoc(annotation.objectIdentifier(), "", "", annotation.multiple(), "");
    }

    public RestApiResponseObjectDoc(String object, String mapKeyObject, String mapValueObject, String multiple, String map) {
        super(object,mapKeyObject,mapValueObject,multiple,map);
    }


}