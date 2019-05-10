package com.crashlytics.android.core;

public class UserMetaData
{
  public static final UserMetaData EMPTY;
  public final String email;
  public final String id;
  public final String name;
  
  static
  {
    UserMetaData localUserMetaData = new com/crashlytics/android/core/UserMetaData;
    localUserMetaData.<init>();
    EMPTY = localUserMetaData;
  }
  
  public UserMetaData()
  {
    this(null, null, null);
  }
  
  public UserMetaData(String paramString1, String paramString2, String paramString3)
  {
    this.id = paramString1;
    this.name = paramString2;
    this.email = paramString3;
  }
  
  public boolean isEmpty()
  {
    String str = this.id;
    boolean bool;
    if (str == null)
    {
      str = this.name;
      if (str == null)
      {
        str = this.email;
        if (str == null) {
          bool = true;
        }
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      str = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\UserMetaData.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */