package com.google.android.gms.wallet;

import java.util.ArrayList;
import java.util.List;

public final class Cart$Builder
{
  private Cart$Builder(Cart paramCart) {}
  
  public Builder addLineItem(LineItem paramLineItem)
  {
    this.zzbok.zzboj.add(paramLineItem);
    return this;
  }
  
  public Cart build()
  {
    return this.zzbok;
  }
  
  public Builder setCurrencyCode(String paramString)
  {
    this.zzbok.zzboi = paramString;
    return this;
  }
  
  public Builder setLineItems(List paramList)
  {
    this.zzbok.zzboj.clear();
    this.zzbok.zzboj.addAll(paramList);
    return this;
  }
  
  public Builder setTotalPrice(String paramString)
  {
    this.zzbok.zzboh = paramString;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\Cart$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */