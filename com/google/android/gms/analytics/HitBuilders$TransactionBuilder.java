package com.google.android.gms.analytics;

public class HitBuilders$TransactionBuilder
  extends HitBuilders.HitBuilder
{
  public HitBuilders$TransactionBuilder()
  {
    set("&t", "transaction");
  }
  
  public TransactionBuilder setAffiliation(String paramString)
  {
    set("&ta", paramString);
    return this;
  }
  
  public TransactionBuilder setCurrencyCode(String paramString)
  {
    set("&cu", paramString);
    return this;
  }
  
  public TransactionBuilder setRevenue(double paramDouble)
  {
    String str = Double.toString(paramDouble);
    set("&tr", str);
    return this;
  }
  
  public TransactionBuilder setShipping(double paramDouble)
  {
    String str = Double.toString(paramDouble);
    set("&ts", str);
    return this;
  }
  
  public TransactionBuilder setTax(double paramDouble)
  {
    String str = Double.toString(paramDouble);
    set("&tt", str);
    return this;
  }
  
  public TransactionBuilder setTransactionId(String paramString)
  {
    set("&ti", paramString);
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\HitBuilders$TransactionBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */