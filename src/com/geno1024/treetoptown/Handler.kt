package com.geno1024.treetoptown

import com.sun.net.httpserver.HttpExchange

/**
 *
 * @author Geno1024 (Y. Z. Chen)
 * @date 2020-09-15 01:40:39
 */
data class Handler(
    val url: String,
    val handler: (HttpExchange) -> Unit
)
{
}
