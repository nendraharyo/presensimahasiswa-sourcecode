package com.google.android.gms.nearby.messages;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.nearby.messages.internal.MessageType;
import java.util.ArrayList;
import java.util.List;

public final class MessageFilter$Builder
{
  private final List zzbbC;
  private boolean zzbbD;
  private final List zzbbE;
  
  public MessageFilter$Builder()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzbbE = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzbbC = localArrayList;
  }
  
  private Builder zzS(String paramString1, String paramString2)
  {
    List localList = this.zzbbE;
    MessageType localMessageType = new com/google/android/gms/nearby/messages/internal/MessageType;
    localMessageType.<init>(paramString1, paramString2);
    localList.add(localMessageType);
    return this;
  }
  
  public MessageFilter build()
  {
    boolean bool1 = this.zzbbD;
    Object localObject;
    if (!bool1)
    {
      localObject = this.zzbbE;
      bool1 = ((List)localObject).isEmpty();
      if (bool1) {}
    }
    else
    {
      bool1 = true;
    }
    for (;;)
    {
      zzx.zza(bool1, "At least one of the include methods must be called.");
      localObject = new com/google/android/gms/nearby/messages/MessageFilter;
      List localList1 = this.zzbbE;
      List localList2 = this.zzbbC;
      boolean bool2 = this.zzbbD;
      ((MessageFilter)localObject).<init>(localList1, localList2, bool2, null);
      return (MessageFilter)localObject;
      bool1 = false;
      localObject = null;
    }
  }
  
  public Builder includeAllMyTypes()
  {
    this.zzbbD = true;
    return this;
  }
  
  public Builder includeFilter(MessageFilter paramMessageFilter)
  {
    List localList1 = this.zzbbE;
    List localList2 = paramMessageFilter.zzEo();
    localList1.addAll(localList2);
    localList1 = this.zzbbC;
    localList2 = paramMessageFilter.zzEq();
    localList1.addAll(localList2);
    boolean bool1 = this.zzbbD;
    boolean bool2 = paramMessageFilter.zzEp();
    bool1 |= bool2;
    this.zzbbD = bool1;
    return this;
  }
  
  public Builder includeNamespacedType(String paramString1, String paramString2)
  {
    boolean bool1 = true;
    boolean bool2;
    String str1;
    if (paramString1 != null)
    {
      bool2 = paramString1.isEmpty();
      if (!bool2)
      {
        str1 = "*";
        bool2 = paramString1.contains(str1);
        if (!bool2)
        {
          bool2 = bool1;
          String str2 = "namespace(%s) cannot be null, empty or contain (*).";
          Object[] arrayOfObject1 = new Object[bool1];
          arrayOfObject1[0] = paramString1;
          zzx.zzb(bool2, str2, arrayOfObject1);
          if (paramString2 == null) {
            break label121;
          }
          str1 = "*";
          bool2 = paramString2.contains(str1);
          if (bool2) {
            break label121;
          }
          bool2 = bool1;
        }
      }
    }
    for (;;)
    {
      Object[] arrayOfObject2 = new Object[bool1];
      arrayOfObject2[0] = paramString2;
      zzx.zzb(bool2, "type(%s) cannot be null or contain (*).", arrayOfObject2);
      return zzS(paramString1, paramString2);
      bool2 = false;
      str1 = null;
      break;
      label121:
      bool2 = false;
      str1 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\MessageFilter$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */