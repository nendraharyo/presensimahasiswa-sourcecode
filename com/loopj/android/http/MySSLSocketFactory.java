package com.loopj.android.http;

import b.a.a.a.ac;
import b.a.a.a.e.c.d;
import b.a.a.a.i.b.k;
import b.a.a.a.i.c.a.g;
import b.a.a.a.l.f;
import b.a.a.a.v;
import java.net.Socket;
import java.security.KeyStore;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

public class MySSLSocketFactory
  extends b.a.a.a.e.d.i
{
  final SSLContext sslContext;
  
  public MySSLSocketFactory(KeyStore paramKeyStore)
  {
    super(paramKeyStore);
    Object localObject = SSLContext.getInstance("TLS");
    this.sslContext = ((SSLContext)localObject);
    localObject = new com/loopj/android/http/MySSLSocketFactory$1;
    ((MySSLSocketFactory.1)localObject).<init>(this);
    SSLContext localSSLContext = this.sslContext;
    TrustManager[] arrayOfTrustManager = new TrustManager[1];
    arrayOfTrustManager[0] = localObject;
    localSSLContext.init(null, arrayOfTrustManager, null);
  }
  
  public static b.a.a.a.e.d.i getFixedSocketFactory()
  {
    try
    {
      localObject1 = new com/loopj/android/http/MySSLSocketFactory;
      Object localObject2 = getKeystore();
      ((MySSLSocketFactory)localObject1).<init>((KeyStore)localObject2);
      localObject2 = b.a.a.a.e.d.i.ALLOW_ALL_HOSTNAME_VERIFIER;
      ((b.a.a.a.e.d.i)localObject1).setHostnameVerifier((b.a.a.a.e.d.l)localObject2);
    }
    finally
    {
      for (;;)
      {
        finally.printStackTrace();
        Object localObject1 = b.a.a.a.e.d.i.getSocketFactory();
      }
    }
    return (b.a.a.a.e.d.i)localObject1;
  }
  
  /* Error */
  public static KeyStore getKeystore()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_0
    //   2: invokestatic 61	java/security/KeyStore:getDefaultType	()Ljava/lang/String;
    //   5: astore_1
    //   6: aload_1
    //   7: invokestatic 64	java/security/KeyStore:getInstance	(Ljava/lang/String;)Ljava/security/KeyStore;
    //   10: astore_1
    //   11: aconst_null
    //   12: astore_0
    //   13: aload_1
    //   14: aconst_null
    //   15: aconst_null
    //   16: invokevirtual 68	java/security/KeyStore:load	(Ljava/io/InputStream;[C)V
    //   19: aload_1
    //   20: areturn
    //   21: astore_2
    //   22: aconst_null
    //   23: astore_1
    //   24: aload_2
    //   25: astore_0
    //   26: aload_0
    //   27: invokevirtual 51	java/lang/Throwable:printStackTrace	()V
    //   30: goto -11 -> 19
    //   33: astore_0
    //   34: goto -8 -> 26
    // Local variable table:
    //   start	length	slot	name	signature
    //   1	26	0	localObject1	Object
    //   33	1	0	localObject2	Object
    //   5	19	1	localObject3	Object
    //   21	4	2	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   2	5	21	finally
    //   6	10	21	finally
    //   15	19	33	finally
  }
  
  /* Error */
  public static KeyStore getKeystoreOfCA(java.io.InputStream paramInputStream)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc 70
    //   4: astore_2
    //   5: aload_2
    //   6: invokestatic 75	java/security/cert/CertificateFactory:getInstance	(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;
    //   9: astore_2
    //   10: new 77	java/io/BufferedInputStream
    //   13: astore_3
    //   14: aload_3
    //   15: aload_0
    //   16: invokespecial 80	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   19: aload_2
    //   20: aload_3
    //   21: invokevirtual 84	java/security/cert/CertificateFactory:generateCertificate	(Ljava/io/InputStream;)Ljava/security/cert/Certificate;
    //   24: astore_2
    //   25: aload_3
    //   26: ifnull +7 -> 33
    //   29: aload_3
    //   30: invokevirtual 89	java/io/InputStream:close	()V
    //   33: invokestatic 61	java/security/KeyStore:getDefaultType	()Ljava/lang/String;
    //   36: astore_3
    //   37: aload_3
    //   38: invokestatic 64	java/security/KeyStore:getInstance	(Ljava/lang/String;)Ljava/security/KeyStore;
    //   41: astore_1
    //   42: aconst_null
    //   43: astore_3
    //   44: aload_1
    //   45: aconst_null
    //   46: aconst_null
    //   47: invokevirtual 68	java/security/KeyStore:load	(Ljava/io/InputStream;[C)V
    //   50: ldc 91
    //   52: astore_3
    //   53: aload_1
    //   54: aload_3
    //   55: aload_2
    //   56: invokevirtual 95	java/security/KeyStore:setCertificateEntry	(Ljava/lang/String;Ljava/security/cert/Certificate;)V
    //   59: aload_1
    //   60: astore_2
    //   61: aload_2
    //   62: areturn
    //   63: astore_3
    //   64: aload_3
    //   65: invokevirtual 98	java/io/IOException:printStackTrace	()V
    //   68: goto -35 -> 33
    //   71: astore_2
    //   72: aconst_null
    //   73: astore_3
    //   74: aload_2
    //   75: invokevirtual 101	java/security/cert/CertificateException:printStackTrace	()V
    //   78: aload_3
    //   79: ifnull +7 -> 86
    //   82: aload_3
    //   83: invokevirtual 89	java/io/InputStream:close	()V
    //   86: aconst_null
    //   87: astore_2
    //   88: goto -55 -> 33
    //   91: invokevirtual 98	java/io/IOException:printStackTrace	()V
    //   94: aconst_null
    //   95: astore_2
    //   96: goto -63 -> 33
    //   99: astore_2
    //   100: aload_1
    //   101: ifnull +7 -> 108
    //   104: aload_1
    //   105: invokevirtual 89	java/io/InputStream:close	()V
    //   108: aload_2
    //   109: athrow
    //   110: astore_1
    //   111: aload_1
    //   112: invokevirtual 98	java/io/IOException:printStackTrace	()V
    //   115: goto -7 -> 108
    //   118: astore 4
    //   120: aconst_null
    //   121: astore_2
    //   122: aload 4
    //   124: astore_1
    //   125: aload_1
    //   126: invokevirtual 104	java/lang/Exception:printStackTrace	()V
    //   129: goto -68 -> 61
    //   132: astore 4
    //   134: aload_1
    //   135: astore_2
    //   136: aload 4
    //   138: astore_1
    //   139: goto -14 -> 125
    //   142: astore_2
    //   143: aload_3
    //   144: astore_1
    //   145: goto -45 -> 100
    //   148: astore_2
    //   149: goto -75 -> 74
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	152	0	paramInputStream	java.io.InputStream
    //   1	104	1	localKeyStore	KeyStore
    //   110	2	1	localIOException1	java.io.IOException
    //   124	21	1	localObject1	Object
    //   4	58	2	localObject2	Object
    //   71	4	2	localCertificateException1	java.security.cert.CertificateException
    //   87	9	2	localObject3	Object
    //   99	10	2	localObject4	Object
    //   121	15	2	localObject5	Object
    //   142	1	2	localObject6	Object
    //   148	1	2	localCertificateException2	java.security.cert.CertificateException
    //   13	42	3	localObject7	Object
    //   63	2	3	localIOException2	java.io.IOException
    //   73	71	3	localObject8	Object
    //   118	5	4	localException1	Exception
    //   132	5	4	localException2	Exception
    //   91	1	16	localIOException3	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   29	33	63	java/io/IOException
    //   5	9	71	java/security/cert/CertificateException
    //   10	13	71	java/security/cert/CertificateException
    //   15	19	71	java/security/cert/CertificateException
    //   82	86	91	java/io/IOException
    //   5	9	99	finally
    //   10	13	99	finally
    //   15	19	99	finally
    //   104	108	110	java/io/IOException
    //   37	41	118	java/lang/Exception
    //   46	50	132	java/lang/Exception
    //   55	59	132	java/lang/Exception
    //   20	24	142	finally
    //   74	78	142	finally
    //   20	24	148	java/security/cert/CertificateException
  }
  
  public static k getNewHttpClient(KeyStore paramKeyStore)
  {
    try
    {
      localObject1 = new com/loopj/android/http/MySSLSocketFactory;
      ((MySSLSocketFactory)localObject1).<init>(paramKeyStore);
      b.a.a.a.e.c.i locali = new b/a/a/a/e/c/i;
      locali.<init>();
      Object localObject2 = new b/a/a/a/e/c/e;
      Object localObject3 = "http";
      d locald = d.a();
      int i = 80;
      ((b.a.a.a.e.c.e)localObject2).<init>((String)localObject3, locald, i);
      locali.a((b.a.a.a.e.c.e)localObject2);
      localObject2 = new b/a/a/a/e/c/e;
      localObject3 = "https";
      int j = 443;
      ((b.a.a.a.e.c.e)localObject2).<init>((String)localObject3, (b.a.a.a.e.c.l)localObject1, j);
      locali.a((b.a.a.a.e.c.e)localObject2);
      localObject2 = new b/a/a/a/l/b;
      ((b.a.a.a.l.b)localObject2).<init>();
      localObject1 = v.c;
      f.a((b.a.a.a.l.e)localObject2, (ac)localObject1);
      localObject1 = "UTF-8";
      f.a((b.a.a.a.l.e)localObject2, (String)localObject1);
      localObject3 = new b/a/a/a/i/c/a/g;
      ((g)localObject3).<init>((b.a.a.a.l.e)localObject2, locali);
      localObject1 = new b/a/a/a/i/b/k;
      ((k)localObject1).<init>((b.a.a.a.e.b)localObject3, (b.a.a.a.l.e)localObject2);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        k localk = new b/a/a/a/i/b/k;
        localk.<init>();
      }
    }
    return (k)localObject1;
  }
  
  public Socket createSocket()
  {
    return this.sslContext.getSocketFactory().createSocket();
  }
  
  public Socket createSocket(Socket paramSocket, String paramString, int paramInt, boolean paramBoolean)
  {
    return this.sslContext.getSocketFactory().createSocket(paramSocket, paramString, paramInt, paramBoolean);
  }
  
  public void fixHttpsURLConnection()
  {
    HttpsURLConnection.setDefaultSSLSocketFactory(this.sslContext.getSocketFactory());
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\MySSLSocketFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */