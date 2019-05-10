package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

class zzhi
{
  private final String zzEY;
  private String zzF;
  private int zzGu;
  private final List zzJI;
  private final List zzJJ;
  private final String zzJK;
  private final String zzJL;
  private final String zzJM;
  private final String zzJN;
  private final boolean zzJO;
  private final boolean zzJP;
  
  public zzhi(int paramInt, Map paramMap)
  {
    Object localObject = (String)paramMap.get("url");
    this.zzF = ((String)localObject);
    localObject = (String)paramMap.get("base_uri");
    this.zzJL = ((String)localObject);
    localObject = (String)paramMap.get("post_parameters");
    this.zzJM = ((String)localObject);
    boolean bool = parseBoolean((String)paramMap.get("drt_include"));
    this.zzJO = bool;
    bool = parseBoolean((String)paramMap.get("pan_include"));
    this.zzJP = bool;
    localObject = (String)paramMap.get("activation_overlay_url");
    this.zzJK = ((String)localObject);
    localObject = (String)paramMap.get("check_packages");
    localObject = zzav((String)localObject);
    this.zzJJ = ((List)localObject);
    localObject = (String)paramMap.get("request_id");
    this.zzEY = ((String)localObject);
    localObject = (String)paramMap.get("type");
    this.zzJN = ((String)localObject);
    localObject = (String)paramMap.get("errors");
    localObject = zzav((String)localObject);
    this.zzJI = ((List)localObject);
    this.zzGu = paramInt;
  }
  
  private static boolean parseBoolean(String paramString)
  {
    String str;
    boolean bool;
    if (paramString != null)
    {
      str = "1";
      bool = paramString.equals(str);
      if (!bool)
      {
        str = "true";
        bool = paramString.equals(str);
        if (!bool) {}
      }
      else
      {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      str = null;
    }
  }
  
  private List zzav(String paramString)
  {
    if (paramString == null) {}
    for (List localList = null;; localList = Arrays.asList(paramString.split(","))) {
      return localList;
    }
  }
  
  public int getErrorCode()
  {
    return this.zzGu;
  }
  
  public String getRequestId()
  {
    return this.zzEY;
  }
  
  public String getType()
  {
    return this.zzJN;
  }
  
  public String getUrl()
  {
    return this.zzF;
  }
  
  public void setUrl(String paramString)
  {
    this.zzF = paramString;
  }
  
  public List zzgE()
  {
    return this.zzJI;
  }
  
  public String zzgF()
  {
    return this.zzJM;
  }
  
  public boolean zzgG()
  {
    return this.zzJO;
  }
  
  public boolean zzgH()
  {
    return this.zzJP;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzhi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */