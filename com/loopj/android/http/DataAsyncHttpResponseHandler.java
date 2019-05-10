package com.loopj.android.http;

import android.os.Message;

public abstract class DataAsyncHttpResponseHandler
  extends AsyncHttpResponseHandler
{
  private static final String LOG_TAG = "DataAsyncHttpRH";
  protected static final int PROGRESS_DATA_MESSAGE = 7;
  
  public static byte[] copyOfRange(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    Object localObject;
    if (paramInt1 > paramInt2)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    int i = paramArrayOfByte.length;
    if ((paramInt1 < 0) || (paramInt1 > i))
    {
      localObject = new java/lang/ArrayIndexOutOfBoundsException;
      ((ArrayIndexOutOfBoundsException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    int j = paramInt2 - paramInt1;
    i -= paramInt1;
    i = Math.min(j, i);
    byte[] arrayOfByte = new byte[j];
    System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte, 0, i);
    return arrayOfByte;
  }
  
  /* Error */
  byte[] getResponseData(b.a.a.a.k paramk)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_1
    //   3: ifnull +220 -> 223
    //   6: aload_1
    //   7: invokeinterface 40 1 0
    //   12: astore_3
    //   13: aload_3
    //   14: ifnull +209 -> 223
    //   17: aload_1
    //   18: invokeinterface 44 1 0
    //   23: lstore 4
    //   25: ldc2_w 45
    //   28: lstore 6
    //   30: lload 4
    //   32: lload 6
    //   34: lcmp
    //   35: istore 8
    //   37: iload 8
    //   39: ifle +15 -> 54
    //   42: new 18	java/lang/IllegalArgumentException
    //   45: astore_2
    //   46: aload_2
    //   47: ldc 50
    //   49: invokespecial 53	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   52: aload_2
    //   53: athrow
    //   54: lconst_0
    //   55: lstore 6
    //   57: lload 4
    //   59: lload 6
    //   61: lcmp
    //   62: istore 8
    //   64: iload 8
    //   66: ifge +8 -> 74
    //   69: ldc2_w 54
    //   72: lstore 4
    //   74: new 59	b/a/a/a/o/c
    //   77: astore 9
    //   79: lload 4
    //   81: l2i
    //   82: istore 10
    //   84: aload 9
    //   86: iload 10
    //   88: invokespecial 62	b/a/a/a/o/c:<init>	(I)V
    //   91: sipush 4096
    //   94: istore 10
    //   96: iload 10
    //   98: newarray <illegal type>
    //   100: astore 11
    //   102: aload_3
    //   103: aload 11
    //   105: invokevirtual 69	java/io/InputStream:read	([B)I
    //   108: istore 12
    //   110: iconst_m1
    //   111: istore 13
    //   113: iload 12
    //   115: iload 13
    //   117: if_icmpeq +96 -> 213
    //   120: invokestatic 75	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   123: astore 14
    //   125: aload 14
    //   127: invokevirtual 79	java/lang/Thread:isInterrupted	()Z
    //   130: istore 13
    //   132: iload 13
    //   134: ifne +79 -> 213
    //   137: iconst_0
    //   138: istore 13
    //   140: aconst_null
    //   141: astore 14
    //   143: aload 9
    //   145: aload 11
    //   147: iconst_0
    //   148: iload 12
    //   150: invokevirtual 83	b/a/a/a/o/c:a	([BII)V
    //   153: iconst_0
    //   154: istore 13
    //   156: aconst_null
    //   157: astore 14
    //   159: aload 11
    //   161: iconst_0
    //   162: iload 12
    //   164: invokestatic 87	com/loopj/android/http/DataAsyncHttpResponseHandler:copyOfRange	([BII)[B
    //   167: astore 15
    //   169: aload_0
    //   170: aload 15
    //   172: invokevirtual 91	com/loopj/android/http/DataAsyncHttpResponseHandler:sendProgressDataMessage	([B)V
    //   175: iconst_0
    //   176: i2l
    //   177: lstore 16
    //   179: aload_0
    //   180: lload 16
    //   182: lload 4
    //   184: invokevirtual 95	com/loopj/android/http/DataAsyncHttpResponseHandler:sendProgressMessage	(JJ)V
    //   187: goto -85 -> 102
    //   190: astore_2
    //   191: aload_3
    //   192: invokestatic 101	com/loopj/android/http/AsyncHttpClient:silentCloseInputStream	(Ljava/io/InputStream;)V
    //   195: aload_2
    //   196: athrow
    //   197: astore_2
    //   198: invokestatic 104	java/lang/System:gc	()V
    //   201: new 106	java/io/IOException
    //   204: astore_2
    //   205: aload_2
    //   206: ldc 108
    //   208: invokespecial 109	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   211: aload_2
    //   212: athrow
    //   213: aload_3
    //   214: invokestatic 101	com/loopj/android/http/AsyncHttpClient:silentCloseInputStream	(Ljava/io/InputStream;)V
    //   217: aload 9
    //   219: invokevirtual 113	b/a/a/a/o/c:b	()[B
    //   222: astore_2
    //   223: aload_2
    //   224: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	225	0	this	DataAsyncHttpResponseHandler
    //   0	225	1	paramk	b.a.a.a.k
    //   1	52	2	localIllegalArgumentException	IllegalArgumentException
    //   190	6	2	localObject1	Object
    //   197	1	2	localOutOfMemoryError	OutOfMemoryError
    //   204	20	2	localObject2	Object
    //   12	202	3	localInputStream	java.io.InputStream
    //   23	160	4	l1	long
    //   28	32	6	l2	long
    //   35	30	8	bool1	boolean
    //   77	141	9	localc	b.a.a.a.o.c
    //   82	15	10	i	int
    //   100	60	11	arrayOfByte1	byte[]
    //   108	55	12	j	int
    //   111	7	13	k	int
    //   130	25	13	bool2	boolean
    //   123	35	14	localThread	Thread
    //   167	4	15	arrayOfByte2	byte[]
    //   177	4	16	l3	long
    // Exception table:
    //   from	to	target	type
    //   96	100	190	finally
    //   103	108	190	finally
    //   120	123	190	finally
    //   125	130	190	finally
    //   148	153	190	finally
    //   162	167	190	finally
    //   170	175	190	finally
    //   182	187	190	finally
    //   74	77	197	java/lang/OutOfMemoryError
    //   86	91	197	java/lang/OutOfMemoryError
    //   191	195	197	java/lang/OutOfMemoryError
    //   195	197	197	java/lang/OutOfMemoryError
    //   213	217	197	java/lang/OutOfMemoryError
    //   217	222	197	java/lang/OutOfMemoryError
  }
  
  protected void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    int i = paramMessage.what;
    switch (i)
    {
    }
    for (;;)
    {
      return;
      Object localObject1 = (Object[])paramMessage.obj;
      if (localObject1 != null)
      {
        int j = localObject1.length;
        int k = 1;
        if (j >= k)
        {
          j = 0;
          localObject2 = null;
          try
          {
            localObject1 = localObject1[0];
            localObject1 = (byte[])localObject1;
            localObject1 = (byte[])localObject1;
            onProgressData((byte[])localObject1);
            continue;
          }
          finally
          {
            localObject2 = AsyncHttpClient.log;
            str1 = "DataAsyncHttpRH";
            String str2 = "custom onProgressData contains an error";
            ((LogInterface)localObject2).e(str1, str2, localThrowable);
          }
          continue;
        }
      }
      LogInterface localLogInterface = AsyncHttpClient.log;
      Object localObject2 = "DataAsyncHttpRH";
      String str1 = "PROGRESS_DATA_MESSAGE didn't got enough params";
      localLogInterface.e((String)localObject2, str1);
    }
  }
  
  public void onProgressData(byte[] paramArrayOfByte)
  {
    AsyncHttpClient.log.d("DataAsyncHttpRH", "onProgressData(byte[]) was not overriden, but callback was received");
  }
  
  public final void sendProgressDataMessage(byte[] paramArrayOfByte)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramArrayOfByte;
    Message localMessage = obtainMessage(7, arrayOfObject);
    sendMessage(localMessage);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\DataAsyncHttpResponseHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */