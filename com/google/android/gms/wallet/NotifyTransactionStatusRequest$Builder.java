package com.google.android.gms.wallet;

import android.text.TextUtils;
import com.google.android.gms.common.internal.zzx;

public final class NotifyTransactionStatusRequest$Builder
{
  private NotifyTransactionStatusRequest$Builder(NotifyTransactionStatusRequest paramNotifyTransactionStatusRequest) {}
  
  public NotifyTransactionStatusRequest build()
  {
    int i = 1;
    Object localObject = this.zzbpA.zzboo;
    boolean bool = TextUtils.isEmpty((CharSequence)localObject);
    int k;
    if (!bool)
    {
      bool = i;
      String str = "googleTransactionId is required";
      zzx.zzb(bool, str);
      localObject = this.zzbpA;
      int j = ((NotifyTransactionStatusRequest)localObject).status;
      if (j < i) {
        break label84;
      }
      localObject = this.zzbpA;
      k = ((NotifyTransactionStatusRequest)localObject).status;
      int m = 8;
      if (k > m) {
        break label84;
      }
    }
    for (;;)
    {
      zzx.zzb(i, "status is an unrecognized value");
      return this.zzbpA;
      k = 0;
      localObject = null;
      break;
      label84:
      i = 0;
    }
  }
  
  public Builder setDetailedReason(String paramString)
  {
    this.zzbpA.zzbpz = paramString;
    return this;
  }
  
  public Builder setGoogleTransactionId(String paramString)
  {
    this.zzbpA.zzboo = paramString;
    return this;
  }
  
  public Builder setStatus(int paramInt)
  {
    this.zzbpA.status = paramInt;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\NotifyTransactionStatusRequest$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */