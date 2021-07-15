package edu.homework04.NumbersChecker;

public enum HttpErrors {
	BadRequest("Bad Request", 400) {
		public String flagError() {
			return "You made bad request!";
		}
	},
	Unauthorized("Unauthorized", 401) {
		public String flagError() {
			return "You are not authorized!";
		}
	},
	Forbidden("Forbidden", 403) {
		public String flagError() {
			return "You request is forbidden!";
		}
	},
	NotFound("Not Found", 404) {
		public String flagError() {
			return "Could not find!";
		}
	};

//		BadRequest  Unauthorized Forbidden NotFound
	private String name;
	private int code;

	private HttpErrors(String name, int code) {
		this.name = name;
		this.code = code;
	}

	public String promptError() {
		return "HTTP Error " + this.code + " - " + this.name + "!\n";
	}

	public String getDiscription() {
		switch (this) {
		case BadRequest:
			return "The server could not understand the request due to invalid syntax.";
		case Forbidden:
			return "The client does not have access rights to the content; that is, it is unauthorized, so the server is refusing to \n"
					+ "give the requested resource. Unlike 401, the client's identity is known to the server.";
		case NotFound:
			return "The server can not find the requested resource. In the browser, this means the URL is not recognized. In an API, \n"
					+ "this can also mean that the endpoint is valid but the resource itself does not exist. Servers may also send this \n"
					+ "response instead of 403 to hide the existence of a resource from an unauthorized client. This response code is \n"
					+ "probably the most famous one due to its frequent occurrence on the web.";

		case Unauthorized:
			return "Although the HTTP standard specifies \"unauthorized\", semantically this response means \"unauthenticated\". That is, \n"
					+ "the client must authenticate itself to get the requested response.";
		default:
			return "Unknown error";
		}
	}

	public abstract String flagError();
}
