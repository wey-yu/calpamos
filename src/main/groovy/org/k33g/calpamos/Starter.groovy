vertx.createHttpServer().requestHandler({ req ->
    req.response().putHeader("content-type", "text/html").end("<html><body><h1>Hello 🌍</h1></body></html>")
}).listen(8080)
