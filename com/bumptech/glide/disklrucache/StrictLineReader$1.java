package com.bumptech.glide.disklrucache;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

class StrictLineReader$1
  extends ByteArrayOutputStream
{
  StrictLineReader$1(StrictLineReader paramStrictLineReader, int paramInt)
  {
    super(paramInt);
  }
  
  public String toString()
  {
    int i = this.count;
    if (i > 0)
    {
      byte[] arrayOfByte1 = this.buf;
      int j = this.count + -1;
      i = arrayOfByte1[j];
      j = 13;
      if (i != j) {}
    }
    for (i = this.count + -1;; i = this.count) {
      try
      {
        localObject1 = new java/lang/String;
        byte[] arrayOfByte2 = this.buf;
        Object localObject2 = this.this$0;
        localObject2 = StrictLineReader.access$000((StrictLineReader)localObject2);
        localObject2 = ((Charset)localObject2).name();
        ((String)localObject1).<init>(arrayOfByte2, 0, i, (String)localObject2);
        return (String)localObject1;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        Object localObject1 = new java/lang/AssertionError;
        ((AssertionError)localObject1).<init>(localUnsupportedEncodingException);
        throw ((Throwable)localObject1);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\disklrucache\StrictLineReader$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */