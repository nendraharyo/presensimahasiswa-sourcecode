package com.google.android.gms.internal;

import java.io.IOException;

public class zzst
  extends IOException
{
  public zzst(String paramString)
  {
    super(paramString);
  }
  
  static zzst zzJs()
  {
    zzst localzzst = new com/google/android/gms/internal/zzst;
    localzzst.<init>("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    return localzzst;
  }
  
  static zzst zzJt()
  {
    zzst localzzst = new com/google/android/gms/internal/zzst;
    localzzst.<init>("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    return localzzst;
  }
  
  static zzst zzJu()
  {
    zzst localzzst = new com/google/android/gms/internal/zzst;
    localzzst.<init>("CodedInputStream encountered a malformed varint.");
    return localzzst;
  }
  
  static zzst zzJv()
  {
    zzst localzzst = new com/google/android/gms/internal/zzst;
    localzzst.<init>("Protocol message contained an invalid tag (zero).");
    return localzzst;
  }
  
  static zzst zzJw()
  {
    zzst localzzst = new com/google/android/gms/internal/zzst;
    localzzst.<init>("Protocol message end-group tag did not match expected tag.");
    return localzzst;
  }
  
  static zzst zzJx()
  {
    zzst localzzst = new com/google/android/gms/internal/zzst;
    localzzst.<init>("Protocol message tag had invalid wire type.");
    return localzzst;
  }
  
  static zzst zzJy()
  {
    zzst localzzst = new com/google/android/gms/internal/zzst;
    localzzst.<init>("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    return localzzst;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzst.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */