package io.fabric.sdk.android.services.network;

import java.util.concurrent.Callable;

public abstract class HttpRequest$Operation
  implements Callable
{
  /* Error */
  public Object call()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: aload_0
    //   5: invokevirtual 15	io/fabric/sdk/android/services/network/HttpRequest$Operation:run	()Ljava/lang/Object;
    //   8: astore_3
    //   9: aload_0
    //   10: invokevirtual 18	io/fabric/sdk/android/services/network/HttpRequest$Operation:done	()V
    //   13: aload_3
    //   14: areturn
    //   15: astore_3
    //   16: new 20	io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException
    //   19: astore 4
    //   21: aload 4
    //   23: aload_3
    //   24: invokespecial 23	io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException:<init>	(Ljava/io/IOException;)V
    //   27: aload 4
    //   29: athrow
    //   30: astore_3
    //   31: aload_3
    //   32: athrow
    //   33: astore_3
    //   34: aload_0
    //   35: invokevirtual 18	io/fabric/sdk/android/services/network/HttpRequest$Operation:done	()V
    //   38: aload_3
    //   39: athrow
    //   40: astore_3
    //   41: new 20	io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException
    //   44: astore_2
    //   45: aload_2
    //   46: aload_3
    //   47: invokespecial 23	io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException:<init>	(Ljava/io/IOException;)V
    //   50: aload_2
    //   51: athrow
    //   52: astore_2
    //   53: iload_1
    //   54: ifne -16 -> 38
    //   57: new 20	io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException
    //   60: astore_3
    //   61: aload_3
    //   62: aload_2
    //   63: invokespecial 23	io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException:<init>	(Ljava/io/IOException;)V
    //   66: aload_3
    //   67: athrow
    //   68: astore_3
    //   69: iconst_0
    //   70: istore_1
    //   71: aconst_null
    //   72: astore 4
    //   74: goto -40 -> 34
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	77	0	this	Operation
    //   1	70	1	i	int
    //   3	48	2	localHttpRequestException1	HttpRequest.HttpRequestException
    //   52	11	2	localIOException1	java.io.IOException
    //   8	6	3	localObject1	Object
    //   15	9	3	localIOException2	java.io.IOException
    //   30	2	3	localHttpRequestException2	HttpRequest.HttpRequestException
    //   33	6	3	localObject2	Object
    //   40	7	3	localIOException3	java.io.IOException
    //   60	7	3	localHttpRequestException3	HttpRequest.HttpRequestException
    //   68	1	3	localObject3	Object
    //   19	54	4	localHttpRequestException4	HttpRequest.HttpRequestException
    // Exception table:
    //   from	to	target	type
    //   9	13	15	java/io/IOException
    //   4	8	30	io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException
    //   31	33	33	finally
    //   41	44	33	finally
    //   46	50	33	finally
    //   50	52	33	finally
    //   4	8	40	java/io/IOException
    //   34	38	52	java/io/IOException
    //   4	8	68	finally
  }
  
  protected abstract void done();
  
  protected abstract Object run();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\network\HttpRequest$Operation.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */