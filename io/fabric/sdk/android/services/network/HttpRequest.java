package io.fabric.sdk.android.services.network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPInputStream;

public class HttpRequest
{
  private static final String BOUNDARY = "00content0boundary00";
  public static final String CHARSET_UTF8 = "UTF-8";
  private static HttpRequest.ConnectionFactory CONNECTION_FACTORY = HttpRequest.ConnectionFactory.DEFAULT;
  public static final String CONTENT_TYPE_FORM = "application/x-www-form-urlencoded";
  public static final String CONTENT_TYPE_JSON = "application/json";
  private static final String CONTENT_TYPE_MULTIPART = "multipart/form-data; boundary=00content0boundary00";
  private static final String CRLF = "\r\n";
  private static final String[] EMPTY_STRINGS = new String[0];
  public static final String ENCODING_GZIP = "gzip";
  public static final String HEADER_ACCEPT = "Accept";
  public static final String HEADER_ACCEPT_CHARSET = "Accept-Charset";
  public static final String HEADER_ACCEPT_ENCODING = "Accept-Encoding";
  public static final String HEADER_AUTHORIZATION = "Authorization";
  public static final String HEADER_CACHE_CONTROL = "Cache-Control";
  public static final String HEADER_CONTENT_ENCODING = "Content-Encoding";
  public static final String HEADER_CONTENT_LENGTH = "Content-Length";
  public static final String HEADER_CONTENT_TYPE = "Content-Type";
  public static final String HEADER_DATE = "Date";
  public static final String HEADER_ETAG = "ETag";
  public static final String HEADER_EXPIRES = "Expires";
  public static final String HEADER_IF_NONE_MATCH = "If-None-Match";
  public static final String HEADER_LAST_MODIFIED = "Last-Modified";
  public static final String HEADER_LOCATION = "Location";
  public static final String HEADER_PROXY_AUTHORIZATION = "Proxy-Authorization";
  public static final String HEADER_REFERER = "Referer";
  public static final String HEADER_SERVER = "Server";
  public static final String HEADER_USER_AGENT = "User-Agent";
  public static final String METHOD_DELETE = "DELETE";
  public static final String METHOD_GET = "GET";
  public static final String METHOD_HEAD = "HEAD";
  public static final String METHOD_OPTIONS = "OPTIONS";
  public static final String METHOD_POST = "POST";
  public static final String METHOD_PUT = "PUT";
  public static final String METHOD_TRACE = "TRACE";
  public static final String PARAM_CHARSET = "charset";
  private int bufferSize;
  private HttpURLConnection connection = null;
  private boolean form;
  private String httpProxyHost;
  private int httpProxyPort;
  private boolean ignoreCloseExceptions = true;
  private boolean multipart;
  private HttpRequest.RequestOutputStream output;
  private final String requestMethod;
  private boolean uncompress;
  public final URL url;
  
  public HttpRequest(CharSequence paramCharSequence, String paramString)
  {
    URL localURL = null;
    this.uncompress = false;
    int i = 8192;
    this.bufferSize = i;
    try
    {
      localURL = new java/net/URL;
      localObject = paramCharSequence.toString();
      localURL.<init>((String)localObject);
      this.url = localURL;
      this.requestMethod = paramString;
      return;
    }
    catch (MalformedURLException localMalformedURLException)
    {
      Object localObject = new io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
      ((HttpRequest.HttpRequestException)localObject).<init>(localMalformedURLException);
      throw ((Throwable)localObject);
    }
  }
  
  public HttpRequest(URL paramURL, String paramString)
  {
    this.uncompress = false;
    this.bufferSize = 8192;
    this.url = paramURL;
    this.requestMethod = paramString;
  }
  
  private static StringBuilder addParamPrefix(String paramString, StringBuilder paramStringBuilder)
  {
    char c = '?';
    int i = 38;
    int j = paramString.indexOf(c);
    int k = paramStringBuilder.length() + -1;
    int m = -1;
    if (j == m) {
      paramStringBuilder.append(c);
    }
    for (;;)
    {
      return paramStringBuilder;
      if (j < k)
      {
        j = paramString.charAt(k);
        if (j != i) {
          paramStringBuilder.append(i);
        }
      }
    }
  }
  
  private static StringBuilder addPathSeparator(String paramString, StringBuilder paramStringBuilder)
  {
    char c = '/';
    int i = paramString.indexOf(':') + 2;
    int j = paramString.lastIndexOf(c);
    if (i == j) {
      paramStringBuilder.append(c);
    }
    return paramStringBuilder;
  }
  
  public static String append(CharSequence paramCharSequence, Map paramMap)
  {
    char c1 = '=';
    Object localObject = paramCharSequence.toString();
    if (paramMap != null)
    {
      boolean bool1 = paramMap.isEmpty();
      if (!bool1) {
        break label29;
      }
    }
    for (;;)
    {
      return (String)localObject;
      label29:
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>((String)localObject);
      addPathSeparator((String)localObject, localStringBuilder);
      addParamPrefix((String)localObject, localStringBuilder);
      Iterator localIterator = paramMap.entrySet().iterator();
      localObject = (Map.Entry)localIterator.next();
      String str = ((Map.Entry)localObject).getKey().toString();
      localStringBuilder.append(str);
      localStringBuilder.append(c1);
      localObject = ((Map.Entry)localObject).getValue();
      if (localObject != null) {
        localStringBuilder.append(localObject);
      }
      for (;;)
      {
        boolean bool2 = localIterator.hasNext();
        if (!bool2) {
          break;
        }
        char c2 = '&';
        localStringBuilder.append(c2);
        localObject = (Map.Entry)localIterator.next();
        str = ((Map.Entry)localObject).getKey().toString();
        localStringBuilder.append(str);
        localStringBuilder.append(c1);
        localObject = ((Map.Entry)localObject).getValue();
        if (localObject != null) {
          localStringBuilder.append(localObject);
        }
      }
      localObject = localStringBuilder.toString();
    }
  }
  
  public static String append(CharSequence paramCharSequence, Object... paramVarArgs)
  {
    char c = '=';
    Object localObject1 = paramCharSequence.toString();
    int i;
    if (paramVarArgs != null)
    {
      i = paramVarArgs.length;
      if (i != 0) {
        break label25;
      }
    }
    for (;;)
    {
      return (String)localObject1;
      label25:
      i = paramVarArgs.length % 2;
      if (i != 0)
      {
        localObject1 = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject1).<init>("Must specify an even number of parameter names/values");
        throw ((Throwable)localObject1);
      }
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>((String)localObject1);
      addPathSeparator((String)localObject1, localStringBuilder);
      addParamPrefix((String)localObject1, localStringBuilder);
      localObject1 = paramVarArgs[0];
      localStringBuilder.append(localObject1);
      localStringBuilder.append(c);
      int j = 1;
      localObject1 = paramVarArgs[j];
      if (localObject1 != null) {
        localStringBuilder.append(localObject1);
      }
      j = 2;
      for (;;)
      {
        int k = paramVarArgs.length;
        if (j >= k) {
          break;
        }
        localStringBuilder.append('&');
        Object localObject2 = paramVarArgs[j];
        localStringBuilder.append(localObject2);
        localStringBuilder.append(c);
        k = j + 1;
        localObject2 = paramVarArgs[k];
        if (localObject2 != null) {
          localStringBuilder.append(localObject2);
        }
        j += 2;
      }
      localObject1 = localStringBuilder.toString();
    }
  }
  
  /* Error */
  private HttpURLConnection createConnection()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 259	io/fabric/sdk/android/services/network/HttpRequest:httpProxyHost	Ljava/lang/String;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnull +38 -> 44
    //   9: getstatic 136	io/fabric/sdk/android/services/network/HttpRequest:CONNECTION_FACTORY	Lio/fabric/sdk/android/services/network/HttpRequest$ConnectionFactory;
    //   12: astore_1
    //   13: aload_0
    //   14: getfield 163	io/fabric/sdk/android/services/network/HttpRequest:url	Ljava/net/URL;
    //   17: astore_2
    //   18: aload_0
    //   19: invokespecial 263	io/fabric/sdk/android/services/network/HttpRequest:createProxy	()Ljava/net/Proxy;
    //   22: astore_3
    //   23: aload_1
    //   24: aload_2
    //   25: aload_3
    //   26: invokeinterface 267 3 0
    //   31: astore_1
    //   32: aload_0
    //   33: getfield 165	io/fabric/sdk/android/services/network/HttpRequest:requestMethod	Ljava/lang/String;
    //   36: astore_2
    //   37: aload_1
    //   38: aload_2
    //   39: invokevirtual 272	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   42: aload_1
    //   43: areturn
    //   44: getstatic 136	io/fabric/sdk/android/services/network/HttpRequest:CONNECTION_FACTORY	Lio/fabric/sdk/android/services/network/HttpRequest$ConnectionFactory;
    //   47: astore_1
    //   48: aload_0
    //   49: getfield 163	io/fabric/sdk/android/services/network/HttpRequest:url	Ljava/net/URL;
    //   52: astore_2
    //   53: aload_1
    //   54: aload_2
    //   55: invokeinterface 275 2 0
    //   60: astore_1
    //   61: goto -29 -> 32
    //   64: astore_1
    //   65: new 167	io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException
    //   68: astore_2
    //   69: aload_2
    //   70: aload_1
    //   71: invokespecial 170	io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException:<init>	(Ljava/io/IOException;)V
    //   74: aload_2
    //   75: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	76	0	this	HttpRequest
    //   4	57	1	localObject1	Object
    //   64	7	1	localIOException	IOException
    //   17	58	2	localObject2	Object
    //   22	4	3	localProxy	Proxy
    // Exception table:
    //   from	to	target	type
    //   0	4	64	java/io/IOException
    //   9	12	64	java/io/IOException
    //   13	17	64	java/io/IOException
    //   18	22	64	java/io/IOException
    //   25	31	64	java/io/IOException
    //   32	36	64	java/io/IOException
    //   38	42	64	java/io/IOException
    //   44	47	64	java/io/IOException
    //   48	52	64	java/io/IOException
    //   54	60	64	java/io/IOException
  }
  
  private Proxy createProxy()
  {
    Proxy localProxy = new java/net/Proxy;
    Proxy.Type localType = Proxy.Type.HTTP;
    InetSocketAddress localInetSocketAddress = new java/net/InetSocketAddress;
    String str = this.httpProxyHost;
    int i = this.httpProxyPort;
    localInetSocketAddress.<init>(str, i);
    localProxy.<init>(localType, localInetSocketAddress);
    return localProxy;
  }
  
  public static HttpRequest delete(CharSequence paramCharSequence)
  {
    HttpRequest localHttpRequest = new io/fabric/sdk/android/services/network/HttpRequest;
    localHttpRequest.<init>(paramCharSequence, "DELETE");
    return localHttpRequest;
  }
  
  public static HttpRequest delete(CharSequence paramCharSequence, Map paramMap, boolean paramBoolean)
  {
    String str = append(paramCharSequence, paramMap);
    if (paramBoolean) {
      str = encode(str);
    }
    return delete(str);
  }
  
  public static HttpRequest delete(CharSequence paramCharSequence, boolean paramBoolean, Object... paramVarArgs)
  {
    String str = append(paramCharSequence, paramVarArgs);
    if (paramBoolean) {
      str = encode(str);
    }
    return delete(str);
  }
  
  public static HttpRequest delete(URL paramURL)
  {
    HttpRequest localHttpRequest = new io/fabric/sdk/android/services/network/HttpRequest;
    localHttpRequest.<init>(paramURL, "DELETE");
    return localHttpRequest;
  }
  
  /* Error */
  public static String encode(CharSequence paramCharSequence)
  {
    // Byte code:
    //   0: new 152	java/net/URL
    //   3: astore_1
    //   4: aload_0
    //   5: invokeinterface 158 1 0
    //   10: astore_2
    //   11: aload_1
    //   12: aload_2
    //   13: invokespecial 161	java/net/URL:<init>	(Ljava/lang/String;)V
    //   16: aload_1
    //   17: invokevirtual 318	java/net/URL:getHost	()Ljava/lang/String;
    //   20: astore_3
    //   21: aload_1
    //   22: invokevirtual 321	java/net/URL:getPort	()I
    //   25: istore 4
    //   27: iconst_m1
    //   28: istore 5
    //   30: iload 4
    //   32: iload 5
    //   34: if_icmpeq +52 -> 86
    //   37: new 184	java/lang/StringBuilder
    //   40: astore 6
    //   42: aload 6
    //   44: invokespecial 322	java/lang/StringBuilder:<init>	()V
    //   47: aload 6
    //   49: aload_3
    //   50: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: astore 6
    //   55: bipush 58
    //   57: istore 7
    //   59: aload 6
    //   61: iload 7
    //   63: invokevirtual 192	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   66: astore 6
    //   68: iload 4
    //   70: invokestatic 327	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   73: astore_2
    //   74: aload 6
    //   76: aload_2
    //   77: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: astore_2
    //   81: aload_2
    //   82: invokevirtual 251	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   85: astore_3
    //   86: new 329	java/net/URI
    //   89: astore_2
    //   90: aload_1
    //   91: invokevirtual 332	java/net/URL:getProtocol	()Ljava/lang/String;
    //   94: astore 6
    //   96: aload_1
    //   97: invokevirtual 335	java/net/URL:getPath	()Ljava/lang/String;
    //   100: astore 8
    //   102: aload_1
    //   103: invokevirtual 338	java/net/URL:getQuery	()Ljava/lang/String;
    //   106: astore_1
    //   107: aload_2
    //   108: aload 6
    //   110: aload_3
    //   111: aload 8
    //   113: aload_1
    //   114: aconst_null
    //   115: invokespecial 341	java/net/URI:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   118: aload_2
    //   119: invokevirtual 344	java/net/URI:toASCIIString	()Ljava/lang/String;
    //   122: astore_2
    //   123: bipush 63
    //   125: istore 5
    //   127: aload_2
    //   128: iload 5
    //   130: invokevirtual 182	java/lang/String:indexOf	(I)I
    //   133: istore 5
    //   135: iload 5
    //   137: ifle +101 -> 238
    //   140: iload 5
    //   142: iconst_1
    //   143: iadd
    //   144: istore 7
    //   146: aload_2
    //   147: invokevirtual 345	java/lang/String:length	()I
    //   150: istore 9
    //   152: iload 7
    //   154: iload 9
    //   156: if_icmpge +82 -> 238
    //   159: new 184	java/lang/StringBuilder
    //   162: astore_3
    //   163: aload_3
    //   164: invokespecial 322	java/lang/StringBuilder:<init>	()V
    //   167: iconst_0
    //   168: istore 9
    //   170: aconst_null
    //   171: astore 8
    //   173: iload 5
    //   175: iconst_1
    //   176: iadd
    //   177: istore 10
    //   179: aload_2
    //   180: iconst_0
    //   181: iload 10
    //   183: invokevirtual 349	java/lang/String:substring	(II)Ljava/lang/String;
    //   186: astore 8
    //   188: aload_3
    //   189: aload 8
    //   191: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   194: astore_3
    //   195: iload 5
    //   197: iconst_1
    //   198: iadd
    //   199: istore 5
    //   201: aload_2
    //   202: iload 5
    //   204: invokevirtual 351	java/lang/String:substring	(I)Ljava/lang/String;
    //   207: astore_2
    //   208: ldc_w 353
    //   211: astore 6
    //   213: ldc_w 355
    //   216: astore 8
    //   218: aload_2
    //   219: aload 6
    //   221: aload 8
    //   223: invokevirtual 359	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   226: astore_2
    //   227: aload_3
    //   228: aload_2
    //   229: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   232: astore_2
    //   233: aload_2
    //   234: invokevirtual 251	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   237: astore_2
    //   238: aload_2
    //   239: areturn
    //   240: astore_2
    //   241: new 167	io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException
    //   244: astore 6
    //   246: aload 6
    //   248: aload_2
    //   249: invokespecial 170	io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException:<init>	(Ljava/io/IOException;)V
    //   252: aload 6
    //   254: athrow
    //   255: astore_2
    //   256: new 277	java/io/IOException
    //   259: astore 6
    //   261: aload 6
    //   263: ldc_w 361
    //   266: invokespecial 362	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   269: aload 6
    //   271: aload_2
    //   272: invokevirtual 366	java/io/IOException:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   275: pop
    //   276: new 167	io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException
    //   279: astore_2
    //   280: aload_2
    //   281: aload 6
    //   283: invokespecial 170	io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException:<init>	(Ljava/io/IOException;)V
    //   286: aload_2
    //   287: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	288	0	paramCharSequence	CharSequence
    //   3	111	1	localObject1	Object
    //   10	229	2	localObject2	Object
    //   240	9	2	localIOException	IOException
    //   255	17	2	localURISyntaxException	java.net.URISyntaxException
    //   279	8	2	localHttpRequestException	HttpRequest.HttpRequestException
    //   20	208	3	localObject3	Object
    //   25	44	4	i	int
    //   28	175	5	j	int
    //   40	242	6	localObject4	Object
    //   57	5	7	c	char
    //   144	13	7	k	int
    //   100	122	8	str	String
    //   150	19	9	m	int
    //   177	5	10	n	int
    // Exception table:
    //   from	to	target	type
    //   0	3	240	java/io/IOException
    //   4	10	240	java/io/IOException
    //   12	16	240	java/io/IOException
    //   86	89	255	java/net/URISyntaxException
    //   90	94	255	java/net/URISyntaxException
    //   96	100	255	java/net/URISyntaxException
    //   102	106	255	java/net/URISyntaxException
    //   114	118	255	java/net/URISyntaxException
    //   118	122	255	java/net/URISyntaxException
    //   128	133	255	java/net/URISyntaxException
    //   146	150	255	java/net/URISyntaxException
    //   159	162	255	java/net/URISyntaxException
    //   163	167	255	java/net/URISyntaxException
    //   181	186	255	java/net/URISyntaxException
    //   189	194	255	java/net/URISyntaxException
    //   202	207	255	java/net/URISyntaxException
    //   221	226	255	java/net/URISyntaxException
    //   228	232	255	java/net/URISyntaxException
    //   233	237	255	java/net/URISyntaxException
  }
  
  public static HttpRequest get(CharSequence paramCharSequence)
  {
    HttpRequest localHttpRequest = new io/fabric/sdk/android/services/network/HttpRequest;
    localHttpRequest.<init>(paramCharSequence, "GET");
    return localHttpRequest;
  }
  
  public static HttpRequest get(CharSequence paramCharSequence, Map paramMap, boolean paramBoolean)
  {
    String str = append(paramCharSequence, paramMap);
    if (paramBoolean) {
      str = encode(str);
    }
    return get(str);
  }
  
  public static HttpRequest get(CharSequence paramCharSequence, boolean paramBoolean, Object... paramVarArgs)
  {
    String str = append(paramCharSequence, paramVarArgs);
    if (paramBoolean) {
      str = encode(str);
    }
    return get(str);
  }
  
  public static HttpRequest get(URL paramURL)
  {
    HttpRequest localHttpRequest = new io/fabric/sdk/android/services/network/HttpRequest;
    localHttpRequest.<init>(paramURL, "GET");
    return localHttpRequest;
  }
  
  private static String getValidCharset(String paramString)
  {
    if (paramString != null)
    {
      int i = paramString.length();
      if (i <= 0) {}
    }
    for (;;)
    {
      return paramString;
      paramString = "UTF-8";
    }
  }
  
  public static HttpRequest head(CharSequence paramCharSequence)
  {
    HttpRequest localHttpRequest = new io/fabric/sdk/android/services/network/HttpRequest;
    localHttpRequest.<init>(paramCharSequence, "HEAD");
    return localHttpRequest;
  }
  
  public static HttpRequest head(CharSequence paramCharSequence, Map paramMap, boolean paramBoolean)
  {
    String str = append(paramCharSequence, paramMap);
    if (paramBoolean) {
      str = encode(str);
    }
    return head(str);
  }
  
  public static HttpRequest head(CharSequence paramCharSequence, boolean paramBoolean, Object... paramVarArgs)
  {
    String str = append(paramCharSequence, paramVarArgs);
    if (paramBoolean) {
      str = encode(str);
    }
    return head(str);
  }
  
  public static HttpRequest head(URL paramURL)
  {
    HttpRequest localHttpRequest = new io/fabric/sdk/android/services/network/HttpRequest;
    localHttpRequest.<init>(paramURL, "HEAD");
    return localHttpRequest;
  }
  
  public static void keepAlive(boolean paramBoolean)
  {
    String str = Boolean.toString(paramBoolean);
    setProperty("http.keepAlive", str);
  }
  
  public static void nonProxyHosts(String... paramVarArgs)
  {
    Object localObject1;
    String str;
    if (paramVarArgs != null)
    {
      int i = paramVarArgs.length;
      if (i > 0)
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        int j = paramVarArgs.length + -1;
        i = 0;
        str = null;
        while (i < j)
        {
          Object localObject2 = paramVarArgs[i];
          localObject2 = ((StringBuilder)localObject1).append((String)localObject2);
          char c = '|';
          ((StringBuilder)localObject2).append(c);
          i += 1;
        }
        str = paramVarArgs[j];
        ((StringBuilder)localObject1).append(str);
        str = "http.nonProxyHosts";
        localObject1 = ((StringBuilder)localObject1).toString();
        setProperty(str, (String)localObject1);
      }
    }
    for (;;)
    {
      return;
      str = "http.nonProxyHosts";
      localObject1 = null;
      setProperty(str, null);
    }
  }
  
  public static HttpRequest options(CharSequence paramCharSequence)
  {
    HttpRequest localHttpRequest = new io/fabric/sdk/android/services/network/HttpRequest;
    localHttpRequest.<init>(paramCharSequence, "OPTIONS");
    return localHttpRequest;
  }
  
  public static HttpRequest options(URL paramURL)
  {
    HttpRequest localHttpRequest = new io/fabric/sdk/android/services/network/HttpRequest;
    localHttpRequest.<init>(paramURL, "OPTIONS");
    return localHttpRequest;
  }
  
  public static HttpRequest post(CharSequence paramCharSequence)
  {
    HttpRequest localHttpRequest = new io/fabric/sdk/android/services/network/HttpRequest;
    localHttpRequest.<init>(paramCharSequence, "POST");
    return localHttpRequest;
  }
  
  public static HttpRequest post(CharSequence paramCharSequence, Map paramMap, boolean paramBoolean)
  {
    String str = append(paramCharSequence, paramMap);
    if (paramBoolean) {
      str = encode(str);
    }
    return post(str);
  }
  
  public static HttpRequest post(CharSequence paramCharSequence, boolean paramBoolean, Object... paramVarArgs)
  {
    String str = append(paramCharSequence, paramVarArgs);
    if (paramBoolean) {
      str = encode(str);
    }
    return post(str);
  }
  
  public static HttpRequest post(URL paramURL)
  {
    HttpRequest localHttpRequest = new io/fabric/sdk/android/services/network/HttpRequest;
    localHttpRequest.<init>(paramURL, "POST");
    return localHttpRequest;
  }
  
  public static void proxyHost(String paramString)
  {
    setProperty("http.proxyHost", paramString);
    setProperty("https.proxyHost", paramString);
  }
  
  public static void proxyPort(int paramInt)
  {
    String str = Integer.toString(paramInt);
    setProperty("http.proxyPort", str);
    setProperty("https.proxyPort", str);
  }
  
  public static HttpRequest put(CharSequence paramCharSequence)
  {
    HttpRequest localHttpRequest = new io/fabric/sdk/android/services/network/HttpRequest;
    localHttpRequest.<init>(paramCharSequence, "PUT");
    return localHttpRequest;
  }
  
  public static HttpRequest put(CharSequence paramCharSequence, Map paramMap, boolean paramBoolean)
  {
    String str = append(paramCharSequence, paramMap);
    if (paramBoolean) {
      str = encode(str);
    }
    return put(str);
  }
  
  public static HttpRequest put(CharSequence paramCharSequence, boolean paramBoolean, Object... paramVarArgs)
  {
    String str = append(paramCharSequence, paramVarArgs);
    if (paramBoolean) {
      str = encode(str);
    }
    return put(str);
  }
  
  public static HttpRequest put(URL paramURL)
  {
    HttpRequest localHttpRequest = new io/fabric/sdk/android/services/network/HttpRequest;
    localHttpRequest.<init>(paramURL, "PUT");
    return localHttpRequest;
  }
  
  public static void setConnectionFactory(HttpRequest.ConnectionFactory paramConnectionFactory)
  {
    HttpRequest.ConnectionFactory localConnectionFactory;
    if (paramConnectionFactory == null) {
      localConnectionFactory = HttpRequest.ConnectionFactory.DEFAULT;
    }
    for (CONNECTION_FACTORY = localConnectionFactory;; CONNECTION_FACTORY = paramConnectionFactory) {
      return;
    }
  }
  
  private static String setProperty(String paramString1, String paramString2)
  {
    Object localObject;
    if (paramString2 != null)
    {
      localObject = new io/fabric/sdk/android/services/network/HttpRequest$1;
      ((HttpRequest.1)localObject).<init>(paramString1, paramString2);
    }
    for (;;)
    {
      return (String)AccessController.doPrivileged((PrivilegedAction)localObject);
      localObject = new io/fabric/sdk/android/services/network/HttpRequest$2;
      ((HttpRequest.2)localObject).<init>(paramString1);
    }
  }
  
  public static HttpRequest trace(CharSequence paramCharSequence)
  {
    HttpRequest localHttpRequest = new io/fabric/sdk/android/services/network/HttpRequest;
    localHttpRequest.<init>(paramCharSequence, "TRACE");
    return localHttpRequest;
  }
  
  public static HttpRequest trace(URL paramURL)
  {
    HttpRequest localHttpRequest = new io/fabric/sdk/android/services/network/HttpRequest;
    localHttpRequest.<init>(paramURL, "TRACE");
    return localHttpRequest;
  }
  
  public HttpRequest accept(String paramString)
  {
    return header("Accept", paramString);
  }
  
  public HttpRequest acceptCharset(String paramString)
  {
    return header("Accept-Charset", paramString);
  }
  
  public HttpRequest acceptEncoding(String paramString)
  {
    return header("Accept-Encoding", paramString);
  }
  
  public HttpRequest acceptGzipEncoding()
  {
    return acceptEncoding("gzip");
  }
  
  public HttpRequest acceptJson()
  {
    return accept("application/json");
  }
  
  public HttpRequest authorization(String paramString)
  {
    return header("Authorization", paramString);
  }
  
  public boolean badRequest()
  {
    int i = 400;
    int k = code();
    if (i == k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public HttpRequest basic(String paramString1, String paramString2)
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("Basic ");
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = HttpRequest.Base64.encode(paramString1 + ':' + paramString2);
    localObject1 = (String)localObject2;
    return authorization((String)localObject1);
  }
  
  public HttpRequest body(AtomicReference paramAtomicReference)
  {
    String str = body();
    paramAtomicReference.set(str);
    return this;
  }
  
  public HttpRequest body(AtomicReference paramAtomicReference, String paramString)
  {
    String str = body(paramString);
    paramAtomicReference.set(str);
    return this;
  }
  
  public String body()
  {
    String str = charset();
    return body(str);
  }
  
  public String body(String paramString)
  {
    ByteArrayOutputStream localByteArrayOutputStream = byteStream();
    try
    {
      localObject = buffer();
      copy((InputStream)localObject, localByteArrayOutputStream);
      localObject = getValidCharset(paramString);
      return localByteArrayOutputStream.toString((String)localObject);
    }
    catch (IOException localIOException)
    {
      Object localObject = new io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
      ((HttpRequest.HttpRequestException)localObject).<init>(localIOException);
      throw ((Throwable)localObject);
    }
  }
  
  public BufferedInputStream buffer()
  {
    BufferedInputStream localBufferedInputStream = new java/io/BufferedInputStream;
    InputStream localInputStream = stream();
    int i = this.bufferSize;
    localBufferedInputStream.<init>(localInputStream, i);
    return localBufferedInputStream;
  }
  
  public int bufferSize()
  {
    return this.bufferSize;
  }
  
  public HttpRequest bufferSize(int paramInt)
  {
    int i = 1;
    if (paramInt < i)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Size must be greater than zero");
      throw localIllegalArgumentException;
    }
    this.bufferSize = paramInt;
    return this;
  }
  
  public BufferedReader bufferedReader()
  {
    String str = charset();
    return bufferedReader(str);
  }
  
  public BufferedReader bufferedReader(String paramString)
  {
    BufferedReader localBufferedReader = new java/io/BufferedReader;
    InputStreamReader localInputStreamReader = reader(paramString);
    int i = this.bufferSize;
    localBufferedReader.<init>(localInputStreamReader, i);
    return localBufferedReader;
  }
  
  protected ByteArrayOutputStream byteStream()
  {
    int i = contentLength();
    ByteArrayOutputStream localByteArrayOutputStream;
    if (i > 0)
    {
      localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
      localByteArrayOutputStream.<init>(i);
    }
    for (;;)
    {
      return localByteArrayOutputStream;
      localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
      localByteArrayOutputStream.<init>();
    }
  }
  
  public byte[] bytes()
  {
    ByteArrayOutputStream localByteArrayOutputStream = byteStream();
    try
    {
      localObject = buffer();
      copy((InputStream)localObject, localByteArrayOutputStream);
      return localByteArrayOutputStream.toByteArray();
    }
    catch (IOException localIOException)
    {
      Object localObject = new io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
      ((HttpRequest.HttpRequestException)localObject).<init>(localIOException);
      throw ((Throwable)localObject);
    }
  }
  
  public String cacheControl()
  {
    return header("Cache-Control");
  }
  
  public String charset()
  {
    return parameter("Content-Type", "charset");
  }
  
  public HttpRequest chunk(int paramInt)
  {
    getConnection().setChunkedStreamingMode(paramInt);
    return this;
  }
  
  protected HttpRequest closeOutput()
  {
    HttpRequest.RequestOutputStream localRequestOutputStream = this.output;
    if (localRequestOutputStream == null) {
      return this;
    }
    boolean bool = this.multipart;
    if (bool)
    {
      localRequestOutputStream = this.output;
      String str = "\r\n--00content0boundary00--\r\n";
      localRequestOutputStream.write(str);
    }
    bool = this.ignoreCloseExceptions;
    if (bool) {}
    for (;;)
    {
      try
      {
        localRequestOutputStream = this.output;
        localRequestOutputStream.close();
      }
      catch (IOException localIOException)
      {
        continue;
      }
      bool = false;
      localRequestOutputStream = null;
      this.output = null;
      break;
      localRequestOutputStream = this.output;
      localRequestOutputStream.close();
    }
  }
  
  protected HttpRequest closeOutputQuietly()
  {
    try
    {
      return closeOutput();
    }
    catch (IOException localIOException)
    {
      HttpRequest.HttpRequestException localHttpRequestException = new io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
      localHttpRequestException.<init>(localIOException);
      throw localHttpRequestException;
    }
  }
  
  public int code()
  {
    try
    {
      closeOutput();
      HttpURLConnection localHttpURLConnection = getConnection();
      return localHttpURLConnection.getResponseCode();
    }
    catch (IOException localIOException)
    {
      HttpRequest.HttpRequestException localHttpRequestException = new io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
      localHttpRequestException.<init>(localIOException);
      throw localHttpRequestException;
    }
  }
  
  public HttpRequest code(AtomicInteger paramAtomicInteger)
  {
    int i = code();
    paramAtomicInteger.set(i);
    return this;
  }
  
  public HttpRequest connectTimeout(int paramInt)
  {
    getConnection().setConnectTimeout(paramInt);
    return this;
  }
  
  public String contentEncoding()
  {
    return header("Content-Encoding");
  }
  
  public int contentLength()
  {
    return intHeader("Content-Length");
  }
  
  public HttpRequest contentLength(int paramInt)
  {
    getConnection().setFixedLengthStreamingMode(paramInt);
    return this;
  }
  
  public HttpRequest contentLength(String paramString)
  {
    int i = Integer.parseInt(paramString);
    return contentLength(i);
  }
  
  public HttpRequest contentType(String paramString)
  {
    return contentType(paramString, null);
  }
  
  public HttpRequest contentType(String paramString1, String paramString2)
  {
    Object localObject;
    if (paramString2 != null)
    {
      int i = paramString2.length();
      if (i > 0)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = ((StringBuilder)localObject).append(paramString1);
        String str = "; charset=";
        localObject = str + paramString2;
      }
    }
    for (HttpRequest localHttpRequest = header("Content-Type", (String)localObject);; localHttpRequest = header("Content-Type", paramString1)) {
      return localHttpRequest;
    }
  }
  
  public String contentType()
  {
    return header("Content-Type");
  }
  
  protected HttpRequest copy(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    HttpRequest.6 local6 = new io/fabric/sdk/android/services/network/HttpRequest$6;
    boolean bool = this.ignoreCloseExceptions;
    local6.<init>(this, paramInputStream, bool, paramInputStream, paramOutputStream);
    return (HttpRequest)local6.call();
  }
  
  protected HttpRequest copy(Reader paramReader, Writer paramWriter)
  {
    HttpRequest.7 local7 = new io/fabric/sdk/android/services/network/HttpRequest$7;
    boolean bool = this.ignoreCloseExceptions;
    local7.<init>(this, paramReader, bool, paramReader, paramWriter);
    return (HttpRequest)local7.call();
  }
  
  public boolean created()
  {
    int i = 201;
    int k = code();
    if (i == k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public long date()
  {
    return dateHeader("Date");
  }
  
  public long dateHeader(String paramString)
  {
    return dateHeader(paramString, -1);
  }
  
  public long dateHeader(String paramString, long paramLong)
  {
    closeOutputQuietly();
    return getConnection().getHeaderFieldDate(paramString, paramLong);
  }
  
  public HttpRequest disconnect()
  {
    getConnection().disconnect();
    return this;
  }
  
  public String eTag()
  {
    return header("ETag");
  }
  
  public long expires()
  {
    return dateHeader("Expires");
  }
  
  public HttpRequest followRedirects(boolean paramBoolean)
  {
    getConnection().setInstanceFollowRedirects(paramBoolean);
    return this;
  }
  
  public HttpRequest form(Object paramObject1, Object paramObject2)
  {
    return form(paramObject1, paramObject2, "UTF-8");
  }
  
  public HttpRequest form(Object paramObject1, Object paramObject2, String paramString)
  {
    boolean bool1 = true;
    boolean bool2 = this.form;
    if (!bool2) {
      bool2 = bool1;
    }
    for (;;)
    {
      String str;
      if (bool2)
      {
        str = "application/x-www-form-urlencoded";
        contentType(str, paramString);
        this.form = bool1;
      }
      localObject = getValidCharset(paramString);
      try
      {
        openOutput();
        if (!bool2)
        {
          localRequestOutputStream = this.output;
          i = 38;
          localRequestOutputStream.write(i);
        }
        localRequestOutputStream = this.output;
        str = paramObject1.toString();
        str = URLEncoder.encode(str, (String)localObject);
        localRequestOutputStream.write(str);
        localRequestOutputStream = this.output;
        int i = 61;
        localRequestOutputStream.write(i);
        if (paramObject2 != null)
        {
          localRequestOutputStream = this.output;
          str = paramObject2.toString();
          localObject = URLEncoder.encode(str, (String)localObject);
          localRequestOutputStream.write((String)localObject);
        }
        return this;
      }
      catch (IOException localIOException)
      {
        HttpRequest.RequestOutputStream localRequestOutputStream;
        localObject = new io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        ((HttpRequest.HttpRequestException)localObject).<init>(localIOException);
        throw ((Throwable)localObject);
      }
      bool2 = false;
      localRequestOutputStream = null;
    }
  }
  
  public HttpRequest form(Map.Entry paramEntry)
  {
    return form(paramEntry, "UTF-8");
  }
  
  public HttpRequest form(Map.Entry paramEntry, String paramString)
  {
    Object localObject1 = paramEntry.getKey();
    Object localObject2 = paramEntry.getValue();
    return form(localObject1, localObject2, paramString);
  }
  
  public HttpRequest form(Map paramMap)
  {
    return form(paramMap, "UTF-8");
  }
  
  public HttpRequest form(Map paramMap, String paramString)
  {
    boolean bool = paramMap.isEmpty();
    if (!bool)
    {
      Object localObject = paramMap.entrySet();
      Iterator localIterator = ((Set)localObject).iterator();
      for (;;)
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject = (Map.Entry)localIterator.next();
        form((Map.Entry)localObject, paramString);
      }
    }
    return this;
  }
  
  public HttpURLConnection getConnection()
  {
    HttpURLConnection localHttpURLConnection = this.connection;
    if (localHttpURLConnection == null)
    {
      localHttpURLConnection = createConnection();
      this.connection = localHttpURLConnection;
    }
    return this.connection;
  }
  
  protected String getParam(String paramString1, String paramString2)
  {
    int i = 34;
    int j = 0;
    int k = 59;
    int m = -1;
    if (paramString1 != null)
    {
      n = paramString1.length();
      if (n != 0) {}
    }
    else
    {
      n = 0;
    }
    int i2;
    int i3;
    for (String str = null;; str = null)
    {
      return str;
      i2 = paramString1.length();
      n = paramString1.indexOf(k);
      i3 = n + 1;
      if ((i3 != 0) && (i3 != i2)) {
        break;
      }
      n = 0;
    }
    int n = paramString1.indexOf(k, i3);
    if (n == m)
    {
      n = i3;
      i3 = i2;
    }
    for (;;)
    {
      if (n < i3)
      {
        int i4 = paramString1.indexOf('=', n);
        if ((i4 != m) && (i4 < i3))
        {
          str = paramString1.substring(n, i4).trim();
          boolean bool = paramString2.equals(str);
          if (bool)
          {
            i1 = i4 + 1;
            str = paramString1.substring(i1, i3).trim();
            i4 = str.length();
            if (i4 != 0)
            {
              i2 = 2;
              if (i4 <= i2) {
                break;
              }
              i2 = str.charAt(0);
              if (i != i2) {
                break;
              }
              i2 = i4 + -1;
              i2 = str.charAt(i2);
              if (i != i2) {
                break;
              }
              i2 = 1;
              j = i4 + -1;
              str = str.substring(i2, j);
              break;
            }
          }
        }
        i3 += 1;
        i1 = paramString1.indexOf(k, i3);
        if (i1 == m) {
          i1 = i2;
        }
        i5 = i1;
        i1 = i3;
        i3 = i5;
        continue;
      }
      int i1 = 0;
      str = null;
      break;
      int i5 = i1;
      i1 = i3;
      i3 = i5;
    }
  }
  
  protected Map getParams(String paramString)
  {
    int i = 34;
    int j = 59;
    int k = -1;
    int m;
    Object localObject;
    if (paramString != null)
    {
      m = paramString.length();
      if (m != 0) {}
    }
    else
    {
      localObject = Collections.emptyMap();
    }
    for (;;)
    {
      return (Map)localObject;
      int n = paramString.length();
      m = paramString.indexOf(j);
      int i1 = m + 1;
      if ((i1 == 0) || (i1 == n))
      {
        localObject = Collections.emptyMap();
      }
      else
      {
        m = paramString.indexOf(j, i1);
        if (m == k) {
          m = n;
        }
        LinkedHashMap localLinkedHashMap = new java/util/LinkedHashMap;
        localLinkedHashMap.<init>();
        if (i1 < m)
        {
          int i2 = paramString.indexOf('=', i1);
          String str1;
          String str2;
          if ((i2 != k) && (i2 < m))
          {
            str1 = paramString.substring(i1, i2).trim();
            int i3 = str1.length();
            if (i3 > 0)
            {
              i2 += 1;
              str2 = paramString.substring(i2, m).trim();
              i3 = str2.length();
              if (i3 != 0)
              {
                int i4 = 2;
                if (i3 <= i4) {
                  break label294;
                }
                i4 = str2.charAt(0);
                if (i != i4) {
                  break label294;
                }
                i4 = i3 + -1;
                i4 = str2.charAt(i4);
                if (i != i4) {
                  break label294;
                }
                i4 = 1;
                i3 += -1;
                str2 = str2.substring(i4, i3);
                localLinkedHashMap.put(str1, str2);
              }
            }
          }
          for (;;)
          {
            i1 = m + 1;
            m = paramString.indexOf(j, i1);
            if (m != k) {
              break;
            }
            m = n;
            break;
            label294:
            localLinkedHashMap.put(str1, str2);
          }
        }
        localObject = localLinkedHashMap;
      }
    }
  }
  
  public HttpRequest header(String paramString, Number paramNumber)
  {
    if (paramNumber != null) {}
    for (String str = paramNumber.toString();; str = null) {
      return header(paramString, str);
    }
  }
  
  public HttpRequest header(String paramString1, String paramString2)
  {
    getConnection().setRequestProperty(paramString1, paramString2);
    return this;
  }
  
  public HttpRequest header(Map.Entry paramEntry)
  {
    String str1 = (String)paramEntry.getKey();
    String str2 = (String)paramEntry.getValue();
    return header(str1, str2);
  }
  
  public String header(String paramString)
  {
    closeOutputQuietly();
    return getConnection().getHeaderField(paramString);
  }
  
  public HttpRequest headers(Map paramMap)
  {
    boolean bool = paramMap.isEmpty();
    if (!bool)
    {
      Object localObject = paramMap.entrySet();
      Iterator localIterator = ((Set)localObject).iterator();
      for (;;)
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject = (Map.Entry)localIterator.next();
        header((Map.Entry)localObject);
      }
    }
    return this;
  }
  
  public Map headers()
  {
    closeOutputQuietly();
    return getConnection().getHeaderFields();
  }
  
  public String[] headers(String paramString)
  {
    Object localObject = headers();
    boolean bool;
    if (localObject != null)
    {
      bool = ((Map)localObject).isEmpty();
      if (!bool) {}
    }
    else
    {
      localObject = EMPTY_STRINGS;
    }
    for (;;)
    {
      return (String[])localObject;
      localObject = (List)((Map)localObject).get(paramString);
      if (localObject != null)
      {
        bool = ((List)localObject).isEmpty();
        if (!bool)
        {
          int i = ((List)localObject).size();
          String[] arrayOfString = new String[i];
          localObject = (String[])((List)localObject).toArray(arrayOfString);
          continue;
        }
      }
      localObject = EMPTY_STRINGS;
    }
  }
  
  public HttpRequest ifModifiedSince(long paramLong)
  {
    getConnection().setIfModifiedSince(paramLong);
    return this;
  }
  
  public HttpRequest ifNoneMatch(String paramString)
  {
    return header("If-None-Match", paramString);
  }
  
  public HttpRequest ignoreCloseExceptions(boolean paramBoolean)
  {
    this.ignoreCloseExceptions = paramBoolean;
    return this;
  }
  
  public boolean ignoreCloseExceptions()
  {
    return this.ignoreCloseExceptions;
  }
  
  public int intHeader(String paramString)
  {
    return intHeader(paramString, -1);
  }
  
  public int intHeader(String paramString, int paramInt)
  {
    closeOutputQuietly();
    return getConnection().getHeaderFieldInt(paramString, paramInt);
  }
  
  public boolean isBodyEmpty()
  {
    int i = contentLength();
    if (i == 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public long lastModified()
  {
    return dateHeader("Last-Modified");
  }
  
  public String location()
  {
    return header("Location");
  }
  
  public String message()
  {
    try
    {
      closeOutput();
      HttpURLConnection localHttpURLConnection = getConnection();
      return localHttpURLConnection.getResponseMessage();
    }
    catch (IOException localIOException)
    {
      HttpRequest.HttpRequestException localHttpRequestException = new io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
      localHttpRequestException.<init>(localIOException);
      throw localHttpRequestException;
    }
  }
  
  public String method()
  {
    return getConnection().getRequestMethod();
  }
  
  public boolean notFound()
  {
    int i = 404;
    int k = code();
    if (i == k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public boolean notModified()
  {
    int i = 304;
    int k = code();
    if (i == k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public boolean ok()
  {
    int i = 200;
    int k = code();
    if (i == k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  protected HttpRequest openOutput()
  {
    Object localObject = this.output;
    if (localObject != null) {}
    for (;;)
    {
      return this;
      localObject = getConnection();
      boolean bool = true;
      ((HttpURLConnection)localObject).setDoOutput(bool);
      localObject = getConnection().getRequestProperty("Content-Type");
      localObject = getParam((String)localObject, "charset");
      HttpRequest.RequestOutputStream localRequestOutputStream = new io/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;
      OutputStream localOutputStream = getConnection().getOutputStream();
      int i = this.bufferSize;
      localRequestOutputStream.<init>(localOutputStream, (String)localObject, i);
      this.output = localRequestOutputStream;
    }
  }
  
  public String parameter(String paramString1, String paramString2)
  {
    String str = header(paramString1);
    return getParam(str, paramString2);
  }
  
  public Map parameters(String paramString)
  {
    String str = header(paramString);
    return getParams(str);
  }
  
  public HttpRequest part(String paramString, File paramFile)
  {
    return part(paramString, null, paramFile);
  }
  
  public HttpRequest part(String paramString, InputStream paramInputStream)
  {
    return part(paramString, null, null, paramInputStream);
  }
  
  public HttpRequest part(String paramString, Number paramNumber)
  {
    return part(paramString, null, paramNumber);
  }
  
  public HttpRequest part(String paramString1, String paramString2)
  {
    return part(paramString1, null, paramString2);
  }
  
  public HttpRequest part(String paramString1, String paramString2, File paramFile)
  {
    return part(paramString1, paramString2, null, paramFile);
  }
  
  public HttpRequest part(String paramString1, String paramString2, Number paramNumber)
  {
    if (paramNumber != null) {}
    for (String str = paramNumber.toString();; str = null) {
      return part(paramString1, paramString2, str);
    }
  }
  
  public HttpRequest part(String paramString1, String paramString2, String paramString3)
  {
    return part(paramString1, paramString2, null, paramString3);
  }
  
  /* Error */
  public HttpRequest part(String paramString1, String paramString2, String paramString3, File paramFile)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: new 471	java/io/BufferedInputStream
    //   6: astore 6
    //   8: new 734	java/io/FileInputStream
    //   11: astore 7
    //   13: aload 7
    //   15: aload 4
    //   17: invokespecial 737	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   20: aload 6
    //   22: aload 7
    //   24: invokespecial 740	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   27: aload_0
    //   28: aload_1
    //   29: aload_2
    //   30: aload_3
    //   31: aload 6
    //   33: invokevirtual 720	io/fabric/sdk/android/services/network/HttpRequest:part	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)Lio/fabric/sdk/android/services/network/HttpRequest;
    //   36: astore 7
    //   38: aload 6
    //   40: ifnull +8 -> 48
    //   43: aload 6
    //   45: invokevirtual 743	java/io/InputStream:close	()V
    //   48: aload 7
    //   50: areturn
    //   51: astore 7
    //   53: aconst_null
    //   54: astore 6
    //   56: new 167	io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException
    //   59: astore 5
    //   61: aload 5
    //   63: aload 7
    //   65: invokespecial 170	io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException:<init>	(Ljava/io/IOException;)V
    //   68: aload 5
    //   70: athrow
    //   71: astore 7
    //   73: aload 6
    //   75: ifnull +8 -> 83
    //   78: aload 6
    //   80: invokevirtual 743	java/io/InputStream:close	()V
    //   83: aload 7
    //   85: athrow
    //   86: astore 6
    //   88: goto -40 -> 48
    //   91: astore 6
    //   93: goto -10 -> 83
    //   96: astore 7
    //   98: aconst_null
    //   99: astore 6
    //   101: goto -28 -> 73
    //   104: astore 7
    //   106: goto -50 -> 56
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	109	0	this	HttpRequest
    //   0	109	1	paramString1	String
    //   0	109	2	paramString2	String
    //   0	109	3	paramString3	String
    //   0	109	4	paramFile	File
    //   1	68	5	localHttpRequestException	HttpRequest.HttpRequestException
    //   6	73	6	localBufferedInputStream	BufferedInputStream
    //   86	1	6	localIOException1	IOException
    //   91	1	6	localIOException2	IOException
    //   99	1	6	localObject1	Object
    //   11	38	7	localObject2	Object
    //   51	13	7	localIOException3	IOException
    //   71	13	7	localObject3	Object
    //   96	1	7	localObject4	Object
    //   104	1	7	localIOException4	IOException
    // Exception table:
    //   from	to	target	type
    //   3	6	51	java/io/IOException
    //   8	11	51	java/io/IOException
    //   15	20	51	java/io/IOException
    //   22	27	51	java/io/IOException
    //   31	36	71	finally
    //   56	59	71	finally
    //   63	68	71	finally
    //   68	71	71	finally
    //   43	48	86	java/io/IOException
    //   78	83	91	java/io/IOException
    //   3	6	96	finally
    //   8	11	96	finally
    //   15	20	96	finally
    //   22	27	96	finally
    //   31	36	104	java/io/IOException
  }
  
  public HttpRequest part(String paramString1, String paramString2, String paramString3, InputStream paramInputStream)
  {
    try
    {
      startPart();
      writePartHeader(paramString1, paramString2, paramString3);
      HttpRequest.RequestOutputStream localRequestOutputStream = this.output;
      copy(paramInputStream, localRequestOutputStream);
      return this;
    }
    catch (IOException localIOException)
    {
      HttpRequest.HttpRequestException localHttpRequestException = new io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
      localHttpRequestException.<init>(localIOException);
      throw localHttpRequestException;
    }
  }
  
  public HttpRequest part(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    try
    {
      startPart();
      writePartHeader(paramString1, paramString2, paramString3);
      HttpRequest.RequestOutputStream localRequestOutputStream = this.output;
      localRequestOutputStream.write(paramString4);
      return this;
    }
    catch (IOException localIOException)
    {
      HttpRequest.HttpRequestException localHttpRequestException = new io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
      localHttpRequestException.<init>(localIOException);
      throw localHttpRequestException;
    }
  }
  
  public HttpRequest partHeader(String paramString1, String paramString2)
  {
    return send(paramString1).send(": ").send(paramString2).send("\r\n");
  }
  
  public HttpRequest proxyAuthorization(String paramString)
  {
    return header("Proxy-Authorization", paramString);
  }
  
  public HttpRequest proxyBasic(String paramString1, String paramString2)
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("Basic ");
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = HttpRequest.Base64.encode(paramString1 + ':' + paramString2);
    localObject1 = (String)localObject2;
    return proxyAuthorization((String)localObject1);
  }
  
  public HttpRequest readTimeout(int paramInt)
  {
    getConnection().setReadTimeout(paramInt);
    return this;
  }
  
  public InputStreamReader reader()
  {
    String str = charset();
    return reader(str);
  }
  
  public InputStreamReader reader(String paramString)
  {
    try
    {
      InputStreamReader localInputStreamReader = new java/io/InputStreamReader;
      localObject = stream();
      String str = getValidCharset(paramString);
      localInputStreamReader.<init>((InputStream)localObject, str);
      return localInputStreamReader;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      Object localObject = new io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
      ((HttpRequest.HttpRequestException)localObject).<init>(localUnsupportedEncodingException);
      throw ((Throwable)localObject);
    }
  }
  
  public HttpRequest receive(File paramFile)
  {
    try
    {
      BufferedOutputStream localBufferedOutputStream = new java/io/BufferedOutputStream;
      localObject = new java/io/FileOutputStream;
      ((FileOutputStream)localObject).<init>(paramFile);
      int i = this.bufferSize;
      localBufferedOutputStream.<init>((OutputStream)localObject, i);
      localObject = new io/fabric/sdk/android/services/network/HttpRequest$3;
      boolean bool = this.ignoreCloseExceptions;
      ((HttpRequest.3)localObject).<init>(this, localBufferedOutputStream, bool, localBufferedOutputStream);
      return (HttpRequest)((HttpRequest.3)localObject).call();
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      Object localObject = new io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
      ((HttpRequest.HttpRequestException)localObject).<init>(localFileNotFoundException);
      throw ((Throwable)localObject);
    }
  }
  
  public HttpRequest receive(OutputStream paramOutputStream)
  {
    try
    {
      BufferedInputStream localBufferedInputStream = buffer();
      return copy(localBufferedInputStream, paramOutputStream);
    }
    catch (IOException localIOException)
    {
      HttpRequest.HttpRequestException localHttpRequestException = new io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
      localHttpRequestException.<init>(localIOException);
      throw localHttpRequestException;
    }
  }
  
  public HttpRequest receive(PrintStream paramPrintStream)
  {
    return receive(paramPrintStream);
  }
  
  public HttpRequest receive(Writer paramWriter)
  {
    BufferedReader localBufferedReader = bufferedReader();
    HttpRequest.5 local5 = new io/fabric/sdk/android/services/network/HttpRequest$5;
    boolean bool = this.ignoreCloseExceptions;
    local5.<init>(this, localBufferedReader, bool, localBufferedReader, paramWriter);
    return (HttpRequest)local5.call();
  }
  
  public HttpRequest receive(Appendable paramAppendable)
  {
    BufferedReader localBufferedReader = bufferedReader();
    HttpRequest.4 local4 = new io/fabric/sdk/android/services/network/HttpRequest$4;
    boolean bool = this.ignoreCloseExceptions;
    local4.<init>(this, localBufferedReader, bool, localBufferedReader, paramAppendable);
    return (HttpRequest)local4.call();
  }
  
  public HttpRequest referer(String paramString)
  {
    return header("Referer", paramString);
  }
  
  public HttpRequest send(File paramFile)
  {
    try
    {
      BufferedInputStream localBufferedInputStream = new java/io/BufferedInputStream;
      localObject = new java/io/FileInputStream;
      ((FileInputStream)localObject).<init>(paramFile);
      localBufferedInputStream.<init>((InputStream)localObject);
      return send(localBufferedInputStream);
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      Object localObject = new io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
      ((HttpRequest.HttpRequestException)localObject).<init>(localFileNotFoundException);
      throw ((Throwable)localObject);
    }
  }
  
  public HttpRequest send(InputStream paramInputStream)
  {
    try
    {
      openOutput();
      HttpRequest.RequestOutputStream localRequestOutputStream = this.output;
      copy(paramInputStream, localRequestOutputStream);
      return this;
    }
    catch (IOException localIOException)
    {
      HttpRequest.HttpRequestException localHttpRequestException = new io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
      localHttpRequestException.<init>(localIOException);
      throw localHttpRequestException;
    }
  }
  
  public HttpRequest send(Reader paramReader)
  {
    try
    {
      openOutput();
      OutputStreamWriter localOutputStreamWriter = new java/io/OutputStreamWriter;
      localObject = this.output;
      Charset localCharset = HttpRequest.RequestOutputStream.access$200(this.output).charset();
      localOutputStreamWriter.<init>((OutputStream)localObject, localCharset);
      localObject = new io/fabric/sdk/android/services/network/HttpRequest$8;
      ((HttpRequest.8)localObject).<init>(this, localOutputStreamWriter, paramReader, localOutputStreamWriter);
      return (HttpRequest)((HttpRequest.8)localObject).call();
    }
    catch (IOException localIOException)
    {
      Object localObject = new io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
      ((HttpRequest.HttpRequestException)localObject).<init>(localIOException);
      throw ((Throwable)localObject);
    }
  }
  
  public HttpRequest send(CharSequence paramCharSequence)
  {
    try
    {
      openOutput();
      HttpRequest.RequestOutputStream localRequestOutputStream = this.output;
      localObject = paramCharSequence.toString();
      localRequestOutputStream.write((String)localObject);
      return this;
    }
    catch (IOException localIOException)
    {
      Object localObject = new io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
      ((HttpRequest.HttpRequestException)localObject).<init>(localIOException);
      throw ((Throwable)localObject);
    }
  }
  
  public HttpRequest send(byte[] paramArrayOfByte)
  {
    ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
    localByteArrayInputStream.<init>(paramArrayOfByte);
    return send(localByteArrayInputStream);
  }
  
  public String server()
  {
    return header("Server");
  }
  
  public boolean serverError()
  {
    int i = 500;
    int k = code();
    if (i == k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  protected HttpRequest startPart()
  {
    boolean bool = this.multipart;
    HttpRequest.RequestOutputStream localRequestOutputStream;
    String str;
    if (!bool)
    {
      bool = true;
      this.multipart = bool;
      contentType("multipart/form-data; boundary=00content0boundary00").openOutput();
      localRequestOutputStream = this.output;
      str = "--00content0boundary00\r\n";
      localRequestOutputStream.write(str);
    }
    for (;;)
    {
      return this;
      localRequestOutputStream = this.output;
      str = "\r\n--00content0boundary00\r\n";
      localRequestOutputStream.write(str);
    }
  }
  
  public InputStream stream()
  {
    int i = code();
    int j = 400;
    if (i < j) {}
    for (;;)
    {
      Object localObject4;
      try
      {
        Object localObject1 = getConnection();
        localObject1 = ((HttpURLConnection)localObject1).getInputStream();
        boolean bool = this.uncompress;
        if (bool)
        {
          localObject4 = "gzip";
          String str = contentEncoding();
          bool = ((String)localObject4).equals(str);
          if (bool) {
            break label112;
          }
        }
        return (InputStream)localObject1;
      }
      catch (IOException localIOException1)
      {
        localObject4 = new io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        ((HttpRequest.HttpRequestException)localObject4).<init>(localIOException1);
        throw ((Throwable)localObject4);
      }
      Object localObject2 = getConnection().getErrorStream();
      if (localObject2 != null) {
        continue;
      }
      try
      {
        localObject2 = getConnection();
        localObject2 = ((HttpURLConnection)localObject2).getInputStream();
      }
      catch (IOException localIOException2)
      {
        localObject4 = new io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        ((HttpRequest.HttpRequestException)localObject4).<init>(localIOException2);
        throw ((Throwable)localObject4);
      }
      try
      {
        label112:
        localObject4 = new java/util/zip/GZIPInputStream;
        ((GZIPInputStream)localObject4).<init>(localIOException2);
        Object localObject3 = localObject4;
      }
      catch (IOException localIOException3)
      {
        localObject4 = new io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        ((HttpRequest.HttpRequestException)localObject4).<init>(localIOException3);
        throw ((Throwable)localObject4);
      }
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = method();
    localStringBuilder = localStringBuilder.append((String)localObject).append(' ');
    localObject = url();
    return (String)localObject;
  }
  
  public HttpRequest trustAllCerts()
  {
    return this;
  }
  
  public HttpRequest trustAllHosts()
  {
    return this;
  }
  
  public HttpRequest uncompress(boolean paramBoolean)
  {
    this.uncompress = paramBoolean;
    return this;
  }
  
  public URL url()
  {
    return getConnection().getURL();
  }
  
  public HttpRequest useCaches(boolean paramBoolean)
  {
    getConnection().setUseCaches(paramBoolean);
    return this;
  }
  
  public HttpRequest useProxy(String paramString, int paramInt)
  {
    Object localObject = this.connection;
    if (localObject != null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("The connection has already been created. This method must be called before reading or writing to the request.");
      throw ((Throwable)localObject);
    }
    this.httpProxyHost = paramString;
    this.httpProxyPort = paramInt;
    return this;
  }
  
  public HttpRequest userAgent(String paramString)
  {
    return header("User-Agent", paramString);
  }
  
  protected HttpRequest writePartHeader(String paramString1, String paramString2)
  {
    return writePartHeader(paramString1, paramString2, null);
  }
  
  protected HttpRequest writePartHeader(String paramString1, String paramString2, String paramString3)
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = ((StringBuilder)localObject1).append("form-data; name=\"");
    ((StringBuilder)localObject2).append(paramString1);
    if (paramString2 != null)
    {
      localObject2 = ((StringBuilder)localObject1).append("\"; filename=\"");
      ((StringBuilder)localObject2).append(paramString2);
    }
    char c = '"';
    ((StringBuilder)localObject1).append(c);
    localObject2 = "Content-Disposition";
    localObject1 = ((StringBuilder)localObject1).toString();
    partHeader((String)localObject2, (String)localObject1);
    if (paramString3 != null)
    {
      localObject1 = "Content-Type";
      partHeader((String)localObject1, paramString3);
    }
    return send("\r\n");
  }
  
  public OutputStreamWriter writer()
  {
    try
    {
      openOutput();
      OutputStreamWriter localOutputStreamWriter = new java/io/OutputStreamWriter;
      localObject1 = this.output;
      Object localObject2 = this.output;
      localObject2 = HttpRequest.RequestOutputStream.access$200((HttpRequest.RequestOutputStream)localObject2);
      localObject2 = ((CharsetEncoder)localObject2).charset();
      localOutputStreamWriter.<init>((OutputStream)localObject1, (Charset)localObject2);
      return localOutputStreamWriter;
    }
    catch (IOException localIOException)
    {
      Object localObject1 = new io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
      ((HttpRequest.HttpRequestException)localObject1).<init>(localIOException);
      throw ((Throwable)localObject1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\network\HttpRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */