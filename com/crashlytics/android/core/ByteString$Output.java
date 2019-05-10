package com.crashlytics.android.core;

import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;

final class ByteString$Output
  extends FilterOutputStream
{
  private final ByteArrayOutputStream bout;
  
  private ByteString$Output(ByteArrayOutputStream paramByteArrayOutputStream)
  {
    super(paramByteArrayOutputStream);
    this.bout = paramByteArrayOutputStream;
  }
  
  public ByteString toByteString()
  {
    byte[] arrayOfByte = this.bout.toByteArray();
    ByteString localByteString = new com/crashlytics/android/core/ByteString;
    localByteString.<init>(arrayOfByte, null);
    return localByteString;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\ByteString$Output.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */