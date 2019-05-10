package com.loopj.android.http;

import b.a.a.a.q;
import b.a.a.a.r;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class AsyncHttpClient$1
  implements r
{
  AsyncHttpClient$1(AsyncHttpClient paramAsyncHttpClient) {}
  
  public void process(q paramq, b.a.a.a.n.e parame)
  {
    Object localObject1 = "Accept-Encoding";
    boolean bool1 = paramq.containsHeader((String)localObject1);
    Object localObject2;
    if (!bool1)
    {
      localObject1 = "Accept-Encoding";
      localObject2 = "gzip";
      paramq.addHeader((String)localObject1, (String)localObject2);
    }
    localObject1 = AsyncHttpClient.access$000(this.this$0).keySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    for (;;)
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (String)localIterator.next();
      boolean bool2 = paramq.containsHeader((String)localObject1);
      if (bool2)
      {
        localObject2 = paramq.getFirstHeader((String)localObject1);
        LogInterface localLogInterface = AsyncHttpClient.log;
        String str1 = "AsyncHttpClient";
        int i = 4;
        Object[] arrayOfObject = new Object[i];
        arrayOfObject[0] = localObject1;
        Object localObject3 = AsyncHttpClient.access$000(this.this$0).get(localObject1);
        arrayOfObject[1] = localObject3;
        localObject3 = ((b.a.a.a.e)localObject2).c();
        arrayOfObject[2] = localObject3;
        int j = 3;
        localObject3 = ((b.a.a.a.e)localObject2).d();
        arrayOfObject[j] = localObject3;
        String str2 = String.format("Headers were overwritten! (%s | %s) overwrites (%s | %s)", arrayOfObject);
        localLogInterface.d(str1, str2);
        paramq.removeHeader((b.a.a.a.e)localObject2);
      }
      localObject2 = (String)AsyncHttpClient.access$000(this.this$0).get(localObject1);
      paramq.addHeader((String)localObject1, (String)localObject2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\AsyncHttpClient$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */