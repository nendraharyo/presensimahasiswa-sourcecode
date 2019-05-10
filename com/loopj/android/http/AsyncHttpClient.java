package com.loopj.android.http;

import android.content.Context;
import android.os.Looper;
import b.a.a.a.a.m;
import b.a.a.a.ac;
import b.a.a.a.b.o;
import b.a.a.a.e.c.d;
import b.a.a.a.u;
import b.a.a.a.v;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.URI;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AsyncHttpClient
{
  public static final int DEFAULT_MAX_CONNECTIONS = 10;
  public static final int DEFAULT_MAX_RETRIES = 5;
  public static final int DEFAULT_RETRY_SLEEP_TIME_MILLIS = 1500;
  public static final int DEFAULT_SOCKET_BUFFER_SIZE = 8192;
  public static final int DEFAULT_SOCKET_TIMEOUT = 10000;
  public static final String ENCODING_GZIP = "gzip";
  public static final String HEADER_ACCEPT_ENCODING = "Accept-Encoding";
  public static final String HEADER_CONTENT_DISPOSITION = "Content-Disposition";
  public static final String HEADER_CONTENT_ENCODING = "Content-Encoding";
  public static final String HEADER_CONTENT_RANGE = "Content-Range";
  public static final String HEADER_CONTENT_TYPE = "Content-Type";
  public static final String LOG_TAG = "AsyncHttpClient";
  public static LogInterface log;
  private final Map clientHeaderMap;
  private int connectTimeout;
  private final b.a.a.a.i.b.k httpClient;
  private final b.a.a.a.n.e httpContext;
  private boolean isUrlEncodingEnabled;
  private int maxConnections;
  private final Map requestMap;
  private int responseTimeout;
  private ExecutorService threadPool;
  
  static
  {
    LogHandler localLogHandler = new com/loopj/android/http/LogHandler;
    localLogHandler.<init>();
    log = localLogHandler;
  }
  
  public AsyncHttpClient()
  {
    this(false, 80, 443);
  }
  
  public AsyncHttpClient(int paramInt)
  {
    this(false, paramInt, 443);
  }
  
  public AsyncHttpClient(int paramInt1, int paramInt2)
  {
    this(false, paramInt1, paramInt2);
  }
  
  public AsyncHttpClient(b.a.a.a.e.c.i parami)
  {
    this.maxConnections = j;
    this.connectTimeout = i;
    this.responseTimeout = i;
    this.isUrlEncodingEnabled = bool;
    Object localObject1 = new b/a/a/a/l/b;
    ((b.a.a.a.l.b)localObject1).<init>();
    long l = this.connectTimeout;
    b.a.a.a.e.a.a.a((b.a.a.a.l.e)localObject1, l);
    Object localObject2 = new b/a/a/a/e/a/c;
    int k = this.maxConnections;
    ((b.a.a.a.e.a.c)localObject2).<init>(k);
    b.a.a.a.e.a.a.a((b.a.a.a.l.e)localObject1, (b.a.a.a.e.a.b)localObject2);
    b.a.a.a.e.a.a.a((b.a.a.a.l.e)localObject1, j);
    int m = this.responseTimeout;
    b.a.a.a.l.c.a((b.a.a.a.l.e)localObject1, m);
    m = this.connectTimeout;
    b.a.a.a.l.c.c((b.a.a.a.l.e)localObject1, m);
    b.a.a.a.l.c.a((b.a.a.a.l.e)localObject1, bool);
    m = 8192;
    b.a.a.a.l.c.b((b.a.a.a.l.e)localObject1, m);
    localObject2 = v.c;
    b.a.a.a.l.f.a((b.a.a.a.l.e)localObject1, (ac)localObject2);
    localObject2 = createConnectionManager(parami, (b.a.a.a.l.b)localObject1);
    if (localObject2 != null) {}
    for (;;)
    {
      Utils.asserts(bool, "Custom implementation of #createConnectionManager(SchemeRegistry, BasicHttpParams) returned null");
      Object localObject3 = getDefaultThreadPool();
      this.threadPool = ((ExecutorService)localObject3);
      localObject3 = new java/util/WeakHashMap;
      ((WeakHashMap)localObject3).<init>();
      localObject3 = Collections.synchronizedMap((Map)localObject3);
      this.requestMap = ((Map)localObject3);
      localObject3 = new java/util/HashMap;
      ((HashMap)localObject3).<init>();
      this.clientHeaderMap = ((Map)localObject3);
      localObject3 = new b/a/a/a/n/n;
      b.a.a.a.n.a locala = new b/a/a/a/n/a;
      locala.<init>();
      ((b.a.a.a.n.n)localObject3).<init>(locala);
      this.httpContext = ((b.a.a.a.n.e)localObject3);
      localObject3 = new b/a/a/a/i/b/k;
      ((b.a.a.a.i.b.k)localObject3).<init>((b.a.a.a.e.b)localObject2, (b.a.a.a.l.e)localObject1);
      this.httpClient = ((b.a.a.a.i.b.k)localObject3);
      localObject3 = this.httpClient;
      localObject1 = new com/loopj/android/http/AsyncHttpClient$1;
      ((AsyncHttpClient.1)localObject1).<init>(this);
      ((b.a.a.a.i.b.k)localObject3).a((b.a.a.a.r)localObject1);
      localObject3 = this.httpClient;
      localObject1 = new com/loopj/android/http/AsyncHttpClient$2;
      ((AsyncHttpClient.2)localObject1).<init>(this);
      ((b.a.a.a.i.b.k)localObject3).a((u)localObject1);
      localObject3 = this.httpClient;
      localObject1 = new com/loopj/android/http/AsyncHttpClient$3;
      ((AsyncHttpClient.3)localObject1).<init>(this);
      ((b.a.a.a.i.b.k)localObject3).a((b.a.a.a.r)localObject1, 0);
      localObject3 = this.httpClient;
      localRetryHandler = new com/loopj/android/http/RetryHandler;
      localRetryHandler.<init>(5, 1500);
      ((b.a.a.a.i.b.k)localObject3).a(localRetryHandler);
      return;
      bool = false;
      localObject3 = null;
    }
  }
  
  public AsyncHttpClient(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    this(locali);
  }
  
  private b.a.a.a.b.c.e addEntityToRequestBase(b.a.a.a.b.c.e parame, b.a.a.a.k paramk)
  {
    if (paramk != null) {
      parame.setEntity(paramk);
    }
    return parame;
  }
  
  public static void allowRetryExceptionClass(Class paramClass)
  {
    if (paramClass != null) {
      RetryHandler.addClassToWhitelist(paramClass);
    }
  }
  
  public static void blockRetryExceptionClass(Class paramClass)
  {
    if (paramClass != null) {
      RetryHandler.addClassToBlacklist(paramClass);
    }
  }
  
  private void cancelRequests(List paramList, boolean paramBoolean)
  {
    if (paramList != null)
    {
      Iterator localIterator = paramList.iterator();
      for (;;)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        RequestHandle localRequestHandle = (RequestHandle)localIterator.next();
        localRequestHandle.cancel(paramBoolean);
      }
    }
  }
  
  public static void endEntityViaReflection(b.a.a.a.k paramk)
  {
    boolean bool1 = paramk instanceof b.a.a.a.g.f;
    boolean bool2;
    Object localObject1;
    if (bool1)
    {
      bool2 = false;
      localLogInterface = null;
      localObject1 = b.a.a.a.g.f.class;
    }
    for (;;)
    {
      try
      {
        localObject3 = ((Class)localObject1).getDeclaredFields();
        int j = localObject3.length;
        bool1 = false;
        localObject1 = null;
        k = 0;
        str1 = null;
        if (k >= j) {
          continue;
        }
        localObject1 = localObject3[k];
        String str2 = ((Field)localObject1).getName();
        String str3 = "wrappedEntity";
        boolean bool3 = str2.equals(str3);
        if (!bool3) {
          continue;
        }
      }
      finally
      {
        int k;
        localLogInterface = log;
        String str1 = "AsyncHttpClient";
        Object localObject3 = "wrappedEntity consume";
        localLogInterface.e(str1, (String)localObject3, localThrowable);
        continue;
        int i = 0;
        Object localObject2 = null;
        continue;
      }
      if (localObject1 != null)
      {
        bool2 = true;
        ((Field)localObject1).setAccessible(bool2);
        localObject1 = ((Field)localObject1).get(paramk);
        localObject1 = (b.a.a.a.k)localObject1;
        if (localObject1 != null) {
          ((b.a.a.a.k)localObject1).consumeContent();
        }
      }
      return;
      i = k + 1;
      k = i;
    }
  }
  
  private static b.a.a.a.e.c.i getDefaultSchemeRegistry(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    int i = 1;
    Object localObject2;
    Object localObject3;
    if (paramBoolean)
    {
      localObject1 = log;
      localObject2 = "AsyncHttpClient";
      localObject3 = "Beware! Using the fix is insecure, as it doesn't verify SSL certificates.";
      ((LogInterface)localObject1).d((String)localObject2, (String)localObject3);
    }
    if (paramInt1 < i)
    {
      paramInt1 = 80;
      localObject1 = log;
      localObject2 = "AsyncHttpClient";
      localObject3 = "Invalid HTTP port number specified, defaulting to 80";
      ((LogInterface)localObject1).d((String)localObject2, (String)localObject3);
    }
    if (paramInt2 < i)
    {
      paramInt2 = 443;
      localObject1 = log;
      localObject2 = "AsyncHttpClient";
      localObject3 = "Invalid HTTPS port number specified, defaulting to 443";
      ((LogInterface)localObject1).d((String)localObject2, (String)localObject3);
    }
    if (paramBoolean) {}
    for (Object localObject1 = MySSLSocketFactory.getFixedSocketFactory();; localObject1 = b.a.a.a.e.d.i.getSocketFactory())
    {
      localObject2 = new b/a/a/a/e/c/i;
      ((b.a.a.a.e.c.i)localObject2).<init>();
      localObject3 = new b/a/a/a/e/c/e;
      d locald = d.a();
      ((b.a.a.a.e.c.e)localObject3).<init>("http", locald, paramInt1);
      ((b.a.a.a.e.c.i)localObject2).a((b.a.a.a.e.c.e)localObject3);
      localObject3 = new b/a/a/a/e/c/e;
      ((b.a.a.a.e.c.e)localObject3).<init>("https", (b.a.a.a.e.c.l)localObject1, paramInt2);
      ((b.a.a.a.e.c.i)localObject2).a((b.a.a.a.e.c.e)localObject3);
      return (b.a.a.a.e.c.i)localObject2;
    }
  }
  
  public static String getUrlWithQueryString(boolean paramBoolean, String paramString, RequestParams paramRequestParams)
  {
    boolean bool1;
    Object localObject1;
    if (paramString == null)
    {
      bool1 = false;
      localObject1 = null;
      return (String)localObject1;
    }
    if (paramBoolean) {
      localObject1 = "UTF-8";
    }
    for (;;)
    {
      try
      {
        localObject1 = URLDecoder.decode(paramString, (String)localObject1);
        Object localObject2 = new java/net/URL;
        ((URL)localObject2).<init>((String)localObject1);
        localObject1 = new java/net/URI;
        localObject3 = ((URL)localObject2).getProtocol();
        localObject4 = ((URL)localObject2).getUserInfo();
        str2 = ((URL)localObject2).getHost();
        int i = ((URL)localObject2).getPort();
        String str3 = ((URL)localObject2).getPath();
        String str4 = ((URL)localObject2).getQuery();
        localObject2 = ((URL)localObject2).getRef();
        ((URI)localObject1).<init>((String)localObject3, (String)localObject4, str2, i, str3, str4, (String)localObject2);
        paramString = ((URI)localObject1).toASCIIString();
        localObject1 = paramString;
        if (paramRequestParams == null) {
          break;
        }
        localObject3 = paramRequestParams.getParamString().trim();
        localObject4 = "";
        boolean bool2 = ((String)localObject3).equals(localObject4);
        if (bool2) {
          break;
        }
        localObject4 = "?";
        bool2 = ((String)localObject3).equals(localObject4);
        if (bool2) {
          break;
        }
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject4 = ((StringBuilder)localObject4).append((String)localObject1);
        str2 = "?";
        bool1 = ((String)localObject1).contains(str2);
        if (!bool1) {
          break label292;
        }
        localObject1 = "&";
        localObject1 = (String)localObject1;
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject1 = (String)localObject1 + (String)localObject3;
      }
      catch (Exception localException)
      {
        Object localObject3 = log;
        Object localObject4 = "AsyncHttpClient";
        String str2 = "getUrlWithQueryString encoding URL";
        ((LogInterface)localObject3).e((String)localObject4, str2, localException);
      }
      String str1 = paramString;
      continue;
      label292:
      str1 = "?";
    }
  }
  
  /* Error */
  public static boolean isInputStreamGZIPCompressed(java.io.PushbackInputStream paramPushbackInputStream)
  {
    // Byte code:
    //   0: iconst_2
    //   1: istore_1
    //   2: iconst_1
    //   3: istore_2
    //   4: iconst_0
    //   5: istore_3
    //   6: aload_0
    //   7: ifnonnull +5 -> 12
    //   10: iload_3
    //   11: ireturn
    //   12: iload_1
    //   13: newarray <illegal type>
    //   15: astore 4
    //   17: iconst_0
    //   18: istore 5
    //   20: iload 5
    //   22: iload_1
    //   23: if_icmpge +48 -> 71
    //   26: iconst_2
    //   27: iload 5
    //   29: isub
    //   30: istore 6
    //   32: aload_0
    //   33: aload 4
    //   35: iload 5
    //   37: iload 6
    //   39: invokevirtual 415	java/io/PushbackInputStream:read	([BII)I
    //   42: istore 6
    //   44: iload 6
    //   46: ifge +15 -> 61
    //   49: aload_0
    //   50: aload 4
    //   52: iconst_0
    //   53: iload 5
    //   55: invokevirtual 419	java/io/PushbackInputStream:unread	([BII)V
    //   58: goto -48 -> 10
    //   61: iload 5
    //   63: iload 6
    //   65: iadd
    //   66: istore 5
    //   68: goto -48 -> 20
    //   71: aload_0
    //   72: aload 4
    //   74: iconst_0
    //   75: iload 5
    //   77: invokevirtual 419	java/io/PushbackInputStream:unread	([BII)V
    //   80: aload 4
    //   82: iconst_0
    //   83: baload
    //   84: sipush 255
    //   87: iand
    //   88: istore 5
    //   90: aload 4
    //   92: iload_2
    //   93: baload
    //   94: bipush 8
    //   96: ishl
    //   97: istore 7
    //   99: ldc_w 420
    //   102: istore 6
    //   104: iload 7
    //   106: iload 6
    //   108: iand
    //   109: istore 7
    //   111: iload 5
    //   113: iload 7
    //   115: ior
    //   116: istore 5
    //   118: ldc_w 422
    //   121: istore 7
    //   123: iload 7
    //   125: iload 5
    //   127: if_icmpne +22 -> 149
    //   130: iload_2
    //   131: istore_3
    //   132: goto -122 -> 10
    //   135: astore 8
    //   137: aload_0
    //   138: aload 4
    //   140: iconst_0
    //   141: iload 5
    //   143: invokevirtual 419	java/io/PushbackInputStream:unread	([BII)V
    //   146: aload 8
    //   148: athrow
    //   149: iconst_0
    //   150: istore_2
    //   151: aconst_null
    //   152: astore 8
    //   154: goto -24 -> 130
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	157	0	paramPushbackInputStream	java.io.PushbackInputStream
    //   1	23	1	i	int
    //   3	148	2	bool1	boolean
    //   5	127	3	bool2	boolean
    //   15	124	4	arrayOfByte	byte[]
    //   18	124	5	j	int
    //   30	79	6	k	int
    //   97	31	7	m	int
    //   135	12	8	localObject1	Object
    //   152	1	8	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   37	42	135	finally
  }
  
  private b.a.a.a.k paramsToEntity(RequestParams paramRequestParams, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    b.a.a.a.k localk = null;
    if (paramRequestParams != null) {}
    try
    {
      localk = paramRequestParams.getEntity(paramResponseHandlerInterface);
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        if (paramResponseHandlerInterface != null) {
          paramResponseHandlerInterface.sendFailureMessage(0, null, null, localIOException);
        } else {
          localIOException.printStackTrace();
        }
      }
    }
    return localk;
  }
  
  public static void silentCloseInputStream(InputStream paramInputStream)
  {
    if (paramInputStream != null) {}
    try
    {
      paramInputStream.close();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        LogInterface localLogInterface = log;
        String str1 = "AsyncHttpClient";
        String str2 = "Cannot close input stream";
        localLogInterface.w(str1, str2, localIOException);
      }
    }
  }
  
  public static void silentCloseOutputStream(OutputStream paramOutputStream)
  {
    if (paramOutputStream != null) {}
    try
    {
      paramOutputStream.close();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        LogInterface localLogInterface = log;
        String str1 = "AsyncHttpClient";
        String str2 = "Cannot close output stream";
        localLogInterface.w(str1, str2, localIOException);
      }
    }
  }
  
  public void addHeader(String paramString1, String paramString2)
  {
    this.clientHeaderMap.put(paramString1, paramString2);
  }
  
  public void cancelAllRequests(boolean paramBoolean)
  {
    Object localObject = this.requestMap.values();
    Iterator localIterator1 = ((Collection)localObject).iterator();
    boolean bool;
    do
    {
      bool = localIterator1.hasNext();
      if (!bool) {
        break;
      }
      localObject = (List)localIterator1.next();
    } while (localObject == null);
    Iterator localIterator2 = ((List)localObject).iterator();
    for (;;)
    {
      bool = localIterator2.hasNext();
      if (!bool) {
        break;
      }
      localObject = (RequestHandle)localIterator2.next();
      ((RequestHandle)localObject).cancel(paramBoolean);
    }
    this.requestMap.clear();
  }
  
  public void cancelRequests(Context paramContext, boolean paramBoolean)
  {
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (paramContext == null)
    {
      localObject1 = log;
      localObject2 = "AsyncHttpClient";
      localObject3 = "Passed null Context to cancelRequests";
      ((LogInterface)localObject1).e((String)localObject2, (String)localObject3);
    }
    for (;;)
    {
      return;
      localObject1 = (List)this.requestMap.get(paramContext);
      this.requestMap.remove(paramContext);
      localObject2 = Looper.myLooper();
      localObject3 = Looper.getMainLooper();
      if (localObject2 == localObject3)
      {
        localObject2 = new com/loopj/android/http/AsyncHttpClient$4;
        ((AsyncHttpClient.4)localObject2).<init>(this, (List)localObject1, paramBoolean);
        localObject1 = this.threadPool;
        ((ExecutorService)localObject1).submit((Runnable)localObject2);
      }
      else
      {
        cancelRequests((List)localObject1, paramBoolean);
      }
    }
  }
  
  public void cancelRequestsByTAG(Object paramObject, boolean paramBoolean)
  {
    if (paramObject == null)
    {
      localObject1 = log;
      localObject2 = "AsyncHttpClient";
      localObject3 = "cancelRequestsByTAG, passed TAG is null, cannot proceed";
      ((LogInterface)localObject1).d((String)localObject2, (String)localObject3);
      return;
    }
    Object localObject1 = this.requestMap.values();
    Object localObject2 = ((Collection)localObject1).iterator();
    boolean bool1;
    do
    {
      bool1 = ((Iterator)localObject2).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (List)((Iterator)localObject2).next();
    } while (localObject1 == null);
    Object localObject3 = ((List)localObject1).iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject3).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (RequestHandle)((Iterator)localObject3).next();
      Object localObject4 = ((RequestHandle)localObject1).getTag();
      boolean bool2 = paramObject.equals(localObject4);
      if (bool2) {
        ((RequestHandle)localObject1).cancel(paramBoolean);
      }
    }
  }
  
  public void clearCredentialsProvider()
  {
    this.httpClient.E().a();
  }
  
  protected b.a.a.a.e.b createConnectionManager(b.a.a.a.e.c.i parami, b.a.a.a.l.b paramb)
  {
    b.a.a.a.i.c.a.g localg = new b/a/a/a/i/c/a/g;
    localg.<init>(paramb, parami);
    return localg;
  }
  
  public RequestHandle delete(Context paramContext, String paramString1, b.a.a.a.k paramk, String paramString2, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    b.a.a.a.i.b.k localk = this.httpClient;
    b.a.a.a.n.e locale = this.httpContext;
    Object localObject1 = new com/loopj/android/http/HttpDelete;
    Object localObject2 = URI.create(paramString1).normalize();
    ((HttpDelete)localObject1).<init>((URI)localObject2);
    localObject2 = addEntityToRequestBase((b.a.a.a.b.c.e)localObject1, paramk);
    localObject1 = this;
    return sendRequest(localk, locale, (b.a.a.a.b.c.l)localObject2, paramString2, paramResponseHandlerInterface, paramContext);
  }
  
  public RequestHandle delete(Context paramContext, String paramString, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    HttpDelete localHttpDelete = new com/loopj/android/http/HttpDelete;
    Object localObject = getURI(paramString);
    localHttpDelete.<init>((URI)localObject);
    b.a.a.a.i.b.k localk = this.httpClient;
    b.a.a.a.n.e locale = this.httpContext;
    localObject = this;
    return sendRequest(localk, locale, localHttpDelete, null, paramResponseHandlerInterface, paramContext);
  }
  
  public RequestHandle delete(Context paramContext, String paramString, b.a.a.a.e[] paramArrayOfe, RequestParams paramRequestParams, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    HttpDelete localHttpDelete = new com/loopj/android/http/HttpDelete;
    boolean bool = this.isUrlEncodingEnabled;
    Object localObject = getUrlWithQueryString(bool, paramString, paramRequestParams);
    localHttpDelete.<init>((String)localObject);
    if (paramArrayOfe != null) {
      localHttpDelete.setHeaders(paramArrayOfe);
    }
    b.a.a.a.i.b.k localk = this.httpClient;
    b.a.a.a.n.e locale = this.httpContext;
    localObject = this;
    return sendRequest(localk, locale, localHttpDelete, null, paramResponseHandlerInterface, paramContext);
  }
  
  public RequestHandle delete(Context paramContext, String paramString, b.a.a.a.e[] paramArrayOfe, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    HttpDelete localHttpDelete = new com/loopj/android/http/HttpDelete;
    Object localObject = getURI(paramString);
    localHttpDelete.<init>((URI)localObject);
    if (paramArrayOfe != null) {
      localHttpDelete.setHeaders(paramArrayOfe);
    }
    b.a.a.a.i.b.k localk = this.httpClient;
    b.a.a.a.n.e locale = this.httpContext;
    localObject = this;
    return sendRequest(localk, locale, localHttpDelete, null, paramResponseHandlerInterface, paramContext);
  }
  
  public RequestHandle delete(String paramString, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    return delete(null, paramString, paramResponseHandlerInterface);
  }
  
  public void delete(String paramString, RequestParams paramRequestParams, AsyncHttpResponseHandler paramAsyncHttpResponseHandler)
  {
    HttpDelete localHttpDelete = new com/loopj/android/http/HttpDelete;
    Object localObject = getUrlWithQueryString(this.isUrlEncodingEnabled, paramString, paramRequestParams);
    localHttpDelete.<init>((String)localObject);
    b.a.a.a.i.b.k localk = this.httpClient;
    b.a.a.a.n.e locale = this.httpContext;
    localObject = this;
    sendRequest(localk, locale, localHttpDelete, null, paramAsyncHttpResponseHandler, null);
  }
  
  public RequestHandle get(Context paramContext, String paramString1, b.a.a.a.k paramk, String paramString2, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    b.a.a.a.i.b.k localk = this.httpClient;
    b.a.a.a.n.e locale = this.httpContext;
    Object localObject1 = new com/loopj/android/http/HttpGet;
    Object localObject2 = URI.create(paramString1).normalize();
    ((HttpGet)localObject1).<init>((URI)localObject2);
    localObject2 = addEntityToRequestBase((b.a.a.a.b.c.e)localObject1, paramk);
    localObject1 = this;
    return sendRequest(localk, locale, (b.a.a.a.b.c.l)localObject2, paramString2, paramResponseHandlerInterface, paramContext);
  }
  
  public RequestHandle get(Context paramContext, String paramString, RequestParams paramRequestParams, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    b.a.a.a.i.b.k localk = this.httpClient;
    b.a.a.a.n.e locale = this.httpContext;
    HttpGet localHttpGet = new com/loopj/android/http/HttpGet;
    Object localObject = getUrlWithQueryString(this.isUrlEncodingEnabled, paramString, paramRequestParams);
    localHttpGet.<init>((String)localObject);
    localObject = this;
    return sendRequest(localk, locale, localHttpGet, null, paramResponseHandlerInterface, paramContext);
  }
  
  public RequestHandle get(Context paramContext, String paramString, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    return get(paramContext, paramString, null, paramResponseHandlerInterface);
  }
  
  public RequestHandle get(Context paramContext, String paramString, b.a.a.a.e[] paramArrayOfe, RequestParams paramRequestParams, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    HttpGet localHttpGet = new com/loopj/android/http/HttpGet;
    boolean bool = this.isUrlEncodingEnabled;
    Object localObject = getUrlWithQueryString(bool, paramString, paramRequestParams);
    localHttpGet.<init>((String)localObject);
    if (paramArrayOfe != null) {
      localHttpGet.setHeaders(paramArrayOfe);
    }
    b.a.a.a.i.b.k localk = this.httpClient;
    b.a.a.a.n.e locale = this.httpContext;
    localObject = this;
    return sendRequest(localk, locale, localHttpGet, null, paramResponseHandlerInterface, paramContext);
  }
  
  public RequestHandle get(String paramString, RequestParams paramRequestParams, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    return get(null, paramString, paramRequestParams, paramResponseHandlerInterface);
  }
  
  public RequestHandle get(String paramString, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    return get(null, paramString, null, paramResponseHandlerInterface);
  }
  
  public int getConnectTimeout()
  {
    return this.connectTimeout;
  }
  
  protected ExecutorService getDefaultThreadPool()
  {
    return Executors.newCachedThreadPool();
  }
  
  public b.a.a.a.b.j getHttpClient()
  {
    return this.httpClient;
  }
  
  public b.a.a.a.n.e getHttpContext()
  {
    return this.httpContext;
  }
  
  public LogInterface getLogInterface()
  {
    return log;
  }
  
  public int getLoggingLevel()
  {
    return log.getLoggingLevel();
  }
  
  public int getMaxConnections()
  {
    return this.maxConnections;
  }
  
  public int getResponseTimeout()
  {
    return this.responseTimeout;
  }
  
  public ExecutorService getThreadPool()
  {
    return this.threadPool;
  }
  
  protected URI getURI(String paramString)
  {
    return URI.create(paramString).normalize();
  }
  
  public RequestHandle head(Context paramContext, String paramString, RequestParams paramRequestParams, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    b.a.a.a.i.b.k localk = this.httpClient;
    b.a.a.a.n.e locale = this.httpContext;
    b.a.a.a.b.c.g localg = new b/a/a/a/b/c/g;
    Object localObject = getUrlWithQueryString(this.isUrlEncodingEnabled, paramString, paramRequestParams);
    localg.<init>((String)localObject);
    localObject = this;
    return sendRequest(localk, locale, localg, null, paramResponseHandlerInterface, paramContext);
  }
  
  public RequestHandle head(Context paramContext, String paramString, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    return head(paramContext, paramString, null, paramResponseHandlerInterface);
  }
  
  public RequestHandle head(Context paramContext, String paramString, b.a.a.a.e[] paramArrayOfe, RequestParams paramRequestParams, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    b.a.a.a.b.c.g localg = new b/a/a/a/b/c/g;
    boolean bool = this.isUrlEncodingEnabled;
    Object localObject = getUrlWithQueryString(bool, paramString, paramRequestParams);
    localg.<init>((String)localObject);
    if (paramArrayOfe != null) {
      localg.setHeaders(paramArrayOfe);
    }
    b.a.a.a.i.b.k localk = this.httpClient;
    b.a.a.a.n.e locale = this.httpContext;
    localObject = this;
    return sendRequest(localk, locale, localg, null, paramResponseHandlerInterface, paramContext);
  }
  
  public RequestHandle head(String paramString, RequestParams paramRequestParams, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    return head(null, paramString, paramRequestParams, paramResponseHandlerInterface);
  }
  
  public RequestHandle head(String paramString, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    return head(null, paramString, null, paramResponseHandlerInterface);
  }
  
  public boolean isLoggingEnabled()
  {
    return log.isLoggingEnabled();
  }
  
  public boolean isUrlEncodingEnabled()
  {
    return this.isUrlEncodingEnabled;
  }
  
  protected AsyncHttpRequest newAsyncHttpRequest(b.a.a.a.i.b.k paramk, b.a.a.a.n.e parame, b.a.a.a.b.c.l paraml, String paramString, ResponseHandlerInterface paramResponseHandlerInterface, Context paramContext)
  {
    AsyncHttpRequest localAsyncHttpRequest = new com/loopj/android/http/AsyncHttpRequest;
    localAsyncHttpRequest.<init>(paramk, parame, paraml, paramResponseHandlerInterface);
    return localAsyncHttpRequest;
  }
  
  public RequestHandle patch(Context paramContext, String paramString1, b.a.a.a.k paramk, String paramString2, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    b.a.a.a.i.b.k localk = this.httpClient;
    b.a.a.a.n.e locale = this.httpContext;
    Object localObject1 = new b/a/a/a/b/c/h;
    Object localObject2 = getURI(paramString1);
    ((b.a.a.a.b.c.h)localObject1).<init>((URI)localObject2);
    localObject2 = addEntityToRequestBase((b.a.a.a.b.c.e)localObject1, paramk);
    localObject1 = this;
    return sendRequest(localk, locale, (b.a.a.a.b.c.l)localObject2, paramString2, paramResponseHandlerInterface, paramContext);
  }
  
  public RequestHandle patch(Context paramContext, String paramString, RequestParams paramRequestParams, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    b.a.a.a.k localk = paramsToEntity(paramRequestParams, paramResponseHandlerInterface);
    return patch(paramContext, paramString, localk, null, paramResponseHandlerInterface);
  }
  
  public RequestHandle patch(Context paramContext, String paramString1, b.a.a.a.e[] paramArrayOfe, b.a.a.a.k paramk, String paramString2, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    Object localObject1 = new b/a/a/a/b/c/h;
    Object localObject2 = getURI(paramString1);
    ((b.a.a.a.b.c.h)localObject1).<init>((URI)localObject2);
    b.a.a.a.b.c.e locale = addEntityToRequestBase((b.a.a.a.b.c.e)localObject1, paramk);
    if (paramArrayOfe != null) {
      locale.setHeaders(paramArrayOfe);
    }
    localObject2 = this.httpClient;
    b.a.a.a.n.e locale1 = this.httpContext;
    localObject1 = this;
    return sendRequest((b.a.a.a.i.b.k)localObject2, locale1, locale, paramString2, paramResponseHandlerInterface, paramContext);
  }
  
  public RequestHandle patch(String paramString, RequestParams paramRequestParams, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    return patch(null, paramString, paramRequestParams, paramResponseHandlerInterface);
  }
  
  public RequestHandle patch(String paramString, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    return patch(null, paramString, null, paramResponseHandlerInterface);
  }
  
  public RequestHandle post(Context paramContext, String paramString1, b.a.a.a.k paramk, String paramString2, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    b.a.a.a.i.b.k localk = this.httpClient;
    b.a.a.a.n.e locale = this.httpContext;
    Object localObject1 = new b/a/a/a/b/c/i;
    Object localObject2 = getURI(paramString1);
    ((b.a.a.a.b.c.i)localObject1).<init>((URI)localObject2);
    localObject2 = addEntityToRequestBase((b.a.a.a.b.c.e)localObject1, paramk);
    localObject1 = this;
    return sendRequest(localk, locale, (b.a.a.a.b.c.l)localObject2, paramString2, paramResponseHandlerInterface, paramContext);
  }
  
  public RequestHandle post(Context paramContext, String paramString, RequestParams paramRequestParams, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    b.a.a.a.k localk = paramsToEntity(paramRequestParams, paramResponseHandlerInterface);
    return post(paramContext, paramString, localk, null, paramResponseHandlerInterface);
  }
  
  public RequestHandle post(Context paramContext, String paramString1, b.a.a.a.e[] paramArrayOfe, b.a.a.a.k paramk, String paramString2, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    Object localObject1 = new b/a/a/a/b/c/i;
    Object localObject2 = getURI(paramString1);
    ((b.a.a.a.b.c.i)localObject1).<init>((URI)localObject2);
    b.a.a.a.b.c.e locale = addEntityToRequestBase((b.a.a.a.b.c.e)localObject1, paramk);
    if (paramArrayOfe != null) {
      locale.setHeaders(paramArrayOfe);
    }
    localObject2 = this.httpClient;
    b.a.a.a.n.e locale1 = this.httpContext;
    localObject1 = this;
    return sendRequest((b.a.a.a.i.b.k)localObject2, locale1, locale, paramString2, paramResponseHandlerInterface, paramContext);
  }
  
  public RequestHandle post(Context paramContext, String paramString1, b.a.a.a.e[] paramArrayOfe, RequestParams paramRequestParams, String paramString2, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    b.a.a.a.b.c.i locali = new b/a/a/a/b/c/i;
    Object localObject = getURI(paramString1);
    locali.<init>((URI)localObject);
    if (paramRequestParams != null)
    {
      localObject = paramsToEntity(paramRequestParams, paramResponseHandlerInterface);
      locali.setEntity((b.a.a.a.k)localObject);
    }
    if (paramArrayOfe != null) {
      locali.setHeaders(paramArrayOfe);
    }
    b.a.a.a.i.b.k localk = this.httpClient;
    b.a.a.a.n.e locale = this.httpContext;
    localObject = this;
    return sendRequest(localk, locale, locali, paramString2, paramResponseHandlerInterface, paramContext);
  }
  
  public RequestHandle post(String paramString, RequestParams paramRequestParams, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    return post(null, paramString, paramRequestParams, paramResponseHandlerInterface);
  }
  
  public RequestHandle post(String paramString, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    return post(null, paramString, null, paramResponseHandlerInterface);
  }
  
  public RequestHandle put(Context paramContext, String paramString1, b.a.a.a.k paramk, String paramString2, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    b.a.a.a.i.b.k localk = this.httpClient;
    b.a.a.a.n.e locale = this.httpContext;
    Object localObject1 = new b/a/a/a/b/c/j;
    Object localObject2 = getURI(paramString1);
    ((b.a.a.a.b.c.j)localObject1).<init>((URI)localObject2);
    localObject2 = addEntityToRequestBase((b.a.a.a.b.c.e)localObject1, paramk);
    localObject1 = this;
    return sendRequest(localk, locale, (b.a.a.a.b.c.l)localObject2, paramString2, paramResponseHandlerInterface, paramContext);
  }
  
  public RequestHandle put(Context paramContext, String paramString, RequestParams paramRequestParams, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    b.a.a.a.k localk = paramsToEntity(paramRequestParams, paramResponseHandlerInterface);
    return put(paramContext, paramString, localk, null, paramResponseHandlerInterface);
  }
  
  public RequestHandle put(Context paramContext, String paramString1, b.a.a.a.e[] paramArrayOfe, b.a.a.a.k paramk, String paramString2, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    Object localObject1 = new b/a/a/a/b/c/j;
    Object localObject2 = getURI(paramString1);
    ((b.a.a.a.b.c.j)localObject1).<init>((URI)localObject2);
    b.a.a.a.b.c.e locale = addEntityToRequestBase((b.a.a.a.b.c.e)localObject1, paramk);
    if (paramArrayOfe != null) {
      locale.setHeaders(paramArrayOfe);
    }
    localObject2 = this.httpClient;
    b.a.a.a.n.e locale1 = this.httpContext;
    localObject1 = this;
    return sendRequest((b.a.a.a.i.b.k)localObject2, locale1, locale, paramString2, paramResponseHandlerInterface, paramContext);
  }
  
  public RequestHandle put(String paramString, RequestParams paramRequestParams, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    return put(null, paramString, paramRequestParams, paramResponseHandlerInterface);
  }
  
  public RequestHandle put(String paramString, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    return put(null, paramString, null, paramResponseHandlerInterface);
  }
  
  public void removeAllHeaders()
  {
    this.clientHeaderMap.clear();
  }
  
  public void removeHeader(String paramString)
  {
    this.clientHeaderMap.remove(paramString);
  }
  
  protected RequestHandle sendRequest(b.a.a.a.i.b.k paramk, b.a.a.a.n.e parame, b.a.a.a.b.c.l paraml, String paramString, ResponseHandlerInterface paramResponseHandlerInterface, Context paramContext)
  {
    Object localObject1;
    if (paraml == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("HttpUriRequest must not be null");
      throw ((Throwable)localObject1);
    }
    if (paramResponseHandlerInterface == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("ResponseHandler must not be null");
      throw ((Throwable)localObject1);
    }
    boolean bool = paramResponseHandlerInterface.getUseSynchronousMode();
    if (bool)
    {
      bool = paramResponseHandlerInterface.getUsePoolThread();
      if (!bool)
      {
        localObject1 = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject1).<init>("Synchronous ResponseHandler used in AsyncHttpClient. You should create your response handler in a looper thread or use SyncHttpClient instead.");
        throw ((Throwable)localObject1);
      }
    }
    Object localObject3;
    if (paramString != null)
    {
      bool = paraml instanceof b.a.a.a.b.c.e;
      if (!bool) {
        break label395;
      }
      localObject1 = paraml;
      localObject1 = ((b.a.a.a.b.c.e)paraml).getEntity();
      if (localObject1 == null) {
        break label395;
      }
      localObject1 = "Content-Type";
      bool = ((b.a.a.a.b.c.l)paraml).containsHeader((String)localObject1);
      if (!bool) {
        break label395;
      }
      localObject1 = log;
      localObject3 = "AsyncHttpClient";
      ??? = "Passed contentType will be ignored because HttpEntity sets content type";
      ((LogInterface)localObject1).w((String)localObject3, (String)???);
    }
    for (;;)
    {
      localObject1 = ((b.a.a.a.b.c.l)paraml).getAllHeaders();
      paramResponseHandlerInterface.setRequestHeaders((b.a.a.a.e[])localObject1);
      localObject1 = ((b.a.a.a.b.c.l)paraml).getURI();
      paramResponseHandlerInterface.setRequestURI((URI)localObject1);
      localObject1 = newAsyncHttpRequest(paramk, parame, (b.a.a.a.b.c.l)paraml, paramString, paramResponseHandlerInterface, paramContext);
      this.threadPool.submit((Runnable)localObject1);
      localObject3 = new com/loopj/android/http/RequestHandle;
      ((RequestHandle)localObject3).<init>((AsyncHttpRequest)localObject1);
      if (paramContext != null) {
        synchronized (this.requestMap)
        {
          localObject1 = this.requestMap;
          localObject1 = ((Map)localObject1).get(paramContext);
          localObject1 = (List)localObject1;
          if (localObject1 == null)
          {
            localObject1 = new java/util/LinkedList;
            ((LinkedList)localObject1).<init>();
            localObject1 = Collections.synchronizedList((List)localObject1);
            Map localMap = this.requestMap;
            localMap.put(paramContext, localObject1);
          }
          ((List)localObject1).add(localObject3);
          ??? = ((List)localObject1).iterator();
          for (;;)
          {
            bool = ((Iterator)???).hasNext();
            if (!bool) {
              break;
            }
            localObject1 = (RequestHandle)((Iterator)???).next();
            bool = ((RequestHandle)localObject1).shouldBeGarbageCollected();
            if (bool) {
              ((Iterator)???).remove();
            }
          }
          label395:
          localObject1 = "Content-Type";
          ((b.a.a.a.b.c.l)paraml).setHeader((String)localObject1, paramString);
        }
      }
    }
    return (RequestHandle)localObject3;
  }
  
  public void setAuthenticationPreemptive(boolean paramBoolean)
  {
    b.a.a.a.i.b.k localk;
    Object localObject;
    if (paramBoolean)
    {
      localk = this.httpClient;
      localObject = new com/loopj/android/http/PreemptiveAuthorizationHttpRequestInterceptor;
      ((PreemptiveAuthorizationHttpRequestInterceptor)localObject).<init>();
      localk.a((b.a.a.a.r)localObject, 0);
    }
    for (;;)
    {
      return;
      localk = this.httpClient;
      localObject = PreemptiveAuthorizationHttpRequestInterceptor.class;
      localk.a((Class)localObject);
    }
  }
  
  public void setBasicAuth(String paramString1, String paramString2)
  {
    setBasicAuth(paramString1, paramString2, false);
  }
  
  public void setBasicAuth(String paramString1, String paramString2, b.a.a.a.a.g paramg)
  {
    setBasicAuth(paramString1, paramString2, paramg, false);
  }
  
  public void setBasicAuth(String paramString1, String paramString2, b.a.a.a.a.g paramg, boolean paramBoolean)
  {
    b.a.a.a.a.r localr = new b/a/a/a/a/r;
    localr.<init>(paramString1, paramString2);
    setCredentials(paramg, localr);
    setAuthenticationPreemptive(paramBoolean);
  }
  
  public void setBasicAuth(String paramString1, String paramString2, boolean paramBoolean)
  {
    setBasicAuth(paramString1, paramString2, null, paramBoolean);
  }
  
  public void setConnectTimeout(int paramInt)
  {
    int i = 1000;
    if (paramInt < i) {
      paramInt = 10000;
    }
    this.connectTimeout = paramInt;
    b.a.a.a.l.e locale = this.httpClient.q();
    long l = this.connectTimeout;
    b.a.a.a.e.a.a.a(locale, l);
    int j = this.connectTimeout;
    b.a.a.a.l.c.c(locale, j);
  }
  
  public void setCookieStore(b.a.a.a.b.h paramh)
  {
    this.httpContext.a("http.cookie-store", paramh);
  }
  
  public void setCredentials(b.a.a.a.a.g paramg, m paramm)
  {
    Object localObject;
    if (paramm == null)
    {
      localObject = log;
      String str1 = "AsyncHttpClient";
      String str2 = "Provided credentials are null, not setting";
      ((LogInterface)localObject).d(str1, str2);
    }
    for (;;)
    {
      return;
      localObject = this.httpClient.E();
      if (paramg == null) {
        paramg = b.a.a.a.a.g.d;
      }
      ((b.a.a.a.b.i)localObject).a(paramg, paramm);
    }
  }
  
  public void setEnableRedirects(boolean paramBoolean)
  {
    setEnableRedirects(paramBoolean, paramBoolean, paramBoolean);
  }
  
  public void setEnableRedirects(boolean paramBoolean1, boolean paramBoolean2)
  {
    setEnableRedirects(paramBoolean1, paramBoolean2, true);
  }
  
  public void setEnableRedirects(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    b.a.a.a.i.b.k localk = this.httpClient;
    Object localObject = localk.q();
    String str = "http.protocol.reject-relative-redirect";
    boolean bool;
    if (!paramBoolean2) {
      bool = true;
    }
    for (;;)
    {
      ((b.a.a.a.l.e)localObject).b(str, bool);
      this.httpClient.q().b("http.protocol.allow-circular-redirects", paramBoolean3);
      localk = this.httpClient;
      localObject = new com/loopj/android/http/MyRedirectHandler;
      ((MyRedirectHandler)localObject).<init>(paramBoolean1);
      localk.a((o)localObject);
      return;
      bool = false;
      localk = null;
    }
  }
  
  public void setLogInterface(LogInterface paramLogInterface)
  {
    if (paramLogInterface != null) {
      log = paramLogInterface;
    }
  }
  
  public void setLoggingEnabled(boolean paramBoolean)
  {
    log.setLoggingEnabled(paramBoolean);
  }
  
  public void setLoggingLevel(int paramInt)
  {
    log.setLoggingLevel(paramInt);
  }
  
  public void setMaxConnections(int paramInt)
  {
    int i = 1;
    if (paramInt < i) {
      paramInt = 10;
    }
    this.maxConnections = paramInt;
    b.a.a.a.l.e locale = this.httpClient.q();
    b.a.a.a.e.a.c localc = new b/a/a/a/e/a/c;
    int j = this.maxConnections;
    localc.<init>(j);
    b.a.a.a.e.a.a.a(locale, localc);
  }
  
  public void setMaxRetriesAndTimeout(int paramInt1, int paramInt2)
  {
    b.a.a.a.i.b.k localk = this.httpClient;
    RetryHandler localRetryHandler = new com/loopj/android/http/RetryHandler;
    localRetryHandler.<init>(paramInt1, paramInt2);
    localk.a(localRetryHandler);
  }
  
  public void setProxy(String paramString, int paramInt)
  {
    b.a.a.a.n localn = new b/a/a/a/n;
    localn.<init>(paramString, paramInt);
    this.httpClient.q().a("http.route.default-proxy", localn);
  }
  
  public void setProxy(String paramString1, int paramInt, String paramString2, String paramString3)
  {
    Object localObject = this.httpClient.E();
    b.a.a.a.a.g localg = new b/a/a/a/a/g;
    localg.<init>(paramString1, paramInt);
    b.a.a.a.a.r localr = new b/a/a/a/a/r;
    localr.<init>(paramString2, paramString3);
    ((b.a.a.a.b.i)localObject).a(localg, localr);
    localObject = new b/a/a/a/n;
    ((b.a.a.a.n)localObject).<init>(paramString1, paramInt);
    this.httpClient.q().a("http.route.default-proxy", localObject);
  }
  
  public void setRedirectHandler(o paramo)
  {
    this.httpClient.a(paramo);
  }
  
  public void setResponseTimeout(int paramInt)
  {
    int i = 1000;
    if (paramInt < i) {
      paramInt = 10000;
    }
    this.responseTimeout = paramInt;
    b.a.a.a.l.e locale = this.httpClient.q();
    int j = this.responseTimeout;
    b.a.a.a.l.c.a(locale, j);
  }
  
  public void setSSLSocketFactory(b.a.a.a.e.d.i parami)
  {
    b.a.a.a.e.c.i locali = this.httpClient.r().a();
    b.a.a.a.e.c.e locale = new b/a/a/a/e/c/e;
    locale.<init>("https", parami, 443);
    locali.a(locale);
  }
  
  public void setThreadPool(ExecutorService paramExecutorService)
  {
    this.threadPool = paramExecutorService;
  }
  
  public void setTimeout(int paramInt)
  {
    int i = 1000;
    if (paramInt < i) {
      paramInt = 10000;
    }
    setConnectTimeout(paramInt);
    setResponseTimeout(paramInt);
  }
  
  public void setURLEncodingEnabled(boolean paramBoolean)
  {
    this.isUrlEncodingEnabled = paramBoolean;
  }
  
  public void setUserAgent(String paramString)
  {
    b.a.a.a.l.f.b(this.httpClient.q(), paramString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\AsyncHttpClient.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */