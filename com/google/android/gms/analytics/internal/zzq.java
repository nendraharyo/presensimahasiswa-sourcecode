package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

abstract class zzq
  extends zzc
{
  zzq.zza zzRx;
  
  public zzq(zzf paramzzf, zzq.zza paramzza)
  {
    super(paramzzf);
    this.zzRx = paramzza;
  }
  
  private zzp zza(XmlResourceParser paramXmlResourceParser)
  {
    for (;;)
    {
      try
      {
        paramXmlResourceParser.next();
        i = paramXmlResourceParser.getEventType();
        int j = 1;
        if (i == j) {
          continue;
        }
        i = paramXmlResourceParser.getEventType();
        j = 2;
        if (i == j)
        {
          str1 = paramXmlResourceParser.getName();
          str1 = str1.toLowerCase();
          str4 = "screenname";
          bool2 = str1.equals(str4);
          if (!bool2) {
            continue;
          }
          i = 0;
          str1 = null;
          str4 = "name";
          str1 = paramXmlResourceParser.getAttributeValue(null, str4);
          str4 = paramXmlResourceParser.nextText();
          str4 = str4.trim();
          bool3 = TextUtils.isEmpty(str1);
          if (!bool3)
          {
            bool3 = TextUtils.isEmpty(str4);
            if (!bool3)
            {
              localObject = this.zzRx;
              ((zzq.zza)localObject).zzj(str1, str4);
            }
          }
        }
      }
      catch (XmlPullParserException localXmlPullParserException)
      {
        String str1;
        str4 = "Error parsing tracker configuration file";
        zze(str4, localXmlPullParserException);
        return this.zzRx.zzkq();
        str4 = "bool";
        boolean bool2 = localXmlPullParserException.equals(str4);
        if (!bool2) {
          continue;
        }
        int i = 0;
        String str2 = null;
        str4 = "name";
        str2 = paramXmlResourceParser.getAttributeValue(null, str4);
        str4 = paramXmlResourceParser.nextText();
        str4 = str4.trim();
        bool3 = TextUtils.isEmpty(str2);
        if (bool3) {
          continue;
        }
        bool3 = TextUtils.isEmpty(str4);
        if (bool3) {
          continue;
        }
        try
        {
          bool3 = Boolean.parseBoolean(str4);
          localzza = this.zzRx;
          localzza.zzf(str2, bool3);
        }
        catch (NumberFormatException localNumberFormatException1)
        {
          localObject = "Error parsing bool configuration value";
          zzc((String)localObject, str4, localNumberFormatException1);
        }
        continue;
      }
      catch (IOException localIOException)
      {
        Object localObject;
        zzq.zza localzza;
        String str4 = "Error parsing tracker configuration file";
        zze(str4, localIOException);
        continue;
        str4 = "integer";
        boolean bool1 = localIOException.equals(str4);
        if (!bool1) {
          continue;
        }
        bool1 = false;
        String str3 = null;
        str4 = "name";
        str3 = paramXmlResourceParser.getAttributeValue(null, str4);
        str4 = paramXmlResourceParser.nextText();
        str4 = str4.trim();
        boolean bool3 = TextUtils.isEmpty(str3);
        if (bool3) {
          continue;
        }
        bool3 = TextUtils.isEmpty(str4);
        if (bool3) {
          continue;
        }
        try
        {
          int k = Integer.parseInt(str4);
          localzza = this.zzRx;
          localzza.zzc(str3, k);
        }
        catch (NumberFormatException localNumberFormatException2)
        {
          localObject = "Error parsing int configuration value";
          zzc((String)localObject, str4, localNumberFormatException2);
        }
        continue;
      }
      i = paramXmlResourceParser.next();
      continue;
      str4 = "string";
      bool2 = str1.equals(str4);
      if (!bool2) {
        continue;
      }
      i = 0;
      str1 = null;
      str4 = "name";
      str1 = paramXmlResourceParser.getAttributeValue(null, str4);
      str4 = paramXmlResourceParser.nextText();
      str4 = str4.trim();
      bool3 = TextUtils.isEmpty(str1);
      if ((!bool3) && (str4 != null))
      {
        localObject = this.zzRx;
        ((zzq.zza)localObject).zzk(str1, str4);
      }
    }
  }
  
  public zzp zzah(int paramInt)
  {
    try
    {
      localObject1 = zzji();
      localObject1 = ((zzf)localObject1).zzjx();
      localObject1 = ((Context)localObject1).getResources();
      localObject1 = ((Resources)localObject1).getXml(paramInt);
      localObject1 = zza((XmlResourceParser)localObject1);
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
      for (;;)
      {
        Object localObject1;
        String str = "inflate() called with unknown resourceId";
        zzd(str, localNotFoundException);
        Object localObject2 = null;
      }
    }
    return (zzp)localObject1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\zzq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */