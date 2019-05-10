package org.apache.http.impl;

import java.util.Locale;
import org.apache.http.ReasonPhraseCatalog;
import org.apache.http.util.Args;

public class EnglishReasonPhraseCatalog
  implements ReasonPhraseCatalog
{
  public static final EnglishReasonPhraseCatalog INSTANCE;
  private static final String[][] REASON_PHRASES;
  
  static
  {
    int i = 3;
    int j = 8;
    Object localObject = new org/apache/http/impl/EnglishReasonPhraseCatalog;
    ((EnglishReasonPhraseCatalog)localObject).<init>();
    INSTANCE = (EnglishReasonPhraseCatalog)localObject;
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
    REASON_PHRASES = (String[][])localObject;
    setReason(200, "OK");
    setReason(201, "Created");
    setReason(202, "Accepted");
    setReason(204, "No Content");
    setReason(301, "Moved Permanently");
    setReason(302, "Moved Temporarily");
    setReason(304, "Not Modified");
    setReason(400, "Bad Request");
    setReason(401, "Unauthorized");
    setReason(403, "Forbidden");
    setReason(404, "Not Found");
    setReason(500, "Internal Server Error");
    setReason(501, "Not Implemented");
    setReason(502, "Bad Gateway");
    setReason(503, "Service Unavailable");
    setReason(100, "Continue");
    setReason(307, "Temporary Redirect");
    setReason(405, "Method Not Allowed");
    setReason(409, "Conflict");
    setReason(412, "Precondition Failed");
    setReason(413, "Request Too Long");
    setReason(414, "Request-URI Too Long");
    setReason(415, "Unsupported Media Type");
    setReason(300, "Multiple Choices");
    setReason(303, "See Other");
    setReason(305, "Use Proxy");
    setReason(402, "Payment Required");
    setReason(406, "Not Acceptable");
    setReason(407, "Proxy Authentication Required");
    setReason(408, "Request Timeout");
    setReason(101, "Switching Protocols");
    setReason(203, "Non Authoritative Information");
    setReason(205, "Reset Content");
    setReason(206, "Partial Content");
    setReason(504, "Gateway Timeout");
    setReason(505, "Http Version Not Supported");
    setReason(410, "Gone");
    setReason(411, "Length Required");
    setReason(416, "Requested Range Not Satisfiable");
    setReason(417, "Expectation Failed");
    setReason(102, "Processing");
    setReason(207, "Multi-Status");
    setReason(422, "Unprocessable Entity");
    setReason(419, "Insufficient Space On Resource");
    setReason(420, "Method Failure");
    setReason(423, "Locked");
    setReason(507, "Insufficient Storage");
    setReason(424, "Failed Dependency");
  }
  
  private static void setReason(int paramInt, String paramString)
  {
    int i = paramInt / 100;
    int j = i * 100;
    j = paramInt - j;
    REASON_PHRASES[i][j] = paramString;
  }
  
  public String getReason(int paramInt, Locale paramLocale)
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
      Args.check(i, (String)localObject);
      int j = paramInt / 100;
      i = j * 100;
      int k = paramInt - i;
      i = 0;
      String str2 = null;
      String[] arrayOfString = REASON_PHRASES[j];
      int m = arrayOfString.length;
      if (m > k) {
        str2 = REASON_PHRASES[j][k];
      }
      return str2;
      i = 0;
      str2 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\EnglishReasonPhraseCatalog.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */