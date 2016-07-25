/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.hasor.restful;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Set;
/**
 * @version : 2013-6-5
 * @author 赵永春 (zyc@hasor.net)
 */
public interface RenderData {
    public static final String ROOT_DATA_KEY   = "rootData";
    public static final String RETURN_DATA_KEY = "returnData";

    //
    //
    public HttpServletRequest getHttpRequest();

    public HttpServletResponse getHttpResponse();

    public Set<String> keySet();

    public Object get(String key);

    public void put(String key, Object value);

    public String getViewName();

    public void setViewName(String viewName);

    public String getViewType();

    public void setViewType(String viewType);

    public boolean useLayout();

    public void enableLayout();

    public void disableLayout();
}