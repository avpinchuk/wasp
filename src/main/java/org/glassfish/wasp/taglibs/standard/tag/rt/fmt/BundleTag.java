/*
 * Copyright (c) 1997-2020 Oracle and/or its affiliates. All rights reserved.
 * Copyright 2004 The Apache Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.glassfish.wasp.taglibs.standard.tag.rt.fmt;

import org.glassfish.wasp.taglibs.standard.tag.common.fmt.BundleSupport;

import jakarta.servlet.jsp.JspTagException;

/**
 * A handler for &lt;bundle&gt; that supports rtexprvalue-based attributes.
 *
 * @author Jan Luehe
 */
public class BundleTag extends BundleSupport {

    private static final long serialVersionUID = 1L;

    // *********************************************************************
    // Accessor methods

    // For tag attribute
    public void setBasename(String basename) throws JspTagException {
        this.basename = basename;
    }

    // For tag attribute
    public void setPrefix(String prefix) throws JspTagException {
        this.prefix = prefix;
    }
}
