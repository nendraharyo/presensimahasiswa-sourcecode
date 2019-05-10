package b.a.a.a.i;

import b.a.a.a.ad;
import b.a.a.a.o.a;
import java.util.Locale;

public class d
  implements ad
{
  public static final d a;
  private static final String[][] b;
  
  static
  {
    int i = 3;
    int j = 8;
    Object localObject = new b/a/a/a/i/d;
    ((d)localObject).<init>();
    a = (d)localObject;
    localObject = new String[6][];
    localObject[0] = null;
    String[] arrayOfString1 = new String[i];
    localObject[1] = arrayOfString1;
    arrayOfString1 = new String[j];
    localObject[2] = arrayOfString1;
    String[] arrayOfString2 = new String[j];
    localObject[i] = arrayOfString2;
    arrayOfString1 = new String[25];
    localObject[4] = arrayOfString1;
    arrayOfString1 = new String[j];
    localObject[5] = arrayOfString1;
    b = (String[][])localObject;
    a(200, "OK");
    a(201, "Created");
    a(202, "Accepted");
    a(204, "No Content");
    a(301, "Moved Permanently");
    a(302, "Moved Temporarily");
    a(304, "Not Modified");
    a(400, "Bad Request");
    a(401, "Unauthorized");
    a(403, "Forbidden");
    a(404, "Not Found");
    a(500, "Internal Server Error");
    a(501, "Not Implemented");
    a(502, "Bad Gateway");
    a(503, "Service Unavailable");
    a(100, "Continue");
    a(307, "Temporary Redirect");
    a(405, "Method Not Allowed");
    a(409, "Conflict");
    a(412, "Precondition Failed");
    a(413, "Request Too Long");
    a(414, "Request-URI Too Long");
    a(415, "Unsupported Media Type");
    a(300, "Multiple Choices");
    a(303, "See Other");
    a(305, "Use Proxy");
    a(402, "Payment Required");
    a(406, "Not Acceptable");
    a(407, "Proxy Authentication Required");
    a(408, "Request Timeout");
    a(101, "Switching Protocols");
    a(203, "Non Authoritative Information");
    a(205, "Reset Content");
    a(206, "Partial Content");
    a(504, "Gateway Timeout");
    a(505, "Http Version Not Supported");
    a(410, "Gone");
    a(411, "Length Required");
    a(416, "Requested Range Not Satisfiable");
    a(417, "Expectation Failed");
    a(102, "Processing");
    a(207, "Multi-Status");
    a(422, "Unprocessable Entity");
    a(419, "Insufficient Space On Resource");
    a(420, "Method Failure");
    a(423, "Locked");
    a(507, "Insufficient Storage");
    a(424, "Failed Dependency");
  }
  
  private static void a(int paramInt, String paramString)
  {
    int i = paramInt / 100;
    int j = i * 100;
    j = paramInt - j;
    b[i][j] = paramString;
  }
  
  public String a(int paramInt, Locale paramLocale)
  {
    int i = 100;
    if (paramInt >= i)
    {
      i = 600;
      if (paramInt < i) {
        i = 1;
      }
    }
    for (;;)
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str1 = "Unknown category for status code ";
      localObject = str1 + paramInt;
      a.a(i, (String)localObject);
      int j = paramInt / 100;
      i = j * 100;
      int k = paramInt - i;
      i = 0;
      String str2 = null;
      String[] arrayOfString = b[j];
      int m = arrayOfString.length;
      if (m > k) {
        str2 = b[j][k];
      }
      return str2;
      i = 0;
      str2 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */