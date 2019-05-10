package com.crashlytics.android.answers;

 enum SessionEvent$Type
{
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    Object localObject = new com/crashlytics/android/answers/SessionEvent$Type;
    ((Type)localObject).<init>("START", 0);
    START = (Type)localObject;
    localObject = new com/crashlytics/android/answers/SessionEvent$Type;
    ((Type)localObject).<init>("RESUME", m);
    RESUME = (Type)localObject;
    localObject = new com/crashlytics/android/answers/SessionEvent$Type;
    ((Type)localObject).<init>("PAUSE", k);
    PAUSE = (Type)localObject;
    localObject = new com/crashlytics/android/answers/SessionEvent$Type;
    ((Type)localObject).<init>("STOP", j);
    STOP = (Type)localObject;
    localObject = new com/crashlytics/android/answers/SessionEvent$Type;
    ((Type)localObject).<init>("CRASH", i);
    CRASH = (Type)localObject;
    localObject = new com/crashlytics/android/answers/SessionEvent$Type;
    ((Type)localObject).<init>("INSTALL", 5);
    INSTALL = (Type)localObject;
    localObject = new com/crashlytics/android/answers/SessionEvent$Type;
    ((Type)localObject).<init>("CUSTOM", 6);
    CUSTOM = (Type)localObject;
    localObject = new com/crashlytics/android/answers/SessionEvent$Type;
    ((Type)localObject).<init>("PREDEFINED", 7);
    PREDEFINED = (Type)localObject;
    localObject = new Type[8];
    Type localType1 = START;
    localObject[0] = localType1;
    localType1 = RESUME;
    localObject[m] = localType1;
    localType1 = PAUSE;
    localObject[k] = localType1;
    localType1 = STOP;
    localObject[j] = localType1;
    localType1 = CRASH;
    localObject[i] = localType1;
    Type localType2 = INSTALL;
    localObject[5] = localType2;
    localType2 = CUSTOM;
    localObject[6] = localType2;
    localType2 = PREDEFINED;
    localObject[7] = localType2;
    $VALUES = (Type[])localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\SessionEvent$Type.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */