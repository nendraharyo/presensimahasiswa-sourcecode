package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.common.server.converter.ConverterWrapper;
import java.util.Map;

public class FastJsonResponse$Field
  implements SafeParcelable
{
  public static final zza CREATOR;
  private final int mVersionCode;
  protected final int zzamL;
  protected final boolean zzamM;
  protected final int zzamN;
  protected final boolean zzamO;
  protected final String zzamP;
  protected final int zzamQ;
  protected final Class zzamR;
  protected final String zzamS;
  private FieldMappingDictionary zzamT;
  private FastJsonResponse.zza zzamU;
  
  static
  {
    zza localzza = new com/google/android/gms/common/server/response/zza;
    localzza.<init>();
    CREATOR = localzza;
  }
  
  FastJsonResponse$Field(int paramInt1, int paramInt2, boolean paramBoolean1, int paramInt3, boolean paramBoolean2, String paramString1, int paramInt4, String paramString2, ConverterWrapper paramConverterWrapper)
  {
    this.mVersionCode = paramInt1;
    this.zzamL = paramInt2;
    this.zzamM = paramBoolean1;
    this.zzamN = paramInt3;
    this.zzamO = paramBoolean2;
    this.zzamP = paramString1;
    this.zzamQ = paramInt4;
    if (paramString2 == null)
    {
      this.zzamR = null;
      this.zzamS = null;
      if (paramConverterWrapper != null) {
        break label88;
      }
    }
    Object localObject;
    for (this.zzamU = null;; this.zzamU = ((FastJsonResponse.zza)localObject))
    {
      return;
      localObject = SafeParcelResponse.class;
      this.zzamR = ((Class)localObject);
      this.zzamS = paramString2;
      break;
      label88:
      localObject = paramConverterWrapper.zzrh();
    }
  }
  
  protected FastJsonResponse$Field(int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2, String paramString, int paramInt3, Class paramClass, FastJsonResponse.zza paramzza)
  {
    int i = 1;
    this.mVersionCode = i;
    this.zzamL = paramInt1;
    this.zzamM = paramBoolean1;
    this.zzamN = paramInt2;
    this.zzamO = paramBoolean2;
    this.zzamP = paramString;
    this.zzamQ = paramInt3;
    this.zzamR = paramClass;
    String str;
    if (paramClass == null)
    {
      i = 0;
      str = null;
    }
    for (this.zzamS = null;; this.zzamS = str)
    {
      this.zzamU = paramzza;
      return;
      str = paramClass.getCanonicalName();
    }
  }
  
  public static Field zza(String paramString, int paramInt, FastJsonResponse.zza paramzza, boolean paramBoolean)
  {
    Field localField = new com/google/android/gms/common/server/response/FastJsonResponse$Field;
    int i = paramzza.zzrj();
    int j = paramzza.zzrk();
    localField.<init>(i, paramBoolean, j, false, paramString, paramInt, null, paramzza);
    return localField;
  }
  
  public static Field zza(String paramString, int paramInt, Class paramClass)
  {
    int i = 11;
    Field localField = new com/google/android/gms/common/server/response/FastJsonResponse$Field;
    localField.<init>(i, false, i, false, paramString, paramInt, paramClass, null);
    return localField;
  }
  
  public static Field zzb(String paramString, int paramInt, Class paramClass)
  {
    int i = 11;
    boolean bool = true;
    Field localField = new com/google/android/gms/common/server/response/FastJsonResponse$Field;
    localField.<init>(i, bool, i, bool, paramString, paramInt, paramClass, null);
    return localField;
  }
  
  public static Field zzi(String paramString, int paramInt)
  {
    Field localField = new com/google/android/gms/common/server/response/FastJsonResponse$Field;
    localField.<init>(0, false, 0, false, paramString, paramInt, null, null);
    return localField;
  }
  
  public static Field zzj(String paramString, int paramInt)
  {
    int i = 4;
    Field localField = new com/google/android/gms/common/server/response/FastJsonResponse$Field;
    localField.<init>(i, false, i, false, paramString, paramInt, null, null);
    return localField;
  }
  
  public static Field zzk(String paramString, int paramInt)
  {
    int i = 6;
    Field localField = new com/google/android/gms/common/server/response/FastJsonResponse$Field;
    localField.<init>(i, false, i, false, paramString, paramInt, null, null);
    return localField;
  }
  
  public static Field zzl(String paramString, int paramInt)
  {
    int i = 7;
    Field localField = new com/google/android/gms/common/server/response/FastJsonResponse$Field;
    localField.<init>(i, false, i, false, paramString, paramInt, null, null);
    return localField;
  }
  
  public static Field zzm(String paramString, int paramInt)
  {
    int i = 7;
    boolean bool = true;
    Field localField = new com/google/android/gms/common/server/response/FastJsonResponse$Field;
    localField.<init>(i, bool, i, bool, paramString, paramInt, null, null);
    return localField;
  }
  
  public Object convertBack(Object paramObject)
  {
    return this.zzamU.convertBack(paramObject);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public String toString()
  {
    char c = '\n';
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("Field\n");
    Object localObject1 = localStringBuilder.append("            versionCode=");
    int i = this.mVersionCode;
    ((StringBuilder)localObject1).append(i).append(c);
    localObject1 = localStringBuilder.append("                 typeIn=");
    i = this.zzamL;
    ((StringBuilder)localObject1).append(i).append(c);
    localObject1 = localStringBuilder.append("            typeInArray=");
    boolean bool1 = this.zzamM;
    ((StringBuilder)localObject1).append(bool1).append(c);
    localObject1 = localStringBuilder.append("                typeOut=");
    int j = this.zzamN;
    ((StringBuilder)localObject1).append(j).append(c);
    localObject1 = localStringBuilder.append("           typeOutArray=");
    boolean bool2 = this.zzamO;
    ((StringBuilder)localObject1).append(bool2).append(c);
    localObject1 = localStringBuilder.append("        outputFieldName=");
    Object localObject2 = this.zzamP;
    ((StringBuilder)localObject1).append((String)localObject2).append(c);
    localObject1 = localStringBuilder.append("      safeParcelFieldId=");
    int k = this.zzamQ;
    ((StringBuilder)localObject1).append(k).append(c);
    localObject1 = localStringBuilder.append("       concreteTypeName=");
    localObject2 = zzru();
    ((StringBuilder)localObject1).append((String)localObject2).append(c);
    localObject1 = zzrt();
    if (localObject1 != null)
    {
      localObject1 = localStringBuilder.append("     concreteType.class=");
      localObject2 = zzrt().getCanonicalName();
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(c);
    }
    localObject2 = localStringBuilder.append("          converterName=");
    localObject1 = this.zzamU;
    if (localObject1 == null) {}
    for (localObject1 = "null";; localObject1 = this.zzamU.getClass().getCanonicalName())
    {
      ((StringBuilder)localObject2).append((String)localObject1).append(c);
      return localStringBuilder.toString();
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
  
  public void zza(FieldMappingDictionary paramFieldMappingDictionary)
  {
    this.zzamT = paramFieldMappingDictionary;
  }
  
  public int zzrj()
  {
    return this.zzamL;
  }
  
  public int zzrk()
  {
    return this.zzamN;
  }
  
  public Field zzro()
  {
    Field localField = new com/google/android/gms/common/server/response/FastJsonResponse$Field;
    int i = this.mVersionCode;
    int j = this.zzamL;
    boolean bool1 = this.zzamM;
    int k = this.zzamN;
    boolean bool2 = this.zzamO;
    String str1 = this.zzamP;
    int m = this.zzamQ;
    String str2 = this.zzamS;
    ConverterWrapper localConverterWrapper = zzrw();
    localField.<init>(i, j, bool1, k, bool2, str1, m, str2, localConverterWrapper);
    return localField;
  }
  
  public boolean zzrp()
  {
    return this.zzamM;
  }
  
  public boolean zzrq()
  {
    return this.zzamO;
  }
  
  public String zzrr()
  {
    return this.zzamP;
  }
  
  public int zzrs()
  {
    return this.zzamQ;
  }
  
  public Class zzrt()
  {
    return this.zzamR;
  }
  
  String zzru()
  {
    String str = this.zzamS;
    if (str == null) {}
    for (str = null;; str = this.zzamS) {
      return str;
    }
  }
  
  public boolean zzrv()
  {
    FastJsonResponse.zza localzza = this.zzamU;
    boolean bool;
    if (localzza != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localzza = null;
    }
  }
  
  ConverterWrapper zzrw()
  {
    Object localObject = this.zzamU;
    if (localObject == null) {}
    for (localObject = null;; localObject = ConverterWrapper.zza(this.zzamU)) {
      return (ConverterWrapper)localObject;
    }
  }
  
  public Map zzrx()
  {
    zzx.zzz(this.zzamS);
    zzx.zzz(this.zzamT);
    FieldMappingDictionary localFieldMappingDictionary = this.zzamT;
    String str = this.zzamS;
    return localFieldMappingDictionary.zzcR(str);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\server\response\FastJsonResponse$Field.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */