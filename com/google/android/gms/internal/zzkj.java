package com.google.android.gms.internal;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.appdatasearch.DocumentContents;
import com.google.android.gms.appdatasearch.DocumentContents.zza;
import com.google.android.gms.appdatasearch.DocumentId;
import com.google.android.gms.appdatasearch.DocumentSection;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;
import com.google.android.gms.appdatasearch.RegisterSectionInfo.zza;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.appdatasearch.UsageInfo.zza;
import com.google.android.gms.appindexing.Action;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class zzkj
{
  private static DocumentSection zza(String paramString, zzpm.zzc paramzzc)
  {
    Object localObject = new com/google/android/gms/appdatasearch/RegisterSectionInfo$zza;
    ((RegisterSectionInfo.zza)localObject).<init>(paramString);
    localObject = ((RegisterSectionInfo.zza)localObject).zzM(true).zzbC(paramString).zzbB("blob").zzmh();
    DocumentSection localDocumentSection = new com/google/android/gms/appdatasearch/DocumentSection;
    byte[] arrayOfByte = zzsu.toByteArray(paramzzc);
    localDocumentSection.<init>(arrayOfByte, (RegisterSectionInfo)localObject);
    return localDocumentSection;
  }
  
  public static UsageInfo zza(Action paramAction, long paramLong, String paramString, int paramInt)
  {
    Object localObject1 = null;
    boolean bool1 = false;
    Object localObject2 = new android/os/Bundle;
    ((Bundle)localObject2).<init>();
    Object localObject3 = paramAction.zzmk();
    ((Bundle)localObject2).putAll((Bundle)localObject3);
    Object localObject4 = ((Bundle)localObject2).getBundle("object");
    localObject3 = "id";
    boolean bool2 = ((Bundle)localObject4).containsKey((String)localObject3);
    Object localObject5;
    int i;
    if (bool2)
    {
      localObject3 = Uri.parse(((Bundle)localObject4).getString("id"));
      localObject5 = ((Bundle)localObject4).getString("name");
      String str1 = ((Bundle)localObject4).getString("type");
      String str2 = "url";
      localObject4 = Uri.parse(((Bundle)localObject4).getString(str2));
      localObject4 = zzkk.zza(paramString, (Uri)localObject4);
      localObject1 = UsageInfo.zza((Intent)localObject4, (String)localObject5, (Uri)localObject3, str1, null);
      localObject3 = ".private:ssbContext";
      bool2 = ((Bundle)localObject2).containsKey((String)localObject3);
      if (bool2)
      {
        localObject3 = DocumentSection.zzh(((Bundle)localObject2).getByteArray(".private:ssbContext"));
        ((DocumentContents.zza)localObject1).zza((DocumentSection)localObject3);
        localObject3 = ".private:ssbContext";
        ((Bundle)localObject2).remove((String)localObject3);
      }
      localObject3 = ".private:accountName";
      bool2 = ((Bundle)localObject2).containsKey((String)localObject3);
      if (bool2)
      {
        localObject3 = ((Bundle)localObject2).getString(".private:accountName");
        localObject5 = new android/accounts/Account;
        str1 = "com.google";
        ((Account)localObject5).<init>((String)localObject3, str1);
        ((DocumentContents.zza)localObject1).zzb((Account)localObject5);
        localObject3 = ".private:accountName";
        ((Bundle)localObject2).remove((String)localObject3);
      }
      localObject3 = ".private:isContextOnly";
      bool2 = ((Bundle)localObject2).containsKey((String)localObject3);
      if (!bool2) {
        break label423;
      }
      localObject3 = ".private:isContextOnly";
      bool2 = ((Bundle)localObject2).getBoolean((String)localObject3);
      if (!bool2) {
        break label423;
      }
      i = 4;
      localObject5 = ".private:isContextOnly";
      ((Bundle)localObject2).remove((String)localObject5);
    }
    for (;;)
    {
      localObject5 = ".private:isDeviceOnly";
      boolean bool3 = ((Bundle)localObject2).containsKey((String)localObject5);
      if (bool3)
      {
        bool1 = ((Bundle)localObject2).getBoolean(".private:isDeviceOnly", false);
        localObject5 = ".private:isDeviceOnly";
        ((Bundle)localObject2).remove((String)localObject5);
      }
      localObject2 = zzg((Bundle)localObject2);
      localObject2 = zza(".private:action", (zzpm.zzc)localObject2);
      ((DocumentContents.zza)localObject1).zza((DocumentSection)localObject2);
      localObject2 = new com/google/android/gms/appdatasearch/UsageInfo$zza;
      ((UsageInfo.zza)localObject2).<init>();
      localObject4 = UsageInfo.zza(paramString, (Intent)localObject4);
      localObject3 = ((UsageInfo.zza)localObject2).zza((DocumentId)localObject4).zzw(paramLong).zzar(i);
      localObject1 = ((DocumentContents.zza)localObject1).zzme();
      return ((UsageInfo.zza)localObject3).zza((DocumentContents)localObject1).zzO(bool1).zzas(paramInt).zzmi();
      i = 0;
      localObject3 = null;
      break;
      label423:
      i = 0;
      localObject3 = null;
    }
  }
  
  private static zzpm.zzb zzb(String paramString, Bundle paramBundle)
  {
    zzpm.zzb localzzb = new com/google/android/gms/internal/zzpm$zzb;
    localzzb.<init>();
    localzzb.name = paramString;
    zzpm.zzd localzzd = new com/google/android/gms/internal/zzpm$zzd;
    localzzd.<init>();
    localzzb.zzaMt = localzzd;
    localzzd = localzzb.zzaMt;
    zzpm.zzc localzzc = zzg(paramBundle);
    localzzd.zzaMy = localzzc;
    return localzzb;
  }
  
  static zzpm.zzc zzg(Bundle paramBundle)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = paramBundle.keySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    for (;;)
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (String)localIterator.next();
      localObject2 = paramBundle.get((String)localObject1);
      int i = localObject2 instanceof String;
      if (i != 0)
      {
        localObject2 = (String)localObject2;
        localObject1 = zzp((String)localObject1, (String)localObject2);
        localArrayList.add(localObject1);
      }
      else
      {
        i = localObject2 instanceof Bundle;
        if (i != 0)
        {
          localObject2 = (Bundle)localObject2;
          localObject1 = zzb((String)localObject1, (Bundle)localObject2);
          localArrayList.add(localObject1);
        }
        else
        {
          i = localObject2 instanceof String[];
          StringBuilder localStringBuilder;
          label157:
          Object localObject3;
          if (i != 0)
          {
            localObject2 = (String[])localObject2;
            int n = localObject2.length;
            i = 0;
            localStringBuilder = null;
            if (i < n)
            {
              localObject3 = localObject2[i];
              if (localObject3 != null) {
                break label185;
              }
            }
            for (;;)
            {
              int j;
              i += 1;
              break label157;
              break;
              label185:
              localObject3 = zzp((String)localObject1, (String)localObject3);
              localArrayList.add(localObject3);
            }
          }
          int k = localObject2 instanceof Bundle[];
          if (k != 0)
          {
            localObject2 = (Bundle[])localObject2;
            int i1 = localObject2.length;
            k = 0;
            localStringBuilder = null;
            label238:
            if (k < i1)
            {
              localObject3 = localObject2[k];
              if (localObject3 != null) {
                break label266;
              }
            }
            for (;;)
            {
              int m;
              k += 1;
              break label238;
              break;
              label266:
              localObject3 = zzb((String)localObject1, (Bundle)localObject3);
              localArrayList.add(localObject3);
            }
          }
          boolean bool2 = localObject2 instanceof Boolean;
          if (bool2)
          {
            localObject2 = (Boolean)localObject2;
            boolean bool3 = ((Boolean)localObject2).booleanValue();
            localObject1 = zzi((String)localObject1, bool3);
            localArrayList.add(localObject1);
          }
          else
          {
            localObject1 = "SearchIndex";
            localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            String str = "Unsupported value: ";
            localStringBuilder = localStringBuilder.append(str);
            localObject2 = localObject2;
            Log.e((String)localObject1, (String)localObject2);
          }
        }
      }
    }
    Object localObject2 = new com/google/android/gms/internal/zzpm$zzc;
    ((zzpm.zzc)localObject2).<init>();
    localObject1 = "type";
    boolean bool1 = paramBundle.containsKey((String)localObject1);
    if (bool1)
    {
      localObject1 = paramBundle.getString("type");
      ((zzpm.zzc)localObject2).type = ((String)localObject1);
    }
    localObject1 = new zzpm.zzb[localArrayList.size()];
    localObject1 = (zzpm.zzb[])localArrayList.toArray((Object[])localObject1);
    ((zzpm.zzc)localObject2).zzaMu = ((zzpm.zzb[])localObject1);
    return (zzpm.zzc)localObject2;
  }
  
  private static zzpm.zzb zzi(String paramString, boolean paramBoolean)
  {
    zzpm.zzb localzzb = new com/google/android/gms/internal/zzpm$zzb;
    localzzb.<init>();
    localzzb.name = paramString;
    zzpm.zzd localzzd = new com/google/android/gms/internal/zzpm$zzd;
    localzzd.<init>();
    localzzb.zzaMt = localzzd;
    localzzb.zzaMt.zzaMv = paramBoolean;
    return localzzb;
  }
  
  private static zzpm.zzb zzp(String paramString1, String paramString2)
  {
    zzpm.zzb localzzb = new com/google/android/gms/internal/zzpm$zzb;
    localzzb.<init>();
    localzzb.name = paramString1;
    zzpm.zzd localzzd = new com/google/android/gms/internal/zzpm$zzd;
    localzzd.<init>();
    localzzb.zzaMt = localzzd;
    localzzb.zzaMt.zzamJ = paramString2;
    return localzzb;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzkj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */