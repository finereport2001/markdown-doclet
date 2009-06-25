/*
 * Copyright 2003 Sun Microsystems, Inc.  All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Sun designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Sun in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa Clara,
 * CA 95054 USA or visit www.sun.com if you need additional information or
 * have any questions.
 */

package com.visural.doclets.markdown.formats.html;

import com.visural.doclets.markdown.internal.toolkit.util.links.*;

/**
 * Stores output of a link.
 *
 * @author Jamie Ho
 * @since 1.5
 */
public class LinkOutputImpl implements LinkOutput {

    /**
     * The output of the link.
     */
    public StringBuffer output;

    /**
     * Construct a new LinkOutputImpl.
     */
    public LinkOutputImpl() {
        output = new StringBuffer();
    }

    /**
     * {@inheritDoc}
     */
    public void append(Object o) {
        output.append(o instanceof String ?
            (String) o : ((LinkOutputImpl)o).toString());
    }

    /**
     * {@inheritDoc}
     */
    public String toString() {
        return output.toString();
    }

}
