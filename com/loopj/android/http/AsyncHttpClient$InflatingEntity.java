package com.loopj.android.http;

import b.a.a.a.g.f;
import b.a.a.a.k;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.zip.GZIPInputStream;

class AsyncHttpClient$InflatingEntity
  extends f
{
  GZIPInputStream gzippedStream;
  PushbackInputStream pushbackStream;
  InputStream wrappedStream;
  
  public AsyncHttpClient$InflatingEntity(k paramk)
  {
    super(paramk);
  }
  
  public void consumeContent()
  {
    AsyncHttpClient.silentCloseInputStream(this.wrappedStream);
    AsyncHttpClient.silentCloseInputStream(this.pushbackStream);
    AsyncHttpClient.silentCloseInputStream(this.gzippedStream);
    super.consumeContent();
  }
  
  public InputStream getContent()
  {
    Object localObject1 = this.wrappedEntity.getContent();
    this.wrappedStream = ((InputStream)localObject1);
    localObject1 = new java/io/PushbackInputStream;
    Object localObject2 = this.wrappedStream;
    int i = 2;
    ((PushbackInputStream)localObject1).<init>((InputStream)localObject2, i);
    this.pushbackStream = ((PushbackInputStream)localObject1);
    localObject1 = this.pushbackStream;
    boolean bool = AsyncHttpClient.isInputStreamGZIPCompressed((PushbackInputStream)localObject1);
    if (bool)
    {
      localObject1 = new java/util/zip/GZIPInputStream;
      localObject2 = this.pushbackStream;
      ((GZIPInputStream)localObject1).<init>((InputStream)localObject2);
      this.gzippedStream = ((GZIPInputStream)localObject1);
    }
    for (localObject1 = this.gzippedStream;; localObject1 = this.pushbackStream) {
      return (InputStream)localObject1;
    }
  }
  
  public long getContentLength()
  {
    k localk = this.wrappedEntity;
    if (localk == null) {}
    for (long l = 0L;; l = localk.getContentLength())
    {
      return l;
      localk = this.wrappedEntity;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\AsyncHttpClient$InflatingEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */