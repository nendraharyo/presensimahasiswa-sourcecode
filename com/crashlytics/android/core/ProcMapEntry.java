package com.crashlytics.android.core;

class ProcMapEntry
{
  public final long address;
  public final String path;
  public final String perms;
  public final long size;
  
  public ProcMapEntry(long paramLong1, long paramLong2, String paramString1, String paramString2)
  {
    this.address = paramLong1;
    this.size = paramLong2;
    this.perms = paramString1;
    this.path = paramString2;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\ProcMapEntry.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */