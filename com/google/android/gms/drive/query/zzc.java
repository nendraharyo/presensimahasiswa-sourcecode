package com.google.android.gms.drive.query;

import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.zzb;
import com.google.android.gms.drive.query.internal.Operator;
import com.google.android.gms.drive.query.internal.zzf;
import java.util.Iterator;
import java.util.List;

public class zzc
  implements zzf
{
  public String zza(zzb paramzzb, Object paramObject)
  {
    Object[] arrayOfObject = new Object[2];
    String str = paramzzb.getName();
    arrayOfObject[0] = str;
    arrayOfObject[1] = paramObject;
    return String.format("contains(%s,%s)", arrayOfObject);
  }
  
  public String zza(Operator paramOperator, MetadataField paramMetadataField, Object paramObject)
  {
    Object[] arrayOfObject = new Object[3];
    String str = paramOperator.getTag();
    arrayOfObject[0] = str;
    str = paramMetadataField.getName();
    arrayOfObject[1] = str;
    arrayOfObject[2] = paramObject;
    return String.format("cmp(%s,%s,%s)", arrayOfObject);
  }
  
  public String zza(Operator paramOperator, List paramList)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = paramOperator.getTag();
    localObject1 = (String)localObject2 + "(";
    localStringBuilder.<init>((String)localObject1);
    localObject1 = "";
    Iterator localIterator = paramList.iterator();
    for (localObject2 = localObject1;; localObject2 = localObject1)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (String)localIterator.next();
      localStringBuilder.append((String)localObject2);
      localStringBuilder.append((String)localObject1);
      localObject1 = ",";
    }
    return ")";
  }
  
  public String zzd(MetadataField paramMetadataField)
  {
    Object[] arrayOfObject = new Object[1];
    String str = paramMetadataField.getName();
    arrayOfObject[0] = str;
    return String.format("fieldOnly(%s)", arrayOfObject);
  }
  
  public String zzd(MetadataField paramMetadataField, Object paramObject)
  {
    Object[] arrayOfObject = new Object[2];
    String str = paramMetadataField.getName();
    arrayOfObject[0] = str;
    arrayOfObject[1] = paramObject;
    return String.format("has(%s,%s)", arrayOfObject);
  }
  
  public String zzdh(String paramString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    return String.format("not(%s)", arrayOfObject);
  }
  
  public String zzdi(String paramString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    return String.format("fullTextSearch(%s)", arrayOfObject);
  }
  
  public String zztN()
  {
    return "all()";
  }
  
  public String zztO()
  {
    return "ownedByMe()";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\query\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */