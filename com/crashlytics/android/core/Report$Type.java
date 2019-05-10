package com.crashlytics.android.core;

public enum Report$Type
{
  static
  {
    int i = 1;
    Object localObject = new com/crashlytics/android/core/Report$Type;
    ((Type)localObject).<init>("JAVA", 0);
    JAVA = (Type)localObject;
    localObject = new com/crashlytics/android/core/Report$Type;
    ((Type)localObject).<init>("NATIVE", i);
    NATIVE = (Type)localObject;
    localObject = new Type[2];
    Type localType = JAVA;
    localObject[0] = localType;
    localType = NATIVE;
    localObject[i] = localType;
    $VALUES = (Type[])localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\Report$Type.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */