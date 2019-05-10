package com.bumptech.glide;

public enum Priority
{
  static
  {
    int i = 3;
    int j = 2;
    int k = 1;
    Object localObject = new com/bumptech/glide/Priority;
    ((Priority)localObject).<init>("IMMEDIATE", 0);
    IMMEDIATE = (Priority)localObject;
    localObject = new com/bumptech/glide/Priority;
    ((Priority)localObject).<init>("HIGH", k);
    HIGH = (Priority)localObject;
    localObject = new com/bumptech/glide/Priority;
    ((Priority)localObject).<init>("NORMAL", j);
    NORMAL = (Priority)localObject;
    localObject = new com/bumptech/glide/Priority;
    ((Priority)localObject).<init>("LOW", i);
    LOW = (Priority)localObject;
    localObject = new Priority[4];
    Priority localPriority = IMMEDIATE;
    localObject[0] = localPriority;
    localPriority = HIGH;
    localObject[k] = localPriority;
    localPriority = NORMAL;
    localObject[j] = localPriority;
    localPriority = LOW;
    localObject[i] = localPriority;
    $VALUES = (Priority[])localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\Priority.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */