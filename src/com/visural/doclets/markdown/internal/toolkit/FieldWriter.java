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

package com.visural.doclets.markdown.internal.toolkit;

import java.io.*;
import com.sun.javadoc.*;

/**
 * The interface for writing field output.
 *
 * This code is not part of an API.
 * It is implementation that is subject to change.
 * Do not use it as an API
 *
 * @author Jamie Ho
 * @since 1.5
 */

public interface FieldWriter {

    /**
     * Write the header for the field documentation.
     *
     * @param classDoc the class that the fields belong to.
     * @param header the header to write.
     */
    public void writeHeader(ClassDoc classDoc, String header);

    /**
     * Write the field header for the given field.
     *
     * @param field the field being documented.
     * @param isFirst the flag to indicate whether or not the field is the
     *        first to be documented.
     */
    public void writeFieldHeader(FieldDoc field, boolean isFirst);

    /**
     * Write the signature for the given field.
     *
     * @param field the field being documented.
     */
    public void writeSignature(FieldDoc field);

    /**
     * Write the deprecated output for the given field.
     *
     * @param field the field being documented.
     */
    public void writeDeprecated(FieldDoc field);

    /**
     * Write the comments for the given field.
     *
     * @param field the field being documented.
     */
    public void writeComments(FieldDoc field);

    /**
     * Write the tag output for the given field.
     *
     * @param field the field being documented.
     */
    public void writeTags(FieldDoc field);

    /**
     * Write the field footer.
     */
    public void writeFieldFooter();

    /**
     * Write the footer for the field documentation.
     *
     * @param classDoc the class that the fields belong to.
     */
    public void writeFooter(ClassDoc classDoc);

    /**
     * Close the writer.
     */
    public void close() throws IOException;
}
