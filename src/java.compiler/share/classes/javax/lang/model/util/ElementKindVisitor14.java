/*
 * Copyright (c) 2019, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
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
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package javax.lang.model.util;

import javax.lang.model.element.*;
import javax.annotation.processing.SupportedSourceVersion;
import static javax.lang.model.SourceVersion.*;
import javax.lang.model.SourceVersion;

/**
 * {@preview Associated with records, a preview feature of the Java language.
 *
 *           This class is associated with <i>records</i>, a preview
 *           feature of the Java language. Preview features
 *           may be removed in a future release, or upgraded to permanent
 *           features of the Java language.}
 *
 * A visitor of program elements based on their {@linkplain
 * ElementKind kind} with default behavior appropriate for the {@link
 * SourceVersion#RELEASE_14 RELEASE_14} source version.
 *
 * For {@linkplain
 * Element elements} <code><i>Xyz</i></code> that may have more than one
 * kind, the <code>visit<i>Xyz</i></code> methods in this class delegate
 * to the <code>visit<i>Xyz</i>As<i>Kind</i></code> method corresponding to the
 * first argument's kind.  The <code>visit<i>Xyz</i>As<i>Kind</i></code> methods
 * call {@link #defaultAction defaultAction}, passing their arguments
 * to {@code defaultAction}'s corresponding parameters.
 *
 * <p> Methods in this class may be overridden subject to their
 * general contract.  Note that annotating methods in concrete
 * subclasses with {@link java.lang.Override @Override} will help
 * ensure that methods are overridden as intended.
 *
 * <p> <b>WARNING:</b> The {@code ElementVisitor} interface
 * implemented by this class may have methods added to it or the
 * {@code ElementKind} {@code enum} used in this case may have
 * constants added to it in the future to accommodate new, currently
 * unknown, language structures added to future versions of the
 * Java&trade; programming language.  Therefore, methods whose names
 * begin with {@code "visit"} may be added to this class in the
 * future; to avoid incompatibilities, classes which extend this class
 * should not declare any instance methods with names beginning with
 * {@code "visit"}.
 *
 * <p>When such a new visit method is added, the default
 * implementation in this class will be to call the {@link
 * #visitUnknown visitUnknown} method.  A new abstract element kind
 * visitor class will also be introduced to correspond to the new
 * language level; this visitor will have different default behavior
 * for the visit method in question.  When the new visitor is
 * introduced, all or portions of this visitor may be deprecated.
 *
 * @param <R> the return type of this visitor's methods.  Use {@link
 *            Void} for visitors that do not need to return results.
 * @param <P> the type of the additional parameter to this visitor's
 *            methods.  Use {@code Void} for visitors that do not need an
 *            additional parameter.
 *
 * @see ElementKindVisitor6
 * @see ElementKindVisitor7
 * @see ElementKindVisitor8
 * @see ElementKindVisitor9
 * @since 14
 */
@jdk.internal.PreviewFeature(feature=jdk.internal.PreviewFeature.Feature.RECORDS,
                             essentialAPI=false)
@SupportedSourceVersion(RELEASE_14)
public class ElementKindVisitor14<R, P> extends ElementKindVisitor9<R, P> {
    /**
     * Constructor for concrete subclasses; uses {@code null} for the
     * default value.
     */
    protected ElementKindVisitor14() {
        super(null);
    }

    /**
     * Constructor for concrete subclasses; uses the argument for the
     * default value.
     *
     * @param defaultValue the value to assign to {@link #DEFAULT_VALUE}
     */
    protected ElementKindVisitor14(R defaultValue) {
        super(defaultValue);
    }

    /**
     * {@inheritDoc}
     *
     * @implSpec This implementation calls {@code defaultAction}.
     *
     * @param e the element to visit
     * @param p a visitor-specified parameter
     * @return  the result of {@code defaultAction}
     */
    @SuppressWarnings("preview")
    @Override
    public R visitRecordComponent(RecordComponentElement e, P p) {
        return defaultAction(e, p);
    }

    /**
     * {@inheritDoc}
     *
     * @implSpec This implementation calls {@code defaultAction}.
     *.
     * @param e the element to visit
     * @param p a visitor-specified parameter
     * @return  the result of {@code defaultAction}
     */
    @Override
    public R visitTypeAsRecord(TypeElement e, P p) {
        return defaultAction(e, p);
    }

    /**
     * Visits a {@code BINDING_VARIABLE} variable element.
     *
     * @implSpec This implementation calls {@code defaultAction}.
     *
     * @param e {@inheritDoc}
     * @param p {@inheritDoc}
     * @return  the result of {@code defaultAction}
     *
     * @since 14
     */
    @Override
    public R visitVariableAsBindingVariable(VariableElement e, P p) {
        return defaultAction(e, p);
    }
}
