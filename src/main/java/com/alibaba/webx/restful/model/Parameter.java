package com.alibaba.webx.restful.model;

import com.alibaba.webx.restful.model.converter.TypeConvertException;
import com.alibaba.webx.restful.process.RestfulRequestContext;

/**
 * Abstraction for a method parameter
 */
public interface Parameter {

    public static enum Source {
        ENTITY, QUERY, MATRIX, PATH, COOKIE, HEADER, CONTEXT, FORM, UNKNOWN, AUTO_WIRED
    }

    Source getSource();

    Object getParameterValue(RestfulRequestContext requestContext) throws TypeConvertException;

}
