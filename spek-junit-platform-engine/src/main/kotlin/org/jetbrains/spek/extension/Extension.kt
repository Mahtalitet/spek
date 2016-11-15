package org.jetbrains.spek.extension

import org.jetbrains.spek.meta.Experimental

/**
 * @author Ranie Jade Ramiso
 */
@Experimental
interface Extension {
    fun init(annotations: Array<Annotation>)
}
