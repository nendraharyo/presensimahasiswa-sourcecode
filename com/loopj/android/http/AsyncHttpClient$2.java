package com.loopj.android.http;

import b.a.a.a.f;
import b.a.a.a.k;
import b.a.a.a.s;
import b.a.a.a.u;

class AsyncHttpClient$2
  implements u
{
  AsyncHttpClient$2(AsyncHttpClient paramAsyncHttpClient) {}
  
  public void process(s params, b.a.a.a.n.e parame)
  {
    k localk = params.b();
    if (localk == null) {}
    label111:
    for (;;)
    {
      return;
      Object localObject = localk.getContentEncoding();
      if (localObject != null)
      {
        f[] arrayOff = ((b.a.a.a.e)localObject).e();
        int i = arrayOff.length;
        int j = 0;
        localObject = null;
        for (;;)
        {
          if (j >= i) {
            break label111;
          }
          String str1 = arrayOff[j].a();
          String str2 = "gzip";
          boolean bool = str1.equalsIgnoreCase(str2);
          if (bool)
          {
            localObject = new com/loopj/android/http/AsyncHttpClient$InflatingEntity;
            ((AsyncHttpClient.InflatingEntity)localObject).<init>(localk);
            params.a((k)localObject);
            break;
          }
          j += 1;
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\AsyncHttpClient$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */