package com.google.android.gms.analytics;

public class HitBuilders$ItemBuilder
  extends HitBuilders.HitBuilder
{
  public HitBuilders$ItemBuilder()
  {
    set("&t", "item");
  }
  
  public ItemBuilder setCategory(String paramString)
  {
    set("&iv", paramString);
    return this;
  }
  
  public ItemBuilder setCurrencyCode(String paramString)
  {
    set("&cu", paramString);
    return this;
  }
  
  public ItemBuilder setName(String paramString)
  {
    set("&in", paramString);
    return this;
  }
  
  public ItemBuilder setPrice(double paramDouble)
  {
    String str = Double.toString(paramDouble);
    set("&ip", str);
    return this;
  }
  
  public ItemBuilder setQuantity(long paramLong)
  {
    String str = Long.toString(paramLong);
    set("&iq", str);
    return this;
  }
  
  public ItemBuilder setSku(String paramString)
  {
    set("&ic", paramString);
    return this;
  }
  
  public ItemBuilder setTransactionId(String paramString)
  {
    set("&ti", paramString);
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\HitBuilders$ItemBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */