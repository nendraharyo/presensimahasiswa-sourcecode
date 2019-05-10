package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.BitSet;

public class DocumentContents
  implements SafeParcelable
{
  public static final zzb CREATOR;
  public final Account account;
  final int mVersionCode;
  final DocumentSection[] zzTC;
  public final String zzTD;
  public final boolean zzTE;
  
  static
  {
    zzb localzzb = new com/google/android/gms/appdatasearch/zzb;
    localzzb.<init>();
    CREATOR = localzzb;
  }
  
  DocumentContents(int paramInt, DocumentSection[] paramArrayOfDocumentSection, String paramString, boolean paramBoolean, Account paramAccount)
  {
    this.mVersionCode = paramInt;
    this.zzTC = paramArrayOfDocumentSection;
    this.zzTD = paramString;
    this.zzTE = paramBoolean;
    this.account = paramAccount;
  }
  
  DocumentContents(String paramString, boolean paramBoolean, Account paramAccount, DocumentSection... paramVarArgs)
  {
    this(i, paramVarArgs, paramString, paramBoolean, paramAccount);
    Object localObject3 = new java/util/BitSet;
    int j = zzh.zzmg();
    ((BitSet)localObject3).<init>(j);
    j = 0;
    localObject1 = null;
    for (;;)
    {
      int k = paramVarArgs.length;
      if (j >= k) {
        break;
      }
      localObject2 = paramVarArgs[j];
      k = ((DocumentSection)localObject2).zzTQ;
      int m = -1;
      if (k != m)
      {
        boolean bool = ((BitSet)localObject3).get(k);
        if (bool)
        {
          localObject1 = new java/lang/IllegalArgumentException;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localObject3 = ((StringBuilder)localObject3).append("Duplicate global search section type ");
          localObject2 = zzh.zzao(k);
          localObject3 = (String)localObject2;
          ((IllegalArgumentException)localObject1).<init>((String)localObject3);
          throw ((Throwable)localObject1);
        }
        ((BitSet)localObject3).set(k);
      }
      j += 1;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\appdatasearch\DocumentContents.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */