package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import java.util.ArrayList;
import java.util.List;

public class DocumentContents$zza
{
  private List zzTF;
  private String zzTG;
  private boolean zzTH;
  private Account zzTI;
  
  public zza zzL(boolean paramBoolean)
  {
    this.zzTH = paramBoolean;
    return this;
  }
  
  public zza zza(DocumentSection paramDocumentSection)
  {
    Object localObject = this.zzTF;
    if (localObject == null)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      this.zzTF = ((List)localObject);
    }
    this.zzTF.add(paramDocumentSection);
    return this;
  }
  
  public zza zzb(Account paramAccount)
  {
    this.zzTI = paramAccount;
    return this;
  }
  
  public zza zzbz(String paramString)
  {
    this.zzTG = paramString;
    return this;
  }
  
  public DocumentContents zzme()
  {
    DocumentContents localDocumentContents = new com/google/android/gms/appdatasearch/DocumentContents;
    String str = this.zzTG;
    boolean bool = this.zzTH;
    Account localAccount = this.zzTI;
    Object localObject = this.zzTF;
    DocumentSection[] arrayOfDocumentSection;
    if (localObject != null)
    {
      localObject = this.zzTF;
      int i = this.zzTF.size();
      arrayOfDocumentSection = new DocumentSection[i];
    }
    for (localObject = (DocumentSection[])((List)localObject).toArray(arrayOfDocumentSection);; localObject = null)
    {
      localDocumentContents.<init>(str, bool, localAccount, (DocumentSection[])localObject);
      return localDocumentContents;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\appdatasearch\DocumentContents$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */