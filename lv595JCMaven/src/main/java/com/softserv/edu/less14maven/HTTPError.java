package main.java.com.softserv.edu.less14maven;

public enum HTTPError {
    E400(400,"Bad Request",false),
            E401(401,"Unauthorized",false),
            E402(402,"Payment Required",false),
            E403(403,"Forbidden",false),
            E404(404,"Not Found",false),
            E405(405,"Method Not Allowed",false),
            E406(406,"Not Acceptable",false),
            E407(407,"Proxy Authentication Required",false),
            E408(408,"Request Timeout",false),
            E409(409,"Conflict",false),
            E410(410,"Gone",false);
    private int code;
    private String description;
    private boolean mark;

    public boolean isMarked (){
        return this.mark;
    }

    public String getDescription (){
        return this.description;
    }
    private HTTPError(int code, String description, boolean mark) {
        this.code = code;
        this.description = description;
        this.mark = mark;
    }

    private HTTPError nextHTTPError() {
        if (this == HTTPError.E400)return E401;
        if (this == HTTPError.E401)return E402;
        if (this == HTTPError.E402)return E403;
        if (this == HTTPError.E403)return E404;
        if (this == HTTPError.E404)return E405;
        if (this == HTTPError.E405)return E406;
        if (this == HTTPError.E406)return E407;
        if (this == HTTPError.E407)return E408;
        if (this == HTTPError.E408)return E409;
        if (this == HTTPError.E409)return E410;
        return E400;
    }

    public HTTPError knownHTTPError (int code){
//        this = HTTPError.E400;
        HTTPError result = HTTPError.E400;
//        System.out.println(code);
         do {
//             System.out.println(result);
            if (result.code == code) {
//                System.out.println("Error known");
                result.mark = true;
                return result;
            }
            result = result.nextHTTPError();
        } while (result != HTTPError.E400);
        return result;
    }


}
