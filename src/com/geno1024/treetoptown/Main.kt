package com.geno1024.treetoptown

import com.sun.net.httpserver.HttpContext
import com.sun.net.httpserver.HttpHandler
import com.sun.net.httpserver.HttpServer
import com.sun.net.httpserver.HttpsServer
import java.net.InetSocketAddress

object Main
{
    @JvmStatic
    fun main(args: Array<String>)
    {
        with (
            listOf<Handler>()
        ) handlers@ {
            HttpServer.create(InetSocketAddress(8080), 0).apply server@ {
                this@handlers.forEach { handler ->
                    createContext(handler.url, handler.handler)
                }
                start()
            }
            HttpsServer.create(InetSocketAddress(8081), 0).apply server@ {
                this@handlers.forEach { handler ->
                    createContext(handler.url, handler.handler)
                }
            }
        }
    }
}
