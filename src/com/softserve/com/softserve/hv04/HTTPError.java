package com.softserve.hv04;

import java.util.Scanner;

	public enum HTTPError  {
		ERROR400 ("Bad Request  ", 400),
		ERROR401 ("Unauthorized  ", 401),
		ERROR402 ("Payment Required ", 402),
		ERROR403 ("Forbidden ",403),
		ERROR404 ("Not Found ",404),
		ERROR405 ("Method Not Allowed", 405),
		ERROR406 ("Not Acceptable ",406),
		ERROR407 ("Proxy Authentication Required ",406),
		ERROR408 ("Request Timeout ",406),
		ERROR409 ("Conflict ", 409),
		ERROR410 ("Gone ", 410),
		ERROR411 ("Length Required ", 4),
		ERROR412 ("Precondition Failed ", 412),
		ERROR413 ("Payload Too Large ", 4),
		ERROR414 ("URI Too Long ", 414),
		ERROR415 ("Unsupported Media Type ", 415),
		ERROR416 ("Range Not Satisfiable ", 416),
		ERROR417 ("Expectation Failed ", 417),
		ERROR418 ("I’m a teapot ", 418),
		ERROR419 ("Authentication Timeout ", 419),
		ERROR421 ("Misdirected Request ", 421),
		ERROR422 ("Unprocessable Entity ", 422),
		ERROR423 ("Locked ", 423),
		ERROR424 ("Failed Dependency ", 424),
		ERROR425 ("Too Early ", 425),
		ERROR426 ("Upgrade Required ", 426),
		ERROR428 ("Precondition Required ", 428),
		ERROR429 ("Too Many Requests ", 429),
		ERROR431 ("Request Header Fields Too Large ", 431),
		ERROR449 ("Retry With ", 449),
		ERROR451 ("Unavailable For Legal Reasons ", 451),
		ERROR499 ("Client Closed Request ", 499);
		
		
			
		
		private final String err;
	    private final int num;
	   
	   
	    

	    private HTTPError(String err, int num) {
	        this.err = err;
	        this.num = num;
	       
	    }
	    
	    @Override
	    public String toString() {
	        return getErr();
	    }


		public String getErr() {
			return err;
		}

		public int getNum() {
			return num;
		}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HTTPError ern = HTTPError.ERROR400;

			System.out.print("Number of HTTPError = ");
		    Scanner input = new Scanner(System.in);
		    int numErr = input.nextInt();


		    switch (numErr) {
		    case 400: ern = HTTPError.ERROR400; break;
		    case 401: ern = HTTPError.ERROR401; break;
		    case 402: ern = HTTPError.ERROR402; break;
		    case 403: ern = HTTPError.ERROR403; break;
		    case 404: ern = HTTPError.ERROR404; break;
		    case 405: ern = HTTPError.ERROR405; break;
		    case 406: ern = HTTPError.ERROR406; break;
		    case 407: ern = HTTPError.ERROR407; break;
		    case 408: ern = HTTPError.ERROR408; break;
		    case 409: ern = HTTPError.ERROR409; break;
		    case 410: ern = HTTPError.ERROR410; break;
		    case 411: ern = HTTPError.ERROR411; break;
		    case 412: ern = HTTPError.ERROR412; break;
		    case 413: ern = HTTPError.ERROR413; break;
		    case 414: ern = HTTPError.ERROR414; break;
		    case 415: ern = HTTPError.ERROR415; break;
		    case 416: ern = HTTPError.ERROR416; break;
		    case 417: ern = HTTPError.ERROR417; break;
		    case 418: ern = HTTPError.ERROR418; break;
		    case 419: ern = HTTPError.ERROR419; break;
		    case 421: ern = HTTPError.ERROR421; break;
		    case 422: ern = HTTPError.ERROR422; break;
		    case 423: ern = HTTPError.ERROR423; break;
		    case 424: ern = HTTPError.ERROR424; break;
		    case 425: ern = HTTPError.ERROR425; break;
		    case 426: ern = HTTPError.ERROR426; break;	    
		    case 428: ern = HTTPError.ERROR428; break;
		    case 429: ern = HTTPError.ERROR429; break;
		    case 431: ern = HTTPError.ERROR431; break;
		    case 449: ern = HTTPError.ERROR449; break;
		    case 451: ern = HTTPError.ERROR451; break;
		    case 499: ern = HTTPError.ERROR499; break;
		    default: System.out.println("Incorrect input"); return;
		  }
		    System.out.println(ern);
				 
	}

}
