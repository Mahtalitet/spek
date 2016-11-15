package org.jetbrains.spek.extension

import org.jetbrains.spek.meta.Experimental

/**
 * @author Ranie Jade Ramiso
 */
@Experimental
interface GroupExtensionContext: ExtensionContext {
    val parent: GroupExtensionContext?
    val lazy: Boolean
}
