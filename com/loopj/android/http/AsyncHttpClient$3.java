package com.loopj.android.http;

import b.a.a.a.a.c;
import b.a.a.a.a.g;
import b.a.a.a.a.h;
import b.a.a.a.a.m;
import b.a.a.a.b.i;
import b.a.a.a.i.a.b;
import b.a.a.a.n;
import b.a.a.a.n.e;
import b.a.a.a.q;
import b.a.a.a.r;

class AsyncHttpClient$3
  implements r
{
  AsyncHttpClient$3(AsyncHttpClient paramAsyncHttpClient) {}
  
  public void process(q paramq, e parame)
  {
    h localh = (h)parame.a("http.auth.target-scope");
    Object localObject1 = (i)parame.a("http.auth.credentials-provider");
    Object localObject2 = (n)parame.a("http.target_host");
    Object localObject3 = localh.c();
    if (localObject3 == null)
    {
      localObject3 = new b/a/a/a/a/g;
      String str = ((n)localObject2).a();
      int i = ((n)localObject2).b();
      ((g)localObject3).<init>(str, i);
      localObject1 = ((i)localObject1).a((g)localObject3);
      if (localObject1 != null)
      {
        localObject2 = new b/a/a/a/i/a/b;
        ((b)localObject2).<init>();
        localh.a((c)localObject2);
        localh.a((m)localObject1);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\AsyncHttpClient$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */