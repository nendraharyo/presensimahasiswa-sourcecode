package com.loopj.android.http;

import b.a.a.a.e;
import org.xml.sax.helpers.DefaultHandler;

public abstract class SaxAsyncHttpResponseHandler
  extends AsyncHttpResponseHandler
{
  private static final String LOG_TAG = "SaxAsyncHttpRH";
  private DefaultHandler handler;
  
  public SaxAsyncHttpResponseHandler(DefaultHandler paramDefaultHandler)
  {
    Error localError = null;
    this.handler = null;
    if (paramDefaultHandler == null)
    {
      localError = new java/lang/Error;
      localError.<init>("null instance of <T extends DefaultHandler> passed to constructor");
      throw localError;
    }
    this.handler = paramDefaultHandler;
  }
  
  /* Error */
  protected byte[] getResponseData(b.a.a.a.k paramk)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnull +95 -> 96
    //   4: aload_1
    //   5: invokeinterface 30 1 0
    //   10: astore_2
    //   11: aload_2
    //   12: ifnull +84 -> 96
    //   15: invokestatic 36	javax/xml/parsers/SAXParserFactory:newInstance	()Ljavax/xml/parsers/SAXParserFactory;
    //   18: astore_3
    //   19: aload_3
    //   20: invokevirtual 40	javax/xml/parsers/SAXParserFactory:newSAXParser	()Ljavax/xml/parsers/SAXParser;
    //   23: astore_3
    //   24: aload_3
    //   25: invokevirtual 46	javax/xml/parsers/SAXParser:getXMLReader	()Lorg/xml/sax/XMLReader;
    //   28: astore_3
    //   29: aload_0
    //   30: getfield 17	com/loopj/android/http/SaxAsyncHttpResponseHandler:handler	Lorg/xml/sax/helpers/DefaultHandler;
    //   33: astore 4
    //   35: aload_3
    //   36: aload 4
    //   38: invokeinterface 52 2 0
    //   43: new 54	java/io/InputStreamReader
    //   46: astore 4
    //   48: aload_0
    //   49: invokevirtual 58	com/loopj/android/http/SaxAsyncHttpResponseHandler:getCharset	()Ljava/lang/String;
    //   52: astore 5
    //   54: aload 4
    //   56: aload_2
    //   57: aload 5
    //   59: invokespecial 61	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   62: new 63	org/xml/sax/InputSource
    //   65: astore 5
    //   67: aload 5
    //   69: aload 4
    //   71: invokespecial 66	org/xml/sax/InputSource:<init>	(Ljava/io/Reader;)V
    //   74: aload_3
    //   75: aload 5
    //   77: invokeinterface 70 2 0
    //   82: aload_2
    //   83: invokestatic 76	com/loopj/android/http/AsyncHttpClient:silentCloseInputStream	(Ljava/io/InputStream;)V
    //   86: aload 4
    //   88: ifnull +8 -> 96
    //   91: aload 4
    //   93: invokevirtual 79	java/io/InputStreamReader:close	()V
    //   96: aconst_null
    //   97: areturn
    //   98: astore_3
    //   99: aconst_null
    //   100: astore 4
    //   102: getstatic 83	com/loopj/android/http/AsyncHttpClient:log	Lcom/loopj/android/http/LogInterface;
    //   105: astore 5
    //   107: ldc 9
    //   109: astore 6
    //   111: ldc 85
    //   113: astore 7
    //   115: aload 5
    //   117: aload 6
    //   119: aload 7
    //   121: aload_3
    //   122: invokeinterface 91 4 0
    //   127: aload_2
    //   128: invokestatic 76	com/loopj/android/http/AsyncHttpClient:silentCloseInputStream	(Ljava/io/InputStream;)V
    //   131: aload 4
    //   133: ifnull -37 -> 96
    //   136: aload 4
    //   138: invokevirtual 79	java/io/InputStreamReader:close	()V
    //   141: goto -45 -> 96
    //   144: astore_3
    //   145: goto -49 -> 96
    //   148: astore_3
    //   149: aconst_null
    //   150: astore 4
    //   152: getstatic 83	com/loopj/android/http/AsyncHttpClient:log	Lcom/loopj/android/http/LogInterface;
    //   155: astore 5
    //   157: ldc 9
    //   159: astore 6
    //   161: ldc 85
    //   163: astore 7
    //   165: aload 5
    //   167: aload 6
    //   169: aload 7
    //   171: aload_3
    //   172: invokeinterface 91 4 0
    //   177: aload_2
    //   178: invokestatic 76	com/loopj/android/http/AsyncHttpClient:silentCloseInputStream	(Ljava/io/InputStream;)V
    //   181: aload 4
    //   183: ifnull -87 -> 96
    //   186: aload 4
    //   188: invokevirtual 79	java/io/InputStreamReader:close	()V
    //   191: goto -95 -> 96
    //   194: astore_3
    //   195: goto -99 -> 96
    //   198: astore_3
    //   199: aconst_null
    //   200: astore 4
    //   202: aload_2
    //   203: invokestatic 76	com/loopj/android/http/AsyncHttpClient:silentCloseInputStream	(Ljava/io/InputStream;)V
    //   206: aload 4
    //   208: ifnull +8 -> 216
    //   211: aload 4
    //   213: invokevirtual 79	java/io/InputStreamReader:close	()V
    //   216: aload_3
    //   217: athrow
    //   218: astore_3
    //   219: goto -123 -> 96
    //   222: astore 4
    //   224: goto -8 -> 216
    //   227: astore_3
    //   228: goto -26 -> 202
    //   231: astore_3
    //   232: goto -80 -> 152
    //   235: astore_3
    //   236: goto -134 -> 102
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	239	0	this	SaxAsyncHttpResponseHandler
    //   0	239	1	paramk	b.a.a.a.k
    //   10	193	2	localInputStream	java.io.InputStream
    //   18	57	3	localObject1	Object
    //   98	24	3	localSAXException1	org.xml.sax.SAXException
    //   144	1	3	localIOException1	java.io.IOException
    //   148	24	3	localParserConfigurationException1	javax.xml.parsers.ParserConfigurationException
    //   194	1	3	localIOException2	java.io.IOException
    //   198	19	3	localObject2	Object
    //   218	1	3	localIOException3	java.io.IOException
    //   227	1	3	localObject3	Object
    //   231	1	3	localParserConfigurationException2	javax.xml.parsers.ParserConfigurationException
    //   235	1	3	localSAXException2	org.xml.sax.SAXException
    //   33	179	4	localObject4	Object
    //   222	1	4	localIOException4	java.io.IOException
    //   52	114	5	localObject5	Object
    //   109	59	6	str1	String
    //   113	57	7	str2	String
    // Exception table:
    //   from	to	target	type
    //   15	18	98	org/xml/sax/SAXException
    //   19	23	98	org/xml/sax/SAXException
    //   24	28	98	org/xml/sax/SAXException
    //   29	33	98	org/xml/sax/SAXException
    //   36	43	98	org/xml/sax/SAXException
    //   43	46	98	org/xml/sax/SAXException
    //   48	52	98	org/xml/sax/SAXException
    //   57	62	98	org/xml/sax/SAXException
    //   136	141	144	java/io/IOException
    //   15	18	148	javax/xml/parsers/ParserConfigurationException
    //   19	23	148	javax/xml/parsers/ParserConfigurationException
    //   24	28	148	javax/xml/parsers/ParserConfigurationException
    //   29	33	148	javax/xml/parsers/ParserConfigurationException
    //   36	43	148	javax/xml/parsers/ParserConfigurationException
    //   43	46	148	javax/xml/parsers/ParserConfigurationException
    //   48	52	148	javax/xml/parsers/ParserConfigurationException
    //   57	62	148	javax/xml/parsers/ParserConfigurationException
    //   186	191	194	java/io/IOException
    //   15	18	198	finally
    //   19	23	198	finally
    //   24	28	198	finally
    //   29	33	198	finally
    //   36	43	198	finally
    //   43	46	198	finally
    //   48	52	198	finally
    //   57	62	198	finally
    //   91	96	218	java/io/IOException
    //   211	216	222	java/io/IOException
    //   62	65	227	finally
    //   69	74	227	finally
    //   75	82	227	finally
    //   102	105	227	finally
    //   121	127	227	finally
    //   152	155	227	finally
    //   171	177	227	finally
    //   62	65	231	javax/xml/parsers/ParserConfigurationException
    //   69	74	231	javax/xml/parsers/ParserConfigurationException
    //   75	82	231	javax/xml/parsers/ParserConfigurationException
    //   62	65	235	org/xml/sax/SAXException
    //   69	74	235	org/xml/sax/SAXException
    //   75	82	235	org/xml/sax/SAXException
  }
  
  public abstract void onFailure(int paramInt, e[] paramArrayOfe, DefaultHandler paramDefaultHandler);
  
  public void onFailure(int paramInt, e[] paramArrayOfe, byte[] paramArrayOfByte, Throwable paramThrowable)
  {
    DefaultHandler localDefaultHandler = this.handler;
    onFailure(paramInt, paramArrayOfe, localDefaultHandler);
  }
  
  public abstract void onSuccess(int paramInt, e[] paramArrayOfe, DefaultHandler paramDefaultHandler);
  
  public void onSuccess(int paramInt, e[] paramArrayOfe, byte[] paramArrayOfByte)
  {
    DefaultHandler localDefaultHandler = this.handler;
    onSuccess(paramInt, paramArrayOfe, localDefaultHandler);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\SaxAsyncHttpResponseHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */